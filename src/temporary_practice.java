public class temporary_practice {

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

// 5. Rectangle Class
// Define a class `Rectangle` with attributes `length` and `width`. Create methods to calculate the perimeter
// and area of the rectangle.

/* 
class rectangle{
    float length;
    float width;

    float area() {
        return length * width;
    }

    float perimeter() {
        return 2 * (length + width);
    }
}
*/

// 6. Student Database Class
// Define a class `StudentDatabase` that holds a list of students. Each student is represented as a dictionary
// with their `name` and `age`. Provide methods to add a student, remove a student, and display all students.
/* 
static class StudentDatabase{
    
    ArrayList<HashMap<String, Object>> students = new ArrayList<>();

    // Add a student
    void addStudent(String name, int age) {
        HashMap<String, Object> student = new HashMap<>();
        student.put("name", name);
        student.put("age", age);
        students.add(student);
    }

    // Remove a student by name
    void removeStudent(String name) {
        students.removeIf(student -> student.get("name").equals(name));
    }

    // Display all students
    void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in database.");
        } else {
            for (HashMap<String, Object> student : students) {
                System.out.println(
                    "Name: " + student.get("name") +
                    ", Age: " + student.get("age")
                );
            }
        }
    }
}


    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        db.addStudent("Ali", 20);
        db.addStudent("Fatima", 19);

        db.displayStudents();

        db.removeStudent("Ali");

        System.out.println("After removal:");
        db.displayStudents();
    }
}

*/

// 1. Shape Inheritance
// Define a base class `Shape` with a method `draw()`. Then create subclasses `Circle` and `Rectangle`, each
// implementing the `draw()` method. Demonstrate polymorphism.

/*
static class shape{
    void draw(){
        System.out.println("I can draw");
    }
}
static class circle extends shape{
    void draw(){
        System.out.println("I can draw circle");
    }
}
static class rectangle extends shape{
    void draw(){
        System.out.println("I can draw rectangle");
    }
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new rectangle();

        s1.draw();
        s2.draw();
}
}}
*/

// 2. Animal and Dog Classes
// Create a class `Animal` with attributes `name` and `species`. Then, create a class `Dog` that inherits from
// `Animal`, with an additional attribute `breed`. Demonstrate usage by creating instances of both classes and
// printing their information.

/* 
static class animal{
    String name;
    String species;

    void display_info(){
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Species: " + species);
    }
}
static class dog extends animal{
    String breed;

    void display_info(){
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Species: " + species);
        System.out.println("Dog Breed: " + breed);
    }
    public static void main(String[]args){
        animal a1 = new dog();
        a1.name = "Buddy";
        a1.species = "Canine";
        ((dog) a1).breed = "Golden Retriever";
        a1.display_info();
    }
}}
*/



}
