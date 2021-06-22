package tests;

import exceptions.EmailMissingATSignException;
import exceptions.PhoneNumberNonNumericException;

public class EmailContentMock {

    String telefonnummer = "12345678";

    public PhoneNumberNonNumericException getPhoneNumberNonNumericException() {
        return phoneNumberNonNumericException;
    }

    public void setPhoneNumberNonNumericException(PhoneNumberNonNumericException phoneNumberNonNumericException) {
        this.phoneNumberNonNumericException = phoneNumberNonNumericException;
    }

    PhoneNumberNonNumericException phoneNumberNonNumericException = new PhoneNumberNonNumericException("Telefonnummeret er ikke numerisk");
    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
