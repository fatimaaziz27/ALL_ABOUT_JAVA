import java.util.*;
public class Constructor {
    public static void main(String[] args) {
        //Topic: Constructor
    // A constructor in Java is a special method that is automatically called when an object of a class is
    // instantiated(created). It has the same name as the class, no return type (not even void), and is
    // used to initialize the object's state by setting initial values for its attributes.
    //Types of Constructor:
    //1. Argumental
    //2. Non Argumental/ Programmer Defined Default
    //3. Java Default


            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your Hair Color: ");
            String color = input.nextLine();
            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            // Creating objects of the OOP class
            Person obj1 = new Person(name,age,color);

            System.out.println("Name: " + obj1.getName() + ", Age: " + obj1.getAge()+", Hair Color: " + obj1.getHairColor());
    //
            Person obj2= new Person();
            System.out.println("Name: " + obj2.getName() + ", Age: " + obj2.getAge()+", Hair Color: " + obj2.getHairColor());
        }
    }
    class Person {
        String name; // attribute default null
        int age; // attribute default 0
        String hair_color; // attribute default null
        //Non Argumantal Constructor
        //Syntax:
        //classname(){
        //  this.attribute = programmer_default_value
        Person(){
            this.name = "Unknown";
            this.age = 10;
            this.hair_color = "Black";
        }
        // Argumantal Constructor
        //Syntax:
        //classname( datatype_of_attribute transpoter_for_attribute,....){
        //  this.attribute = transpoter_for_atttribute
        Person(String initial_name,int initial_age, String initial_hair_color){
            this.name = initial_name;
            this.age = initial_age;
            this.hair_color = initial_hair_color;
        }


        // Getter for name
        public String getName() {
            return name;
        }
        // Setter for name
        public void setName(String newname) {
            this.name = newname;
        }
        // Getter for age
        public int getAge() {
            return age;
        }
        // Setter for age
        public void setAge(int newage) {
            if (newage >= 0) { // Validation
                this.age = newage;
            } else {
                System.out.println("Age cannot be negative.");
            }
        }
        //Getter for hair color
        public String getHairColor() {
            return hair_color;
        }
        //Setter for hair color
        public void setHairColor(String new_hair_color) {
            this.hair_color = new_hair_color;
        }

    }


    //Person(){  //Non Argumantal Constructor
    //    this.name = "Unknown";
    //    this.age = 10;
    //    this.hair_color = "Black";
    //}
    
