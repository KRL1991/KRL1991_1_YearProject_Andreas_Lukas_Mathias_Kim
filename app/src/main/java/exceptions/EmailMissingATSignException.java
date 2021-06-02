package exceptions;

public class EmailMissingATSignException extends RuntimeException {

    public EmailMissingATSignException(String message) {
        super(message);
    }
}
