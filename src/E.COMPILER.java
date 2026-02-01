import java.util.*;
class E_COMPILER{
    public static void main(String[] args) {

// Q2) -------->

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // if (num == 0){
        //     System.out.print("the number is zero");
        // }
        // else if (num <= 0){
        //     System.out.print("the number is negative");
        // }
        
        // else{
        //     System.out.print("the number is positive");
        // }

// Q3) ------------->

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // if (num%2 == 0){
        //     System.out.print("number IS EVEN");
        // }
        // else{
        //     System.out.print("number is odd");
        // }

// Q3) ------------->

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // if (num/7 == 1){
        //     System.out.print("hello");
        // }
        // else{
        //     System.out.print("number is not divisible by 7");
        // }

// Q4) ------------->

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.print("both num are equal");
        }
        else if (num1 <= num2){
            System.out.print(num2 + " is greater than " + num1);
        }
        else{
            System.out.print(num1 + " is greater than " + num2);
        }
}
    
}
