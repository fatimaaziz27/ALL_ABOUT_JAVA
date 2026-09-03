import java.util.*;


// if else &  else if

// ned java class practice question ---------->

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








// 1. Check Age
class mainn {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            if (age >= 60)
                System.out.println("Senior Citizen");
            else
                System.out.println("Adult");
        }
        else
            System.out.println("Minor");
    }
}

// Steps:
// Store age in age.
// Check if age is 18 or above.
// If yes, check if age is 60 or above.
// If yes → Senior Citizen.
// Otherwise → Adult.
// If no → Minor.







// 2. Check Number
class mainn {
    public static void main(String[] args) {

        int n = 10;

        if (n > 0) {
            if (n % 2 == 0)
                System.out.println("Positive Even");
            else
                System.out.println("Positive Odd");
        }
        else
            System.out.println("Negative");
    }
}

// Steps:
// Store a number in n.
// Check if the number is positive.
// If positive, check if it is even.
// If yes → Positive Even.
// Otherwise → Positive Odd.
// If not positive → Negative.









// 3. Check Marks
class mainn {
    public static void main(String[] args) {

        int marks = 80;

        if (marks >= 50) {
            if (marks >= 80)
                System.out.println("Excellent");
            else
                System.out.println("Pass");
        }
        else
            System.out.println("Fail");
    }
}

// Steps:
// Store marks in marks.
// Check if marks are 50 or above.
// If yes, check if marks are 80 or above.
// If yes → Excellent.
// Otherwise → Pass.
// If below 50 → Fail.







// 4. Check Login
class mainn {
    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234"))
                System.out.println("Login Successful");
            else
                System.out.println("Wrong Password");
        }
        else
            System.out.println("Wrong Username");
    }
}

// Steps:
// Store username.
// Store password.
// Check the username.
// If correct, check the password.
// If both are correct → Login Successful.
// Otherwise → Wrong Username or Wrong Password.

    
    
    
    
    
    
    
    
// 5. Check Driving Eligibility
class mainn {
    public static void main(String[] args) {

        int age = 20;
        boolean license = true;

        if (age >= 18) {
            if (license)
                System.out.println("Can Drive");
            else
                System.out.println("Need License");
        }
        else
            System.out.println("Too Young");
    }
}

// Steps:
// Store age.
// Store whether the person has a license.
// Check if age is 18 or above.
// If yes, check the license.
// If license is true → Can Drive.
// Otherwise → Need License.
// If age is below 18 → Too Young.









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





// 1. AND &&
class mainn {
    public static void main(String[] args) {

        int age = 20;
        boolean id = true;

        if (age >= 18 && id == true)
            System.out.println("Allowed");
        else
            System.out.println("Not Allowed");
    }
}

// Steps:
// Store age.
// Check age is 18 or above.
// Check ID is true.
// Both conditions must be true.
// Print Allowed.





// 2. OR ||
class mainn {
    public static void main(String[] args) {

        int n = 5;

        if (n == 5 || n == 10)
            System.out.println("Correct");
        else
            System.out.println("Wrong");
    }
}

// Steps:
// Store a number.
// Check if it is 5.
// OR check if it is 10.
// If either condition is true → Correct.
// Otherwise → Wrong.

    

    
// 3. NOT !
class mainn {
    public static void main(String[] args) {

        boolean rain = false;

        if (!rain)
            System.out.println("Go Outside");
        else
            System.out.println("Stay Home");
    }
}

// Steps:
// Store rain as false.
// !rain changes false to true.
// If it is not raining → Go Outside.
// Otherwise → Stay Home.






    
    
// Real-Life Examples
// 1. AND — Driving
class mainn {
    public static void main(String[] args) {

        int age = 20;
        boolean license = true;

        if (age >= 18 && license == true)
            System.out.println("You can drive");
        else
            System.out.println("You cannot drive");
    }
}

// Steps:
// Check age is 18 or above.
// Check the person has a license.
// Both must be true.
// Allow driving.


    
// 2. OR — Discount
class mainn {
    public static void main(String[] args) {

        boolean student = true;
        boolean senior = false;

        if (student || senior)
            System.out.println("Discount Available");
        else
            System.out.println("No Discount");
    }
}

// Steps:
// Check if the person is a student.
// Check if the person is a senior.
// Either one can be true.
// Give the discount.



// 3. AND + OR — School Entry
class mainn {
    public static void main(String[] args) {

        int marks = 70;
        boolean feePaid = true;

        if (marks >= 50 && feePaid)
            System.out.println("Admission Allowed");
        else
            System.out.println("Admission Not Allowed");
    }
}

// Steps:
// Check marks are 50 or above.
// Check the fee is paid.
// Both conditions must be true.
// Allow admission.
// Otherwise, don't allow admission.












    









// workig calculator 
import java.util.*;
public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); 

    System.out.println("Enter a Operator:");
    String operator = scan.nextLine();

    System.out.println("Enter a number:");
    int n1 = scan.nextInt();

    System.out.println("Enter a number:");
    int n2 = scan.nextInt();

    if (operator.equals("+")){
      System.out.println(n1+n2);
    }
    else if (operator.equals("-")){
      System.out.println(n1-n2);
    }
    else if (operator.equals("*")){
      System.out.println(n1*n2);
    }
    else if (operator.equals("/")){
      System.out.println(n1/n2);
    }
    else if (operator.equals("%")){
      System.out.println(n1/n2);
    }
    else{
      System.out.println("Invalid Operator");
    }

    }
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
