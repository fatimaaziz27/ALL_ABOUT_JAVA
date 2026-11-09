STRINGS (7 Practice Codes)

1. Print Length of String
public class String1 {
   public static void main(String[] args) {
       String str = "Hello";

       System.out.println("Length = " + str.length());
   }
}

2. Convert to Uppercase & Lowercase
public class String2 {
   public static void main(String[] args) {
       String str = "Java";

       System.out.println(str.toUpperCase());
       System.out.println(str.toLowerCase());
   }
}

3. Check Two Strings Equal
public class String3 {
   public static void main(String[] args) {
       String a = "Java";
       String b = "java";

       System.out.println(a.equals(b));        // false
       System.out.println(a.equalsIgnoreCase(b)); // true
   }
}

4. Reverse a String
public class String4 {
   public static void main(String[] args) {
       String str = "Hello";
       String rev = "";

       for (int i = str.length() - 1; i >= 0; i--) {
           rev += str.charAt(i);
       }

       System.out.println("Reversed = " + rev);
   }
}

5. Count Vowels
public class String5 {
   public static void main(String[] args) {
       String str = "Education";
       int count = 0;

       for (char c : str.toLowerCase().toCharArray()) {
           if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
               count++;
           }
       }

       System.out.println("Vowels = " + count);
   }
}

6. Check Palindrome
public class String6 {
   public static void main(String[] args) {
       String str = "madam";
       String rev = "";

       for (int i = str.length() - 1; i >= 0; i--) {
           rev += str.charAt(i);
       }

       if (str.equals(rev)) {
           System.out.println("Palindrome");
       } else {
           System.out.println("Not Palindrome");
       }
   }
}

7. Use StringBuilder (Efficient Reverse)
public class String7 {
   public static void main(String[] args) {
       String str = "Java";

       StringBuilder sb = new StringBuilder(str);
       sb.reverse();

       System.out.println(sb);
   }
}


