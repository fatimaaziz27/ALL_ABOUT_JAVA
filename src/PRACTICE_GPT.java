/*
 * ============================================================
 *                 JAVA FUNDAMENTALS PRACTICE
 *                       Practice.java
 * ============================================================
 *
 * Topics:
 *
 * 1. Variables & Data Types
 * 2. Operators
 * 3. if / else
 * 4. switch
 * 5. Loops
 * 6. Arrays
 * 7. Strings
 * 8. Methods
 * 9. Input / Output
 * 10. Type Casting
 *
 *
 * IMPORTANT:
 *
 * The examples are provided first.
 * The practice questions are provided after each topic.
 *
 * Try solving the practice questions yourself before
 * checking any solution.
 *
 * ============================================================
 */


/*
 * ============================================================
 * 1. VARIABLES & DATA TYPES
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Create variables using different data types.
 */

class VariablesExample1 {

    public static void main(String[] args) {

        String name = "Fatima";
        int age = 20;
        double height = 5.5;
        boolean student = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(student);
    }
}


/*
 * EXAMPLE 2
 *
 * Changing the value of a variable.
 */

class VariablesExample2 {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age);

        age = 21;

        System.out.println(age);
    }
}


/*
 * EXAMPLE 3
 *
 * Using variables in a calculation.
 */

class VariablesExample3 {

    public static void main(String[] args) {

        int price = 500;
        int quantity = 3;

        int total = price * quantity;

        System.out.println("Total: " + total);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create variables for:
 *
 * Name
 * Age
 * City
 * GPA
 * Student status
 *
 *
 * Q2.
 * Create:
 *
 * price = 1000
 * quantity = 5
 *
 * Calculate and print the total.
 *
 *
 * Q3.
 * Create:
 *
 * length = 10
 * width = 5
 *
 * Calculate the area of a rectangle.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 2. OPERATORS
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Arithmetic operators.
 */

class OperatorsExample1 {

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}


/*
 * EXAMPLE 2
 *
 * Comparison operators.
 */

class OperatorsExample2 {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age > 18);
        System.out.println(age == 20);
        System.out.println(age != 25);
        System.out.println(age < 30);
    }
}


/*
 * EXAMPLE 3
 *
 * Logical operators.
 */

class OperatorsExample3 {

    public static void main(String[] args) {

        int age = 25;

        System.out.println(age >= 18 && age <= 60);

        System.out.println(age < 18 || age > 60);

        System.out.println(!(age < 18));
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create two numbers and print:
 *
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Remainder
 *
 *
 * Q2.
 * Check whether a number is greater than 50.
 *
 *
 * Q3.
 * Check whether a person is between 18 and 60 years old
 * using the && operator.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 3. IF / ELSE
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Check whether someone is an adult or minor.
 */

class IfElseExample1 {

    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {

            System.out.println("Adult");

        } else {

            System.out.println("Minor");
        }
    }
}


/*
 * EXAMPLE 2
 *
 * Check whether a number is even or odd.
 */

class IfElseExample2 {

    public static void main(String[] args) {

        int number = 7;

        if (number % 2 == 0) {

            System.out.println("Even");

        } else {

            System.out.println("Odd");
        }
    }
}


/*
 * EXAMPLE 3
 *
 * Grade calculator.
 */

class IfElseExample3 {

    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 80) {

            System.out.println("A");

        } else if (marks >= 60) {

            System.out.println("B");

        } else if (marks >= 40) {

            System.out.println("C");

        } else {

            System.out.println("Fail");
        }
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Check whether a number is:
 *
 * Positive
 * Negative
 * Zero
 *
 *
 * Q2.
 * Check whether someone is eligible to vote.
 *
 * Age 18 or above = Eligible
 * Otherwise = Not eligible
 *
 *
 * Q3.
 * Create a grading system:
 *
 * 90+     = A+
 * 80-89   = A
 * 70-79   = B
 * 60-69   = C
 * Below 60 = Fail
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 4. SWITCH
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Days of the week.
 */

class SwitchExample1 {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}


/*
 * EXAMPLE 2
 *
 * Simple food menu.
 */

class SwitchExample2 {

    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {

            case 1:
                System.out.println("Burger");
                break;

            case 2:
                System.out.println("Pizza");
                break;

            case 3:
                System.out.println("Pasta");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}


/*
 * EXAMPLE 3
 *
 * Simple calculator using switch.
 */

class SwitchExample3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a switch for all 7 days of the week.
 *
 *
 * Q2.
 * Create this menu:
 *
 * 1. Tea
 * 2. Coffee
 * 3. Juice
 * 4. Water
 *
 * Print the selected item.
 *
 *
 * Q3.
 * Create a calculator using:
 *
 * +
 * -
 * *
 * /
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 5. LOOPS
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * for loop.
 */

class LoopsExample1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }
}


