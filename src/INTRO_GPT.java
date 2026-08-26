/*
 * ============================================================
 *                    JAVA INTRODUCTION
 *                        Intro.java
 * ============================================================
 *
 * This file explains the basic structure of a Java program.
 *
 * Topics:
 *
 * 1. import java.util.*
 * 2. public class Main
 * 3. public static void main(String[] args)
 * 4. { }
 * 5. System.out.println()
 * 6. Strings
 * 7. Semicolon ;
 * 8. Complete Java program structure
 *
 * ============================================================
 */


/*
 * ============================================================
 * 1. import java.util.*;
 * ============================================================
 *
 * "import" tells Java that we want to use classes from
 * another package.
 *
 * java.util is a Java package containing useful classes such as:
 *
 * Scanner
 * ArrayList
 * HashMap
 * HashSet
 * Collections
 *
 * Example:
 *
 * Scanner input = new Scanner(System.in);
 *
 * To use Scanner, we can write:
 *
 * import java.util.Scanner;
 *
 * OR:
 *
 * import java.util.*;
 *
 *
 * What does "*" mean?
 *
 * "*" means all available classes from that package.
 *
 * Therefore:
 *
 * import java.util.*;
 *
 * means:
 *
 * Import classes from java.util.
 *
 *
 * IMPORTANT:
 *
 * This program does not use anything from java.util,
 * so the import is not actually required here.
 *
 */


import java.util.*;


/*
 * ============================================================
 * 2. public class Main
 * ============================================================
 *
 * "class" is used to create a class.
 *
 * A class can be thought of as a container or blueprint
 * for Java code.
 *
 * Example:
 *
 * class Car {
 *
 * }
 *
 * This creates a class called Car.
 *
 *
 * In this program:
 *
 * public class Main {
 *
 * }
 *
 * creates a class called Main.
 *
 *
 * "public" means the class can be accessed from outside.
 *
 * For now, remember:
 *
 * public = accessible from outside
 *
 *
 * IMPORTANT:
 *
 * If the class is public, the file name normally needs to
 * match the class name.
 *
 * Example:
 *
 * public class Main
 *
 * should be saved as:
 *
 * Main.java
 *
 */


public class Main {


    /*
     * ========================================================
     * 3. public static void main(String[] args)
     * ========================================================
     *
     * This is called the main method.
     *
     * Java starts executing a normal Java application
     * from the main() method.
     *
     */


