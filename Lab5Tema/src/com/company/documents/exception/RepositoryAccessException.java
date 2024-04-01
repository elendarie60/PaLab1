package com.company.documents.exception;

public class RepositoryAccessException extends RuntimeException {
    public RepositoryAccessException(String message) {
        super(message);
    }

    public RepositoryAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
