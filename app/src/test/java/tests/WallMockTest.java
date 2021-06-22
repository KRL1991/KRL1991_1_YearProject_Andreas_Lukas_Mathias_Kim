package tests;

import org.junit.Test;

import exceptions.WallHeightOverThresholdException;
import exceptions.WallHeightUnderThresholdException;

import static org.junit.Assert.*;

public class WallMockTest {

    @Test
    public void getHeight() {

        WallMock wM = new WallMock(250);

        int expected = 250;

        assertEquals(expected, wM.getHeight());


    }
// Tjekker om exception smides hvis højden overstiger eller er 251 = -  så testen "fejler" egentlig.
    @Test
    public void wallTooHigh() {

        WallMock wM = new WallMock(251);


        int expected = 251;

        assertThrows(wM.wallTooHigh, expected);
    }

    private void assertThrows(WallHeightOverThresholdException wallTooHigh, int expected) {

        if (expected >= 251) throw wallTooHigh;
    }
// Tjekker om exception wallTooSmall bliver kastet hvis højden er under eller = 9 - så
    @Test
    public void wallTooSmall() {

        WallMock wM = new WallMock(9);

        int expected = 9;

        assertThrows(wM.wallTooSmall, expected);


    }

    private void assertThrows(WallHeightUnderThresholdException wallTooSmall, int expected) {

        if (expected <= 9) throw wallTooSmall;


    }
}