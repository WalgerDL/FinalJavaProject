package ru.sber.Exceptions;

public class NoFoundException extends Exception {
    public NoFoundException() {
    }

    public NoFoundException(String message) {
        super(message);
    }

    public NoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFoundException(Throwable cause) {
        super(cause);
    }

    public NoFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
