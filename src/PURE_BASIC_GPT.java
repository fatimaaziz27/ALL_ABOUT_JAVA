import java.util.*;
/*
 *                    JAVA FUNDAMENTALS
 *                         Basic.java
 * ============================================================
 *
 * Topics:
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
 * ============================================================
 */


public class Basic {

    public static void main(String[] args) {

        // 1. VARIABLES & DATA TYPES
        // =====================================================
        //
        // A variable stores a value in memory.
        //
        // Syntax:
        // dataType variableName = value;
        //

        int age = 20;
        String name = "Fatima";
        double price = 3500.50;
        char grade = 'A';
        boolean isAvailable = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Available: " + isAvailable);


        /*
         * Common Data Types:
         *
         * int      -> whole numbers       -> 20
         * double   -> decimal numbers     -> 20.5
         * char     -> single character    -> 'A'
         * boolean  -> true / false         -> true
         * String   -> text                -> "Fatima"
         */


        // 2. OPERATORS
        // =====================================================

        int a = 10;
        int b = 3;

        // Arithmetic Operators

        System.out.println("\nArithmetic Operators:");

        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3
        System.out.println(a % b);  // 1


        /*
         * Comparison Operators:
         *
         * ==   Equal to
         * !=   Not equal to
         * >    Greater than
         * <    Less than
         * >=   Greater than or equal to
         * <=   Less than or equal to
         *
         * The result is always true or false.
         */

        System.out.println("\nComparison Operators:");

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);


        /*
         * Logical Operators:
         *
         * &&   AND
         * ||   OR
         * !    NOT
         */

        int studentAge = 20;

        System.out.println("\nLogical Operators:");

        System.out.println(studentAge >= 18 && studentAge <= 60);
        System.out.println(studentAge < 18 || studentAge > 60);
        System.out.println(!(studentAge < 18));


        // 3. IF / ELSE
        // =====================================================
        //
        // Used when a program needs to make a decision.
        //
        // if condition is true -> execute if block
        // otherwise -> execute else block
        //

        int userAge = 20;

        System.out.println("\nif / else:");

        if (userAge >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // else if

        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }


        // 4. SWITCH
        // =====================================================
        //
        // switch is useful when checking one value against
        // multiple fixed options.
        //

        int day = 2;

        System.out.println("\nSwitch:");

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


        /*
         * Use:
         *
         * if / else -> conditions and ranges
         *
         * switch    -> fixed choices
         */


        // 5. LOOPS
        // =====================================================
        //
        // Loops are used to repeat code.
        //


        // -------------------------
        // FOR LOOP
        // -------------------------

        System.out.println("\nFor Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // -------------------------
        // WHILE LOOP
        // -------------------------

        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // -------------------------
        // DO-WHILE LOOP
        // -------------------------
        //
        // do-while runs at least once.
        //

        System.out.println("\nDo-While Loop:");

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 5);


        
        // 6. ARRAYS
        // =====================================================
        //
        // An array stores multiple values of the same type.
        //

        int[] marksArray = {80, 90, 75, 88};

        /*
         * Index:
         *
         * Value:  80   90   75   88
         * Index:   0    1    2    3
         *
         * Java arrays start from index 0.
         */

        System.out.println("\nArray:");

        System.out.println(marksArray[0]);
        System.out.println(marksArray[1]);


        // Loop through an array

        System.out.println("\nArray using for loop:");

        for (int index = 0; index < marksArray.length; index++) {
            System.out.println(marksArray[index]);
        }


        // Enhanced for loop

        System.out.println("\nEnhanced For Loop:");

        for (int mark : marksArray) {
            System.out.println(mark);
        }


        
        // 7. STRINGS
        // =====================================================
        //
        // String is used to store text.
        //

        String studentName = "Fatima";

        System.out.println("\nString:");

        System.out.println(studentName);

        // Length

        System.out.println(studentName.length());

        // Uppercase

        System.out.println(studentName.toUpperCase());

        // Lowercase

        System.out.println(studentName.toLowerCase());

        // Get character at index

        System.out.println(studentName.charAt(0));

        // Compare Strings

        System.out.println(studentName.equals("Fatima"));

        /*
         * Important:
         *
         * Use:
         *
         * studentName.equals("Fatima")
         *
         * Instead of:
         *
         * studentName == "Fatima"
         *
         * when comparing String values.
         */


        
        // 8. METHODS
        // =====================================================
        //
        // A method is a reusable block of code.
        //
        // Example:
        //
        // static void greet() {
        //     System.out.println("Hello!");
        // }
        //
        // Call:
        //
        // greet();
        //


        System.out.println("\nMethods:");

