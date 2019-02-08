package top.vitafresh.javapractice;

public class SelfDrivingCar extends Car {
    public SelfDrivingCar(String chosenColor, String chosenInterior) {
        super(chosenColor, chosenInterior);
        System.out.println("Constructing self-driving car...");
    }

    public SelfDrivingCar() {
    }
}
