package com.company.wagon;

public class Lux extends Wagon{

    public int numberOfPeople;
    public static int numberOfRooms = 7;
    public final static double cost = 200; //$
    public Lux(double weight, double volume,int numberOfPeople,int numberOfRooms) {
        super(weight, volume);
        this.numberOfPeople = numberOfPeople;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double totalWeight(){
        return weight + (numberOfPeople * 60);
    }

    @Override
    public int getPeople(){
        return numberOfPeople;
    }
    @Override
    public int getRooms(){
        return numberOfRooms;
    }

    public final double getCost() {
        return cost;
    }
}
