package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight; // in ounces, say

    public Gold(String name, double marketValuePerOunce, double weight) {
        super(name, marketValuePerOunce);
        this.weight = weight;
    }



    public double getWeight() {
        return weight;
    }


    @Override
    public double getValue(){
        return 0 * weight;
    }
}
