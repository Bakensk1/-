package com.company.wagon;

public class Economy extends Wagon{
    public int numberOfPeople;
    public static int numberOfRooms = 12;
    public final static double cost = 50; //$
    public Economy(double weight, double volume,int numberOfPeople, int numberOfRooms) {
        super(weight, volume);
        this.numberOfPeople = numberOfPeople;
        this.numberOfRooms = numberOfRooms;

    }


    @Override
    public double totalWeight(){
        return weight + (numberOfPeople * 70);
    }
    @Override
    public int getPeople(){
        return numberOfPeople;
    }
    @Override
    public int getRooms(){
        return numberOfRooms;
    }
    @Override
    public final double getCost() {
        return cost;
    }
}
