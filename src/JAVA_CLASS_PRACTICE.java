import java.util.*;



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



// 6. Employee Hierarchy
// Define a base class Employee with attributes name and employeeId. Create two
// subclasses Manager and Developer that inherit from Employee. Each subclass should
// have its own method to display job-specific responsibilities.

// Incompleted -------->

/*
class java{
    public static void main(String[] args){
        manager m1 = new manager("ifra",1464);
        m1.display_info();
        developer d1 = new developer("iqra", 7834);
        d1.display_info();
    
    }
}
class employee{
    String name;
    Integer employeeid;
    employee(String name,Integer employeeid){
        this.name = name;
        this.employeeid = employeeid;
    }
class manager extends employee{
    manager (String name,Integer employeeid) {
        super(name,employeeid);
    }
    void display_info(){
        System.out.println("Manager: "+ name + "ID: " + employeeid);
    }
}
class developer extends employee{
    developer (String name,Integer employeeid) {
        super(name,employeeid);
    }
    void display_info(){
        System.out.println("developer: "+ name + "ID: " + employeeid);
    }
}
}
*/


// mid-term questions

// Q1) Write a Java programs three integers from the user and prints the largest and smallest numbers among them.

/*
class main{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number: ");
        Integer num1 = sc.nextInt();
        System.out.println("enter your second number: ");
        Integer num2 = sc.nextInt();
        System.out.println("enter your third number: ");
        Integer num3 = sc.nextInt();

        // for smallest number:

        if (num1>=num2 && num1>=num3){
            System.out.println("largest number: "+ num1);
        }
        else if (num2>=num1 && num2>=num3){
                System.out.println("largest number: "+ num2);
        }
        else if (num3>=num1 && num3>=num2){
            System.out.println("largest number: "+ num3);
        }
        else{
            System.out.println("largest number: --");
        }
        
        // for smallest number:

        if (num1<=num2 && num1<=num3){
            System.out.println("smallest number: "+ num1);
        }
        else if (num2<=num1 && num2<=num3){
                System.out.println("smallest number: "+ num2);
        }
        else if (num3<=num1 && num3<=num2){
            System.out.println("smallest number: "+ num3);
        }
        else{
            System.out.println("smallest number: --");
        }
    }
}
*/

// Q2) write a Java program that takes n numbers from the user (where n is entered first), stores them in an array, and then prints:
// The sum of all numbers
// The maximum number entered

/*
class main{
    public static void main(String[]args){
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of number list: ");
        Integer size = sc.nextInt();
        
        for (int i=1; i<=size; i++){
            System.out.println("enter your "+i+" number: ");
            Integer n = sc.nextInt();
            numbers.add(n);
        }
        System.out.println(numbers);

        int sum_of_all=0;
        for (int i : numbers){
            sum_of_all+=i;
        }

        int max_num = 0;
        for (int i : numbers){
            max_num++;
        }
        
        System.out.println(sum_of_all);
        System.out.println(max_num);
    }
}
*/

// Q3) Write a Java program that reads a string from the user and counts how many vowels it contains.
/*
class main{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A WORD: ");
        String w = sc.nextLine();
        int vowels = 0;
        if (w == "a" || w == "e" || w == "i" || w == "o" || w == "u"){
            vowels++;
        }

        System.out.println(vowels);
    }
}
*/

// Q4) Write a Java program that stores 5 product names and their prices using a HashMap<String, Double>.
// Then print all products whose price is greater than 1000


class main{
    public static void main(String[]args){
    HashMap<String,Integer> h1 = new HashMap<>();
    h1.put("milk",220);
    h1.put("salt",2230);
    h1.put("sugar",150);
    h1.put("chips",50);
    h1.put("cake",100);
    
    for (int i : h1){

    }
    }
}











// Multilevel Inheritance

// example code --------->


