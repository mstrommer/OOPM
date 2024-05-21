package _07_B_Exceptions;

public class IllegalElementFormatException extends Exception {
    public IllegalElementFormatException(String message) {
        super(message);
    }
    public IllegalElementFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}