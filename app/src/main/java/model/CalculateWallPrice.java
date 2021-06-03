package model;

public class CalculateWallPrice {

    double wallHeigth;
    double wallWidth;
    int standardGlassHeight = 60;
    int standardGlassWidth = 45;
    int singleGlassPrice = 985;
    int delivery = 800;


    public CalculateWallPrice(double wallHeigth, double wallWidth, int standardGlassHeight, int standardGlassWidth, int singleGlassPrice, int delivery) {
        this.wallHeigth = wallHeigth;
        this.wallWidth = wallWidth;
        this.standardGlassHeight = standardGlassHeight;
        this.standardGlassWidth = standardGlassWidth;
        this.singleGlassPrice = singleGlassPrice;
        this.delivery = delivery;

        int wallPrice = (int) ((wallHeigth/standardGlassHeight) * (wallWidth/standardGlassWidth)*(singleGlassPrice)+delivery);



    }
}


