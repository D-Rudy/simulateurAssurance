package com.mycompany.insuranceSimulator.contract;

public class Moto extends Vehicle {
    private Integer numberOfCylinder;


    @Override
    public void calculateRate() {
    }

    @Override
    public void print() {

    }

    public Integer getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(Integer numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "numberOfCylinder: " + numberOfCylinder +
                '}';
    }
}
