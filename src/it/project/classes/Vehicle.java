package it.project.classes;

public abstract class Vehicle {
    private String type;
    private int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("The vehicle is a " + this.type + " and has " + this.numberOfWheels + " wheels.");
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void vehicleSound();
}
