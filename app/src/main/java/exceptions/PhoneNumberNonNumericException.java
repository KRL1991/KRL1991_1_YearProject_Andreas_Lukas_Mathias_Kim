package exceptions;

public class PhoneNumberNonNumericException extends RuntimeException {


    public PhoneNumberNonNumericException(String message) {
        super(message);
    }
}
