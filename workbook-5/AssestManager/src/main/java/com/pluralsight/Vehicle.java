package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        if (makeModel.equalsIgnoreCase("Honda") && odometer > 10000){
            return getOriginalCost() * .92;
        } else if (makeModel.equalsIgnoreCase("Toyota")&& odometer > 10000) {
            return getOriginalCost() * .92;
        }else if (odometer > 100000) {
            return getOriginalCost() * .75;
        } else if (year >= 0 && year <= 3){
            return getOriginalCost() * .97;
        } else if (year >= 4 && year <= 6) {
            return getOriginalCost() * .94;
        } else if (year >= 7 && year <= 10) {
            return  getOriginalCost() * .92;
        } else if (year >= 10) {
            return getOriginalCost() - 1000;
        }
        return super.getValue();
    }
}