        greet();

        greetUser("Fatima");

        int result = add(10, 20);

        System.out.println("Addition: " + result);


        
        // 9. INPUT / OUTPUT
        // =====================================================
        //
        // Output:
        //
        // System.out.println();
        //
        // Input:
        //
        // Scanner
        //
        // Scanner example is written below.
        //
        // Uncomment it if you want to test user input.
        //

        /*
        import java.util.Scanner;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.print("Enter your age: ");
        int userAgeInput = input.nextInt();

        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAgeInput);

        input.close();
        */


        
        // 10. TYPE CASTING
        // =====================================================
        //
        // Type casting means converting one data type
        // into another.
        //


        // -------------------------
        // WIDENING
        // -------------------------
        //
        // Smaller type -> larger type
        // Happens automatically.
        //

        int wholeNumber = 10;

        double decimalNumber = wholeNumber;

        System.out.println("\nWidening:");
        System.out.println(decimalNumber);


        // -------------------------
        // NARROWING
        // -------------------------
        //
        // Larger type -> smaller type
        // Requires manual casting.
        //

        double originalPrice = 10.99;

        int convertedPrice = (int) originalPrice;

        System.out.println("\nNarrowing:");
        System.out.println(convertedPrice);

        /*
         * Output:
         *
         * 10
         *
         * The decimal part is removed.
         */


        
        // MINI EXAMPLE
        // =====================================================
        //
        // Simple Bus Booking Example
        //

        System.out.println("\nBus Booking Example:");

        String destination = "Lahore";
        int seats = 5;
        double ticketPrice = 3500.0;

        if (seats > 0) {

            System.out.println("Bus available");
            System.out.println("Destination: " + destination);

            double total = ticketPrice * seats;

            System.out.println("Seats: " + seats);
            System.out.println("Total: " + total);

        } else {

            System.out.println("No seats available");
        }
    }


    
    // METHODS USED ABOVE
    // =========================================================

    // Method without parameter

    static void greet() {

        System.out.println("Hello!");
    }


    // Method with parameter

    static void greetUser(String name) {

        System.out.println("Hello " + name);
    }


    // Method that returns a value

    static int add(int a, int b) {

        return a + b;
    }
}


