package tests;

import exceptions.WallWidthNotNumericException;

public class WallWidthNonNumericMock {

    String width;

    WallWidthNotNumericException wallWidthNotNumericException = new WallWidthNotNumericException("Error Width not numeric!");

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public WallWidthNotNumericException getWallWidthNotNumericException() {
        return wallWidthNotNumericException;
    }

    public void setWallWidthNotNumericException(WallWidthNotNumericException wallWidthNotNumericException) {
        this.wallWidthNotNumericException = wallWidthNotNumericException;


    }
}