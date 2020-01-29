package com.akarelov.flyway.exception;

public class UserNotExistsException extends RuntimeException {
    private ErrorCode errorCode;

    public UserNotExistsException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
