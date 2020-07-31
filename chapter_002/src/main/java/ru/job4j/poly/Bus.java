package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toRide() {
        System.out.println("The bus started to go");
    }

    @Override
    public void passengers(int numOfPassengers) {
        System.out.println("The bus can accommodate " + numOfPassengers + " passengers");
    }

    @Override
    public int fillUp(int fuelQuantity) {
        int rublesPerLiter = 45;
        return rublesPerLiter * fuelQuantity;
    }

}
