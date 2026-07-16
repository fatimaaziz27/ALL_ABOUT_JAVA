
// Exception Handling -------->

// Example code -------->

//     code 1:

// import java.util.*;
// class TRY_EXCEPTION {
//     public static void main(String[] args) {

//         try{
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println("Result: " + c);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero is not allowed.");
//         }
//         finally {
//             System.out.println("End of try-catch block.");
//         }

//         // Another Example:

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to divide 100 by: ");
//         int divisor = sc.nextInt();

//         try {
//             int result = 100 / divisor;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero.");
//         } finally {
//             System.out.println("Execution completed.");
//         }

//         // Example with multiple catch blocks:

//         try {
//             System.out.println("enter first number:");
//             int num1 = sc.nextInt();
//             System.out.println("enter second number:");
//             int num2 = sc.nextInt();
//             int num3 = num1 / num2;
//             System.out.println("Result: " + num3);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic Error");
//         }
//         catch (Exception e) {
//             System.out.println("Random Error");
//         }
//         finally {
//             System.out.println("Execution completed.");
//         }
//     }
// }

//     code 2:

// import java.util.*;
// class E{
//     public static void main(String[]args) {
//         Scanner sc = new Scanner(System.in);

// //        try{
// //            System.out.println("Enter a number: ");
// //            int a = sc.nextInt();
// //            System.out.println("Enter a number: ");
// //            int b = sc.nextInt();
// //            int c = a/b;
// //            System.out.println("Result:" + c);
// //        }
// //        catch (ArithmeticException e){
// //            System.out.println("Can not divide by zero");
// //        }
// //        catch(InputMismatchException e){
// //            System.out.println("invalid input");
// //        }
        
//         while (true) {
//             try {
//                 System.out.println("Enter a number: ");
//                 int a = sc.nextInt();
//                 sc.nextLine();
//                 System.out.println("Enter a number: ");
//                 int b = sc.nextInt();
//                 int c = a / b;
//                 System.out.println("Result:" + c);
//                 break;
//             } catch (ArithmeticException e) {
//                 System.out.println("Can not divide by zero");
//             } catch (InputMismatchException e) {
//                 System.out.println("invalid input");
//                 sc.nextLine();
//             }
//         }
//     }
// }

//     code 3:

// with throw & throws ------->

//class invalid_age_exception extends Exception{
//    invalid_age_exception(String m){
//        super(m);
//    }
//}
//class e{
//    static String validate_age(int age) throws invalid_age_exception{
//        if (age < 18){
//            throw new invalid_age_exception("Age must be 18");
//        }
//        else {
//            return "valid age";
//        }
//    }
//    public static void main(String[]args){
//        try{
//            System.out.println(validate_age(13));
//        }
//        catch (invalid_age_exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("exit");
//        }
//    }
//}


















//=====================================================
//              EXCEPTION HANDLING
//=====================================================

// Definition:
// Exception Handling is used to handle
// errors during program execution.
// It prevents the program from stopping
// suddenly by handling errors properly.

/*

            EXCEPTION HANDLING
                    |
        ---------------------------
        |            |            |
        v            v            v

       try         catch       finally

      Code       Handles      Always
   that may      Errors       Executes
   cause error

*/

// Types:

/*

          EXCEPTION HANDLING
                  |
     ---------------------------------
     |               |               |
     v               v               v

     try           catch         finally
                                    |
                                    |
                           throw & throws

*/



//=====================================================
//                  EXAMPLE CODE 1
//=====================================================

// Definition:
// This example shows how try, catch,
// and finally work.
// It also shows multiple catch blocks
// to handle different exceptions.

// Flow Diagram

/*

              Start
                |
                v

         Execute try Block
                |
                v

        Exception Occurred?
           /           \
         Yes           No
          |             |
          v             |

   Execute catch      Continue
          |             |
          v             |
     Execute finally <--|
          |
          v

         End

*/

// CODE:

/*

import java.util.*;

class TRY_EXCEPTION {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("End of try-catch block.");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to divide 100 by: ");
        int divisor = sc.nextInt();

        try {
            int result = 100 / divisor;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Execution completed.");
        }

        try {
            System.out.println("enter first number:");
            int num1 = sc.nextInt();

            System.out.println("enter second number:");
            int num2 = sc.nextInt();

            int num3 = num1 / num2;

            System.out.println("Result: " + num3);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }
        catch (Exception e) {
            System.out.println("Random Error");
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}

*/



//=====================================================
//                  EXAMPLE CODE 2
//=====================================================

// Definition:
// This example keeps asking the user
// for input until valid values are entered.
// It handles ArithmeticException and
// InputMismatchException.

// Flow Diagram

/*

              Start
                |
                v

          Enter Values
                |
                v

        Execute try Block
                |
                v

        Exception Occurred?
           /           \
         Yes           No
          |             |
          v             |

 Handle Exception    Print Result
          |             |
          v             |
      Ask Again <-------|
          |
          v

         End

*/

// CODE:

/*

import java.util.*;

class E{

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Enter a number: ");
                int a = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter a number: ");
                int b = sc.nextInt();

                int c = a / b;

                System.out.println("Result:" + c);

                break;

            }

            catch (ArithmeticException e) {
                System.out.println("Can not divide by zero");
            }

            catch (InputMismatchException e) {
                System.out.println("invalid input");
                sc.nextLine();
            }
        }
    }
}

*/



//=====================================================
//             THROW AND THROWS
//=====================================================

// Definition:
// throw is used to create an exception.
// throws tells that a method may
// produce an exception.

/*

            throw & throws
                    |
        ------------------------
        |                      |
        v                      v

      throw                 throws

 Creates an            Declares an
 Exception             Exception

*/

// Flow Diagram

/*

              Start
                |
                v

         Call Method
                |
                v

        Check Condition
                |
         Age < 18 ?
          /       \
        Yes       No
         |         |
         v         v

 throw Exception  Return Result
         |         |
         v         |
      catch Block  |
         |_________|
               |
               v

            finally
               |
               v

              End

*/

// CODE:

/*

class invalid_age_exception extends Exception{

    invalid_age_exception(String m){
        super(m);
    }
}

class e{

    static String validate_age(int age)
            throws invalid_age_exception{

        if (age < 18){

            throw new invalid_age_exception("Age must be 18");

        }
        else {

            return "valid age";
        }
    }

    public static void main(String[]args){

        try{

            System.out.println(validate_age(13));

        }

        catch (invalid_age_exception e){

            System.out.println(e.getMessage());

        }

        finally {

            System.out.println("exit");
        }
    }
}

*/
