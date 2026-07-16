import java.util.*;
class mainn {

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
