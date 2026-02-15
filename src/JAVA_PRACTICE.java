import java.util.*;
class JAVA_PRACTICE{
    public static void main(String[]args){

//                                              Basic Java Programming
    }
}


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
    System.out.println("Sum of list: " + sum);
}
*/

// 2. Filtering and Summing Numbers
// Write a Java program that creates a list of integers. Use list comprehension to create a new list that
// contains only the numbers greater than 10. Calculate the sum of the numbers in the new list.

// class jp {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER THE SIZE OF A LIST NUMBER: ");
//         int size = sc.nextInt();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         for (int i=1; i<=size; i++){
//             System.out.println("ENTER "+i+" NUMBER: ");
//             int num = sc.nextInt();
//             list1.add(num);
//         }
//         System.out.println(list1);
//         ArrayList<Integer> list2 = new ArrayList<>();
//         for (int i : list1){
//             if (i>=10){
//                 list2.add(i);
//             }
//         }
//         System.out.println(list2);
//         Integer sum_of_list2 = 0;
//         for (int j : list2){
//             sum_of_list2+=j;
//         }
//         System.out.println("Sum of all: " + sum_of_list2);
//     }
// }

// 3. Removing Duplicates
// Given a list containing both strings, write a Java program that removes duplicate elements from the list
// and prints the result.

/*
class jp{
    public static void main(String[] args){
        ArrayList<Integer> numl1 = new ArrayList<>();
        numl1.add(20);
        numl1.add(30);
        numl1.add(30);
        numl1.add(10);
        numl1.add(20);
        ArrayList<Integer> numl2 = new ArrayList<>();
        for (int i : numl1){
            if (numl2.contains(i)==false){
                numl2.add(i);
            }
        }
        System.out.println(numl1);
        System.out.println(numl2);
    }
}
*/

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

// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.

// 3. Check for Division by Zero
// Write a Java function `divide_numbers(x: float, y: float) -> float` that divides `x` by `y`. If `y` is zero, it
// should return `"Cannot divide by zero"`.

// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

// 5. Negative Numbers Handling
// Write a Java function `add_positive_numbers(x: int, y: int) -> int` that adds two numbers but only if both
// are positive. If either number is negative, raise a custom error: `"Both numbers must be positive"`.





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
import java.util.*;
class main{
    public static void main(String[] args){
        student_database s1 = new student_database("alice",23);
        s1.add();
        s1.display();
        s1.add();
        s1.remove();

    }
}
class student_database{
    String name;
    Integer age;

    HashMap<String,Integer> h1 = new HashMap<>();

    student_database(String name , Integer age){
        this.name = name;
        this.age= age;
    }
    void add(){
        h1.put(this.name,this.age);
    }
    void remove(){
        h1.remove(this.name);
    }
    void display(){
        System.out.println(h1);
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
        System.out.println("i am a shape");
    }
    // setter
    public void draw(){
        System.out.println("i am a triangle");
    }
}
*/

// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

/*
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
*/






// Encapsulation


// 1. Bank Account Class
// Define a class `BankAccount` with private attributes `account_number` and `balance`. Provide public
// methods `deposit()` and `withdraw()` to handle deposits and withdrawals. Ensure that the `withdraw()`
// method checks that the withdrawal amount is not greater than the balance.
// completed ------>

/*
class encap {
    public static void main(String[] args) {
        bank_account acc1 = new bank_account();
        acc1.setbalance(6700);
        acc1.setaccount_number(7);
        acc1.deposit(45);
        acc1.withdraw(67);
    }
}
    class bank_account {
        private Integer account_number;
        private Integer balance;

//        bank_account(Integer account_number,Integer balance){
//            this.account_number = account_number;
//            this.balance = balance;

        // getter
        public Integer getaccount_number() {
            return account_number;
        }
        public Integer getbalance() {
            return balance;
        }
        // setter
        public void setaccount_number(Integer newaccount_number) {
            this.account_number = newaccount_number;
        }
        public void setbalance(Integer newbalance) {
            this.balance = newbalance;
        }

        public void deposit(Integer amount){
            amount+=amount;
            System.out.println(amount);
        }
        public void withdraw(Integer amount){
            if (amount>this.balance){
                System.out.println("hgfh");
            }
            else {
                this.balance-=amount;
            }
        }
    }
 */

// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.

