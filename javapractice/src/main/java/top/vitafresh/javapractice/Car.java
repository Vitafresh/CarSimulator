package top.vitafresh.javapractice;

public class Car {
    public String color="Black";
    private int mNumberOfSeats = 5;


    public Car(){
        //Constructor
    }

    public Car(String chosenColor){
        //Constructor
        color=chosenColor;
    }

    public int getmNumberOfSeats() {
        return mNumberOfSeats;
    }
}
