package it.project.classes;

public class Boat extends Vehicle {
    private double maxKnotSpeed;
    private int boatKilosWeight;

    @Override
    public void vehicleSound(){
        System.out.println("CiufCiuf!!");   //is not a train, is just a steam boat
    }

    public Boat(double maxSpeed, int weight){
        setType("boat");
        this.maxKnotSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return "The boat's speed is " + this.maxKnotSpeed + " and his weight is " + this.boatKilosWeight + ".";
    }
}
