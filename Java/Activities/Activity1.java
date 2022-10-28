package activities;

class Car{

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres = 4;
        doors = 4;
    }

    void displayCharacteristics(){
        System.out.println("Color: " +color);
        System.out.println("Transmission: " +transmission);
        System.out.println("Make: "+make);
        System.out.println("Tyres: " +tyres);
        System.out.println("Doors: " +doors);
    }

    void accelarate(){
        System.out.println("Car is moving forward.");
    }

    void brake(){
        System.out.println("Car has stopped.");
    }
}

public class Activity1 {
    public static void main(String[] args){

        Car carName = new Car();
        carName.make = 2014;
        carName.color = "Black";
        carName.transmission = "Manual";

        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();
    }
}
