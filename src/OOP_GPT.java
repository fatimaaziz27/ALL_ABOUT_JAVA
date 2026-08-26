/*                         JAVA OOP
 *                    OOP.java / OOP.java
 * ============================================================
 *
 * Topics:
 *
 * 1. Classes & Objects
 * 2. Constructors
 * 3. Encapsulation
 * 4. Inheritance
 * 5. Polymorphism
 * 6. Abstraction
 * 7. Interfaces
 * 8. Access Modifiers
 * 9. static
 * 10. final
 * 11. this
 * 12. super
 *
 * ============================================================
 */


/*
 * 1. CLASSES & OBJECTS
 * ============================================================
 *
 * Class  = Blueprint
 * Object = Actual instance created from the class
 *
 * Example:
 *
 * class Car
 *      ↓
 * Car car1 = new Car();
 *      ↓
 * Object
 *
 * ============================================================
 */

class Car {

    String color;
    String model;

    void drive() {

        System.out.println("Car is driving");
    }
}


/*
 * Example
 */

class ClassesObjectsExample {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.color = "Black";
        car1.model = "Toyota";

        System.out.println(car1.color);
        System.out.println(car1.model);

        car1.drive();
    }
}


/*
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a class called Student with:
 *
 * name
 * age
 * marks
 *
 * Create an object and print the values.
 *
 *
 * Q2.
 * Create a class called Book with:
 *
 * title
 * author
 * price
 *
 * Create an object and print the values.
 *
 *
 * Q3.
 * Create a class called Phone with:
 *
 * brand
 * model
 *
 * Create a method:
 *
 * call()
 *
 * Print "Calling..."
 *
 *
 * ============================================================
 */


/*
 * 2. CONSTRUCTORS
 * ============================================================
 *
 * A constructor is a special method that runs automatically
 * when an object is created.
 *
 * Rules:
 *
 * 1. Same name as the class
 * 2. No return type
 * 3. Runs automatically when using new
 *
 * ============================================================
 */

class StudentConstructor {

    String name;
    int age;

    StudentConstructor(String name, int age) {

        this.name = name;
        this.age = age;
    }
}


/*
 * Example
 */

class ConstructorExample {

    public static void main(String[] args) {

        StudentConstructor student =
                new StudentConstructor("Fatima", 20);

        System.out.println(student.name);
        System.out.println(student.age);
    }
}


/*
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a Student class with a constructor that accepts:
 *
 * name
 * age
 *
 *
 * Q2.
 * Create a Car class with a constructor that accepts:
 *
 * brand
 * model
 * price
 *
 *
 * Q3.
 * Create a Book class with a constructor that accepts:
 *
 * title
 * author
 * price
 *
 *
 * ============================================================
 */


/*
 * 3. ENCAPSULATION
 * ============================================================
 *
 * Encapsulation means protecting data inside a class.
 *
 * Usually:
 *
 * private variable
 *       ↓
 * getter / setter
 *       ↓
 * controlled access
 *
 * ============================================================
 */

class BankAccount {

    private double balance;


    public void setBalance(double balance) {

        if (balance >= 0) {

            this.balance = balance;
        }
    }


    public double getBalance() {

        return balance;
    }
}


/*
 * Example
 */

class EncapsulationExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println(account.getBalance());
    }
}


/*
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a Person class with a private age variable.
 *
 * Create:
 *
 * setAge()
 * getAge()
 *
 *
 * Q2.
 * Create a BankAccount class with a private balance.
 *
 * Don't allow a negative balance.
 *
 *
 * Q3.
 * Create a Student class with private marks.
 *
 * Only allow marks between 0 and 100.
 *
 *
 * ============================================================
 */


/*
 * 4. INHERITANCE
 * ============================================================
 *
 * Inheritance allows a child class to inherit properties
 * and methods from a parent class.
 *
 * Keyword:
 *
 * extends
 *
 * Example:
 *
 * Animal
 *    ↓
 *  Dog
 *
 * ============================================================
 */

