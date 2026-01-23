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

/*
class java_class_practice {
    public static void main(String[] args) {
        person em1 = new person("me",18,"north nazimabad",250000);
        em1.name();
        em1.age();
        em1.address();
        em1.salary();
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
*/

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



//import java.util.*;
//class main{
//    public static void main(String[]args){
//
//        library b1 = new library("book_t","auth1",2007,true);
//
//        System.out.println("book title:\n" + b1.book_title + "author:\n" + b1.author + "published year:\n" +
//                b1.published_year + "is available:\n" + b1.is_available);
//
//        library b2 = new library("book_t2","auth2",2003,false);
//
//        System.out.println("book title:\n" + b2.book_title + "author:\n" + b2.author + "published year:\n" +
//                b2.published_year + "is available:\n" + b2.is_available);
//    }
//}
//class library{
//    String book_title;
//    String author;
//    Integer published_year;
//    Boolean is_available;
//
//    library(String book_name, String author_name, Integer year, Boolean available){
//        this.book_title = book_name;
//        this.author = author_name;
//        this.published_year = year;
//        this.is_available = available;
//    }
//
//    // getter
//    public String getBook_title(){
//        return book_title;
//    }
//    public String getAuthor(){
//        return author;
//    }
//    public Integer getpublished_year(){
//        return published_year;
//    }
//    public boolean getis_available(){
//        return is_available;
//    }
//
//    // setter
//    public void setBook_title(String newbook_title){
//        this.book_title = newbook_title;
//    }
//    public void setAuthor(String newauthor){
//        this.author = author;
//    }
//    public void setPublished_year(Integer newpublished_year){
//        this.published_year = published_year;
//    }
//    public void setIs_available(Boolean newis_available) {
//        if (is_available == true) {
//            this.is_available = is_available;
//        } else {
//            System.out.println("not available");
//        }
//    }
//}

//// 4. Car Class
//// Define a class `Car` with attributes `make`, `model`, `year`, and `color`. Create a method
//// `display_car_info()` that prints out the car details in a readable format.
//
//
//import java.util.*;
//public class main {
//    public static void main(String[]args) {
//        car c1 = new car("Toyota",2009,"black");
//        c1.display_car_info();
//    }
//}
//class car{
//    String make;
//    Integer model;
//    String colour;
//
//    car(String make, Integer model, String colour) {
//        this.make = make;
//        this.model = model;
//        this.colour = colour;
//    }
//        void display_car_info(){
//            System.out.println("make: " + this.make + "\nmodel: " + this.model +"\ncolour: " + this.colour);
//        }
//}

//// Q5) define a class "rectangle" with attributes "length" and "width" ceate methods to calculate the
////perimeter and area of the rectangle
/*
//import java.util.*;
//class main{
//    public static void main(String[]args){
//        rectangle m1 = new rectangle(5,9);
//        m1.perimeter();
//        m1.area();
//    }
//}
//
//class rectangle {
//    int length;
//    int width;
//
//    rectangle(int length, int width) {
//        this.length = length;
//        this.width= width;
//    }
//
//    void perimeter() {
//        int peri = (2 * length) + (2 * width);
//        System.out.println("perimeter of rectangle: "+ peri);
//    }
//
//    void area() {
//        int area = (length * width);
//        System.out.println("area of rectangle: "+ area);
//    }
//}

// 6. Student Database Class
// Define a class `StudentDatabase` that holds a list of students. Each student is represented as a dictionary
// with their `name` and `age`. Provide methods to add a student, remove a student, and display all students.

import java.util.*;
class main{
    public static void main(String[] args){
        student_database s1 = new student_database("me",18);
        ArrayList<Object> l1 = new ArrayList<>();
        l1.add(s1);

    }
}
class student_database{
    String name;
    Integer age;
    student_database(String name , Integer age){
        this.name = name;
        this.age= age;
    }
    void display(){
        System.out.println("data " + this.name);
    }
}
*/


// 1. Shape Inheritance
// Define a base class `Shape` with a method `draw()`. Then create subclasses `Circle` and `Rectangle`, each
// implementing the `draw()` method. Demonstrate polymorphism.
/*
import java.util.*;
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
    void draw(){
        super.draw();
    }
}
class rectangle extends shape{
    rectangle(String draw){
        super(draw);
    }
    void draw(){
        super.draw();
    }
}


*/



// 2. Animal and Dog Classes
// Create a class `Animal` with attributes `name` and `species`. Then, create a class `Dog` that inherits from
// `Animal`, with an additional attribute `breed`. Demonstrate usage by creating instances of both classes and
// printing their information.


