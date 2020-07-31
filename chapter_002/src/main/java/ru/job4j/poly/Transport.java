package ru.job4j.poly;

public interface Transport {
    void toRide();

    void passengers(int numOfPassengers);

    int fillUp(int fuelQuantity);
}
