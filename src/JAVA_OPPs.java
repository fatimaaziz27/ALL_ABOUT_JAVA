//=====================================================
//              OBJECT ORIENTED PROGRAMMING
//=====================================================

// Main Concepts of OOP:
//
// 1. Classes and Objects
// 2. Encapsulation
// 3. Inheritance
// 4. Polymorphism
// 5. Abstraction
// 6. Interfaces


//=====================================================
//               1. CLASSES & OBJECTS
//=====================================================

// Definition:
// Class:
// A blueprint or template for creating objects.
//
// Object:
// An instance of a class representing a real-world entity.

/*

                    CLASS
                      |
                      v

             Blueprint / Template
                      |
             -------------------
             |                 |
             v                 v

          Fields            Methods

                      |
                      v

                    OBJECT
                      |
                      v

              Instance of Class

*/

class Car {

    // Fields
    String model;
    int year;

    // Methods
    void start() {
        System.out.println("Car is starting.");
    }

    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

//=====================================================
//                 2. ENCAPSULATION
//=====================================================

// Definition:
// Encapsulation means binding data and methods
// into a single unit and protecting data
// using private access modifiers.

/*

                 ENCAPSULATION
                        |
        --------------------------------
        |                              |
        v                              v

   Hide Internal Data          Controlled Access
      (private)               Using Getter/Setter

*/

class Student {

    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

//=====================================================
//                 4. POLYMORPHISM
//=====================================================

// Definition:
// One method performing different actions
// depending on the object.


//=====================================================
//             METHOD OVERLOADING
//=====================================================

/*


              METHOD OVERLOADING
                        |
         Same Method Name
         Different Parameters

*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

//=====================================================
//             METHOD OVERRIDING
//=====================================================

/*

              METHOD OVERRIDING
                        |
         Same Method Name
       Different Implementation

*/

class Bird {

    void sing() {
        System.out.println("Bird is singing.");
    }
}

class Parrot extends Bird {

    @Override
    void sing() {
        System.out.println("Parrot is mimicking.");
    }
}


//=====================================================
//                  5. ABSTRACTION
//=====================================================

// Definition:
// Hiding implementation details
// and showing only essential features.

/*


                    ABSTRACTION
                           |
         --------------------------------
         |                              |
         v                              v

   Hide Complex Logic         Show Essential Features

*/

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

//=====================================================
//                    6. INTERFACES
//=====================================================

// Definition:
// An interface contains abstract methods
// that implementing classes must define.

/*

                     INTERFACE
                           |
          --------------------------------
          |                              |
          v                              v

      Multiple Classes          Common Behavior

*/

interface ShapeInterface {

    void draw();

    double calculateArea();
}

class CircleInterface implements ShapeInterface {

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public double calculateArea() {

        // Area calculation
        return 0;
    }
}

//=====================================================
//                    MAIN CLASS
//=====================================================

public class OOPConcepts {

    public static void main(String[] args) {

//=================================================
        //           CLASSES & OBJECTS
        //=================================================

             Car myCar = new Car();

        myCar.model = "Toyota";
        myCar.year = 2022;

        myCar.start();
        myCar.accelerate();

        //=================================================
        //              ENCAPSULATION
        //=================================================

        Student s1 = new Student();

        s1.setName("Ali");
        s1.setAge(20);

        System.out.println(
                "Student Name: " + s1.getName()
                + ", Age: " + s1.getAge()
        );

        //=================================================
        //               INHERITANCE
        //=================================================

        Dog d1 = new Dog();

        d1.eat();
        d1.bark();


        //=================================================
        //              POLYMORPHISM
        //=================================================

Calculator c1 = new Calculator();

        System.out.println(c1.add(2, 3));
        System.out.println(c1.add(2.5, 3.5));

        Parrot p1 = new Parrot();
        p1.sing();

//=================================================
        //               ABSTRACTION
        //=================================================

Circle circle1 = new Circle();
        circle1.draw();

        //=================================================
        //                INTERFACES
        //=================================================


        CircleInterface ci = new CircleInterface();

        ci.draw();
        System.out.println(ci.calculateArea());
    }
}

/*

======================== OUTPUT ========================

 
Car is starting.
Car is accelerating

Student Name: Ali, Age: 20

Animal is eating.
Dog is barking.










             






































































class JAVA_OOPs {

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

        class Student {
            int id;
            String name;
        }

//     Inheritance:
//     A mechanism where a new class (sub class/ child class) can inherit properties and behaviour from an existing class
//     (super class/ parent class). This promotes code reusability and establishes a hierarchical relationship between classes.

        class Student {
            int id;
            String name;
        }

//     Polymorphism:
//     The ability of different classes to be treated as instances of the same class through a common interface.
//     It allows methods to do different things based on the object that it is acting upon, even though they share the same name.

        // Types:
        // Method Overloading
        // Method Overriding

//     Abstraction:
//     The concept of hiding the complex implementation details and exposing only the essential features of an object.
//     It helps in reducing complexity and increases efficiency.

        abstract class Shape {
            abstract void draw();
            }


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

//               Java OOP Example  -------->

// Parent class (Base class)
class Animal {

    // Method of Animal class
    void sound() {
        // This method prints a general message for animals
        System.out.println("Animal makes sound");
    }
}

// Child class (Derived class) that inherits from Animal
class Dog extends Animal {

    // Method overriding
    // The Dog class provides its own implementation of the sound() method
    void sound() {
        // This message is specific to Dog
        System.out.println("Dog barks");
    }
}

// Main class where the program starts
public class Main {

    public static void main(String[] args) {

        // Creating an object of Dog class
        Dog d = new Dog();

        // Calling the sound() method
        // Since the object is of Dog class, Dog's sound() method will run
        d.sound();
    }
}
}

// OUTPUT ---->
// Dog barks

//=====================================================
//                  3. INHERITANCE
//=====================================================

// Definition:
// Inheritance allows one class to acquire
// properties and methods of another class.

/*

                    INHERITANCE
                           |
                 -------------------
                 |                 |
                 v                 v

             Superclass         Subclass

*/

class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}













