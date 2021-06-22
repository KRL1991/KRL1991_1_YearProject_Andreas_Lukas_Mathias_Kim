package tests;

import exceptions.WallWidthUnderThresholdException;

public class WallWidthMock { // Andreas Test

    int width;

    WallWidthUnderThresholdException wallTooSmall = new WallWidthUnderThresholdException("Error Wall width must be over 10");


    public WallWidthUnderThresholdException getWallTooSmall() { return wallTooSmall; }

    public void setWallTooSmall(WallWidthUnderThresholdException wallTooSmall) {
        this.wallTooSmall = wallTooSmall;
    }
    public WallWidthMock(int width) {
        this.width = width;

    }
}