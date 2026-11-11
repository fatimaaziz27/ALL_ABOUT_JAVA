// LOOPS (7 Practice Codes)

// 1. Print Numbers (1 to 10) – for loop
public class Loop1 {
   public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
           System.out.println(i);
       }
   }
}

// 2. Print Even Numbers (1 to 20) – while loop
public class Loop2 {
   public static void main(String[] args) {
       int i = 1;

       while (i <= 20) {
           if (i % 2 == 0) {
               System.out.print(i + " ");
           }
           i++;
       }
   }
}

// 3. Sum of First N Numbers
public class Loop3 {
   public static void main(String[] args) {
       int n = 5;
       int sum = 0;

       for (int i = 1; i <= n; i++) {
           sum += i;
       }

       System.out.println("Sum = " + sum);
   }
}

4. Factorial of a Number
public class Loop4 {
   public static void main(String[] args) {
       int n = 5;
       int fact = 1;

       for (int i = 1; i <= n; i++) {
           fact *= i;
       }

       System.out.println("Factorial = " + fact);
   }
}

5. Multiplication Table
public class Loop5 {
   public static void main(String[] args) {
       int num = 3;

       for (int i = 1; i <= 10; i++) {
           System.out.println(num + " x " + i + " = " + (num * i));
       }
   }
}

6. Reverse a Number (using while)
public class Loop6 {
   public static void main(String[] args) {
       int num = 1234;
       int rev = 0;

       while (num != 0) {
           int digit = num % 10;
           rev = rev * 10 + digit;
           num /= 10;
       }

       System.out.println("Reversed = " + rev);
   }
}

7. Pattern Printing (Nested Loop)
public class Loop7 {
   public static void main(String[] args) {
       int n = 4;

       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}

