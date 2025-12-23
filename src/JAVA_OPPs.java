import java.util.*;
import java.util.Scanner;
class JAVA_OOPs {

// /*
// There are two types of programming:
//     procedural programming
//     object oriented programming (OOP)

//          Introduction to Object-Oriented Programming in Java

// What is OOP?
//     OOP stands for Object-Oriented Programming System (or Object-Oriented Programming).
//     It’s a way of writing programs where you organize code around objects instead of just functions and logic.

//                                           OR

//     Object-Oriented Programming (OOP) is a programming paradigm(type)
//     that uses "objects" to represent data and methods to manipulate
//     that data. It emphasizes concepts such as encapsulation,
//     inheritance, polymorphism, and abstraction to promote
//     code reusability and modularity.

// Component           Purpose

// Class               Blueprint
// Object              Real-world entity
// Encapsulation       Data protection
// Inheritance         Code reuse
// Polymorphism        Multiple forms
// Abstraction         Hide details


//              Key Concepts of OOP:

//  1. Object: An instance of a class. It contains data and
//  methods defined by the class.

//  2. Class: A blueprint for creating objects. It defines the
//  properties (attributes) and behaviors (methods) that the
//  objects created from the class will have.


// PILLARS OF OOP:

//     Encapsulation:
//     The bundling of data (attributes) and methods (functions) that operate on that data into a single unit (class).
//     It restricts direct access to some of the object components, which help prevent unintended interference and misuse
//     of the data.

//     Inheritance:
//     A mechanism where a new class (sub class/ child class) can inherit properties and behaviour from an existing class
//     (super class/ parent class). This promotes code reusability and establishes a hierarchical relationship between classes.

//     Polymorphism:
//     The ability of different classes to be treated as instances of the same class through a common interface.
//     It allows methods to do different things based on the object that it is acting upon, even though they share the same name.

//     Abstraction:
//     The concept of hiding the complex implementation details and exposing only the essential features of an object.
//     It helps in reducing complexity and increases efficiency.


//                  Benefits of OOP:

//  1. Code Reusability: Through inheritance, existing code can be reused in new
//   classes, reducing redundancy.

//  2. Modularity: Code is organized into classes and objects, making it easier to
//   manage and maintain.

//  3. Flexibility: Polymorphism allows for flexible and dynamic code that can
//   adapt to different situations.

//  4. Easier Maintenance: Encapsulation helps in protecting data and ensures that
//   objects can only be modified through well-defined methods, making maintenance
//   easier.

//  5. Real-World Modeling: OOP allows for better modeling of real-world entities
//   and relationships, making it easier to understand and design complex systems.


    public static void main(String[] args) {

       // Creating objects of the OOP class
       // Syntax: classname objectname = new classname();

        car hamzas_car = new car();

       // Calling method to display data
       // objectname.methodname();

       hamzas_car.honk();           // Output: Beep Beep!
       hamzas_car.start();          // Output: Car Started

       // objectname.attributename;

        hamzas_car.brand="Honda";
       System.out.println(hamzas_car.brand);          // Output: Honda
       System.out.println(hamzas_car.year);          // Output: 2008
        car ammars_car= new car();
       System.out.println(ammars_car.brand);       // Output: Suzuki
       System.out.println(ammars_car.year);        // Output: 2008
    }
}
class car{
   String brand="Suzuki";          // Attribute (property)
   int year = 2008;              // Attribute (property)

   // Method (behavior)

    void honk() {
        System.out.println("Beep Beep!");}
    void start() {
        System.out.println("Car Started");}

}




//  Make a class Pen with attributes ink type, ink color, pen type and method
//  write print "I am a pen and I can write"
//  class OOP {
//    public static void main(String[] args) {
//        pen obj1 = new pen();
////        obj1.write(); // Output: I am a pen and I can write
//        System.out.println(obj1.ink_color);
//        obj1.ink_color="green";
//        System.out.println(obj1.ink_color);
//    }
//}
//class pen {
//    String ink_type = "gel";
//    String ink_color = "blue";
//    String pen_type = "gel pen";
//
//    void write() {
//        System.out.println("I am a pen and I can write");
//    }
//}
//    void display() {
//    System.out.println("Ink Type: "+ink_type);
//    System.out.println("Ink Color: "+ink_color);
//    System.out.println("Pen Type: "+pen_type);
//    }
//}

