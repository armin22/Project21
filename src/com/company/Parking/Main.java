package com.company.Parking;

public class Main {
    public static void main(String[] args) {
        Kia kia = new Kia("Forte", Car.CarType.COUPE);
        Parking park = new Parking(3);

        park.addCarInParking(kia);
        park.addCarInParking(kia);

        Audi audi = new Audi("GDG", Car.CarType.JEEP);
        Parking park1 = new Parking(3);
        park1.addCarInParking(audi);
    }
}
