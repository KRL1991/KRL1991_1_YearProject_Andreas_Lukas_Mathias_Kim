package model;

public class Wall {


    String wallName;
    String price;
    String height;
    String width;
    String acoutsicPanel = "0";
    String satinGlass = "0";
    String wetRoom = "0";
    String soundGlass ="0";
    String frameColor = "Standard";


    public String getWallName() {
        return wallName;
    }

    public void setWallName(String wallName) {
        this.wallName = wallName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getAcoutsicPanel() {
        return acoutsicPanel;
    }

    public void setAcoutsicPanel(String acoutsicPanel) {
        this.acoutsicPanel = acoutsicPanel;
    }

    public String getSatinGlass() {
        return satinGlass;
    }

    public void setSatinGlass(String satinGlass) {
        this.satinGlass = satinGlass;
    }

    public String getWetRoom() {
        return wetRoom;
    }

    public void setWetRoom(String wetRoom) {
        this.wetRoom = wetRoom;
    }

    public String getSoundGlass() {
        return soundGlass;
    }

    public void setSoundGlass(String soundGlass) {
        this.soundGlass = soundGlass;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }
}