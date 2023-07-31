DROP TABLE IF EXISTS permissions_roles;
DROP TABLE IF EXISTS users_roles;

DROP TABLE IF EXISTS permissions;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;

CREATE TABLE `roles` (
                         `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         `role` varchar(80) NOT NULL UNIQUE
);

CREATE TABLE `permissions` (
                               `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                               `permission` varchar(80) NOT NULL UNIQUE,
                               enabled TINYINT DEFAULT '1',
                               note varchar(255) DEFAULT NULL
);

CREATE TABLE permissions_roles (
                                   `permission_id` BIGINT(20) NOT NULL,
                                   `role_id` BIGINT(20) NOT NULL,
                                   PRIMARY KEY (permission_id, role_id),
                                   FOREIGN KEY (permission_id) REFERENCES permissions(id),
                                   FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE `users` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `username` varchar(100) NOT NULL UNIQUE,
  `password` varchar(255) NOT NULL,
  `name` varchar(100) DEFAULT NULL,

  enabled TINYINT DEFAULT '1',
  createdAt timestamp NOT NULL DEFAULT current_timestamp,
  updatedAt timestamp DEFAULT current_timestamp,
  loggedInAt timestamp NULL,

  secured TINYINT DEFAULT '0'
);

CREATE TABLE users_roles (
  `user_id` BIGINT(20) NOT NULL,
  `role_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (user_id, role_id),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (role_id) REFERENCES roles(id)
);




DROP VIEW IF EXISTS enabled_users;

CREATE VIEW enabled_users AS
SELECT username,createdAt, updatedAt, loggedInAt, secured
FROM users;




