package com.akarelov.flyway.exception;

public class NoteNotExistsException extends RuntimeException {
    private ErrorCode errorCode;

    public NoteNotExistsException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
