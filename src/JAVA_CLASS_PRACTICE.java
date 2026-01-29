import java.util.*;



// 6. Student Database Class
// Define a class `StudentDatabase` that holds a list of students. Each student is represented as a dictionary
// with their `name` and `age`. Provide methods to add a student, remove a student, and display all students.

// incomplete code --------->

//class abstraction{
//    public static void main(String[] args){
//        student_database s1 = new student_database("me",18);
//        ArrayList<Object> l1 = new ArrayList<>();
//        l1.add(s1);
//
//    }
//}
//class student_database{
//    String name;
//    Integer age;
//    student_database(String name , Integer age){
//        this.name = name;
//        this.age= age;
//    }
//    void display(){
//        System.out.println("data " + this.name);
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




// Abstraction & Interfaces

// example code -------->

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


// 1. Shape Area Calculation
// Define an abstract class `Shape` with an abstract method `calculate_area()`. Then create subclasses
// `Circle` and `Rectangle` that extends this method, calculating the area for each shape.

// complete code --------->

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

// complete code --------->

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

// complete code --------->

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


// 4. Appliance Interface
// Define an abstract class `Appliance` with an abstract method `turn_on()`. Create subclasses
// `WashingMachine` and `Refrigerator`, each extending the `turn_on()` method.

// 5. Shape Drawing Interface
// Define an abstract class `Shape` with an abstract method `draw()`. Then create subclasses `Circle` and
// `Square` that each implement `draw()` to display the shape in a console.

// 6. Employee Task Management
// Create an abstract class `Employee` with an abstract method `perform_task()`. Then create two
// subclasses, `Manager` and `Developer`, and extends `perform_task()` for each subclass with appropriate
// tasks.