class Animal {

    void eat() {

        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {

    void bark() {

        System.out.println("Dog is barking");
    }
}


/*
 * Example
 */

class InheritanceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}


/*
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create:
 *
 * Animal
 *    ↓
 * Dog
 *
 * Animal should have eat().
 * Dog should have bark().
 *
 *
 * Q2.
 * Create:
 *
 * Vehicle
 *    ↓
 * Car
 *
 * Vehicle should have start().
 * Car should have drive().
 *
 *
 * Q3.
 * Create:
 *
 * Person
 *    ↓
 * Student
 *
 * Person should have name.
 * Student should have study().
 *
 *
 * ============================================================
 */


/*
 * 5. POLYMORPHISM
 * ============================================================
 *
 * Polymorphism means:
 *
 * "Many forms"
 *
 * The same method can behave differently depending on
 * the object.
 *
 * Usually demonstrated using method overriding.
 *
 * ============================================================
 */

class AnimalSound {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}


class DogSound extends AnimalSound {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


class CatSound extends AnimalSound {

    @Override
    void sound() {

        System.out.println("Cat meows");
    }
}


/*
 * Example
 */

class PolymorphismExample {

    public static void main(String[] args) {

        AnimalSound animal1 = new DogSound();

        AnimalSound animal2 = new CatSound();

        animal1.sound();

        animal2.sound();
    }
}


/*
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create:
 *
 * Animal
 * Dog
 * Cat
 *
 * Override sound() in Dog and Cat.
 *
 *
 * Q2.
 * Create:
 *
 * Vehicle
 * Car
 * Bike
 *
 * Override start() in Car and Bike.
 *
 *
 * Q3.
 * Create:
 *
 * Employee
 * Manager
 * Developer
 *
 * Override work() in each child class.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 6. ABSTRACTION
 * ============================================================
 *
 * Abstraction means hiding unnecessary implementation details
 * and showing only what is important.
 *
 * An abstract class can contain:
 *
 * 1. Abstract methods
 * 2. Normal methods
 *
 * Keyword:
 *
 * abstract
 *
 * ============================================================
 */

abstract class AnimalAbstract {

    abstract void sound();


    void eat() {

        System.out.println("Animal is eating");
    }
}


class DogAbstract extends AnimalAbstract {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


/*
 * Example
 */

class AbstractionExample {

