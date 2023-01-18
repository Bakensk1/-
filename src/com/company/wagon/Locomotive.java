package com.company.wagon;

import com.company.engine.Engine;

public class Locomotive extends Wagon {
    Engine engine = new Engine();

    public Locomotive(double weight, double volume) {
        super(weight, volume);
    }

    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public double totalWeight(){
        return weight;
    }

    public String toString(){
        return "Lokomotiv: "+"\n"+"Engine power: "+engine.power+" || Manufacturer: "+engine.manufacturer;
    }

    @Override
    public double getPower(){
        return engine.power;
    }







}
