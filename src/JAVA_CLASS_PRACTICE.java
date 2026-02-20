import java.util.*;

// Functions and Exception Handling

// 1. Safe Addition
// Write a Java function `safe_add(x: float, y: float) -> float` that adds two numbers, and returns a custom
// error message if the numbers are not valid floats.

//class jp{
//    public static void main(String[]arg){
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter first float number: ");
//            double x = sc.nextDouble();
//            System.out.println("Enter second float number: ");
//            double y = sc.nextDouble();
//            double c = x + y;
//            System.out.println("Result: " + c);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Invalid Input");
//        }
//    }
//}





// 2. Safe Subtraction
// Write a Java function `safe_subtract(x: float, y: float) -> float` that subtracts two numbers and handles
// the case where the subtraction results in a negative number.


// class jp{
//     public static void main(String[]arg) {
//         try {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter first float number: ");
//             double x = sc.nextDouble();
//             System.out.println("Enter second float number: ");
//             double y = sc.nextDouble();
//             double c = x - y;
//             if (c<=0){
//             throw ArithmeticException;
//             }
//         }
//         catch (Exception e){
//             System.out.println("-------");
//         }
//     }
// }



// 3. Check for Division by Zero
// Write a Java function `divide_numbers(x: float, y: float) -> float` that divides `x` by `y`. If `y` is zero, it
// should return `"Cannot divide by zero"`.



//class jp{
//    public static void main(String[]arg){
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter first float number: ");
//            int x = sc.nextInt();
//            System.out.println("Enter second float number: ");
//            int y = sc.nextInt();
//            int c = x / y;
//            System.out.println(c);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        }
//    }
//}




// 4. Handling Invalid Input
// Write a Java function `parse_input(value: str) -> int` that takes a string input and converts it to an
// integer. If the conversion fails, return the message `"Invalid input"`.

//class jp{
//    public static void main(String[]arg){
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a word: ");
//            String word = sc.nextLine();
//            int a= Integer.parseInt(word);
//
//        }
//        catch (Exception e){
//            System.out.println("Invalid input");
//        }
//    }
//}















// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// Incompleted -------->

/*
class java{
    public static void main(String[] args){

    }
}
class gradebook{
    private String student_name;
    private ArrayList grades;

    void add_grade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arraylist");
        int size = sc.nextInt();
        while (size > 0) {
            Scanner c = new Scanner(System.in);
            System.out.println("enter any number");
            int num = c.nextInt();
            this.grades.add(num);
            size--;
        }
    }
    void average_grade() {
        int count=0;
        for (int i : this.grades){
            count+=i;
        }
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


































// Hierarchical Inheritance

// 1. Shape Hierarchy
// Define a base class Shape with an attribute color and a method draw(). Create two subclasses
// Circle and Rectangle that inherit from Shape. Each subclass should override the draw() method to
// display its shape type and color.

//class ABSTRACTION {
//    public static void main(String[] args) {
//        shape s1 = new shape("blue");
//        s1.draw();
//        circle c1 = new circle("red");
//        c1.draw();
//        rectangle r1 = new rectangle("cyan");
//        r1.draw();
//    }
//}
//class shape {
//        String color;
//        shape(String color) {
//            this.color = color;
//        }
//        void draw() {}
//    }
//class circle extends shape{
//    circle(String color) {
//        super(color);
//    }
//        @Override
//        void draw() {
//            super.draw();
//            System.out.println(this.color+" circle");
//        }
//    }
//class rectangle extends shape {
//    rectangle(String color) {
//        super(color);
//    }
//    @Override
//    void draw() {
//        super.draw();
//        System.out.println(this.color+" rectangle");
//    }
//}


// 2. Vehicle Hierarchy
// Define a base class Vehicle with attributes brand and speed. Create two subclasses Car
// and Bike that inherit from Vehicle. Each subclass should display vehicle details along with
// its specific type.

//class ABSTRACTION {
//    public static void main(String[] args) {
//        bike b1 = new bike("toyota",70);
//        b1.display_info0();
//        car c1 = new car("toyota",120);
//        c1.display_info1();
//
//    }
//}
//class vehicle {
//    String brand;
//    Integer speed;
//
//    vehicle(String brand, Integer speed) {
//        this.brand = brand;
//        this.speed = speed;
//    }
//}
//class bike extends vehicle {
//    bike(String brand, Integer speed) {
//        super(brand, speed);
//    }
//
//    void display_info0() {
//        System.out.println(brand);
//    }
//}
//class car extends vehicle{
//        car(String brand,Integer speed){
//            super(brand,speed);
//        }
//        void display_info1(){
//            System.out.println(speed);
//        }
//    }


// 3. Account Hierarchy
// Define a base class BankAccount with attributes accountNumber and balance. Create two
// subclasses SavingsAccount and CurrentAccount. Each subclass should implement a method to
// display account type and balance.

//class ABSTRACTION {
//    public static void main(String[] args) {
//        SavingsAccount s1 = new SavingsAccount(40201,80000);
//        s1.display_info0();
//        CurrentAccount c1 = new CurrentAccount(40202,560000);
//        c1.display_info1();
//    }
//}
//class bank_account {
//    Integer account_number;
//    Integer balance;
//    bank_account(Integer account_number,Integer balance) {
//        this.account_number = account_number;
//        this.balance = balance;
//    }
//}
//class SavingsAccount extends bank_account {
//    SavingsAccount(Integer account_number,Integer balance) {
//        super(account_number,balance);
//    }
//    void display_info0() {
//        System.out.println("SavingsAccount:\nAccount_number " + account_number + "\nBalance " + balance);
//    }
//}
//class CurrentAccount extends bank_account{
//    CurrentAccount(Integer account_number,Integer balance){
//        super(account_number,balance);
//    }
//    void display_info1(){
//        System.out.println();
//        System.out.println("CurrentAccount:\nAccount_number " + account_number + "\nBalance " + balance);
//    }
//}

// 4. Person Hierarchy
// Define a base class Person with attributes name and age. Create two subclasses Student and
// Teacher. Each subclass should display role-specific information such as course or subject.

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




















































































