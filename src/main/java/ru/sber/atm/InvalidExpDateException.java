package ru.sber.atm;

public class InvalidExpDateException extends Exception{
    public InvalidExpDateException() {
    }

    public InvalidExpDateException(String message) {
        super(message);
    }

    public InvalidExpDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidExpDateException(Throwable cause) {
        super(cause);
    }

    public InvalidExpDateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
