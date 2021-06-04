package model;

public class CalculationGlassSize {

    double wallHeigth;
    double wallWidth;
    int standardGlassHeight = 60;
    int standardGlassWidth = 45;

    public CalculationGlassSize() {
        this.wallHeigth = wallHeigth;
        this.wallWidth = wallWidth;
        this.standardGlassHeight = standardGlassHeight;
        this.standardGlassWidth = standardGlassWidth;


    }

    public void glassSize (int height, int width){

        int glassSizeHeight = (int) (wallHeigth/standardGlassHeight);
        int glassSizeWidth = (int) (wallWidth/standardGlassWidth);




    }
}
