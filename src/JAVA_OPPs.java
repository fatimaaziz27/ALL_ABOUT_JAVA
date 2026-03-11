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











