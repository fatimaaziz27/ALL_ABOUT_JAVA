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



// Abstraction & Interfaces

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











