/*
class JAVA{
    public static void main(String[] args) {

    employee em1 = new employee();
    em1.Salary(0);
    System.out.println(em1.get_salary());
    }
}
class employee {
    private Integer salary;

    public Integer get_salary() {
        return salary;
    }

    public void Salary(Integer newsalary) {
        this.salary = newsalary;
        if (salary > 0) {
            System.out.println(salary);
        } else {
            System.out.println("Insufficient funds");

        }
    }
}
*/

// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

/*
class java{
public static void main(String[] args) {

    account_holder acc1 = new account_holder("me",5000);
    acc1.deposit(0);
    acc1.withdraw(6700);
    }
}
class account_holder{
    private String name;
    private double account_balance;

    public account_holder(String name ,double account_balance) {
        this.account_balance = account_balance;
        this.name = name;
    }
    void deposit(Integer amount){
        if (amount == 0 || amount < 0){
            System.out.println("Negative amount is not accepted.");
        }
        else{
            this.account_balance+=amount;
            System.out.println(amount + " has been deposited");
        }
    }
    void withdraw(Integer amount){
        if (amount>0 && amount<account_balance){
            this.account_balance-=amount;
            System.out.println(this.name + ", your transaction is successful.");
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
}
*/

// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.

/*
class java{
    public static void main(String[] args){
    
        productstock p1 = new productstock("chips",0);
        p1.check_availability();
    }
}
class productstock{
    private String product_name;
    private Integer quantity_in_stock;

    productstock(String product_name,Integer quantity_in_stock){
        this.product_name = product_name;
        this.quantity_in_stock = quantity_in_stock;
    }
    
    public void check_availability(){
        if (quantity_in_stock == 0){
            System.out.println(this.product_name + " is out of stock");
        }
        else{
            System.out.println(this.quantity_in_stock +" "+ this.product_name + " are available");
        }
    }
}
*/

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// incomplete ---->

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).

/*
class java{
    public static void main(String[] args){
        movie m1 = new movie();
        m1.rating(2);
        m1.get_rating();
    }
}
class movie{
    private Integer rating;

    public Integer get_rating() {
        return rating;
    }
    public void rating(Integer newrating) {
        this.rating = newrating;
        if (rating > 2) {
            System.out.println(rating);
        } else {
            System.out.println("low rating");
        }
    }
}
*/





// Abstraction & Interfaces


// 1. Shape Area Calculation
// Define an abstract class `Shape` with an abstract method `calculate_area()`. Then create subclasses
// `Circle` and `Rectangle` that extends this method, calculating the area for each shape.

/*
class ABSTRACTION {
    public static void main(String[] args) {
        circle c1 = new circle(2,3.14);
        c1.calculate_area();
        rectangle r1 = new rectangle(2,3);
        r1.calculate_area();
    }
}
abstract class shape {
    abstract void calculate_area();
}
class circle extends shape {
    Integer radius;
    double pi;
    circle(Integer radius , double pi){
        this.radius = radius;
        this.pi = pi;
    }
    // getter
    @Override
    public void calculate_area() {
        System.out.println("Area of a circle: " + this.pi * this.radius * this.radius);
    }
}
class rectangle extends shape{
    Integer len_of_r;
    Integer wid_of_r;
    rectangle(Integer len_of_r , Integer wid_of_r){
        this.len_of_r = len_of_r;
        this.wid_of_r = wid_of_r;
    }
    // getter
    @Override
    public void calculate_area() {
        System.out.println("Area of a rectangle: " + this.len_of_r * this.wid_of_r);
    }
}
*/

// 2. Payment System
// Create an abstract class `Payment` with an abstract method `process_payment()`. Then create two
// subclasses: `CreditCardPayment` and `PayPalPayment`. Extend the `process_payment()` method in both
// subclasses.

/*
class ABSTRACTION {
    public static void main(String[] args) {
        CreditCardPayment c1 = new CreditCardPayment();
        c1.process_payment();

        PayPalPayment p1 = new PayPalPayment();
        p1.process_payment();
    }
}
abstract class payment {
    abstract void process_payment();
}
class CreditCardPayment extends payment {
    // getter
    @Override
    public void process_payment() {
        System.out.println("payment process");
    }
}
class PayPalPayment extends payment{
    // getter
    @Override
    public void process_payment() {
        System.out.println("payment process");
    }
}
*/

// 3. Transportation System
// Create an abstract class `Transportation` with an abstract method `move()`. Then create subclasses `Car`
// and `Bicycle` that extend the `move()` method in different ways.

