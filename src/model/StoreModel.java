package model;

import java.util.Arrays;
import java.util.Comparator;

public class StoreModel {
    public DateModel dateModel;
    Store store = new Store(dateModel);

}

class Store {
    CropModel[] seed;

    Store(DateModel dateModel){
        seed = new CropModel[]{
                new Corn(dateModel),
                new Tomato(dateModel),
                new Strawberry(dateModel),
                new Basil(dateModel),
                new Lettuce(dateModel),
                new Broccoli(dateModel),
                new Apple(dateModel),
                new Pear(dateModel),
                new Rice(dateModel)
        };
        Arrays.sort(seed, Comparator.comparingInt(crop -> crop.seedPrice));
    }
}