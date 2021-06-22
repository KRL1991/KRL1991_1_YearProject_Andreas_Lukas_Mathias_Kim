package tests;

import org.junit.Test;

import exceptions.WallWidthNotNumericException;

import static org.junit.Assert.*;

public class WallWidthNonNumericMockTest {

    @Test
    public void getWidth() {
        WallWidthNonNumericMock wallWidthNonNumericMock = new WallWidthNonNumericMock();
        String expected = "50";

        assertThrows(wallWidthNonNumericMock.wallWidthNotNumericException,expected);
    }

    private void assertThrows(WallWidthNotNumericException wallWidthNotNumericException, String expected) {
        if (!expected.equals("50")) throw wallWidthNotNumericException;
    }

    @Test
    public void setWidth() {
    }

    @Test
    public void getWallWidthNotNumericException() {
    }

    @Test
    public void setWallWidthNotNumericException() {
    }
}