/*
class ABSTRACTION {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.move();
        Bicycle b1 = new Bicycle();
        b1.move();
    }
}
abstract class transportation {
    abstract void move();
}
class Car extends transportation {
    // getter
    @Override
    public void move() {
        System.out.println("A car is a four-wheeler");
    }
}
class Bicycle extends transportation{
    // getter
    @Override
    public void move() {
        System.out.println("A bicycle is a two-wheeler");
    }
}
*/

// 4. Appliance Interface
// Define an abstract class `Appliance` with an abstract method `turn_on()`. Create subclasses
// `WashingMachine` and `Refrigerator`, each extending the `turn_on()` method.

/*
class JAVA_CLASS_PRACTICE{
    public static void main(String[] args) {
//         interfaces do not have obj
        washingMachine w1 = new washingMachine();
        w1.turn_on();

        refrigerator r1 = new refrigerator();
        r1.turn_on();
        
    }
}

interface appliance {
    default void turn_on(){
        System.out.println("ON");
    }
}

class washingMachine implements appliance {
    public void turn_on(){
        appliance.super.turn_on();
    }
}


class refrigerator implements appliance {
    public void turn_on(){
        appliance.super.turn_on();
    }
}
*/

// 5. Shape Drawing Interface
// Define an abstract class `Shape` with an abstract method `draw()`. Then create subclasses `Circle` and
// `Square` that each implement `draw()` to display the shape in a console.

/*
class JAVA_CLASS_PRACTICE{
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.draw();
        square q1 = new square();
        q1.draw();
        System.out.println("---------------------------------------------------");  
    }
}
interface shape {
    default void draw(){}
}
class circle implements shape {
    public void draw(){
        shape.super.draw();
    }
}
class square implements shape {
    public void draw(){
        shape.super.draw();
    }
}
*/

// 6. Employee Task Management
// Create an abstract class `Employee` with an abstract method `perform_task()`. Then create two
// subclasses, `Manager` and `Developer`, and extends `perform_task()` for each subclass with appropriate
// tasks.

/*
class main {
    public static void main(String[] args) {
        manager m1 = new manager();
        m1.perform_task();
        developer d1 = new developer();
        d1.perform_task();
    }
}
abstract class employee {
    abstract void perform_task();
}
class manager extends employee {
    // getter
    @Override
    public void perform_task() {
        System.out.println("As a manager, I oversee teams and ensure goals are met.");
    }
}
class developer extends employee {
    // getter
    @Override
    public void perform_task() {
        System.out.println("As a developer, I'm responsible for building and maintaining software solutions.");
    }
}
*/



// Multiple Inheritance


// 1. Artist and Writer Classes
// Define a class `Artist` with the attribute `art_style` and a method `create_art()`. Define another class
// `Writer` with the attribute `writing_style` and a method `write()`. Then define a class `CreativePerson` that
// inherits from both `Artist` and `Writer` and has a method `display_info()` that displays both art and writing
// styles. 

/*
    public static void main(String[] args) {
        creative_person c1 = new creative_person();
        c1.display_info();
    }
}
interface artist {
    default void art_style(){
        System.out.println("artist");
    }
}
interface writer {
     default void writing_style(){
        System.out.println("writer");
    }
}
class creative_person implements artist,writer{

    public void display_info(){
        writer.super.writing_style();
        artist.super.art_style();
    }

    public void writing_style(){
        writer.super.writing_style();
    }
    public void art_style(){
        artist.super.art_style();
    }
}
*/

// 2. Student and Sportsman Classes
// Define a class `Student` with attributes `name` and `age`, and a method `study()`. Define another class
// `Sportsman` with an attribute `sport` and a method `play_sport()`. Then define a class `StudentAthlete`
// that inherits from both `Student` and `Sportsman` and implements a method `display_info()` to show all
// details.

/*
public static void main(String[] args) {
    studentathlete s1 = new studentathlete ();
    s1.display_info1();
    s1.display_info2();
    }
}
interface student{
    default void name(){
        System.out.println("yusra");
    }
    default void age(){
        System.out.println("18");
    }
    default void study(){
        System.out.println("CS");
    }
}
interface sportsman{
    default void sport(){
        System.out.println("sport");
    }
    default void play_sport(){
        System.out.println("play sport");
    }
}
class studentathlete implements student,sportsman{
    public void display_info1(){
        student.super.name();
        student.super.age();
        student.super.study();
    }
    public void display_info2(){
        sportsman.super.sport();
        sportsman.super.play_sport();
    }
}
*/

