import java.util.*;
class Access_Modifiers {
    //Access Modifiers in Java:
//Access modifiers are keywords in Java that set the accessibility
// of classes, methods, and variables. The three main access
// modifiers are:
// 1. Public: Accessible from any other class.
// 2. Protected: Accessible within the same class and subclasses.
// 3. Private: Accessible only within the declared class.


// Why use Access Modifiers?
// Access modifiers are used to implement encapsulation,
// a core principle of OOP. They help protect the internal
// state of an object by restricting direct access to its
// attributes. This ensures that the object's data can only
// be modified through controlled methods (getters and setters),
// maintaining data integrity and preventing unintended interference.
// By using access modifiers, developers can define clear
// interfaces for their classes, enhancing code maintainability
// and readability.

// Example of Access Modifiers:
// class Example {
//     public int publicVar; // Accessible from anywhere
//     private int privateVar; // Accessible only within this class
//     protected int protectedVar; // Accessible within package and subclasses
// }

// Example:
class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", 2020, "Corolla");
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getModel());
        
        myCar.setBrand("Ford");
        myCar.setModel("Ford GT");
        myCar.setYear(2022);
        
        myCar.display();
    }
}
class Car {
    public String brand;
    protected int year;
    private String model;

    // Constructor
    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    //Getter
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    //Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Method to honk
    protected  void honk() {
        System.out.println("Beep Beep!");
    }

    // Method to start the car
    private void start() {
        System.out.println("Car Started");
    }

    // Method to display car details
    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Model: " + model);
    }
    
}}