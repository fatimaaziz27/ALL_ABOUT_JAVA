import java.util.*;
class JAVA_PRACTICE{

//                                              Basic Java Programming

// Data Types & Operations

// 1. Sum of Positive Integers
// Write a Java program that creates a list of floats. Use a for loop to calculate the sum of all positive
// integers in the list.

/* 
public static void main(String[] args) {
    List<Float> floatlist = new ArrayList<>();
    floatlist.add(12.5f);
    floatlist.add(-3.4f);
    floatlist.add(7.8f);
    floatlist.add(0.0f);
    float sum = 0;
    for (Float i : floatlist) {
        if (i > 0) {
            sum += i;
        }
    }
    System.out.println("Sum of list" + sum);
}
*/

// 2. Filtering and Summing Numbers
// Write a Java program that creates a list of integers. Use list comprehension to create a new list that
// contains only the numbers greater than 10. Calculate the sum of the numbers in the new list.

// 3. Removing Duplicates
// Given a list containing both strings, write a Java program that removes duplicate elements from the list
// and prints the result.

// 4. Finding the Mean
// Create a list of numbers (floats) and write a Java program to compute the mean of the numbers in the
// list.

// 5. Count Occurrences of Elements
// Write a Java program that counts how many times a particular number appears in a list of integers.

// 6. Multiplying Numbers
// Create a list of numbers and use a for loop to multiply all the integers in the list together. If there are no
// integers, print a message indicating that.

// String Manipulation

// 1. Case Count
// Write a Java function `case_count(text: str) -> hashmap` that counts the number of uppercase and
// lowercase letters in a string.
// Example:
// Input: `"Hello World"`
// Output: `{ "uppercase": 2, "lowercase": 8 }`

// 2. Removing Vowels
// Write a Java function `remove_vowels(text: str) -> str` that takes a string and returns a new string with all
// vowels removed.

// 3. Palindrome Check
// Write a Java function `is_palindrome(text: str) -> bool` that checks if a string is a palindrome. A string is a
// palindrome if it reads the same forward and backward (e.g., "madam").

// 4. String Rotation
// Write a Java function `rotate_string(text: str, n: int) -> str` that rotates the string by `n` positions. For
// example, if the input is `"abcdef"` and `n = 2`, the output should be `"cdefab"`.

// 5. String Reversal
// Write a Java function `reverse_words(sentence: str) -> str` that reverses the order of words in a given
// sentence.
// Example:
// Input: `"hello world"`
// Output: `"world hello"`

// 6. Substring Check
// Write a Java function `contains_substring(main: str, sub: str) -> bool` that checks if a substring exists
// within a string.
// Example:
// Input: `"hello world", "world"`
// Output: `True`





// Functions and Exception Handling

// 1. Safe Addition
// Write a Java function `safe_add(x: float, y: float) -> float` that adds two numbers, and returns a custom
// error message if the numbers are not valid floats.

/* 
    static float safe_add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            float x = sc.nextFloat();
            float y = sc.nextFloat();

            System.out.println("Result: " + safe_add(x, y));

        } catch (Exception e) {
            System.out.println("Invalid input: enter float numbers only");
        }

        sc.close();
    }
*/

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

/*
    static int safe_sub(int x, int y) {
        int result = x - y;

        if (result < 0) {
            System.out.println("Error: Result is negative.");
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Result: " + safe_sub(x, y));

        } catch (Exception e) {
            System.out.println("Invalid input: enter integer numbers only");
        }

        sc.close();
    }
}
*/

// 3. Check for Division by Zero
// Write a Java function `divide_numbers(x: float, y: float) -> float` that divides `x` by `y`. If `y` is zero, it
// should return `"Cannot divide by zero"`.

/*
static int safe_sub(int x, int y) {
        int result = x / y;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Result: " + safe_sub(x, y));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("invalid input: enter integer numbers only");
        }
        sc.close();
    }
}
*/

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

/*
    static int parse_input(String value) {
        try {
            return Integer.parseInt(value); // convert string to int
        } catch (NumberFormatException e) {
            System.out.println("Invalid input"); // print error message
            return 0; // return 0 when conversion fails
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value1 = sc.nextLine();
        String value2 = sc.nextLine();

        int num1 = parse_input(value1);
        int num2 = parse_input(value2);

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        sc.close();
    }
}

*/

// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.

/* 
    static int add_positive_numbers(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Both numbers must be positive");
        }
        return x + y;
    }

    public static void main(String[] args) {
        try {
            System.out.println(add_positive_numbers(5, 3));   // 8
            System.out.println(add_positive_numbers(-2, 4));  // Throws error
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

*/


// * Object-Oriented Programming *

// Class Definition & Initialization

// 1. Student Class
// Define a class `Student` with the attributes `name` (string), `age` (integer), and `grades` (list of floats).
// Create a constructor to initialize these attributes and a method `average_grade()` that returns the average
// grade of the student.

/*
    public static void main(String[] args) {
            List<Float> grades = new ArrayList<>();
            grades.add(85.5f);
            grades.add(90.0f);
            grades.add(78.5f);

            student_info student1 = new student_info("Alice", 20, grades);
            System.out.println("Name: " + student1.getname()+", Age: " + student1.getage()+", Average Grade: " + student1.average_grade());
    }
    public static class student_info {
        String name;
        int age;
        List<Float> grades;

        // Constructor
        public student_info(String name, int age, List<Float> grades) {
            this.name = name;
            this.age=age;
            this.grades=grades;
        }
        public String getname() {
            return name;
        }
        public int getage() {
            return age;
        }
        public List<Float> getgrades() {
            return grades;
        }
        public void setname(String name) {
            this.name = name;
        }
        public void setage(int age) {
            this.age = age;
        }
        public void setgrades(List<Float> grades) {
            this.grades = grades;
        }
        public float average_grade() {
            float sum = 0;
            for (Float grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }}
 */

// 2. Library Class
// Define a class `Library` with the following attributes: `book_title` (string), `author` (string),
// `published_year` (integer), and `is_available` (boolean). Create methods to check the availability of the
// book and borrow it.

//                      static code:
/*
//    public static void main(String[]args){

// // object 1

//         library b1 = new library("book_t","auth1",2007,true);
//         System.out.println("book title:\n" + b1.book_title + "author:\n" + b1.author + "published year:\n" +
//                 b1.published_year + "is available:\n" + b1.is_available);

// // object 2

//         library b2 = new library("book_t2","auth2",2003,false);
//         System.out.println("book title:\n" + b2.book_title + "author:\n" + b2.author + "published year:\n" +
//                 b2.published_year + "is available:\n" + b2.is_available);
//     }
// }

// // argumental constructor

// class library{

// // attributes
//     String book_title;
//     String author;
//     Integer published_year;
//     Boolean is_available;

// // value calling

//     library(String book_name, String author_name, Integer year, Boolean available){
//         this.book_title = book_name;
//         this.author = author_name;
//         this.published_year = year;
//         this.is_available = available;
//     }

//     // getter
//     public String getBook_title(){
//         return book_title;
//     }
//     public String getAuthor(){
//         return author;
//     }
//     public Integer getpublished_year(){
//         return published_year;
//     }
//     public boolean getis_available(){
//         return is_available;
//     }

//     // setter
//     public void setBook_title(String newbook_title){
//         this.book_title = newbook_title;
//     }
//     public void setAuthor(String newauthor){
//         this.author = author;
//     }
//     public void setPublished_year(Integer newpublished_year){
//         this.published_year = published_year;
//     }
//     public void setIs_available(Boolean newis_available) {
//         if (is_available == true) {
//             this.is_available = is_available;
//         } else {
//             System.out.println("not available");
//         }
//     }

// }


//                             dynamic code:
 */
/*
    public static void main(String[]args){
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you want to continue? yes/no: ");
            String i = scanner.nextLine();
        }
        while (String i == "yes") {
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter book title: ");
            String book_title = scanner.nextLine();

            System.out.print("Enter author_name: ");
            String author = scanner.nextLine();

            System.out.print("Enter published year: ");
            Integer published_year = scanner.nextInt();

            System.out.print("Enter is available: ");
            Boolean is_available = scanner.nextBoolean();
            
            library b1 = new library(book_title,author,published_year,is_available);
            System.out.println("book title:" + b1.book_title + "author:" + b1.author + "published year:" +
                b1.published_year + "is available:" + b1.is_available);
        }
    }
}

// object 2
//        library b2 = new library("book_t2","auth2",2003,false);
//        System.out.println("book title:" + b2.book_title + "author:" + b2.author + "published year:" +
//                b2.published_year + "is available:\n" + b2.is_available);

// argumental constructor

class library{

// attributes
    String book_title;
    String author;
    Integer published_year;
    Boolean is_available;

// value calling
    library(String book_name, String author_name, Integer year, Boolean available){
        this.book_title = book_name;
        this.author = author_name;
        this.published_year = year;
        this.is_available = available;
    }

    // getter
    public String getBook_title(){
        return book_title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getpublished_year(){
        return published_year;
    }
    public boolean getis_available(){
        return is_available;
    }

    // setter
    public void setBook_title(String newbook_title){
        this.book_title = newbook_title;
    }
    public void setAuthor(String newauthor){
        this.author = author;
    }
    public void setPublished_year(Integer newpublished_year){
        this.published_year = published_year;
    }
    public void setIs_available(Boolean newis_available) {
        if (is_available == true) {
            this.is_available = is_available;
        } else {
            System.out.println("not available");
        }
    }
}

//                         dynamic code 2:

import java.util.*;
public class jp {
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you want to continue? yes/no: ");
            String de = scanner.nextLine();
        while (de.equals("yes")) {
            System.out.println("what do you want to do? \n1. add a book \n2. exit");
            int input_type = scanner.nextInt();
            switch (input_type){
                case 1:
                    System.out.print("Enter book title: ");
                    String book_title = scanner.nextLine();

                    System.out.print("Enter author_name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter published year: ");
                    Integer published_year = scanner.nextInt();

                    System.out.print("Enter is available: ");
                    Boolean is_available = scanner.nextBoolean();

                    library b1 = new library(book_title,author,published_year,is_available);
                    System.out.println("book title:" + b1.book_title + "author:" + b1.author + "published year:" +
                            b1.published_year + "is available:" + b1.is_available);
                case 2:
                    break;
            }
        }
    }
}

// object 2
//        library b2 = new library("book_t2","auth2",2003,false);
//        System.out.println("book title:" + b2.book_title + "author:" + b2.author + "published year:" +
//                b2.published_year + "is available:\n" + b2.is_available);

// argumental constructor

class library{

    // attributes
    String book_title;
    String author;
    Integer published_year;
    Boolean is_available;

    // value calling
    library(String book_name, String author_name, Integer year, Boolean available){
        this.book_title = book_name;
        this.author = author_name;
        this.published_year = year;
        this.is_available = available;
    }

    // getter
    public String getBook_title(){
        return book_title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getpublished_year(){
        return published_year;
    }
    public boolean getis_available(){
        return is_available;
    }

    // setter
    public void setBook_title(String newbook_title){
        this.book_title = newbook_title;
    }
    public void setAuthor(String newauthor){
        this.author = author;
    }
    public void setPublished_year(Integer newpublished_year){
        this.published_year = published_year;
    }
    public void setIs_available(Boolean newis_available) {
        if (is_available == true) {
            this.is_available = is_available;
        } else {
            System.out.println("not available");
        }
    }
}
*/
//                          dynamic code ends here.

// 3. Product Class
// Define a class `Product` with the attributes `product_name` (string), `price` (float), and `quantity`
// (integer). Write methods to display the total value of the product in stock (`price * quantity`).

/*
    public static void main(String[]args){
        product p1 = new product("rice",250,10);
        System.out.println("product name:" + p1.product_name + "\nprice:" + p1.price + "\nquantity:" +
                p1.quantity + "\ntotal value:" + p1.total_value);
    }
}
class product{
    // attributes
    String product_name;
    Integer price;
    Integer quantity;
    Integer total_value;

    // value calling
    product(String product_name, Integer price , Integer quantity){
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
        this.total_value = price*quantity;
    }

    // getter
    public String getProduct_name(){
        return product_name;
    }
    public Integer getPrice(){
        return price;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Integer getTotal_value(){
        return total_value;
    }

    // setter
    public void setProduct_name(String newproduct_name){
        this.product_name = newproduct_name;
    }
    public void setPrice(Integer newprice){
        this.price = price;
    }
    public void setQuantity(Integer newquantity){
        this.quantity = quantity;
    }
}

*/

// 4. Car Class
// Define a class `Car` with attributes `make`, `model`, `year`, and `color`. Create a method
// `display_car_info()` that prints out the car details in a readable format.

/*
    public static void main(String[]args) {
        car c1 = new car("Toyota",2009,"black");
        c1.display_car_info();
    }
}
class car{
    String make;
    Integer model;
    String colour;

    car(String make, Integer model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }
        void display_car_info(){
            System.out.println("make: " + this.make + "\nmodel: " + this.model +"\ncolour: " + this.colour);
        }
}
*/

// 5. Rectangle Class
// Define a class `Rectangle` with attributes `length` and `width`. Create methods to calculate the perimeter
// and area of the rectangle.

/*
    public static void main(String[]args){
        rectangle m1 = new rectangle(5,9);
        m1.perimeter();
        m1.area();
    }
}

class rectangle {
    int length;
    int width;

    rectangle(int length, int width) {
        this.length = length;
        this.width= width;
    }

    void perimeter() {
        int peri = (2 * length) + (2 * width);
        System.out.println("perimeter of rectangle: "+ peri);
    }

    void area() {
        int area = (length * width);
        System.out.println("area of rectangle: "+ area);
    }
}
 */

// 6. Student Database Class
// Define a class `StudentDatabase` that holds a list of students. Each student is represented as a dictionary
// with their `name` and `age`. Provide methods to add a student, remove a student, and display all students.

/*
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


// Inheritance


// 1. Shape Inheritance
// Define a base class `Shape` with a method `draw()`. Then create subclasses `Circle` and `Rectangle`, each
// implementing the `draw()` method. Demonstrate polymorphism.

/*  public static void main(String[] args) {
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
*/

// 3. Person and Employee Classes
// Define a `Person` class with attributes `name`, `age`, and `address`. Then define an `Employee` class that
// inherits from `Person` and adds an attribute `salary`. Print out the details of an employee.

// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.

// completed ------>
/*
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


// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.




// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.









// Encapsulation











// 1. Bank Account Class
// Define a class `BankAccount` with private attributes `account_number` and `balance`. Provide public
// methods `deposit()` and `withdraw()` to handle deposits and withdrawals. Ensure that the `withdraw()`
// method checks that the withdrawal amount is not greater than the balance.
// completed ------>
/*
static class bank_account{
    private int account_number;
    private float balance;
    public bank_account(int account_number, float balance){
        this.account_number = account_number;
        this.balance = balance;
    }
    public void deposit(float amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    public void withdraw(float amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }

        }
    public static void main(String[] args){
        bank_account myAccount = new bank_account(123456, 1000.0f);
        myAccount.deposit(500.0f);
        myAccount.withdraw(200.0f);
        myAccount.withdraw(2000.0f);
    }
    }
}
*/


// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.

/*
static class employee{
    private float salary;

    public employee(float salary) {
        this.salary = salary;
    }

    public float get_salary() {
        if (salary > 0) {
            return salary;
        } else {
            System.out.println("Salary must be greater than 0");
            return 0;
        }
    }
public static void main(String[] args) {
    employee emp1 = new employee(5000);
    System.out.println("Employee Salary: " + emp1.get_salary());

    employee emp2 = new employee(-1000);
    System.out.println("Employee Salary: " + emp2.get_salary());
}
}
}
*/

// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

public static void main(String[] args) {
}
class account_holder{
    private String name;
    private double account_balance;

    

}


// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).











// Abstraction & Interfaces







// 1. Shape Area Calculation
// Define an abstract class `Shape` with an abstract method `calculate_area()`. Then create subclasses
// `Circle` and `Rectangle` that extends this method, calculating the area for each shape.

/*
    abstract class Shape {
        abstract int calculate_area();
    }
    class circle extends Shape{
        int radius;
        circle(int radius){
            this.radius=radius;
        }
        int calculate_area(){
            return (int)(3.14*radius*radius);
        }
    }
    class rectangle extends Shape{
        int length;
        int width;
        rectangle(int length, int width){
            this.length=length;
            this.width=width;
        }
        int calculate_area(){
            return length*width;
        }
    }

    public void main(String[] args){
            Shape c = new circle(5);
            Shape r = new rectangle(4,6);

            System.out.println("Area of Circle: " + c.calculate_area());
            System.out.println("Area of Rectangle: " + r.calculate_area());
        }
    }
*/


// 2. Payment System
// Create an abstract class `Payment` with an abstract method `process_payment()`. Then create two
// subclasses: `CreditCardPayment` and `PayPalPayment`. Extend the `process_payment()` method in both
// subclasses.

// 3. Transportation System
// Create an abstract class `Transportation` with an abstract method `move()`. Then create subclasses `Car`
// and `Bicycle` that extend the `move()` method in different ways.

// 4. Appliance Interface
// Define an abstract class `Appliance` with an abstract method `turn_on()`. Create subclasses
// `WashingMachine` and `Refrigerator`, each extending the `turn_on()` method.


// 5. Shape Drawing Interface
// Define an abstract class `Shape` with an abstract method `draw()`. Then create subclasses `Circle` and
// `Square` that each implement `draw()` to display the shape in a console.
/* 
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
        System.out.println("  ***  ");
        System.out.println(" *     * ");
        System.out.println("  ***  ");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
        System.out.println(" ***** ");
        System.out.println(" *   * ");
        System.out.println(" *   * ");
        System.out.println(" ***** ");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.draw();
        System.out.println();
        s.draw();
    }
}
*/




// 6. Employee Task Management
// Create an abstract class `Employee` with an abstract method `perform_task()`. Then create two
// subclasses, `Manager` and `Developer`, and extends `perform_task()` for each subclass with appropriate
// tasks.







// Multiple Inheritance







// 1. Artist and Writer Classes
// Define a class `Artist` with the attribute `art_style` and a method `create_art()`. Define another class
// `Writer` with the attribute `writing_style` and a method `write()`. Then define a class `CreativePerson` that
// inherits from both `Artist` and `Writer` and has a method `display_info()` that displays both art and writing
// styles. 

/*
static class Artist {
    static String art_style;

    void create_art() {
        System.out.println("Creating art in " + art_style + " style.");
    }
}
static class Writer {
    static String writing_style;

    void write() {
        System.out.println("Writing in " + writing_style + " style.");
    }
}
static class creative_person extends Artist {
    String writing_style;
    void display_info() {
        System.out.println("Art Style: " + art_style);
        System.out.println("Writing Style: " + writing_style);
    }
    public static void main(String[] args) {
        creative_person cp = new creative_person();
        cp.art_style = "Impressionism";
        cp.writing_style = "Fiction";
        cp.display_info();
    }
}}

*/



// 2. Student and Sportsman Classes
// Define a class `Student` with attributes `name` and `age`, and a method `study()`. Define another class
// `Sportsman` with an attribute `sport` and a method `play_sport()`. Then define a class `StudentAthlete`
// that inherits from both `Student` and `Sportsman` and implements a method `display_info()` to show all
// details.

// 3. Person and Vehicle Classes
// Define a class `Person` with attributes `name` and `age`. Define another class `Vehicle` with an attribute
// `model`. Create a class `Driver` that inherits from both `Person` and `Vehicle` and displays a message that
// includes the driver's name, age, and the vehicle model.

// 4. Teacher and Researcher Classes
// Define a class `Teacher` with the attribute `subject`. Define another class `Researcher` with the attribute
// `research_area`. Create a class `Professor` that inherits from both `Teacher` and `Researcher` and prints
// out the details of both the subject and research area.

// 5. Chef and Server Classes
// Define a class `Chef` with the attribute `specialty`. Define another class `Server` with an attribute
// `restaurant_name`. Create a class `RestaurantEmployee` that inherits from both `Chef` and `Server` and
// displays the employee's specialty and restaurant name.

// 6. Product and Category Classes
// Define a class `Product` with attributes `product_name` and `price`. Define another class `Category` with
// the attribute `category_name`. Then create a class `ProductCategory` that inherits from both `Product` and
// `Category`, and displays the product name along with its category.






// Hierarchical Inheritance





// 1. Shape Hierarchy
// Define a base class Shape with an attribute color and a method draw(). Create two subclasses
// Circle and Rectangle that inherit from Shape. Each subclass should override the draw() method to
// display its shape type and color.

// 2. Vehicle Hierarchy
// Define a base class Vehicle with attributes brand and speed. Create two subclasses Car
// and Bike that inherit from Vehicle. Each subclass should display vehicle details along with
// its specific type.

// 3. Account Hierarchy
// Define a base class BankAccount with attributes accountNumber and balance. Create two
// subclasses SavingsAccount and CurrentAccount. Each subclass should implement a method to
// display account type and balance.

// 4. Person Hierarchy
// Define a base class Person with attributes name and age. Create two subclasses Student and
// Teacher. Each subclass should display role-specific information such as course or subject.

// 5. Media Hierarchy
// Define a base class Media with attributes title and duration. Create two subclasses Audio and
// Video. Each subclass should display its type and playback details.

// 6. Employee Hierarchy
// Define a base class Employee with attributes name and employeeId. Create two
// subclasses Manager and Developer that inherit from Employee. Each subclass should
// have its own method to display job-specific responsibilities.










// Multilevel Inheritance








// 1. Appliance → WashingMachine → SmartWashingMachine
// Define a base class Appliance with a method turnOn(). Create a subclass WashingMachine that
// adds a method washClothes(). Create a subclass SmartWashingMachine that adds a method
// connectToWiFi(). Demonstrate all methods using a single object.

/*
static class Appliance{
    void turnon(){
        System.out.println("Appliance is turned on");
    }
    static class washingmachine extends Appliance{
        void washclothes(){
            System.out.println("Washing clothes");
    }
    static class SmartWashingMachine extends washingmachine{
        void connectToWiFi(){
            System.out.println("Connected to WiFi");
        }
        public static void main(String[] args){
            SmartWashingMachine swm = new SmartWashingMachine();
            swm.turnon();
            swm.washclothes();
            swm.connectToWiFi();
        }
    }
    }}}
*/


// 2. Education → Course → OnlineCourse
// Define a base class Education with an attribute institutionName. Create a subclass Course that
// adds an attribute courseName. Create a subclass OnlineCourse that adds an attribute platform.
// Display full course details.

// 3. Account → SavingsAccount → PremiumSavings
// Define a base class Account with attributes accountNumber and balance. Create a subclass
// SavingsAccount that adds an attribute interestRate. Create another subclass PremiumSavings
// that adds an attribute bonusRate. Display complete account information.

// 4. Vehicle → Car → ElectricCar
// Define a base class Vehicle with attributes brand and model. Create a subclass Car that adds an
// attribute fuelType. Create a subclass ElectricCar that adds an attribute batteryCapacity. Display
// all vehicle details.

// 5. Animal → Mammal → Dog
// Define a class Animal with a method eat(). Create a subclass Mammal that adds a method
// walk(). Create a subclass Dog that adds a method bark(). Demonstrate method calls using a Dog
// object.

// 6. Person → Employee → Manager
// Define a base class Person with attributes name and age. Create a subclass Employee that adds
// an attribute employeeId. Create another subclass Manager that adds an attribute department.
// Display complete details of a manager.