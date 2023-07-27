package com.mojafa.user_mgmt_microservice.exceptions;

public class InvalidRoleIdentifierException extends RuntimeException {

    public InvalidRoleIdentifierException(String message) {
        super(message);
    }

}
