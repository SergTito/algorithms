package com.sergTito.abstractFactory.absFuctory;

import com.sergTito.abstractFactory.DogePickup;
import com.sergTito.abstractFactory.DogeSuv;
import com.sergTito.abstractFactory.Pickup;
import com.sergTito.abstractFactory.Suv;

public class DogeFactory implements CarsFactory{
    @Override
    public Suv createSuv() {
        return new DogeSuv();
    }

    @Override
    public Pickup createPickup() {
        return new DogePickup();
    }
}
