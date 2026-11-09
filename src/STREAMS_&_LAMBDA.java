// STREAMS & LAMBDA (7 Practice Codes)

// 1. Basic Lambda Expression
interface MyInterface {
   void show();
}

public class Stream1 {
   public static void main(String[] args) {
       MyInterface obj = () -> System.out.println("Hello Lambda");
       obj.show();
   }
}

2. Lambda with Parameters
interface Add {
   int sum(int a, int b);
}

public class Stream2 {
   public static void main(String[] args) {
       Add obj = (a, b) -> a + b;
       System.out.println(obj.sum(5, 3));
   }
}

3. forEach using Lambda
import java.util.*;

public class Stream3 {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1, 2, 3, 4);

       list.forEach(n -> System.out.println(n));
   }
}

4. Filter Even Numbers (Stream)
import java.util.*;
import java.util.stream.*;

public class Stream4 {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5,6);

       list.stream()
           .filter(n -> n % 2 == 0)
           .forEach(System.out::println);
   }
}

5. Map (Square Numbers)
import java.util.*;
import java.util.stream.*;

public class Stream5 {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4);

       list.stream()
           .map(n -> n * n)
           .forEach(System.out::println);
   }
}

6. Reduce (Sum of Elements)
import java.util.*;
import java.util.stream.*;

public class Stream6 {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4);

       int sum = list.stream()
                     .reduce(0, (a, b) -> a + b);

       System.out.println("Sum = " + sum);
   }
}

7. Sort using Stream
import java.util.*;
import java.util.stream.*;

public class Stream7 {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(5,2,8,1);

       list.stream()
           .sorted()
           .forEach(System.out::println);
   }
}

