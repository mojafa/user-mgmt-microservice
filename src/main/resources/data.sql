INSERT INTO permissions(id, permission) VALUES (1, 'Admin');
INSERT INTO permissions(id, permission) VALUES (2, 'Creater');
INSERT INTO permissions(id, permission) VALUES (3, 'Manager');

INSERT INTO permissions(id, permission, enabled) VALUES (4, 'Viewer', false);

INSERT INTO roles(id, role) VALUES (1, 'USER');
INSERT INTO roles(id, role) VALUES (2, 'ADMINISTRATOR');

INSERT INTO permissions_roles(permission_id, role_id) VALUES (1, 1);
INSERT INTO permissions_roles(permission_id, role_id) VALUES (2, 1);

INSERT INTO permissions_roles(permission_id, role_id) VALUES (1, 2);
INSERT INTO permissions_roles(permission_id, role_id) VALUES (2, 2);
INSERT INTO permissions_roles(permission_id, role_id) VALUES (3, 2);


INSERT INTO users(id, username, password ) VALUES (1, 'andrea', '1d/NZaEqNgtEomytAPrwm/+QjmbudLg33oeEk77Xh88=');

UPDATE users SET ENABLED = false WHERE id = 1;


UPDATE users SET secured = true WHERE id = 1;

INSERT INTO users_roles(user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles(user_id, role_id) VALUES (1, 2);

