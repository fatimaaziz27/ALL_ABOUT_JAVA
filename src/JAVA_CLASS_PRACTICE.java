import java.util.*;
// Inheritance

// 1. Shape Inheritance
// Define a base class `Shape` with a method `draw()`. Then create subclasses `Circle` and `Rectangle`, each
// implementing the `draw()` method. Demonstrate polymorphism.
/*
class java_class_practice {
    public static void main(String[] args) {
        shape circle = new shape(" and I am round");
        shape rectangle = new shape(" and I have 4 sides");
        circle.draw();
        rectangle.draw();
    }
}
class shape{
    String draw;
    shape (String draw){
        this.draw = draw;
    }
    void draw(){
        System.out.println("i can be drawn" + draw);
    }
}
class circle extends shape{
    circle(String draw){
        super(draw);
    }
}
class rectangle extends shape{
    rectangle(String draw){
        super(draw);
    }
}
*/

// 2. Animal and Dog Classes
// Create a class `Animal` with attributes `name` and `species`. Then, create a class `Dog` that inherits from
// `Animal`, with an additional attribute `breed`. Demonstrate usage by creating instances of both classes and
// printing their information.
/*
class java_class_practice {
    public static void main(String[] args) {
        animal dog = new animal(" fnfffghghhrt");
        dog.name();
        dog.species();
    }
}
class animal{
    String name;
    String species;
    animal(String name, String species){
        this.name = name;
        this.species = species;
    }
}
class dog extends animal{
    String breed;

    dog(String breed,String name,String species){
        this.breed = breed;
        super(name,species);
    }
}
*/

// 3. Person and Employee Classes
// Define a `Person` class with attributes `name`, `age`, and `address`. Then define an `Employee` class that
// inherits from `Person` and adds an attribute `salary`. Print out the details of an employee.

class java_class_practice {
    public static void main(String[] args) {
        animal dog = new animal(" fnfffghghhrt");
        dog.name();
        dog.species();
    }
}
class person{
    String name;
    Integer age;
    String address;
    person(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class employee extends person{
    Integer salary;
    employee(String name,Integer age,String address,Integer salary){
        super(name, age, address);
        this.salary = salary;
    }

}

// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.

// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.

// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

