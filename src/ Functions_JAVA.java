import java.util.*;
class BASIC_JAVA {

// Java program to check if a number is prime or not:
// CODE:

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

    }
}
