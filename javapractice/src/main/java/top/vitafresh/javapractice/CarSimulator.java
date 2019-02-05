package top.vitafresh.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator...");

        Car myToyota = new Car("Red");

        System.out.println("Color = " + myToyota.color);
        myToyota.color="Blue";
        System.out.println("Color = " + myToyota.color);
        System.out.println("Num of seats = " + myToyota.getmNumberOfSeats());


    }
}
