package com.ciklum.hybris.internship.sesection.collections.models;

public class Vehicle {
    String make;
    String modle;
    int price;
    boolean fourWDrive;

    public Vehicle(String make, String modle, int price, boolean fourWDrive) {
        this.make = make;
        this.modle = modle;
        this.price = price;
        this.fourWDrive = fourWDrive;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    public void setFourWDrive(boolean fourWDrive) {
        this.fourWDrive = fourWDrive;
    }

    @Override
    public String toString() {
        return "Vehicle :" +
                "make='" + make + '\'' +
                ", modle='" + modle + '\'' +
                ", price=" + price +
                ", fourWDrive=" + fourWDrive;
    }
}
