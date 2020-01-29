package com.akarelov.flyway.exception;

public enum ErrorCode {
    USER_NOT_EXISTS(404),
    NOTE_NOT_EXISTS(444);

    private int errorCode;

    ErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
