package com.sergTito.abstractFactory.absFuctory;

import com.sergTito.abstractFactory.Pickup;
import com.sergTito.abstractFactory.Suv;

public interface CarsFactory {
    Suv createSuv();
    Pickup createPickup();
}
