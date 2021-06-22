package tests;

import junit.framework.TestCase;

import org.junit.Test;

import exceptions.WallWidthUnderThresholdException;


public class WallWidthMockTest extends TestCase { // Andreas Test
    @Test
    public void testGetWallTooSmall() {
        WallWidthMock wWM = new WallWidthMock(9);
        int expected = 9;

        assertThrows(wWM.wallTooSmall, expected);
    }

    private void assertThrows(WallWidthUnderThresholdException wallTooSmall, int expected) {
        if (expected < 9 ) throw wallTooSmall;
    }

    @Test
    public void testSetWallTooSmall() {
    }
}