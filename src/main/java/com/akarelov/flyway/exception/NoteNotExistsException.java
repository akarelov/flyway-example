package com.akarelov.flyway.exception;

public class NoteNotExistsException extends RuntimeException {
    private ErrorCode errorCode;

    public NoteNotExistsException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
