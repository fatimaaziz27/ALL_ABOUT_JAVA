import java.util.*;
class mainn {

// If the number is odd → print Weird
// If the number is even:
// Between 2 and 5 → Not Weird
// Between 6 and 20 → Weird
// Greater than 20 → Not Weird
    class mainn {
    public static void main(String[] args) {

        int n = 7;

        if (n % 2 != 0){
            System.out.println("Weird");
        }
        else if (n <= 5){
            System.out.println("Not Weird");
        }
        else if (n <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
//     private static final Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
//         int n = scanner.nextInt();
        
//         if (n%2!=0){
//             System.out.println("Weird");
//         }
//         else if(n>=2 && n<=5){
//             System.out.println("Not Weird");
//         }
//         else if(n>=6 && n<=20){
//             System.out.println("Weird");
//         }
//         else if(n>20){
//             System.out.println("Not Weird");
//         }
//         scanner.close();
//     }
// }








    

    
// code 1
class mainn {
    public static void main(String[] args) {
// Steps:
// Store a number in n.
// Use % 2 to check the remainder.
// If remainder is 0 → Even.
// Otherwise → Odd.
        int n = 7;
        if (n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}


        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │   n = 7     │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │  n % 2 == 0 │
        │     ?       │
        └───┬─────┬───┘
          Yes     No
           ↓       ↓
   ┌───────────┐ ┌──────────┐
   │ Print     │ │ Print    │
   │ "Even"    │ │ "Odd"    │
   └─────┬─────┘ └────┬─────┘
         │             │
         └──────┬──────┘
                ↓
        ┌─────────────┐
        │     END     │
        └─────────────┘





// code    2
class mainn {
    public static void main(String[] args) {
// Steps:
// Store a number in n.
// Check if n > 0.
// If true → Positive.
// Otherwise check if n < 0.
// If true → Negative.
// Otherwise → Zero.
        int n = -5;

        if (n > 0){
            System.out.println("Positive");
        }
        else if (n < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
            

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │   n = -5    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │    n > 0 ?  │
        └───┬─────┬───┘
          YES     NO
           ↓       ↓
   ┌────────────┐  ┌─────────────┐
   │   Print    │  │    n < 0 ?  │
   │ "Positive" │  └───┬─────┬───┘
   └──────┬─────┘    YES     NO
          │            ↓       ↓
          │     ┌──────────┐ ┌────────┐
          │     │  Print   │ │ Print  │
          │     │"Negative"│ │ "Zero" │
          │     └────┬─────┘ └───┬────┘
          │          │            │
          └──────────┴──────┬─────┘
                             ↓
                     ┌─────────────┐
                     │     END     │
                     └─────────────┘




            
// code    3
class mainn {
    public static void main(String[] args) {

// Steps:
// Store two numbers in a and b.
// Compare a with b.
// If a > b → A is greater.
// Otherwise check b > a.
// If true → B is greater.
// Otherwise → Both are equal.
    
        int a = 10;
        int b = 20;

        if (a > b){
            System.out.println("A is greater");
        }
        else if (b > a){
            System.out.println("B is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
       ┌────────────────┐
       │    a = 10      │
       │    b = 20      │
       └───────┬────────┘
               ↓
       ┌────────────────┐
       │     a > b ?    │
       └──────┬─────┬───┘
            YES      NO
             ↓        ↓
     ┌────────────┐  ┌────────────────┐
     │   Print    │  │     b > a ?    │
     │"A is greater"│ └──────┬─────┬───┘
     └──────┬─────┘       YES      NO
            │              ↓        ↓
            │      ┌────────────┐ ┌──────────────┐
            │      │   Print    │ │    Print     │
            │      │"B is greater"││"Both are equal"│
            │      └─────┬──────┘ └──────┬───────┘
            │            │               │
            └────────────┴───────┬───────┘
                                 ↓
                         ┌─────────────┐
                         │     END     │
                         └─────────────┘





// code 3
// 1. Check Even or Odd
class mainn {
    public static void main(String[] args) {

        int n = 10;

        if (n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

// Steps
// Store 10 in n.
// Check n % 2.
// If the remainder is 0 → Even.
// Otherwise → Odd.

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │    n = 10   │
        └──────┬──────┘
               ↓
        ┌────────────────┐
        │   n % 2 == 0 ? │
        └───────┬───┬────┘
              YES   NO
               ↓     ↓
        ┌─────────┐ ┌─────────┐
        │  Print  │ │  Print  │
        │ "Even"  │ │  "Odd"  │
        └────┬────┘ └────┬────┘
             │            │
             └──────┬─────┘
                    ↓
             ┌─────────────┐
             │     END     │
             └─────────────┘



// code 4
// 2. Check Positive or Negative
class mainn {
    public static void main(String[] args) {

        int n = -5;

        if (n > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}

// Steps
// Store -5 in n.
// Check if n > 0.
// If true → Positive.
// Otherwise → Negative.

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │    n = -5   │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │    n > 0 ?  │
        └──────┬──────┘
             YES   NO
              ↓     ↓
       ┌──────────┐ ┌──────────┐
       │  Print   │ │  Print   │
       │"Positive"│ │"Negative"│
       └─────┬────┘ └────┬─────┘
             │             │
             └──────┬──────┘
                    ↓
             ┌─────────────┐
             │     END     │
             └─────────────┘




// code 5
// 3. Check Pass or Fail
class mainn {
    public static void main(String[] args) {

        int marks = 60;

        if (marks >= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

// Steps
// Store marks in marks.
// Check if marks are >= 50.
// If true → Pass.
// Otherwise → Fail.

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
        ┌─────────────┐
        │  marks = 60 │
        └──────┬──────┘
               ↓
        ┌────────────────┐
        │  marks >= 50 ? │
        └───────┬───┬────┘
              YES   NO
               ↓     ↓
        ┌─────────┐ ┌─────────┐
        │  Print  │ │  Print  │
        │ "Pass"  │ │ "Fail"  │
        └────┬────┘ └────┬────┘
             │            │
             └──────┬─────┘
                    ↓
             ┌─────────────┐
             │     END     │
             └─────────────┘




// code 6
// 4. Find Greater Number
class mainn {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a > b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}
// Steps
// Store 10 in a.
// Store 20 in b.
// Check if a > b.
// If true → A is greater.
// Otherwise → B is greater.

        ┌─────────────┐
        │    START    │
        └──────┬──────┘
               ↓
       ┌────────────────┐
       │    a = 10      │
       │    b = 20      │
       └───────┬────────┘
               ↓
       ┌────────────────┐
       │     a > b ?    │
       └───────┬───┬────┘
             YES   NO
              ↓     ↓
       ┌───────────┐ ┌───────────┐
       │   Print   │ │   Print   │
       │"A greater"│ │"B greater"│
       └─────┬─────┘ └─────┬─────┘
             │               │
             └───────┬───────┘
                     ↓
              ┌─────────────┐
              │     END     │
              └─────────────┘



















// Nested If
// Syntax
if (condition1) {
  // code to run if condition1 is true
  if (condition2) {
    // code to run if both condition1 and condition2 are true
  }
}

// Example
int x = 15;
int y = 25;

if (x > 10) {
  System.out.println("x is greater than 10");
  
  // Nested if 
  if (y > 20) {
    System.out.println("y is also greater than 20");
  }
}

// Real-Life Example
// Example
int age = 20;
boolean isCitizen = true;

if (age >= 18) {
  System.out.println("Old enough to vote.");
  
  if (isCitizen) {
    System.out.println("And you are a citizen, so you can vote!");
  } else {
    System.out.println("But you must be a citizen to vote.");
  }
} else {
  System.out.println("Not old enough to vote.");
}











// Logical Operators in Conditions
// && (AND) - all conditions must be true
// || (OR) - at least one condition must be true
// ! (NOT) - reverses a condition (true = false, false = true)
// AND (&&)
// Use AND (&&) when both conditions must be true:

Example
int a = 200;
int b = 33;
int c = 500;

if (a > b && c > a) {
  System.out.println("Both conditions are true");
}

OR (||)
Use OR (||) when at least one of the conditions can be true:

Example
Test if a is greater than b, or if a is greater than c:

int a = 200;
int b = 33;
int c = 500;

if (a > b || a > c) {
  System.out.println("At least one condition is true");
}

NOT (!)
Use NOT (!) to reverse a condition:
Example
Test if a is not greater than b:

int a = 33;
int b = 200;

if (!(a > b)) {
  System.out.println("a is NOT greater than b");
}

Real-Life Example
Example
boolean isLoggedIn = true;
boolean isAdmin = false;
int securityLevel = 3; // 1 = highest

if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
  System.out.println("Access granted");
}
else {
  System.out.println("Access denied");
}

// Try changing securityLevel to test different outcomes:
//
// securityLevel 1 = Access granted
// securityLevel 2 = Access granted
// securityLevel 3 = Access denied
// securityLevel 4 = Access denied
//
// If isAdmin = true, access is granted.



// Real-Life Examples
// Find out if a person is old enough to vote, and if they are a citizen (using nested if statements):
Example
int age = 20;
boolean isCitizen = true;

if (age >= 18) {
  System.out.println("Old enough to vote.");
  
  if (isCitizen) {
    System.out.println("And you are a citizen, so you can vote!");
  } else {
    System.out.println("But you must be a citizen to vote.");
  }
} else {
  System.out.println("Not old enough to vote.");
}


// Check temperature:
// Example
int temperature = 30;

if (temperature < 0) {
  System.out.println("It's freezing!");
} else if (temperature < 20) {
  System.out.println("It's cool.");
} else {
  System.out.println("It's warm.");
} 















// from GPT
import java.util.*;
class mainn {

//=====================================================
//          ODD OR EVEN (WEIRD / NOT WEIRD)
//=====================================================

// Definition:
// This program checks whether a number
// is odd or even.
// It prints "Weird" or "Not Weird"
// based on the given conditions.

/*

             ENTER NUMBER
                   |
                   v

          Check Odd or Even
                   |
        -------------------------
        |                       |
        v                       v

        Odd                  Even
        |                       |
        v                       v

     Print Weird        Check Range
                                |
               --------------------------------
               |               |              |
               v               v              v

             2-5            6-20          Greater than 20
               |               |                |
               v               v                v

          Not Weird         Weird         Not Weird

*/

// Flow Diagram

/*

               Start
                 |
                 v

           Enter Number
                 |
                 v

         Is Number Odd?
            /       \
          Yes       No
           |         |
           v         v

    Print Weird   Is 2 to 5?
                      /    \
                    Yes    No
                     |      |
                     v      v

              Print Not   Is 6 to 20?
                Weird        /      \
                           Yes      No
                            |        |
                            v        v

                     Print Weird   Greater than 20?
                                       /      \
                                     Yes      No
                                      |        |
                                      v        v

                               Print Not      End
                                 Weird

*/

// CODE:

/*

// If the number is odd → print Weird
// If the number is even:
// Between 2 and 5 → Not Weird
// Between 6 and 20 → Weird
// Greater than 20 → Not Weird

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    int n = scanner.nextInt();

    if (n%2!=0){
        System.out.println("Weird");
    }
    else if(n>=2 && n<=5){
        System.out.println("Not Weird");
    }
    else if(n>=6 && n<=20){
        System.out.println("Weird");
    }
    else if(n>20){
        System.out.println("Not Weird");
    }

    scanner.close();
}

*/

}