    public static void main(String[] args) {

        DogAbstract dog = new DogAbstract();

        dog.sound();

        dog.eat();
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create an abstract class Shape.
 *
 * Add:
 *
 * abstract void area();
 *
 * Create Circle and Rectangle classes.
 *
 *
 * Q2.
 * Create an abstract class Animal.
 *
 * Add:
 *
 * abstract void sound();
 *
 * Create Dog and Cat.
 *
 *
 * Q3.
 * Create an abstract class Vehicle.
 *
 * Add:
 *
 * abstract void start();
 *
 * Create Car and Bike.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 7. INTERFACES
 * ============================================================
 *
 * An interface defines a contract.
 *
 * A class uses:
 *
 * implements
 *
 * to implement an interface.
 *
 * ============================================================
 */

interface Payment {

    void pay();
}


class CreditCard implements Payment {

    @Override
    public void pay() {

        System.out.println("Payment using credit card");
    }
}


/*
 * Example
 */

class InterfaceExample {

    public static void main(String[] args) {

        CreditCard card = new CreditCard();

        card.pay();
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create an interface called Animal.
 *
 * Add:
 *
 * void sound();
 *
 * Implement it using Dog.
 *
 *
 * Q2.
 * Create an interface called Payment.
 *
 * Add:
 *
 * void pay();
 *
 * Implement it using:
 *
 * CreditCard
 * PayPal
 *
 *
 * Q3.
 * Create an interface called Vehicle.
 *
 * Add:
 *
 * void start();
 *
 * Implement it using:
 *
 * Car
 * Bike
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 8. ACCESS MODIFIERS
 * ============================================================
 *
 * Access modifiers control who can access a variable,
 * method, or class.
 *
 * Four common levels:
 *
 * public
 * private
 * protected
 * default
 *
 *
 * private:
 * Same class only.
 *
 * default:
 * Same package.
 *
 * protected:
 * Same package + subclasses.
 *
 * public:
 * Accessible from anywhere.
 *
 * ============================================================
 */

class AccessModifiersExample {

    public int publicValue = 10;

    private int privateValue = 20;

    protected int protectedValue = 30;

    int defaultValue = 40;


    public void display() {

        System.out.println(publicValue);

        System.out.println(privateValue);

        System.out.println(protectedValue);

        System.out.println(defaultValue);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a class with:
 *
 * public variable
 * private variable
 * protected variable
 * default variable
 *
 *
 * Q2.
 * Create a private variable and access it using a getter.
 *
 *
 * Q3.
 * Create a protected method and access it from a child class.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 9. static
 * ============================================================
 *
 * static means the member belongs to the class instead of
 * individual objects.
 *
 * ============================================================
 */

class StudentStatic {

    static String university = "ABC University";

    String name;
}


/*
 * Example
 */

class StaticExample {

    static int add(int a, int b) {

        return a + b;
    }


    public static void main(String[] args) {

        StudentStatic s1 = new StudentStatic();

        StudentStatic s2 = new StudentStatic();

        s1.name = "Fatima";

        s2.name = "Ali";


        System.out.println(s1.name);

        System.out.println(s2.name);


        System.out.println(StudentStatic.university);


        System.out.println(add(10, 20));
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a static variable:
 *
 * universityName
 *
 *
 * Q2.
 * Create a static method:
 *
 * add(int a, int b)
 *
 *
 * Q3.
 * Create a Student class with:
 *
 * static university
 * name
 *
 * Create two students.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 10. final
 * ============================================================
 *
 * final means something cannot be changed in a particular way.
 *
 * final variable:
 * Cannot be reassigned.
 *
 * final method:
 * Cannot be overridden.
 *
 * final class:
 * Cannot be inherited.
 *
 * ============================================================
 */


/*
 * FINAL VARIABLE
 */

class FinalVariableExample {

    public static void main(String[] args) {

        final int AGE = 20;

        System.out.println(AGE);

        // AGE = 25;   // ERROR
    }
}


/*
 * FINAL METHOD
 */

class FinalParent {

    final void display() {

        System.out.println("Hello");
    }
}


class FinalChild extends FinalParent {

    // Cannot override display()
}


/*
 * FINAL CLASS
 */

final class FinalClass {

    void display() {

        System.out.println("Hello");
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a final variable PI with value:
 *
 * 3.14159
 *
 *
 * Q2.
 * Create a final method called display().
 *
 *
 * Q3.
 * Create a final class called Constants.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 11. this
 * ============================================================
 *
 * this refers to the current object.
 *
 * It is commonly used when a constructor parameter and
 * instance variable have the same name.
 *
 * ============================================================
 */

class StudentThis {

    String name;
    int age;


    StudentThis(String name, int age) {

        this.name = name;

        this.age = age;
    }
}


/*
 * Example
 */

class ThisExample {

    public static void main(String[] args) {

        StudentThis student =
                new StudentThis("Fatima", 20);

        System.out.println(student.name);

        System.out.println(student.age);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a Person class with:
 *
 * name
 * age
 *
 * Use this in the constructor.
 *
 *
 * Q2.
 * Create a Car class with:
 *
 * brand
 * model
 *
 * Use this in the constructor.
 *
 *
 * Q3.
 * Create a Book class with:
 *
 * title
 * author
 * price
 *
 * Use this in the constructor.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 12. super
 * ============================================================
 *
 * super refers to the parent class.
 *
 * It can be used to access:
 *
 * 1. Parent variables
 * 2. Parent methods
 * 3. Parent constructors
 *
 * ============================================================
 */

class AnimalSuper {

    String name = "Animal";


    void sound() {

        System.out.println("Animal sound");
    }
}


class DogSuper extends AnimalSuper {

    String name = "Dog";


    void display() {

        System.out.println(name);

        System.out.println(super.name);

        super.sound();
    }
}


/*
 * Example
 */

class SuperExample {

    public static void main(String[] args) {

        DogSuper dog = new DogSuper();

        dog.display();
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create:
 *
 * Animal
 * Dog
 *
 * Use super to call the parent method.
 *
 *
 * Q2.
 * Create:
 *
 * Parent
 * Child
 *
 * Give both classes a variable called name.
 *
 * Use super.name to access the parent's variable.
 *
 *
 * Q3.
 * Create a parent constructor and call it from the child
 * constructor using:
 *
 * super();
 *
 *
 * ============================================================
 *                       MINI PROJECTS
 * ============================================================
 *
 *
 * PROJECT 1 — STUDENT MANAGEMENT
 * ============================================================
 *
 * Create a Student class with:
 *
 * name
 * age
 * marks
 *
 * Use:
 *
 * Constructor
 * Encapsulation
 * Getter / Setter
 * Methods
 *
 * Example:
 *
 * Student student =
 *     new Student("Fatima", 20, 85);
 *
 * Print:
 *
 * Name: Fatima
 * Age: 20
 * Marks: 85
 * Grade: A
 *
 *
 * ============================================================
 *
 *
 * PROJECT 2 — BANK ACCOUNT
 * ============================================================
 *
 * Create a BankAccount class with:
 *
 * private balance
 * accountHolder
 *
 * Methods:
 *
 * deposit()
 * withdraw()
 * getBalance()
 *
 * Rules:
 *
 * Deposit cannot be negative.
 *
 * Withdraw cannot be greater than balance.
 *
 * Example:
 *
 * Account Holder: Fatima
 * Balance: 5000
 *
 * Deposit: 2000
 *
 * Balance: 7000
 *
 *
 * ============================================================
 *
 *
 * PROJECT 3 — VEHICLE SYSTEM
 * ============================================================
 *
 * Create:
 *
 * Vehicle
 *      ↓
 * Car
 *      ↓
 * Bike
 *
 * Vehicle should have:
 *
 * start()
 *
 * Car and Bike should override:
 *
 * start()
 *
 * Use:
 *
 * Inheritance
 * Polymorphism
 * Method overriding
 *
 *
 * Example:
 *
 * Vehicle vehicle1 = new Car();
 * Vehicle vehicle2 = new Bike();
 *
 * vehicle1.start();
 * vehicle2.start();
 *
 *
 * ============================================================
 *                     OOP CHALLENGE
 * ============================================================
 *
 * Build a small Bus Booking System using OOP.
 *
 * Create classes:
 *
 * Passenger
 * Bus
 * Ticket
 *
 * Passenger:
 *
 * name
 * age
 *
 * Bus:
 *
 * busNumber
 * destination
 * price
 *
 * Ticket:
 *
 * passenger
 * bus
 * seatNumber
 *
 * Use:
 *
 * Classes
 * Objects
 * Constructors
 * Encapsulation
 * Inheritance
 * Polymorphism
 * Interfaces
 * this
 * super
 *
 *
 * ============================================================
 *                    IMPORTANT ORDER
 * ============================================================
 *
 * Learn these in this order:
 *
 * 1. Classes & Objects
 * 2. Constructors
 * 3. this
 * 4. Encapsulation
 * 5. Access Modifiers
 * 6. Inheritance
 * 7. super
 * 8. Polymorphism
 * 9. Abstraction
 * 10. Interfaces
 * 11. static
 * 12. final
 *
 *
 * Once these are comfortable, move to:
 *
 * Collections
 * Exception Handling
 * File Handling
 * Generics
 * Lambda Expressions
 * Streams
 * JDBC
 * SQL
 * Spring
 * Spring Boot
 *
 * ============================================================
 */ 