// 3. Person and Vehicle Classes
// Define a class `Person` with attributes `name` and `age`. Define another class `Vehicle` with an attribute
// `model`. Create a class `Driver` that inherits from both `Person` and `Vehicle` and displays a message that
// includes the driver's name, age, and the vehicle model.

/*
public static void main(String[] args) {
    driver d1 = new driver();
    d1.display_info();
    }
}
interface person{
    default void name(){
        System.out.println("Driver Name");
    }
    default void age(){
        System.out.println("26");
    }
}
interface vehicle{
    default void model(){
        System.out.println("Toyota corolla");
    }
}
class driver implements person,vehicle{
    public void display_info(){
        person.super.name();
        person.super.age();
        vehicle.super.model();
    }
}
*/

// 4. Teacher and Researcher Classes
// Define a class `Teacher` with the attribute `subject`. Define another class `Researcher` with the attribute
// `research_area`. Create a class `Professor` that inherits from both `Teacher` and `Researcher` and prints
// out the details of both the subject and research area.

/*
public static void main(String[] args) {
    professor p1 = new professor();
    p1.display_info();
    }
}
interface teacher{
    default void subject(){
        System.out.println("CS");
    }
}
interface Researcher{
    default void research_area(){
        System.out.println("research area");
    }
}
class professor implements teacher,Researcher{
    public void display_info(){
        teacher.super.subject();
        Researcher.super.research_area();
    }
}
*/

// 5. Chef and Server Classes
// Define a class `Chef` with the attribute `specialty`. Define another class `Server` with an attribute
// `restaurant_name`. Create a class `RestaurantEmployee` that inherits from both `Chef` and `Server` and
// displays the employee's specialty and restaurant name.

/*
    public static void main(String[] args) {
    restaurantEmployee r1 = new restaurantEmployee();
    r1.display_info();
    }
}
interface chef{
    default void specialty(){
        System.out.println("Cooking");
    }
}
interface server{
    default void restaurant_name(){
        System.out.println("CG");
    }
}
class restaurantEmployee implements chef,server{
    public void display_info(){
        chef.super.specialty();
        server.super.restaurant_name();
    }
}
*/

// 6. Product and Category Classes
// Define a class `Product` with attributes `product_name` and `price`. Define another class `Category` with
// the attribute `category_name`. Then create a class `ProductCategory` that inherits from both `Product` and
// `Category`, and displays the product name along with its category.

/*
public static void main(String[] args) {
    product_category p1 = new product_category();
    p1.display_info();
        }
    }
interface product{
    default void product_name(){
        System.out.println("milk");
    }
    default void price(){
        System.out.println(220);
    }
}
interface category{
    default void category_name(){
        System.out.println("Dairy product");
    }
}
class product_category implements product,category{
    public void display_info(){
        product.super.product_name();
        product.super.price();
        category.super.category_name();
    }
}
*/




// Hierarchical Inheritance


// 1. Shape Hierarchy
// Define a base class Shape with an attribute color and a method draw(). Create two subclasses
// Circle and Rectangle that inherit from Shape. Each subclass should override the draw() method to
// display its shape type and color.

/*
class ABSTRACTION {
    public static void main(String[] args) {
        shape s1 = new shape("blue");
        s1.draw();
        circle c1 = new circle("red");
        c1.draw();
        rectangle r1 = new rectangle("cyan");
        r1.draw();
    }
}
class shape {
        String color;
        shape(String color) {
            this.color = color;
        }
        void draw() {}
    }
class circle extends shape{
    circle(String color) {
        super(color);
    }
        @Override
        void draw() {
            super.draw();
            System.out.println(this.color+" circle");
        }
    }
class rectangle extends shape {
    rectangle(String color) {
        super(color);
    }
    @Override
    void draw() {
        super.draw();
        System.out.println(this.color+" rectangle");
    }
}
*/

// 2. Vehicle Hierarchy
// Define a base class Vehicle with attributes brand and speed. Create two subclasses Car
// and Bike that inherit from Vehicle. Each subclass should display vehicle details along with
// its specific type.

