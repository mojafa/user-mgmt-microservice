package com.mojafa.user_mgmt_microservice.dto;

import  com.mojafa.user_mgmt_microservice.entities.Permission;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PermissionDTO implements java.io.Serializable {

    private Long id;
    private String permission;
    private boolean enabled;


    public PermissionDTO(Permission permission) {
        this.id = permission.getId();
        this.permission = permission.getPermission();
        this.enabled = permission.isEnabled();
    }
}
