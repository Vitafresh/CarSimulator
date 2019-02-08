package top.vitafresh.javapractice;

public class Car {
    public String color="Black";
    private int mNumberOfSeats = 5;
    protected String mInterior;


    public Car(){
        //Constructor
        mInterior="Leather";
    }

    public Car(String chosenColor){
        //Constructor
        color=chosenColor;
    }

    public Car(String chosenColor, String chosenInterior){
        //Constructor
        color=chosenColor;
        mInterior=chosenInterior;
    }


    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void Drive(){
        System.out.println("Driving car." );
    }
}
