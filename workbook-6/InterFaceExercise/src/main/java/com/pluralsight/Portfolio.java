package com.pluralsight;

import java.util.ArrayList;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(FixedAsset assets){}

    @Override
    public double getValue() {
        return 0;
    }
}
