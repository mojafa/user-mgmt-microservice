package com.mojafa.user_mgmt_microservice.exceptions;

public class RoleInUseException extends RuntimeException {

    public RoleInUseException(String message) {
        super(message);
    }

}
