Java User Input (Scanner)
Share



Link Copied
Java User Input
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

ExampleGet your own Java Server
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

If you don't know what a package is, read our Java Packages Tutorial.

Input Types
In the example above, we used the nextLine() method, which is used to read Strings. To read other types, look at the table below:

Method	Description
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
In the example below, we use different methods to read data of various types:

Example
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}

Note: If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "InputMismatchException").

You can read more about exceptions and how to handle errors in the Exceptions chapter.























  Java Scanner Methods
Share



Link Copied
Scanner Methods
The Scanner class can be used to obtain data from the keyboard, files and strings.

A list of useful Scanner methods can be found in the table below.

Method	Description	Return Type
close()	Close the scanner object	void
delimiter()	Return the delimiter used to separate tokens	Pattern
findInLine()	Return a string which matches a regular expression in the current line	String
findWithinHorizon()	Return a string which matches a regular expression within a specified number of characters	String
hasNext()	Return true if another token can be found	boolean
hasNextBoolean()	Return true if the next token represents a boolean value	boolean
hasNextByte()	Return true if the next token represents a byte value	boolean
hasNextDouble()	Return true if the next token represents a number	boolean
hasNextFloat()	Return true if the next token represents a number	boolean
hasNextInt()	Return true if the next token represents an int value	boolean
hasNextLine()	Return true if another line of text is available in the scanner	boolean
hasNextLong()	Return true if the next token represents a long value	boolean
hasNextShort()	Return true if the next token represents a short value	boolean
locale()	Return the scanner's locale	Locale
next()	Return the next token in the scanner	String
nextBoolean()	Return the boolean value of the next token in the scanner	boolean
nextByte()	Return the byte value of the next token in the scanner	byte
nextDouble()	Return the double value of the next token in the scanner	double
nextFloat()	Return the float value of the next token in the scanner	float
nextInt()	Return the int value of the next token in the scanner	int
nextLine()	Return the next line of text in the scanner	String
nextLong()	Return the long value of the next token in the scanner	long
nextShort()	Return the short value of the next token in the scanner	long
radix()	Return the scanner's radix	int
reset()	Reset the scanner's configuration	int
useDelimiter()	Set the delimiter used by the scanner to separate tokens	Scanner
useLocale()	Set the locale used by the scanner	Scanner
useRadix()	Set the radix used by the scanner	Scanner
