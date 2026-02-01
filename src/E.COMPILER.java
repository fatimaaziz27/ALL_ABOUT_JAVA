import java.util.*;
class E_COMPILER{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.print("the number is zero");
        }
        else if (num <= 0){
            System.out.print("the number is negative");
        }
        
        else if (num >= 0){
            System.out.print("the number is positive");
        }
        
        else{
            System.out.print("invalid input");
        }
}
    
}
