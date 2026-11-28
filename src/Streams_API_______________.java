// Streams API (Practice Codes)
// 1. Filter even numbers
import java.util.*;
import java.util.stream.*;

class Test {
   public static void main(String[] args) {
       List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
       nums.stream()
           .filter(n -> n % 2 == 0)
           .forEach(System.out::println);
   }
}
2. Map to square
nums.stream()
   .map(n -> n * n)
   .forEach(System.out::println);
3. Count elements > 3
long count = nums.stream()
   .filter(n -> n > 3)
   .count();
System.out.println(count);
4. Sort list
nums.stream()
   .sorted()
   .forEach(System.out::println);
5. Find max
int max = nums.stream()
   .max(Integer::compare)
   .get();
System.out.println(max);
6. Convert to List
List<Integer> evens = nums.stream()
   .filter(n -> n % 2 == 0)
   .collect(Collectors.toList());
System.out.println(evens);
7. Reduce (sum)
int sum = nums.stream()
   .reduce(0, (a,b) -> a + b);
System.out.println(sum);