/*
 *                       PRACTICE QUESTIONS
 * ============================================================
 *
 * Try solving these yourself before looking for the answer.
 *
 *
 * 1. VARIABLES
 * ------------------------------------------------------------
 *
 * Create variables for:
 *
 * name
 * age
 * salary
 * gender
 * student status
 *
 *
 * 2. OPERATORS
 * ------------------------------------------------------------
 *
 * Create two integers:
 *
 * int a = 20;
 * int b = 5;
 *
 * Print:
 *
 * a + b
 * a - b
 * a * b
 * a / b
 * a % b
 *
 *
 * 3. IF / ELSE
 * ------------------------------------------------------------
 *
 * Create a variable:
 *
 * int age = 25;
 *
 * If age is 18 or greater, print:
 *
 * "Eligible to vote"
 *
 * Otherwise print:
 *
 * "Not eligible to vote"
 *
 *
 * 4. ELSE IF
 * ------------------------------------------------------------
 *
 * Create a marks variable.
 *
 * Print:
 *
 * 80 or above  -> A
 * 60-79        -> B
 * 40-59        -> C
 * Below 40     -> Fail
 *
 *
 * 5. SWITCH
 * ------------------------------------------------------------
 *
 * Create:
 *
 * int day = 3;
 *
 * Use switch to print:
 *
 * 1 -> Monday
 * 2 -> Tuesday
 * 3 -> Wednesday
 * 4 -> Thursday
 * 5 -> Friday
 *
 *
 * 6. FOR LOOP
 * ------------------------------------------------------------
 *
 * Print numbers from 1 to 10 using a for loop.
 *
 *
 * 7. WHILE LOOP
 * ------------------------------------------------------------
 *
 * Print numbers from 10 to 1 using a while loop.
 *
 *
 * 8. ARRAY
 * ------------------------------------------------------------
 *
 * Create an array:
 *
 * int[] numbers = {10, 20, 30, 40, 50};
 *
 * Print all values using a loop.
 *
 *
 * 9. ARRAY SUM
 * ------------------------------------------------------------
 *
 * Find the sum of:
 *
 * {10, 20, 30, 40, 50}
 *
 *
 * 10. ARRAY MAXIMUM
 * ------------------------------------------------------------
 *
 * Find the largest number in:
 *
 * {10, 45, 23, 78, 12}
 *
 *
 * 11. STRING
 * ------------------------------------------------------------
 *
 * Create:
 *
 * String name = "Java";
 *
 * Print:
 *
 * Length
 * Uppercase
 * Lowercase
 * First character
 *
 *
 * 12. STRING COMPARISON
 * ------------------------------------------------------------
 *
 * Create two Strings:
 *
 * String first = "Java";
 * String second = "Java";
 *
 * Check whether they are equal.
 *
 *
 * 13. METHOD
 * ------------------------------------------------------------
 *
 * Create a method:
 *
 * multiply(int a, int b)
 *
 * It should return the multiplication of both numbers.
 *
 *
 * 14. METHOD WITH CONDITION
 * ------------------------------------------------------------
 *
 * Create a method:
 *
 * checkAge(int age)
 *
 * Print:
 *
 * "Adult" if age >= 18
 * "Minor" otherwise
 *
 *
 * 15. TYPE CASTING
 * ------------------------------------------------------------
 *
 * Convert:
 *
 * double number = 25.75;
 *
 * into an int.
 *
 * Print the result.
 *
 *
 * 16. MINI PROJECT
 * ------------------------------------------------------------
 *
 * Create a simple Bus Ticket program.
 *
 * Variables:
 *
 * destination
 * ticketPrice
 * seats
 *
 * If seats are greater than 0:
 *
 * Calculate:
 *
 * total = ticketPrice * seats
 *
 * Print the total price.
 *
 * Otherwise:
 *
 * Print "No seats available."
 *
 *
 *                         QUIZ
 * ============================================================
 *
 * Try answering without running the code.
 *
 *
 * Q1. What does a variable do?
 *
 * A) Runs a loop
 * B) Stores data
 * C) Creates a class
 * D) Deletes data
 *
 *
 * Q2. Which data type stores whole numbers?
 *
 * A) double
 * B) String
 * C) int
 * D) boolean
 *
 *
 * Q3. What is the result of:
 *
 * 10 % 3
 *
 * A) 3
 * B) 1
 * C) 0
 * D) 10
 *
 *
 * Q4. Which operator means "equal to"?
 *
 * A) =
 * B) ==
 * C) !=
 * D) ===
 *
 *
 * Q5. What does && mean?
 *
 * A) OR
 * B) NOT
 * C) AND
 * D) Equal
 *
 *
 * Q6. Which statement is used to make a decision?
 *
 * A) if
 * B) loop
 * C) array
 * D) import
 *
 *
 * Q7. Which loop is commonly used when you know how many times
 * you want to repeat something?
 *
 * A) if
 * B) for
 * C) switch
 * D) class
 *
 *
 * Q8. What is the first index of a Java array?
 *
 * A) 0
 * B) 1
 * C) -1
 * D) 10
 *
 *
 * Q9. Which method returns the length of a String?
 *
 * A) size()
 * B) count()
 * C) length()
 * D) getLength()
 *
 *
 * Q10. Which is the correct way to compare String values?
 *
 * A) name == "Fatima"
 * B) name.equals("Fatima")
 * C) name = "Fatima"
 * D) name.compare("Fatima")
 *
 *
 * Q11. What is a method?
 *
 * A) A reusable block of code
 * B) A database
 * C) A variable
 * D) A loop
 *
 *
 * Q12. Which class is commonly used to take user input?
 *
 * A) Input
 * B) Scanner
 * C) SystemInput
 * D) User
 *
 *
 * Q13. What happens here?
 *
 * double price = 10.99;
 * int value = (int) price;
 *
 * A) 10.99
 * B) 10
 * C) 11
 * D) Error
 *
 *
 * Q14. What does a return statement do?
 *
 * A) Stops the computer
 * B) Sends a value back from a method
 * C) Creates a variable
 * D) Starts a loop
 *
 *
 * Q15. What will this print?
 *
 * int x = 10;
 *
 * if (x > 5) {
 *     System.out.println("Yes");
 * } else {
 *     System.out.println("No");
 * }
 *
 * A) Yes
 * B) No
 * C) Error
 * D) Nothing
 *
 *
 *                      QUIZ ANSWERS
 * ============================================================
 *
 * Q1  -> B
 * Q2  -> C
 * Q3  -> B
 * Q4  -> B
 * Q5  -> C
 * Q6  -> A
 * Q7  -> B
 * Q8  -> A
 * Q9  -> C
 * Q10 -> B
 * Q11 -> A
 * Q12 -> B
 * Q13 -> B
 * Q14 -> B
 * Q15 -> A
 *
 * ============================================================
 *
 * NEXT TOPICS:
 *
 * OOP
 * Collections
 * Exception Handling
 * File Handling
 * Lambda Expressions
 * Stream API
 *
 * ============================================================
 */