/*
class ABSTRACTION {
    public static void main(String[] args) {
        bike b1 = new bike("toyota",70);
        b1.display_info0();
        car c1 = new car("toyota",120);
        c1.display_info1();

    }
}
class vehicle {
    String brand;
    Integer speed;

    vehicle(String brand, Integer speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
class bike extends vehicle {
    bike(String brand, Integer speed) {
        super(brand, speed);
    }

    void display_info0() {
        System.out.println(brand);
    }
}
class car extends vehicle{
        car(String brand,Integer speed){
            super(brand,speed);
        }
        void display_info1(){
            System.out.println(speed);
        }
    }
*/

// 3. Account Hierarchy
// Define a base class BankAccount with attributes accountNumber and balance. Create two
// subclasses SavingsAccount and CurrentAccount. Each subclass should implement a method to
// display account type and balance.

/*
class ABSTRACTION {
   public static void main(String[] args) {
       SavingsAccount s1 = new SavingsAccount(40201,80000);
       s1.display_info0();
       CurrentAccount c1 = new CurrentAccount(40202,560000);
       c1.display_info1();
   }
}
class bank_account {
   Integer account_number;
   Integer balance;
   bank_account(Integer account_number,Integer balance) {
       this.account_number = account_number;
       this.balance = balance;
   }
}
class SavingsAccount extends bank_account {
   SavingsAccount(Integer account_number,Integer balance) {
       super(account_number,balance);
   }
   void display_info0() {
       System.out.println("SavingsAccount:\nAccount_number " + account_number + "\nBalance " + balance);
   }
}
class CurrentAccount extends bank_account{
   CurrentAccount(Integer account_number,Integer balance){
       super(account_number,balance);
   }
   void display_info1(){
       System.out.println();
       System.out.println("CurrentAccount:\nAccount_number " + account_number + "\nBalance " + balance);
   }
}
*/

// 4. Person Hierarchy
// Define a base class Person with attributes name and age. Create two subclasses Student and
// Teacher. Each subclass should display role-specific information such as course or subject.

/*
class java_practice {
    public static void main(String[] args) {
        student s1 = new student("ruqaiya",18);
        s1.display_s_role();
        teacher t1 = new teacher("asfiya", 24);
        t1.display_t_role();
        System.out.println("--------------------------------------------");

    }
}
class Person {
    String name;
    Integer age;
    Person(String name,Integer age) {
        this.name = name;
        this.age = age;
    }
}
class student extends Person {
    student (String name,Integer age) {
        super(name,age);
    }
    void display_s_role() {
        System.out.println("I'm "+name+", an "+age+"-year-old student of CS.");
    }
}
class teacher extends Person{
    teacher(String name,Integer age){
        super(name,age);
    }
    void display_t_role(){
        System.out.println("I'm "+name+","+age+" years old, and I teach history");
    }
}
*/

// 5. Media Hierarchy
// Define a base class Media with attributes title and duration. Create two subclasses Audio and
// Video. Each subclass should display its type and playback details.

/*
class java_class_practice {
    public static void main(String[] args) {
        Audio a1 = new Audio("Unknown", 240);
        a1.display_a();
        Video v1 = new Video("Nature Documentary", 1800);
        v1.display_V();
    }
}
class Media {
    String title;
    Integer duration;
    Media(String title,Integer duration) {
        this.title = title;
        this.duration = duration;
    }
}
class Audio extends Media {
    Audio (String title,Integer duration) {
        super(title,duration);
    }
    void display_a() {
        System.out.println("Audio:\nTitle: "+title+"\nDuration: "+duration);
    }
}
class Video extends Media{
    Video (String title,Integer duration){
        super(title,duration);
    }
    void display_V(){
        System.out.println();
        System.out.println("Video:\nTitle: "+title+"\nDuration: "+duration);
    }
}
*/

// 6. Employee Hierarchy
// Define a base class Employee with attributes name and employeeId. Create two
// subclasses Manager and Developer that inherit from Employee. Each subclass should
// have its own method to display job-specific responsibilities.

//class java{
//    public static void main(String[] args){
//        manager m1 = new manager("ifra",1464);
//        m1.display_info();
//        developer d1 = new developer("iqra", 7834);
//        d1.display_info();
//    }
//}
//class employee{
//    String name;
//    Integer employeeid;
//    employee(String name,Integer employeeid) {
//        this.name = name;
//        this.employeeid = employeeid;
//    }
//}
//class manager extends employee{
//    manager (String name,Integer employeeid) {
//        super(name,employeeid);
//    }
//    void display_info(){
//        System.out.println("Manager: "+ name + "\nID: " + employeeid);
//    }
//}
//class developer extends employee{
//    developer (String name,Integer employeeid) {
//        super(name,employeeid);
//    }
//    void display_info(){
//        System.out.println("developer: "+ name + "\nID: " + employeeid);
//    }
//}





