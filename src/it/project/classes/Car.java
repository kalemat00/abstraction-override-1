package it.project.classes;

public class Car extends Vehicle{
    private int numberOfDoors;
    private double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The car has " + this.numberOfDoors + " doors.");
    }

    @Override
    public void vehicleSound(){
        System.out.println("BroomBroom!!");
    }

    public Car(int wheels, int doors, double price){
        setType("car");
        setNumberOfWheels(wheels);

        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    //something not required by the assignment that i have implement in the class for the
    //private variable not used in the method showVehicleDetails (lo so il mio inglese e' pessimo)


    public double getCarPrice() {
        return carPrice;
    }
}
