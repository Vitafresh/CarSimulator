package top.vitafresh.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator...");


        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow","Plastic");
        System.out.println("Color = " + autoBot.color);
        System.out.println("Interior = " + autoBot.mInterior);
        autoBot.Drive();

//        Car myToyota = new Car("Red","Sedan");
//        System.out.println("Color = " + myToyota.color);
//        myToyota.color="Blue";
//        System.out.println("Color = " + myToyota.color);
//        System.out.println("Num of seats = " + myToyota.getNumberOfSeats());
//        System.out.println("Interiror = " + myToyota.getInterior());
//
        Car myHonda = new Car();
        System.out.println("Color = " + myHonda.color);
        System.out.println("Num of seats = " + myHonda.getNumberOfSeats());
        System.out.println("Interiror = " + myHonda.getInterior());
        myHonda.Drive();



    }
}
