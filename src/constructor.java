import java.util.*;

import javax.print.attribute.standard.Copies;
public class Constructor {

// Constructors in Java
// A constructor is a special method used to initialize objects.

//Types of Constructor:
    
    //1. Argumental
    // Constructor with parameters

    //2. Non Argumental/ Programmer Defined Default
    // Constructor without parameters written by programmer

    Person(){
        this.name = "Unknown";
        this.age = 10;
        this.hair_color = "Black";
        }

    //3. Java Default
    // Constructor automatically created by Java if none exists


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

}
