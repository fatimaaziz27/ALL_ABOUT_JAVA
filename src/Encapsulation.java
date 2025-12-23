import java.util.*;
public class Encapsulation {
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
static class Car1{
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
}
