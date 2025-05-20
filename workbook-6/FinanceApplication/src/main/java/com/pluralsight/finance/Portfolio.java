package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    @Override
    public double getValue() {
       double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable(){
        ArrayList<Valuable> highest
        for (Valuable asset : assets) {
            if (asset.getValue() == assets.mi)

        }
    }

    public Valuable getLeastValuable(){

    }
}
