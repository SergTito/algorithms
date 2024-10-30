package com.sergTito;

public class Auto {
     String name ;
     int maxSpeed;


    public Auto(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

