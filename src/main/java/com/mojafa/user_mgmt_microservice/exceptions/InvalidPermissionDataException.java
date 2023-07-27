package com.mojafa.user_mgmt_microservice.exceptions;

public class InvalidPermissionDataException extends RuntimeException {

    public InvalidPermissionDataException(String message) {
        super(message);
    }

}
