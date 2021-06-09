package tests;

import exceptions.WallHeightOverThresholdException;
import exceptions.WallHeightUnderThresholdException;

public class WallMock {

    int height;

    WallHeightOverThresholdException wallTooHigh = new WallHeightOverThresholdException("Error: Wall must be under 250");

    public WallHeightUnderThresholdException getWallTooSmall() {
        return wallTooSmall;
    }

    public void setWallTooSmall(WallHeightUnderThresholdException wallTooSmall) {
        this.wallTooSmall = wallTooSmall;
    }

    WallHeightUnderThresholdException wallTooSmall = new WallHeightUnderThresholdException("Error: Wall must be over 10");


    public WallMock(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public WallHeightOverThresholdException getWallTooHigh() {
        if(height < 250 ) throw wallTooHigh;
        return wallTooHigh;
    }

    public void setWallTooHigh(WallHeightOverThresholdException wallTooHigh) {
        this.wallTooHigh = wallTooHigh;
    }
}