class java_class_practice {
    public static void main(String[] args) {
        animal dog = new animal(" hrt","thg");
        dog.getname();
        dog.getSpecies();
    }
}
class animal{
    String name;
    String species;
    animal(String name, String species){
        this.name = name;
        this.species = species;
    }
    // getter
    public String getname(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    // setter
    public void setname(Integer newname){
        this.name = name;
    }
    public void setspecies(Integer newspecies){
        this.species = species;

    }
class dog extends animal{
    String breed;

    dog(String breed,String name,String species) {
        super(name, species);
        this.breed = breed;
    }

    // getter
    public String getname(){
        return name;
        }
    public String getSpecies(){
        return species;
    }

    public String getBreed() {
        return breed;
    }

    // setter
    public void setname(String newname){
        this.name = name;
    }
    public void setspecies(String newspecies){
        this.species = species;
    }
    public void setbreed(String newbreed){
        this.breed = breed;
    }

    }
}

// 3. Person and Employee Classes
// Define a `Person` class with attributes `name`, `age`, and `address`. Then define an `Employee` class that
// inherits from `Person` and adds an attribute `salary`. Print out the details of an employee.

/*
class java_class_practice {
    public static void main(String[] args) {
        person em1 = new person("me",18,"north nazimabad",250000);
        em1.name();
        em1.age();
        em1.address();
        em1.salary();
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
*/







// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.
/*
class java_class_practice {
    public static void main(String[] args) {
    }
}
class vehicle{
    String make;
    Integer model;
    vehicle(String make,Integer model){
        this.make = make;
        this.model = model;
    }
}
class electriccar extends vehicle{
    batter_capacity;
    electriccar(String make,Integer model)
    this.battery_capacity = battery_capacity;
    }
    void display_info(){
        System.out.println(this.battery_capacity + this.model + this.make)
    }


*/




// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.


// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

/*
class java_class_practice {
    public static void main(String[] args) {
        employee em1 = new employee("me",18,"north nazimabad",250000);
        System.out.println(em1.name);
        System.out.println(em1.age);
        System.out.println(em1.address);
        System.out.println(em1.salary);
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
    // getter
    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public String getaddress() {
        return address;
    }
    // setter
    public void setname(String newname){
        this.name = name;
    }
    public void setage(Integer newage){
        this.age = age;
    }
    public void setaddress(String newaddress){
        this.address = address;
    }
}
class employee extends person{
    Integer salary;
    employee(String name,Integer age,String address,Integer salary){
        super(name, age, address);
        this.salary = salary;
    }
    // getter
    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public String getaddress() {
        return address;
    }
    public Integer getsalary() {
        return salary;
    }
    // setter
    public void setname(String newname){
        this.name = name;
    }
    public void setage(Integer newage){
        this.age = age;
    }
    public void setaddress(String newaddress){
        this.address = address;
    }
    public void setsalary(Integer newsalary){
        this.salary = salary;
    }
}
*/


// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.

/*
class java_class_practice {
    public static void main(String[] args) {
        electriccar el1 = new electriccar("toyota",2,4);
        el1.display_info();
        vehicle el2 = new vehicle("toyota",5);
        el2.display_info();
    }
}
class vehicle{
    String make;
    Integer model;
    vehicle(String make,Integer model){
        this.make = make;
        this.model = model;
    }
    void display_info(){
        System.out.println("make:" + this.make + " model:"+ this.model);
    }
    // getter
    public String getMake(){
        return make;
    }
    public Integer getmodel() {
        return model;
    }
    // setter
    public void setMake(String newmake){
        this.make = make;
    }
    public void setmodel(Integer newmodel){
        this.model = model;
    }
}
class electriccar extends vehicle {
    Integer battery_capacity;

    electriccar(String make, Integer model, Integer battery_capacity) {
        super(make, model);
        this.battery_capacity = battery_capacity;
    }

    // getter
    public String getMake() {
        return make;
    }

    public Integer getmodel() {
        return model;
    }

    public Integer getbattery_capacity() {
        return battery_capacity;
    }

    // setter
    public void setMake(String newmake) {
        this.make = make;
    }

    public void setmodel(Integer newmodel) {
        this.model = model;
    }

    public void setbattery_capacity(Integer newbattery_capacity) {
        this.battery_capacity = battery_capacity;
    }
    @Override
    void display_info() {
        System.out.println("battery_capacity:" + this.battery_capacity +
                " model:" + this.model + " make:" + this.make);
    }
}
*/




// right code ---->

// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

class java_class_practice {
    public static void main(String[] args) {
        apple a1 = new apple("apple");
        a1.taste();
    }
}
class fruits{
    String name;
    fruits(String name){
        this.name = name;
    }
    void taste(){
        System.out.println();
    }
}
class apple extends fruits{
    apple(String name){
        super(name);
    }
    @Override
    void taste() {
        System.out.println("sweet");
    }
}

// right code ------>

// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.
/*

class main {
    public static void main(String[] args) {
        traingle t1 = new traingle();
        t1.draw();
        t1.getdraw();
        }
}
abstract class shape {
    abstract void getdraw();
}
class traingle extends shape{
    // getter
    @Override
    public void getdraw() {
        System.out.println("vcd");
    }
    // setter
    public void draw(){
        System.out.println("hfg");
    }
}


*/
// Encapsulation

// 1. Bank Account Class
// Define a class `BankAccount` with private attributes `account_number` and `balance`. Provide public
// methods `deposit()` and `withdraw()` to handle deposits and withdrawals. Ensure that the `withdraw()`
// method checks that the withdrawal amount is not greater than the balance.

// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.

// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).






