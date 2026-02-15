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

// 4. Create a base class named Device with attributes like brand and
// model, and methods like powerOn() and powerOff().
// Create a subclass named MobileDevice that inherits from Device and
// adds attributes like phoneNumber and methods like makeCall() and
// sendMessage().
// Finally, create another subclass named Smartphone that inherits
// from MobileDevice and adds attributes like operatingSystem and
// methods like installApp() and browseInternet().

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
















































































