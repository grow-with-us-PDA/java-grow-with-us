package model;

import java.util.Arrays;
import java.util.Comparator;

public class StoreModel {
    Store store = new Store();

}

class Store {
    CropModel[] seed;

    Store(){
        seed = new CropModel[]{
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