//  Make a class of shape with 3 attribute lenght breath & radius and 2 methods
//  find_area(lenght * breath) and find_circumference(2*3.14*radius).
//class Main{
//    public static void main(String[] args){
//        Shape square = new Shape(5,4,0);
//        Shape circle = new Shape(0,0,5);
//        square.find_area();
//        square.find_circumference();
//        circle.find_circumference();
//        circle.find_area();
//    }
//}
//class Shape{
//    int lenght;
//    int breath;
//    double radius;
//    //Constructor
//    Shape(int l, int b, double r){
//        lenght = l;
//        breath = b;
//        radius = r;
//    }
//    void find_area(){
//        int area = lenght*breath;
//        System.out.println("The area is found to be: "+area);
//    }
//    void find_circumference(){
//        double circumference = 2*(radius)*3.14;
//        System.out.println("The circumference is found to be: "+circumference);
//    }
//}

import java.util.*;
// Getters and Setters in OOP:
// Getters and Setters are methods used to access and update
// the private attributes of a class. They provide a controlled
// way to read and modify the values of private variables,
// ensuring encapsulation and data integrity.
// Example:
//class GetterSetter{
//	public static void main(String[] args){
//            // Creating objects of the OOP class
//            Person obj1 = new Person();
//            System.out.println(obj1.getName());
//            obj1.setName("Hussain");
//            obj1.setAge(25);
//            obj1.setHairColor("White");
//            System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge()+", Hair Color: " + obj1.getHairColor());
//            Person obj2= new Person();
//            System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge()+", Hair Color: " + obj2.getHairColor());
//	}
//}
//class Person {
//    String name; // attribute default null
//    int age; // attribute default 0
//    String hair_color; // attribute default null
//
//    // Getter for name
//    public String getName() {return name;}
//    // Setter for name
//    public void setName(String newname) {
//        this.name = newname;}
//    // Getter for age
//    public int getAge() {return age;}
//    // Setter for age
//    public void setAge(int newage) {
//        if (newage >= 0) { // Validation
//            this.age = newage;
//        } else {
//            System.out.println("Age cannot be negative.");
//        }
//    }
//    //Getter for hair color
//    public String getHairColor() {return hair_color;}
//    //Setter for hair color
//    public void setHairColor(String new_hair_color) {
//        this.hair_color = new_hair_color;}


//
//    public static void main(String[] args) {
//        // Creating objects of the OOP class
//        Person obj1 = new Person("Hamza",24,"Brown");
//        System.out.println(obj1.getName());
//        obj1.setName("Hussain");
//        obj1.setAge(25);
//        obj1.setHairColor("White");
//
//        System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge()+", Hair Color: " + obj1.getHairColor());
//
//        Person obj2= new Person();
//        System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge()+", Hair Color: " + obj2.getHairColor());

//    }


//Make a class 'Car' with attributes 'brand' and 'year' and 'model'.
//Make getter setter to initialize these attributes.
// Include methods to 'honk', 'start', and 'display' the car's details.
//In 'honk', print "Beep Beep!".
//In 'start', print "Car Started".
//In 'display', print the brand, year, and model of the car.

class GetterSetter{
    public static void main(String[] args){
        Car1 car1 = new Car1();
        car1.setBrand("Ford");
        car1.setModel("Ford GT");
        car1.setYear(2022);
        car1.honk();
        car1.start();
        car1.display();
        Car1 car2 = new Car1();
        car2.display();

    }
}
class Car1{
    String brand;
    String model;
    int year;
    //Getter Setter Methods
    //Getter syntax ->
//    public datatype_attribute get+attribute_name(){
//      return attribute_name
//    }
    //Setter syntax ->
//    public void set+attribute_name(datatype_attribute new_value(new+attribute_name){
//      this.attribute_name =  new+attribute_name
//    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String newbrand) {
        this.brand = newbrand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void honk(){
        System.out.println("Beep Beep");
    }
    public void start(){
        System.out.println("Car Started");
    }
    public void display(){
        System.out.println("Brand: " + this.brand + ", Model: " + this.model+", Year: " + this.year);
    }
}




