package ru.sber.processingServer;

public class InvalidFormatCardException extends Exception {
    public InvalidFormatCardException() {
    }

    public InvalidFormatCardException(String message) {
        super(message);
    }

    public InvalidFormatCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFormatCardException(Throwable cause) {
        super(cause);
    }

    public InvalidFormatCardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
