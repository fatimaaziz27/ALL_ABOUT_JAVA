class Function_JAVA {
    public static void main(String[] args) {

// Q) Java program to check if a number is prime or not:

// CODE:
/*
    public static String prime(int num) {
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return num+ "Not a Prime number";
            }
        }
        return num+ "is a Prime number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(prime(number));
}

    Scanner number = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = number.nextInt();
        if (num>0){
            if (num%2 == 0){
                System.out.print("the entered num is positive & even");
            }
            else{
                System.out.println("enter number is positive & odd");
            }
        }
        else{
            System.out.println("the entered num is negative");
        }
*/

// Q) Define a StudentData class, create an object, assign values, and display details.

// CODE:
/*
    class StudentData {
    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println(
            "Name: " + name + "\nRoll No: " + rollNo + "\nMarks: " + marks);
        }
    }

    public class Function_JAVA {
        public static void main(String[] args) {
            StudentData student1 = new StudentData();
            student1.name = "YUSRA";
            student1.rollNo = 20;
            student1.marks = 95;
            student1.displayDetails();
        }
    }
*/

// Q) Count vowels and consonants in a name, ignoring spaces.

// CODE:
/*
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter your full name:");
            String name = sc.nextLine();
            name = name.toLowerCase();
    
            int vowels = 0;
            int consonants = 0;
    
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
    
                if (ch == ' ') {
                    continue;
                } else if (ch == 'a' || ch == 'e' || ch == 'i' || 
                            ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
    
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
*/

// while loop example:

// CODE:
/*
    class main{
        public static void main(String[] args){
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
            }
        }
    }
*/

// do-while loop example

// CODE:
/*
    class main{
        public static void main(String[] args){
        int k=0;
        do{
            System.out.println(k);
            k++;
        }
        while(k<=10);
        }
    }
*/

// datatypes examples:

//CODE
/*
    class main{
        public static void main(String[] args){
        // java datatypes
        int my_num = 5;
        float my_float = 5.99f;
        char my_char = 'd';
        Boolean my_bool = true;
        String my_string = "hello";
        }
*/

// Java user input / Scanner examples:

// CODE:
/*
    class Main {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter a number:");
            int num = sc.nextInt();
    
            System.out.println("You entered: " + num);
        }
    }
*/

// Q) A switch statement is a control structure that evaluates an expression and executes code based on matching cases.

// CODE:
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade:");
        char letter = sc.next().toLowerCase().charAt(0);

            switch (letter) {
        case 'a':
            System.out.println("Excellent");
            break;
        case 'b':
            System.out.println("Very good");
            break;
        case 'c':
            System.out.println("Good");
            break;
        case 'd':
            System.out.println("Average");
            break;
        case 'e':
            System.out.println("Poor");
            break;
        default:
            System.out.println("Fail");
        }
    }
}
*/
    }
}














// from GPT
class Function_JAVA {
public static void main(String[] args) {

//=====================================================
//                  JAVA BASIC PROGRAMS
//=====================================================

// This file contains basic Java programs for practice.

// Topics:
// 1. Prime Number
// 2. Student Class
// 3. Count Vowels and Consonants
// 4. While Loop
// 5. Do-While Loop
// 6. Data Types
// 7. Scanner
// 8. Switch Statement



//=====================================================
//                  PRIME NUMBER
//=====================================================

// Definition:
// A prime number is a number that is divisible
// only by 1 and itself.

/*

                PRIME NUMBER
                      |
          -----------------------
          |                     |
          v                     v

     Check Number        Print Result

*/

// Flow Diagram

/*

            Start
              |
              v

       Enter a Number
              |
              v

      Check Prime Logic
              |
        ----------------
        |              |
        v              v

     Prime         Not Prime
        |              |
        v              v

       Print Result
              |
              v
             End

*/

// CODE:

/*
public static String prime(int num) {
for(int i=2;i<=num;i++){
if(num%i==0){
return num+ "Not a Prime number";
}
}
return num+ "is a Prime number";
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
System.out.println(prime(number));
}

Scanner number = new Scanner(System.in);
System.out.println("enter any number:");
int num = number.nextInt();
if (num>0){
    if (num%2 == 0){
        System.out.print("the entered num is positive & even");
    }
    else{
        System.out.println("enter number is positive & odd");
    }
}
else{
    System.out.println("the entered num is negative");
}

*/

// OUTPUT:

/*

Enter a number: 7
7 is a Prime number

or

enter any number:
8
the entered num is positive & even

or

enter any number:
5
enter number is positive & odd

or

enter any number:
-3
the entered num is negative

*/



//=====================================================
//                 STUDENT CLASS
//=====================================================

// Definition:
// A class is a blueprint.
// An object is created from a class.
// Objects store data and use methods.

/*

                 StudentData
                      |
        --------------------------
        |                        |
        v                        v

    Variables               displayDetails()

*/

// Flow Diagram

/*

              Start
                |
                v

      Create Student Object
                |
                v

         Assign Values
                |
                v

     Call displayDetails()
                |
                v

         Print Details
                |
                v
               End

*/

// CODE:

/*
class StudentData {
String name;
int rollNo;
int marks;

void displayDetails() {
    System.out.println(
        "Name: " + name + "\nRoll No: " + rollNo + "\nMarks: " + marks);
    }
}

public class Function_JAVA {
    public static void main(String[] args) {
        StudentData student1 = new StudentData();
        student1.name = "YUSRA";
        student1.rollNo = 20;
        student1.marks = 95;
        student1.displayDetails();
    }
}
*/

// OUTPUT:

/*

Name: YUSRA
Roll No: 20
Marks: 95

*/



//=====================================================
//          COUNT VOWELS AND CONSONANTS
//=====================================================

// Definition:
// This program counts the number of vowels
// and consonants in a name.
// Spaces are ignored.

/*

                ENTER NAME
                     |
                     v

          --------------------
          |                  |
          v                  v

       Vowels          Consonants

*/

// Flow Diagram

/*

              Start
                |
                v

         Enter Full Name
                |
                v

      Read One Character
                |
        --------------------
        |                  |
        v                  v

     Is Space?           Not Space
        |                  |
      Ignore               |
                           v
                  Vowel or Consonant?
                     |            |
                     v            v

               Count Vowel   Count Consonant
                     |
                     v

               Print Result
                     |
                     v
                    End

*/

// CODE:

/*
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = sc.nextLine();
        name = name.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == ' ') {
                continue;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' ||
                       ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
*/

// OUTPUT:

/*

Enter your full name:
Fatima Aziz

Vowels: 6
Consonants: 5

*/
