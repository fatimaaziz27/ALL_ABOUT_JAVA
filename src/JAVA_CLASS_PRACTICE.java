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


// Hierarchical Inheritance

// examples code ------->


// class Main9{
//     public static void main(String[] args) {
//         Animal2 myAnimal = new Animal2("Generic Animal", "make sound");
//         myAnimal.info();
//         myAnimal.speak();
//         Dog1 myDog = new Dog1("Dog", "Bark", "Labrador");
//         myDog.info();
//         myDog.speak();
//         Cat myCat = new Cat("Cat", "Meow", "Brown");
//         myCat.info();
//         myCat.speak();
//     }
// }
// class Animal2 {
//     String specie;
//     String language;

//     Animal2(String specie, String language) {
//         this.specie = specie;
//         this.language = language;
//     }

//     void info() {
//         System.out.println("Specie: " + this.specie + "\nLanguage: " + this.language);
//     }

//     void speak() {
//         System.out.println("I am a " + this.specie + " and I can " + this.language);
//     }
// }
// class Dog1 extends Animal2 {
//     String breed;

//     Dog1(String specie_child, String language_child, String breed_child) {
//         super(specie_child, language_child);
//         this.breed = breed_child;
//     }
//     public void setBreed(String breed) {
//         this.breed = breed;
//     }
//     public String getBreed() {
//         return this.breed;
//     }
//     @Override
//     void info() {
//         super.info();
//         System.out.println("Breed: " + this.breed);
//     }
//     @Override
//     void speak() {
//         super.speak();
//         System.out.println("and I am of breed " + this.breed + ".");
//     }
// }


// //Hierarchical Inheritance Example:

// class Cat extends Animal2 {
//     String color;

//     Cat(String specie_child, String language_child, String color_child) {
//         super(specie_child, language_child);
//         this.color = color_child;
//     }
//    public void setColor(String color) {
//         this.color = color;
//     }
//     public String getColor() {
//         return this.color;
//     }
//     @Override
//     void info() {
//         super.info();
//         System.out.println("Color: " + this.color);
//     }
//     @Override
//     void speak() {
//         super.speak();
//         System.out.println("I am a " + this.color + " cat.");
//     }
// }


//Hierarchical Inheritance Example:


// class Cat extends Animal {
//     String color;
//     Cat(String specie_child, String language_child, String color_child) {
//         super(specie_child, language_child);
//         this.color = color_child;
//     }
//     @Override
//     void info() {
//         super.info();
//         System.out.println("Color: " + this.color);
//     }
//     @Override
//     void speak() {
//         super.speak();
//         System.out.println(" I am a " + this.color + " cat.");
//     }
// }

// class Puppy extends Dog {
//     int ageInMonths;

//     Puppy(String specie_child, String language_child, String breed_child, int ageInMonths_child) {
//         super(specie_child, language_child, breed_child);
//         this.ageInMonths = ageInMonths_child;
//     }
//     public void setAgeInMonths(int ageInMonths) {
//         this.ageInMonths = ageInMonths;
//     }
//     public int getAgeInMonths() {
//         return this.ageInMonths;
//     }
//     @Override
//     void info() {
//         super.info();
//         System.out.println("Age in Months: " + this.ageInMonths);
//     }
//     @Override
//     void speak() {
//         super.speak();
//         System.out.println("I am a puppy and I am " + this.ageInMonths + " months old.");
//     }
// }





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

// class ABSTRACTION {
//     public static void main(String[] args) {
//         shape s1 = new shape("blue");
//         s1.draw();
//         circle c1 = new circle("red");
//         c1.draw();
//         rectangle r1 = new rectangle("cyan");
//         r1.draw();
//     }
// }
// class shape {
//         String color;
//         shape(String color) {
//             this.color = color;
//         }
//         void draw() {}
//     }
// class circle extends shape{
//     circle(String color) {
//         super(color);
//     }
//         @Override
//         void draw() {
//             super.draw();
//             System.out.println(this.color+" circle");
//         }
//     }
// class rectangle extends shape {
//     rectangle(String color) {
//         super(color);
//     }
//     @Override
//     void draw() {
//         super.draw();
//         System.out.println(this.color+" rectangle");
//     }
// }

// 2. Education → Course → OnlineCourse
// Define a base class Education with an attribute institutionName. Create a subclass Course that
// adds an attribute courseName. Create a subclass OnlineCourse that adds an attribute platform.
// Display full course details.

// class ABSTRACTION {
//     public static void main(String[] args) {
//         bike b1 = new bike("toyota",70);
//         b1.display_info0();
//         car c1 = new car("toyota",120);
//         c1.display_info1();

//     }
// }
// class vehicle {
//     String brand;
//     Integer speed;

//     vehicle(String brand, Integer speed) {
//         this.brand = brand;
//         this.speed = speed;
//     }
// }
// class bike extends vehicle {
//     bike(String brand, Integer speed) {
//         super(brand, speed);
//     }

//     void display_info0() {
//         System.out.println(brand);
//     }
// }
// class car extends vehicle{
//         car(String brand,Integer speed){
//             super(brand,speed);
//         }
//         void display_info1(){
//             System.out.println(speed);
//         }
//     }

// 3. Account → SavingsAccount → PremiumSavings
// Define a base class Account with attributes accountNumber and balance. Create a subclass
// SavingsAccount that adds an attribute interestRate. Create another subclass PremiumSavings
// that adds an attribute bonusRate. Display complete account information.

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






























































