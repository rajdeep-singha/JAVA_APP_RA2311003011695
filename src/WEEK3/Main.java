package WEEK3;

class Car {
    String model;
    int year;
    String color;

    // Constructor
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Tesla Model S", 2022, "Red");
        Car car2 = new Car("Ford Mustang", 2021, "Blue");

        // Displaying their information
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}