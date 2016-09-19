package com.example.michal.coffeinaandroidapp;

/**
 * Created by Michał on 12.09.2016.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "Some Latte", R.drawable.latte),
            new Drink("Cappuccino", "Some Cappuccino", R.drawable.cappuccino),
            new Drink("Espresso", "Some Espresso", R.drawable.espresso)
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
