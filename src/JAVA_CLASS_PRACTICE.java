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






// 6. Student Database Class
// Define a class `StudentDatabase` that holds a list of students. Each student is represented as a dictionary
// with their `name` and `age`. Provide methods to add a student, remove a student, and display all students.

// Completed -------->

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













//    Interfaces Example ------->



/*
class Mainnn{
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung");
        myPhone.info();
        myPhone.takephoto();
        myPhone.recordvideo();
        myPhone.playmusic();
        myPhone.stopmusic();
    }
}
interface Camera {
    //Identifiers for Variables -> public, static, final
    public final int value = 5;
    //Identifiers for Methods -> default, static, private
    static void takephoto(){
        System.out.println("Taking photo");
    }
    default void recordvideo(){
        System.out.println("Recording video");
    }
}
interface MusicPlayer {
    default void playmusic(){
        System.out.println("Playing music");
    }
    default void stopmusic(){
        System.out.println("Stopping music");
    }
}
class Smartphone implements Camera, MusicPlayer {
    String brand;
    
    Smartphone(String brand) {
        this.brand = brand;
    }
    void info() {
        System.out.println("Smartphone Brand: " + this.brand);
    }
    public void takephoto(){
        Camera.takephoto();
    }
    public void recordvideo(){
        Camera.super.recordvideo();
    }
    public void playmusic(){
        MusicPlayer.super.playmusic();
    }
    public void stopmusic(){
        MusicPlayer.super.stopmusic();
    }
    
}
 */




// Abstraction & Interfaces

// 4. Appliance Interface
// Define an abstract class `Appliance` with an abstract method `turn_on()`. Create subclasses
// `WashingMachine` and `Refrigerator`, each extending the `turn_on()` method.

class JAVA_CLASS_PRACTICE{
    public static void main(String[] args) {

        appliance a1 = new appliance() { };
        a1.turn_on();

        washingMachine w1 = new washingMachine() { };
        w1.turn_on();

        refrigerator r1 = new refrigerator() { };
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
    








// 5. Shape Drawing Interface
// Define an abstract class `Shape` with an abstract method `draw()`. Then create subclasses `Circle` and
// `Square` that each implement `draw()` to display the shape in a console.














// Multiple Inheritance


// 1. Artist and Writer Classes
// Define a class `Artist` with the attribute `art_style` and a method `create_art()`. Define another class
// `Writer` with the attribute `writing_style` and a method `write()`. Then define a class `CreativePerson` that
// inherits from both `Artist` and `Writer` and has a method `display_info()` that displays both art and writing
// styles. 

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























