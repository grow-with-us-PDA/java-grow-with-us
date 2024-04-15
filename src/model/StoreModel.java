package model;

import java.util.Arrays;
import java.util.Comparator;

public class StoreModel {

}

class Store {
    CropInfo[] seed;

    Store(){
        seed = new CropInfo[]{
                new Corn(),
                new Tomato(),
                new Strawberry(),
                new Basil(),
                new Lettuce(),
                new Broccoli(),
                new Apple(),
                new Pear(),
                new Rice()
        };
        Arrays.sort(seed, Comparator.comparingInt(crop -> crop.seedPrice));
    }
}