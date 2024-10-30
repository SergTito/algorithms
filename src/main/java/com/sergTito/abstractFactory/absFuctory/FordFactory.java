package com.sergTito.abstractFactory.absFuctory;

import com.sergTito.abstractFactory.FordPickup;
import com.sergTito.abstractFactory.FordSuv;
import com.sergTito.abstractFactory.Pickup;
import com.sergTito.abstractFactory.Suv;

public class FordFactory implements CarsFactory{
    @Override
    public Suv createSuv() {
        return new FordSuv();
    }

    @Override
    public Pickup createPickup() {
        return new FordPickup();
    }
}
