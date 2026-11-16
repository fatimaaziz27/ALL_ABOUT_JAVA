WRAPPER CLASSES & TYPE CASTING (7 Practice Codes)

🔹 WRAPPER CLASSES
1. Primitive → Wrapper (Boxing)
public class Wrapper1 {
   public static void main(String[] args) {
       int x = 10;

       Integer obj = Integer.valueOf(x); // boxing
       System.out.println(obj);
   }
}

2. Wrapper → Primitive (Unboxing)
public class Wrapper2 {
   public static void main(String[] args) {
       Integer obj = 20;

       int x = obj; // unboxing
       System.out.println(x);
   }
}

3. Convert String to Integer
public class Wrapper3 {
   public static void main(String[] args) {
       String str = "100";

       int num = Integer.parseInt(str);
       System.out.println(num + 50);
   }
}

4. Wrapper Methods
public class Wrapper4 {
   public static void main(String[] args) {
       int max = Integer.max(10, 20);
       int min = Integer.min(5, 2);

       System.out.println("Max = " + max);
       System.out.println("Min = " + min);
   }
}

🔹 TYPE CASTING
5. Implicit Casting (Widening)
public class Casting1 {
   public static void main(String[] args) {
       int x = 10;
       double y = x; // automatic

       System.out.println(y);
   }
}

6. Explicit Casting (Narrowing)
public class Casting2 {
   public static void main(String[] args) {
       double x = 9.8;
       int y = (int) x; // manual

       System.out.println(y);
   }
}

7. Object Type Casting (Upcasting & Downcasting)
class Animal {
   void sound() {
       System.out.println("Animal sound");
   }
}

class Dog extends Animal {
   void bark() {
       System.out.println("Dog barking");
   }
}

public class Casting3 {
   public static void main(String[] args) {
       Animal a = new Dog(); // upcasting
       a.sound();

       Dog d = (Dog) a; // downcasting
       d.bark();
   }
}

