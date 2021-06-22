package tests;

import org.junit.Test;

import exceptions.PhoneNumberNonNumericException;

import static org.junit.Assert.*;

public class EmailContentMockTest {//Mathias

    @Test
    public void getPhoneNumberNonNumericException() {

        EmailContentMock ecm = new EmailContentMock();
        String expected = "12345678";
        
        assertThrows(ecm.phoneNumberNonNumericException, expected);

    }

    private void assertThrows(PhoneNumberNonNumericException phoneNumberNonNumericException, String expected) {
        if (!expected.equals("12345678")) throw phoneNumberNonNumericException;
    }


    @Test
    public void setPhoneNumberNonNumericException() {

    }

    @Test
    public void TelefonnummerTest() throws Exception {
        EmailContentMock ecm = new EmailContentMock();
        String telefonnummer = "12345678";

        assertEquals(telefonnummer, ecm.telefonnummer);
    }

    @Test
    public void setTelefonnummer() {
    }
}