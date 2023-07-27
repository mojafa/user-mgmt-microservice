package com.mojafa.user_mgmt_microservice.exceptions;

public class InvalidRoleDataException extends RuntimeException {

    public InvalidRoleDataException(String message) {
        super(message);
    }

}
