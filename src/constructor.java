import java.util.*;

import javax.print.attribute.standard.Copies;
public class Constructor {

// Constructors in Java
// A constructor is a special method used to initialize objects.

// Types of Constructors

// 1. Default Constructor
// Constructor without parameters.

class Student {
    Student() {
        System.out.println("Default Constructor");
    }
}

// 2. Parameterized Constructor
// Constructor with parameters.

class Students {
    int id;
    Student(int i) {
        id = i;
    }
}

// 3. Copy Constructor
// Copies values from another object.




    //Types of Constructor:
    //1. Argumental
    // Constructor with parameters

    //2. Non Argumental/ Programmer Defined Default
    // Constructor without parameters written by programmer
    //3. Java Default
// Constructor automatically created by Java if none exists

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your Hair Color: ");
            String color = input.nextLine();
            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            // Creating objects of the OOP class
            Person obj1 = new Person(name,age,color);

            System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge()+", Hair Color: " + obj1.getHairColor());
    //
            Person obj2= new Person();
            System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge()+", Hair Color: " + obj2.getHairColor());
        }
    }
    class Person {
        String name; // attribute default null
        int age; // attribute default 0
        String hair_color; // attribute default null
        //Non Argumantal Constructor
        //Syntax:
        //classname(){
        //  this.attribute = programmer_default_value
        Person(){
            this.name = "Unknown";
            this.age = 10;
            this.hair_color = "Black";
        }
        // Argumantal Constructor
        //Syntax:
        //classname( datatype_of_attribute transpoter_for_attribute,....){
        //  this.attribute = transpoter_for_atttribute
        Person(String initial_name,int initial_age, String initial_hair_color){
            this.name = initial_name;
            this.age = initial_age;
            this.hair_color = initial_hair_color;
        }


        // Getter for name
        public String getName() {
            return name;
        }
        // Setter for name
        public void setName(String newname) {
            this.name = newname;
        }
        // Getter for age
        public int getAge() {
            return age;
        }
        // Setter for age
        public void setAge(int newage) {
            if (newage >= 0) { // Validation
                this.age = newage;
            } else {
                System.out.println("Age cannot be negative.");
            }
        }
        //Getter for hair color
        public String getHairColor() {
            return hair_color;
        }
        //Setter for hair color
        public void setHairColor(String new_hair_color) {
            this.hair_color = new_hair_color;
        }

    }


    //Person(){  //Non Argumantal Constructor
    //    this.name = "Unknown";
    //    this.age = 10;
    //    this.hair_color = "Black";
    //}
    
