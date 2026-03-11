public class INHERITANCE {

// Inheritance in Java
// Inheritance allows one class to acquire the properties and methods of another class.


// Syntax of Inheritance
// class Subclass extends Superclass {
// }


// Types of Inheritance in Java
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance


// Parent Class (Superclass)
class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}


// Child Class (Single Inheritance)
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}


// Multilevel Inheritance
class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating object of Puppy
        Puppy p = new Puppy();

        // Accessing methods from all inherited classes
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}

// OUTPUT ------>
// Animal can eat
// Dog barks
// Puppy weeps

}