    public static void main(String[] args) {


        /*
         * ----------------------------------------------------
         * public
         * ----------------------------------------------------
         *
         * The main method needs to be accessible to Java
         * so Java can start the program.
         *
         *
         * ----------------------------------------------------
         * static
         * ----------------------------------------------------
         *
         * static allows Java to call the main method without
         * creating an object of the Main class first.
         *
         * For now:
         *
         * static = can be used without creating an object
         *
         * You will understand static better when you learn OOP.
         *
         *
         * ----------------------------------------------------
         * void
         * ----------------------------------------------------
         *
         * void means the method does not return a value.
         *
         * Example:
         *
         * void sayHello() {
         *     System.out.println("Hello");
         * }
         *
         * This method performs an action but does not return
         * a value.
         *
         *
         * Compare:
         *
         * int add() {
         *     return 10 + 20;
         * }
         *
         * This method returns an int.
         *
         *
         * ----------------------------------------------------
         * main
         * ----------------------------------------------------
         *
         * main is the name of the method.
         *
         * Java looks for the main() method as the starting
         * point of a normal Java application.
         *
         *
         * ----------------------------------------------------
         * String[] args
         * ----------------------------------------------------
         *
         * String[] means an array of Strings.
         *
         * args stands for "arguments".
         *
         * It can receive information passed to the program
         * through the command line.
         *
         * Example:
         *
         * java Main hello
         *
         * The word "hello" can be received through args.
         *
         * For now, you do not need to memorize command-line
         * arguments.
         *
         * Just remember:
         *
         * String[] args = command-line arguments
         *
         */


        /*
         * ====================================================
         * 4. { }
         * ====================================================
         *
         * Curly braces define a block of code.
         *
         * Example:
         *
         * if (age >= 18) {
         *     System.out.println("Adult");
         * }
         *
         * Everything between { and } belongs to that block.
         *
         *
         * The structure of our program is:
         *
         * class Main
         * {
         *
         *     main method
         *     {
         *
         *         code
         *
         *     }
         *
         * }
         *
         */


        /*
         * ====================================================
         * 5. System.out.println()
         * ====================================================
         *
         * This prints something to the console.
         *
         *
         * System
         * ----------------------------------------------------
         *
         * System is a built-in Java class.
         *
         *
         * out
         * ----------------------------------------------------
         *
         * out represents standard output.
         *
         *
         * println
         * ----------------------------------------------------
         *
         * println means:
         *
         * Print something and move to the next line.
         *
         */


        System.out.println("Hello, World!");


        /*
         * Example:
         *
         * System.out.println("Hello");
         * System.out.println("World");
         *
         * Output:
         *
         * Hello
         * World
         *
         *
         * ----------------------------------------------------
         * print()
         * ----------------------------------------------------
         *
         * print() does not automatically move to the next line.
         *
         *
         * System.out.print("Hello");
         * System.out.print("World");
         *
         * Output:
         *
         * HelloWorld
         *
         */


        /*
         * ====================================================
         * 6. "Hello, World!"
         * ====================================================
         *
         * "Hello, World!" is a String.
         *
         * A String stores text.
         *
         * Examples:
         *
         * "Hello"
         * "Fatima"
         * "Java is fun"
         * "123"
         *
         *
         * IMPORTANT:
         *
         * "123" is a String because it is inside double quotes.
         *
         * 123 is an integer because it is not inside quotes.
         *
         */


        /*
         * ====================================================
         * 7. Semicolon ;
         * ====================================================
         *
         * A semicolon usually marks the end of a Java statement.
         *
         * Examples:
         *
         * int age = 20;
         *
         * String name = "Fatima";
         *
         * System.out.println(age);
         *
         */


        /*
         * ====================================================
         * COMPLETE JAVA PROGRAM STRUCTURE
         * ====================================================
         *
         * Think about a Java program like this:
         *
         *
         * import
         *    ↓
         * class
         *    ↓
         * main method
         *    ↓
         * statements
         *
         */


        /*
         * ====================================================
         * BASIC JAVA TEMPLATE
         * ====================================================
         *
         * For now, remember this structure:
         *
         *
         * public class Main {
         *
         *     public static void main(String[] args) {
         *
         *         // Your code goes here
         *
         *     }
         * }
         *
         */


        /*
         * ====================================================
         * EXAMPLE
         * ====================================================
         *
         * Your Java code goes inside main().
         *
         */


        int age = 20;


        if (age >= 18) {

            System.out.println("Adult");

        }


        /*
         * ====================================================
         * WHAT DOES THIS PROGRAM MEAN?
         * ====================================================
         *
         * public class Main
         *
         * Creates a class called Main.
         *
         *
         * public static void main(String[] args)
         *
         * Creates the main method where Java starts
         * executing the program.
         *
         *
         * int age = 20;
         *
         * Creates an integer variable called age.
         *
         *
         * if (age >= 18)
         *
         * Checks whether age is greater than or equal to 18.
         *
         *
         * System.out.println("Adult");
         *
         * Prints "Adult" if the condition is true.
         *
         */


    }
}


/*
 * ============================================================
 *                       QUICK QUIZ
 * ============================================================
 *
 * Q1. What is a class?
 *
 * A) A container/blueprint for Java code
 * B) A loop
 * C) A variable
 * D) A database
 *
 *
 * Q2. Where does Java normally start executing a basic program?
 *
 * A) class
 * B) main()
 * C) System
 * D) import
 *
 *
 * Q3. What does void mean?
 *
 * A) The method returns an int
 * B) The method returns a String
 * C) The method does not return a value
 * D) The method creates an object
 *
 *
 * Q4. What does static allow us to do with main()?
 *
 * A) Use it without creating a Main object
 * B) Delete the method
 * C) Return a String
 * D) Create a loop
 *
 *
 * Q5. What does String[] args represent?
 *
 * A) An integer
 * B) An array of Strings
 * C) A class
 * D) A loop
 *
 *
 * Q6. What does System.out.println() do?
 *
 * A) Takes input
 * B) Creates a variable
 * C) Prints output and moves to the next line
 * D) Creates a class
 *
 *
 * Q7. What does ; usually represent?
 *
 * A) Start of a class
 * B) End of a statement
 * C) Start of a loop
 * D) A String
 *
 *
 * Q8. What is the difference between:
 *
 * "123"
 *
 * and:
 *
 * 123
 *
 * Answer:
 *
 * "123" is a String.
 * 123 is an integer.
 *
 *
 * ============================================================
 * QUIZ ANSWERS
 * ============================================================
 *
 * Q1 -> A
 * Q2 -> B
 * Q3 -> C
 * Q4 -> A
 * Q5 -> B
 * Q6 -> C
 * Q7 -> B
 * Q8 -> "123" is String, 123 is int
 *
 *
 * ============================================================
 * NEXT TOPICS
 * ============================================================
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
 * 11. OOP
 *
 * ============================================================
 */