// Multilevel Inheritance


// 1. Appliance → WashingMachine → SmartWashingMachine
// Define a base class Appliance with a method turnOn(). Create a subclass WashingMachine that
// adds a method washClothes(). Create a subclass SmartWashingMachine that adds a method
// connectToWiFi(). Demonstrate all methods using a single object.

//class ABSTRACTION{
//    public static void main(String[] args) {
//        SmartWashingMachine s1 = new SmartWashingMachine();
//        SmartWashingMachine.trunon();
//        SmartWashingMachine.washclothes();
//        SmartWashingMachine.connectToWiFi();
//    }
//}
//class Appliance {
//    void trunon() {
//        System.out.println("ON");
//    }
//}
//class WashingMachine extends Appliance {
//    void washclothes() {
//        System.out.println("WashingMachine");
//    }
//}
//class SmartWashingMachine extends WashingMachine {
//    void connectToWiFi(){
//        System.out.println("SmartWashingMachine");
//    }
//}
//           OR       
// class ABSTRACTION{
//     public static void main(String[] args) {
//         SmartWashingMachine s1 = new SmartWashingMachine();
//         SmartWashingMachine.trunon();
//         SmartWashingMachine.washclothes();
//         SmartWashingMachine.connectToWiFi();
//     }
// }
// class Appliance {
//     static void trunon() {
//         System.out.println("ON");
//     }
// }
// class WashingMachine extends Appliance {
//     static void washclothes() {
//         System.out.println("WashingMachine");
//     }
// }
// class SmartWashingMachine extends WashingMachine {
//     static void connectToWiFi(){
//         System.out.println("SmartWashingMachine");
//     }
// }

// 2. Education → Course → OnlineCourse
// Define a base class Education with an attribute institutionName. Create a subclass Course that
// adds an attribute courseName. Create a subclass OnlineCourse that adds an attribute platform.
// Display full course details.

//class ABSTRACTION{
//    public static void main(String[] args) {
//        onlinecourse oc1 = new onlinecourse("a","b","c");
//        oc1.display();
//    }
//}
//class education {
//    String institutionName;
//    education(String institutionName){
//        this.institutionName = institutionName;
//    }
//}
//class course extends education {
//    String courseName;
//    course(String courseName,String institutionName) {
//        super(institutionName);
//        this.courseName = courseName;
//    }
//}
//class onlinecourse extends course {
//    String platform;
//    onlinecourse (String platform,String courseName,String institutionName){
//        super(courseName,institutionName);
//        this.platform = platform;
//        }
//        void display(){
//            System.out.println("Platform: " + platform
//                    + "\nCourse Name: " + courseName
//                    +"\nInstitution Name: "+ institutionName);
//    }
//}

// 3. Account → SavingsAccount → PremiumSavings
// Define a base class Account with attributes accountNumber and balance. Create a subclass
// SavingsAccount that adds an attribute interestRate. Create another subclass PremiumSavings
// that adds an attribute bonusRate. Display complete account information.

// class ASTRACTION{
//     public static void main(String[] args) {
//         premium_savings p1 = new premium_savings(1,2,3,4);
//         p1.display();
//         System.out.println(p1.bonus_rate);
//     }
// }
// class account{
//     Integer account_number;
//     Integer balance;
//     account(Integer account_number,Integer balance){
//         this.account_number = account_number;
//         this.balance = balance;
//     }
// }
// class saving_account extends account{
//     Integer interestRate;
//     saving_account(Integer interestRate,Integer account_number,Integer balance){
//         super(account_number,balance);
//         this.interestRate = interestRate;
//     }
// }
// class premium_savings extends saving_account{
//     Integer bonus_rate;
//     premium_savings(Integer bonus_rate,Integer interestRate,Integer account_number,Integer balance) {
//         super(account_number, interestRate, balance);
//         this.bonus_rate = bonus_rate;
//     }
//     void display(){
//         System.out.println("bonus_rate: "+ bonus_rate
//                 + "\ninterestRate: " + interestRate
//                 + "\naccount_number: " + account_number
//                 + "\nbalance: " + balance);
//     }
// }

