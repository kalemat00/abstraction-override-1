package it.project.testerClass;

import it.project.classes.Boat;
import it.project.classes.Car;

public class Tester {

    public static void main(String...args){
        Boat boat = new Boat(35.23, 4000);
        Car car = new Car(4, 5, 24000);

        car.vehicleSound();
        car.showVehicleDetails();

        System.out.println("\n --------- \n");

        boat.vehicleSound();
        boat.showVehicleDetails();

        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