/*
 * EXAMPLE 2
 *
 * while loop.
 */

class LoopsExample2 {

    public static void main(String[] args) {

        int i = 10;

        while (i >= 1) {

            System.out.println(i);

            i--;
        }
    }
}


/*
 * EXAMPLE 3
 *
 * Multiplication table.
 */

class LoopsExample3 {

    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    number + " x " + i + " = " + number * i
            );
        }
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Print numbers from 1 to 100.
 *
 *
 * Q2.
 * Print all even numbers from 1 to 50.
 *
 *
 * Q3.
 * Print the multiplication table of 7.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 6. ARRAYS
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Create and access an array.
 */

class ArraysExample1 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);

        System.out.println(numbers[4]);
    }
}


/*
 * EXAMPLE 2
 *
 * Loop through an array.
 */

class ArraysExample2 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}


/*
 * EXAMPLE 3
 *
 * Find the sum of array values.
 */

class ArraysExample3 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int number : numbers) {

            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Find the largest number:
 *
 * {10, 45, 23, 78, 12}
 *
 *
 * Q2.
 * Find the smallest number:
 *
 * {50, 20, 90, 10, 40}
 *
 *
 * Q3.
 * Find the average:
 *
 * {80, 70, 90, 60, 100}
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 7. STRINGS
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Basic String methods.
 */

class StringsExample1 {

    public static void main(String[] args) {

        String name = "Fatima";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());
    }
}


/*
 * EXAMPLE 2
 *
 * Access individual characters.
 */

class StringsExample2 {

    public static void main(String[] args) {

        String name = "Fatima";

        System.out.println(name.charAt(0));

        System.out.println(name.charAt(2));
    }
}


/*
 * EXAMPLE 3
 *
 * Compare Strings.
 */

class StringsExample3 {

