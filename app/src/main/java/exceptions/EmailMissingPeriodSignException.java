package exceptions;

public class EmailMissingPeriodSignException extends RuntimeException {

    public EmailMissingPeriodSignException(String message) {
        super(message);
    }
}
