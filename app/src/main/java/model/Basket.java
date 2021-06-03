package model;

import java.util.ArrayList;
import java.util.Observable;

public class Basket /*extends Observable*/ {


    public static ArrayList<Wall> content = new ArrayList<>();


    public static ArrayList<Wall> getContent() {
        return content;
    }

    public static void setContent(ArrayList<Wall> content) {
        Basket.content = content;
    }
}
