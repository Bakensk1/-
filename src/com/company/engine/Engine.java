package com.company.engine;

import java.util.Scanner;

public class Engine {
    Scanner scan = new Scanner(System.in);
    public double power;
    public String manufacturer;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public Engine() {
        System.out.println("Choose Locomotive's manufacturer: ");
        System.out.println("China"+"\n"+"Japan"+"\n"+"Germany");
        this.manufacturer = scan.nextLine();
        if (manufacturer.equals("China")){
            power = 200000000;
        }
        else if (manufacturer.equals("Germany")){
            power = 100000000;
        }
        else if (manufacturer.equals("Japan")){
            power = 150000000;
        }
        else{
            System.out.println("We don't have another locomotives");
            
        }
    }



    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
