package model;

public class CalculateWallPrice {

    double wallHeigth;
    double wallWidth;
    int standardGlassHeight = 60;
    int standardGlassWidth = 45;
    int delivery = 800;


    public CalculateWallPrice(double wallHeigth, double wallWidth, int standardGlassHeight, int standardGlassWidth, int delivery) {
        this.wallHeigth = wallHeigth;
        this.wallWidth = wallWidth;
        this.standardGlassHeight = standardGlassHeight;
        this.standardGlassWidth = standardGlassWidth;
        this.delivery = delivery;

        int glassSize = (int) ((wallHeigth/standardGlassHeight) * (wallWidth/standardGlassWidth) + delivery);
    }
}