// 4. Vehicle → Car → ElectricCar
// Define a base class Vehicle with attributes brand and model. Create a subclass Car that adds an
// attribute fuelType. Create a subclass ElectricCar that adds an attribute batteryCapacity. Display
// all vehicle details.

// class ASTRACTION{
//     public static void main(String[] args){
//         electric_car e1 = new electric_car(1,"A","B","C");
//         e1.display_info();
//     }
// }
// class vehicle{
//     String brand;
//     String model;
//     vehicle(String brand,String model){
//         this.brand = brand;
//         this.model = model;
//     }
// }
// class car extends vehicle{
//     String fueltype;
//     car(String fueltype,String brand,String model){
//         this.fueltype = fueltype;
//         super(brand,model);
//     }
// }
// class electric_car extends car{
//     Integer battery_capacity;
//     electric_car(Integer battery_capacity,String fueltype,String brand,String model){
//         super(fueltype,brand,model);
//         this.battery_capacity = battery_capacity;
//     }
//     void display_info(){
//         System.out.println("Battery Capacity: " + battery_capacity
//                 + "\nFueltype: " + fueltype
//                 + "\nBrand: " + brand
//                 + "\nModel: " + model);
//     }
// }

// 5. Animal → Mammal → Dog
// Define a class Animal with a method eat(). Create a subclass Mammal that adds a method
// walk(). Create a subclass Dog that adds a method bark(). Demonstrate method calls using a Dog
// object.

//class ABSTRACTION{
//    public static void main(String[] args){
//        dog d1 = new dog();
//        d1.bark();
//    }
//}
//class animal{
//    void eat(){
//        System.out.println("eat");
//    }
//}
//class mammal extends animal{
//    void walk(){
//        System.out.println("walk");
//    }
//}
//class dog extends mammal{
//    void bark(){
//        System.out.println("bark");
//    }
//}

// 6. Person → Employee → Manager
// Define a base class Person with attributes name and age. Create a subclass Employee that adds
// an attribute employeeId. Create another subclass Manager that adds an attribute department.
// Display complete details of a manager.

// class jp{
//     public static void main(String[] args){
//         smartphones s1 = new smartphones("Andriod",0300,"samsung","A15");
//         s1.power_on();
//         s1.power_off();
//         s1.make_call();
//         s1.send_message();
//         s1.install_app();
//         s1.browse_internet();
//     }
// }
// class device{
//     String brand;
//     String model;
//     device(String brand_name,String model_number){
//         this.brand = brand_name;
//         this.model = model_number;
//     }
//     void power_on(){
//         System.out.println("ON");
//     }
//     void power_off(){
//         System.out.println("OFF");
//     }
// }
// class device{
//     String brand;
//     String model;
//     device(String brand_name,String model_number){
//         this.brand = brand_name;
//         this.model = model_number;
//     }
//     void power_on(){
//         System.out.println("ON");
//     }
//     void power_off(){
//         System.out.println("OFF");
//     }
// }
// class smartphones extends mobile_device {
//     String operating_system;
//     smartphones(String operating_system, Integer phone_number, String brand_name, String model_number) {
//         super(phone_number, brand_name, model_number);
//         this.operating_system = operating_system;
//     }
//     void install_app(){
//         System.out.println("INSTALLING");
//     }
//     void browse_internet(){
//         System.out.println("BROWSING");
//     }
// }





//                                  Mid-term questions

// Q1) Write a Java programs three integers from the user and prints the largest and smallest numbers among them.

//class main{
//    public static void main(String[]args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your first number: ");
//        Integer num1 = sc.nextInt();
//        System.out.println("enter your second number: ");
//        Integer num2 = sc.nextInt();
//        System.out.println("enter your third number: ");
//        Integer num3 = sc.nextInt();
//
//        // for smallest number:
//
//        if (num1>=num2 && num1>=num3){
//            System.out.println("largest number: "+ num1);
//        }
//        else if (num2>=num1 && num2>=num3){
//                System.out.println("largest number: "+ num2);
//        }
//        else if (num3>=num1 && num3>=num2){
//            System.out.println("largest number: "+ num3);
//        }
//        else{
//            System.out.println("largest number: --");
//        }
//
//        // for smallest number:
//
//        if (num1<=num2 && num1<=num3){
//            System.out.println("smallest number: "+ num1);
//        }
//        else if (num2<=num1 && num2<=num3){
//                System.out.println("smallest number: "+ num2);
//        }
//        else if (num3<=num1 && num3<=num2){
//            System.out.println("smallest number: "+ num3);
//        }
//        else{
//            System.out.println("smallest number: --");
//        }
//    }
//}
//                        OR
//import java.util.*;
//class JAV {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int i = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int j = sc.nextInt();
//        System.out.println("Enter third number: ");
//        int k = sc.nextInt();
//
//        if (i < j && i < k) {
//            if (j < k) {
//                System.out.println(k + " is the largest");
//            }
//            else {
//                System.out.println(j + " is largest");
//            }
//            System.out.println(i + " is smallest");
//        }
//        else if (k < j && k < i) {
//            if (j < i) {
//                System.out.println(i + " is the largest");
//            }
//            else {
//                System.out.println(j + " is largest");
//            }
//            System.out.println(k + " is smallest");
//        }
//        else if (j < k && j < i) {
//            if (i < k) {
//                System.out.println(k + " is the largest");
//            }
//            else {
//                System.out.println(i + " is largest");
//            }
//            System.out.println(j + "  is smallest");
//        }
//    }
//}