    public static void main(String[] args) {

        String password = "java123";

        if (password.equals("java123")) {

            System.out.println("Correct password");

        } else {

            System.out.println("Wrong password");
        }
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a String and print:
 *
 * Length
 * Uppercase
 * Lowercase
 * First character
 *
 *
 * Q2.
 * Check whether a String equals "Java".
 *
 *
 * Q3.
 * Count how many characters are in:
 *
 * "Hello World"
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 8. METHODS
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Method without parameters.
 */

class MethodsExample1 {

    static void greet() {

        System.out.println("Hello!");
    }


    public static void main(String[] args) {

        greet();
    }
}


/*
 * EXAMPLE 2
 *
 * Method with parameters.
 */

class MethodsExample2 {

    static void greet(String name) {

        System.out.println("Hello " + name);
    }


    public static void main(String[] args) {

        greet("Fatima");

        greet("Ali");
    }
}


/*
 * EXAMPLE 3
 *
 * Method that returns a value.
 */

class MethodsExample3 {

    static int add(int a, int b) {

        return a + b;
    }


    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Create a method:
 *
 * square(int number)
 *
 * that returns the square of the number.
 *
 *
 * Q2.
 * Create a method:
 *
 * isEven(int number)
 *
 * that returns true if the number is even.
 *
 *
 * Q3.
 * Create a method:
 *
 * calculateTotal(int price, int quantity)
 *
 * that returns the total price.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 9. INPUT / OUTPUT
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * Take integer input.
 */

class InputExample1 {

    public static void main(String[] args) {

        java.util.Scanner input =
                new java.util.Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = input.nextInt();

        System.out.println("Your age is " + age);

        input.close();
    }
}


/*
 * EXAMPLE 2
 *
 * Take String input.
 */

class InputExample2 {

    public static void main(String[] args) {

        java.util.Scanner input =
                new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = input.nextLine();

        System.out.println("Hello " + name);

        input.close();
    }
}


/*
 * EXAMPLE 3
 *
 * Take multiple inputs.
 */

class InputExample3 {

    public static void main(String[] args) {

        java.util.Scanner input =
                new java.util.Scanner(System.in);

        System.out.print("Enter price: ");

        double price = input.nextDouble();

        System.out.print("Enter quantity: ");

        int quantity = input.nextInt();

        double total = price * quantity;

        System.out.println("Total: " + total);

        input.close();
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Ask the user for:
 *
 * Name
 * Age
 *
 * Then print both.
 *
 *
 * Q2.
 * Ask for two numbers and print their sum.
 *
 *
 * Q3.
 * Ask for:
 *
 * Product name
 * Price
 * Quantity
 *
 * Then calculate and print the total.
 *
 *
 * ============================================================
 */


/*
 * ============================================================
 * 10. TYPE CASTING
 * ============================================================
 */


/*
 * EXAMPLE 1
 *
 * int -> double
 *
 * This is automatic widening.
 */

class CastingExample1 {

    public static void main(String[] args) {

        int number = 10;

        double value = number;

        System.out.println(value);
    }
}


/*
 * EXAMPLE 2
 *
 * double -> int
 *
 * This requires manual casting.
 */

class CastingExample2 {

    public static void main(String[] args) {

        double number = 10.99;

        int value = (int) number;

        System.out.println(value);
    }
}


/*
 * EXAMPLE 3
 *
 * Casting during division.
 */

class CastingExample3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        double result = (double) a / b;

        System.out.println(result);
    }
}


/*
 * ------------------------------------------------------------
 * PRACTICE QUESTIONS
 * ------------------------------------------------------------
 *
 * Q1.
 * Convert:
 *
 * double price = 99.99;
 *
 * into an int.
 *
 *
 * Q2.
 * Convert:
 *
 * int number = 25;
 *
 * into a double.
 *
 *
 * Q3.
 * Calculate 7 / 2 and make sure the result is:
 *
 * 3.5
 *
 *
 * ============================================================
 *                  MINI PROJECTS
 * ============================================================
 *
 *
 * PROJECT 1
 * ------------------------------------------------------------
 * SIMPLE CALCULATOR
 * ------------------------------------------------------------
 *
 * Requirements:
 *
 * Ask the user for two numbers.
 *
 * Example:
 *
 * Enter first number: 10
 * Enter second number: 5
 *
 *
 * Display:
 *
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 *
 *
 * Ask the user to choose an operation.
 *
 * Example:
 *
 * Choose operation: 1
 *
 * Output:
 *
 * Result: 15
 *
 *
 * Concepts to use:
 *
 * Variables
 * Input
 * Operators
 * switch
 * Methods
 *
 *
 * ============================================================
 *
 *
 * PROJECT 2
 * ------------------------------------------------------------
 * STUDENT GRADE CALCULATOR
 * ------------------------------------------------------------
 *
 * Ask the user for:
 *
 * Student name
 * Marks
 *
 *
 * Grade system:
 *
 * 90+      = A+
 * 80-89    = A
 * 70-79    = B
 * 60-69    = C
 * 50-59    = D
 * Below 50 = Fail
 *
 *
 * Example output:
 *
 * Student: Fatima
 * Marks: 85
 * Grade: A
 *
 *
 * Concepts to use:
 *
 * Variables
 * Input
 * if / else
 * Operators
 * Strings
 * Methods
 *
 *
 * ============================================================
 *
 *
 * PROJECT 3
 * ------------------------------------------------------------
 * MINI BUS TICKET BOOKING
 * ------------------------------------------------------------
 *
 * Ask the user for:
 *
 * Passenger name
 * Destination
 * Ticket price
 * Number of seats
 *
 *
 * Calculate:
 *
 * total = ticket price * number of seats
 *
 *
 * Example:
 *
 * Enter passenger name: Fatima
 * Enter destination: Lahore
 * Enter ticket price: 3500
 * Enter number of seats: 2
 *
 *
 * Output:
 *
 * ==============================
 *          BUS TICKET
 * ==============================
 *
 * Passenger: Fatima
 * Destination: Lahore
 * Seats: 2
 * Price: 3500
 * Total: 7000
 *
 * Booking Successful!
 *
 *
 * If seats are 0:
 *
 * No seats available.
 *
 *
 * Concepts to use:
 *
 * Variables
 * Data Types
 * Input / Output
 * Operators
 * if / else
 * Methods
 * Strings
 *
 *
 * ============================================================
 *                      CHALLENGE
 * ============================================================
 *
 * Try to build all 3 projects without copying code.
 *
 * If you get stuck:
 *
 * 1. First identify which concept you need.
 * 2. Write the variables.
 * 3. Take input if needed.
 * 4. Write the logic.
 * 5. Print the result.
 *
 *
 */
