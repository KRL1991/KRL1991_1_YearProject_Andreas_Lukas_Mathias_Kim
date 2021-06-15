package model;

public class Wall {


    String wallName;
    String price;
    String height;
    String width;
    String acoutsicPanel = "0";


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
}