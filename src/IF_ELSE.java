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
