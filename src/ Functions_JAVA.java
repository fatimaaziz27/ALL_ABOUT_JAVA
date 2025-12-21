import java.util.*;

// // Java program to check if a number is prime or not:
// // CODE:

//       public static String prime(int num) {
//         for(int i=2;i<=num;i++){
//             if(num%i==0){
//                 return num+ "Not a Prime number";
//             }
//         }
//         return num+ "is a Prime number";
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         System.out.println(prime(number));
// }

//     Scanner number = new Scanner(System.in);
//         System.out.println("enter any number:");
//         int num = number.nextInt();
//         if (num>0){
//             if (num%2 == 0){
//                 System.out.print("the entered num is positive & even");
//             }
//             else{
//                 System.out.println("enter number is positive & odd");
//             }
//         }
//         else{
//             System.out.println("the entered num is negative");
//         }

// class StudentData {
//     String name;
//     int rollNo;
//     int marks;

//     void displayDetails() {
//         System.out.println(
//             "Name: " + name +
//             "\nRoll No: " + rollNo +
//             "\nMarks: " + marks
//         );
//     }
// }

// public class Function_JAVA {
//     public static void main(String[] args) {
//         StudentData student1 = new StudentData();
//         student1.name = "YUSRA";
//         student1.rollNo = 20;
//         student1.marks = 95;
//         student1.displayDetails();
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your full name:");
//         String name = sc.nextLine();
//         name = name.toLowerCase();

//         int vowels = 0;
//         int consonants = 0;

//         for (int i = 0; i < name.length(); i++) {
//             char ch = name.charAt(i);

//             if (ch == ' ') {
//                 continue;
//             } else if (ch == 'a' || ch == 'e' || ch == 'i' || 
//                        ch == 'o' || ch == 'u') {
//                 vowels++;
//             } else {
//                 consonants++;
//             }
//         }

//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//     }
// }

