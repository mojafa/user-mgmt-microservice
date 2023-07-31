package com.mojafa.user_mgmt_microservice.dto;

import  com.mojafa.user_mgmt_microservice.entities.Permission;
import  com.mojafa.user_mgmt_microservice.entities.Role;
import  com.mojafa.user_mgmt_microservice.entities.User;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO implements Serializable {

    public UserDTO() {
        // empty constructor
        roles = new ArrayList<>();
        permissions = new ArrayList<>();
    }

    public UserDTO(User user) {
        if (user != null) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.email = user.getEmail();
            this.enabled = user.isEnabled();
            this.createdAt = user.getCreatedAt();
            this.updatedAt = user.getUpdatedAt();
            this.loggedInAt = user.getLoggedInAt();
            this.secured = user.isSecured();
            // Because the permissions can be associated to more than one roles i'm creating two String arrays
            // with the distinct keys of roles and permissions.
            roles = new ArrayList<>();
            permissions = new ArrayList<>();

            for (Role role : user.getRoles()) {
                roles.add(role.getRole());
                for (Permission p : role.getPermissions()) {
                    String key = p.getPermission();
                    if ((!permissions.contains(key)) && (p.isEnabled())) {
                        // add the permission only if enabled
                        permissions.add(key);
                    }
                }
            }

        }
    }

    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime loggedInAt;
    private boolean secured;
    // permissions and roles list
    private List<String> roles;
    private List<String> permissions;

}