// Q2) write a Java program that takes n numbers from the user (where n is entered first), stores
// them in an array, and then prints:
// The sum of all numbers
// The maximum number entered

//class main{
//    public static void main(String[]args){
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of number list: ");
//        Integer size = sc.nextInt();
//
//        for (int i=1; i<=size; i++){
//            System.out.println("enter your "+i+" number: ");
//            Integer n = sc.nextInt();
//            numbers.add(n);
//        }
//        System.out.println(numbers);
//
//        int sum_of_all=0;
//        for (int i : numbers){
//            sum_of_all+=i;
//        }
//        int max_num = Collections.max(numbers);
//
//        System.out.println(sum_of_all);
//        System.out.println(max_num);
//    }
//}

// Q3) Write a Java program that reads a string from the user and counts how many vowels it contains.

//class main{
//    public static void main(String[]args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER A WORD: ");
//        String word = sc.nextLine();
//        int vowels = 0;
//        for (int i=0; i<word.length(); i++) {
//            char w = word.charAt(i);
//            if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
//                vowels++;
//            }
//        }
//        System.out.println("vowels: "+ vowels);
//    }
//}

// Q4) Write a Java program that stores 5 product names and their prices using a HashMap<String, Double>.
// Then print all products whose price is greater than 1000

//class main{
//    public static void main(String[]args){
//        HashMap<String,Integer> h1 = new HashMap<>();
//        h1.put("milk",220);
//        h1.put("salt",2230);
//        h1.put("sugar",150);
//        h1.put("chips",50);
//        h1.put("cake",1500);
//        System.out.println(h1.entrySet());
//        for (int i : h1.values()){
//            if (i >= 1000) {
//                System.out.println(i);
//            }
//        }
//    }
//}

// Q) Write a Java program to create a class Library with attributes bookTitle, author, publishedYear, and isAvailable.
// Include:
// A constructor to initialize all attributes
// Getter and setter methods
// A method borrow() that allows the user to borrow the book only if it is available and updates its availability status accordingly.

// class p{
//     public static void main(String[] args){
//         library l1 = new library("a","b",2003,true);
//         l1.borrow();
//     }
// }
// class library{
//     String book_title;
//     String author;
//     Integer published_year;
//     boolean is_available;
// library(String book_title,String author,Integer published_year,boolean is_available){
//         this.book_title = book_title;
//         this.is_available = is_available;
//         this.published_year = published_year;
//         this.author = author;
//     }
//     // Getter ----->
//     String getbook_title(){
//         return book_title;
//     }
//     String getauthor(){
//         return author;
//     }
//     Integer getpublished_year(){
//         return published_year;
//     }
//     boolean getis_available(){
//         return is_available;
//     }
//     // Setter ------->
//     void setBook_title(String book_title){
//         this.book_title = book_title;
//     }
//     void setAuthor(String author){
//         this.author = author;
//     }
//     void setPublished_year(Integer published_year){
//         this.published_year = published_year;
//     }
//     void setIs_available(String isAvailable){
//         this.is_available = is_available;
//     }
//     // Method ------>
//     void borrow(){
//         if(this.is_available == true) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Do you want to borrow? (yes/no)");
//             String ans = sc.nextLine();
//             if (ans.equals("yes")) {
//                 System.out.println("borrowed");
//                 this.is_available = false;
//             }
//         }
//         else {
//             System.out.println("book not available");
//         }
//     }
// }