//class Multilevel{
//    public static void main(String[] args) {
//        Animals myAnimal = new Animals("Generic Animal", "make sound");
//        myAnimal.info();
//        myAnimal.speak();
//        Dog myDog = new Dog("Dog", "Bark", "Labrador");
//        myDog.info();
//        myDog.speak();
//        Puppy myPuppy = new Puppy("Puppy", "Bark", "Beagle", 6);
//        myPuppy.info();
//        myPuppy.speak();
//    }
//}
//class Animals {
//    String specie;
//    String language;
//
//    Animals(String specie, String language) {
//        this.specie = specie;
//        this.language = language;
//    }
//
//    void info() {
//        System.out.println("Specie: " + this.specie + "\nLanguage: " + this.language);
//    }
//
//    void speak() {
//        System.out.println("I am a " + this.specie + " and I can " + this.language);
//    }
//}
//class Dog extends Animals {
//    String breed;
//
//    Dog(String specie_child, String language_child, String breed_child) {
//        super(specie_child, language_child);
//        this.breed = breed_child;
//    }
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//    public String getBreed() {
//        return this.breed;
//    }
//    @Override
//    void info() {
//        super.info();
//        System.out.println("Breed: " + this.breed);
//    }
//    @Override
//    void speak() {
//        super.speak();
//        System.out.println(" and I am of breed " + this.breed + ".");
//    }
//}
//class Puppy extends Dog {
//    int ageInMonths;
//
//    Puppy(String specie_child, String language_child, String breed_child, int ageInMonths_child) {
//        super(specie_child, language_child, breed_child);
//        this.ageInMonths = ageInMonths_child;
//    }
//    public void setAgeInMonths(int ageInMonths) {
//        this.ageInMonths = ageInMonths;
//    }
//    public int getAgeInMonths() {
//        return this.ageInMonths;
//    }
//    @Override
//    void info() {
//        super.info();
//        System.out.println("Age in Months: " + this.ageInMonths);
//    }
//    @Override
//    void speak() {
//        super.speak();
//        System.out.println(" I am a puppy and I am " + this.ageInMonths + " months old.");
//    }
//}



// class Multilevel{
//     public static void main(String[] args) {
//         Device myDevice = new Device("Samsung", "S10");
//         myDevice.info();
//         myDevice.poweron();
//         myDevice.poweroff();
//         System.out.println();
//         MobileDevice myMobile = new MobileDevice("Nokia", "3310", 123456789);
//         myMobile.info();
//         myMobile.poweron();
//         myMobile.makeCall();
//         myMobile.sendMessage();
//         myMobile.poweroff();
//         System.out.println();
//         Smartphone mySmart = new Smartphone("Samsung", "S22", "One UI 8", 123456789);
//         mySmart.info();
//         mySmart.poweron();
//         mySmart.installApp();
//         mySmart.browseInternet();
//         myMobile.makeCall();
//         myMobile.sendMessage();
//         myMobile.poweroff();
//         System.out.println();
//     }
// }
// class Device{
//     String brand;
//     String model;
//     Device(String brand, String model){
//         this.brand = brand;
//         this.model = model;
//     }
//     void info(){
//         System.out.println("Brand: " + this.brand);
//         System.out.println("Model: " + this.model);
//     }
//     void poweron(){
//         System.out.println("Powered on");
//     }
//     void poweroff(){
//         System.out.println("Powered off");
//     }
// }
// class  MobileDevice extends Device{
//     int phonenumber;
//     MobileDevice(String brand, String model, int phonenumber){
//         super(brand,model);
// //        this.brand= brand;
// //        this.model=model;
//         this.phonenumber=phonenumber;
//     }
//     void info(){
//         super.info();
//         System.out.println("Phone number: " + this.phonenumber);
//     }
//     void makeCall(){
//         System.out.println("Calling.....");
//     }
//     void sendMessage(){
//         System.out.println("Sending message.....");
//     }
// }
// class Smartphone extends MobileDevice{
//     String os;
//     Smartphone(String brand, String model, String os, int phonenumber){
//         super(brand,model,phonenumber);
//         this.os=os;
//     }
//     void info(){
//         super.info();
//         System.out.println("OS: " + this.os);
//     }
//     void installApp(){
//         System.out.println("Installing app.....");
//     }
//     void browseInternet(){
//         System.out.println("Browsing Internet.....");
//     }
// }










// 1. Appliance → WashingMachine → SmartWashingMachine
// Define a base class Appliance with a method turnOn(). Create a subclass WashingMachine that
// adds a method washClothes(). Create a subclass SmartWashingMachine that adds a method
// connectToWiFi(). Demonstrate all methods using a single object.

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

// 4. Create a base class named Device with attributes like brand and
// model, and methods like powerOn() and powerOff().
// Create a subclass named MobileDevice that inherits from Device and
// adds attributes like phoneNumber and methods like makeCall() and
// sendMessage().
// Finally, create another subclass named Smartphone that inherits
// from MobileDevice and adds attributes like operatingSystem and
// methods like installApp() and browseInternet().




















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





























































