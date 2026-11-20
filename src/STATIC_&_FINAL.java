// STATIC & FINAL (Practice Codes)
// STATIC KEYWORD
// 1. Static Variable (shared among objects)
class Counter {
   static int count = 0;

   Counter() {
       count++;
       System.out.println("Count = " + count);
   }
}

public class Static1 {
   public static void main(String[] args) {
       new Counter();
       new Counter();
       new Counter();
   }
}

2. Static Method
class MathUtil {
   static int square(int x) {
       return x * x;
   }
}

public class Static2 {
   public static void main(String[] args) {
       System.out.println(MathUtil.square(4));
   }
}

3. Static Block
class Test {
   static {
       System.out.println("Static block executed");
   }
}

public class Static3 {
   public static void main(String[] args) {
       new Test();
   }
}

4. Static vs Instance Variable
class Demo {
   int x = 10;          // instance
   static int y = 20;   // static
}

public class Static4 {
   public static void main(String[] args) {
       Demo d1 = new Demo();
       Demo d2 = new Demo();

       d1.x = 50;

       System.out.println(d2.x); // 10 (separate copy)
       System.out.println(Demo.y); // 20 (shared)
   }
}

🔹 FINAL KEYWORD
5. Final Variable (constant)
public class Final1 {
   public static void main(String[] args) {
       final int x = 10;
       // x = 20; ❌ error

       System.out.println(x);
   }
}

6. Final Method (cannot override)
class Parent {
   final void show() {
       System.out.println("Final method");
   }
}

class Child extends Parent {
   // void show() {} ❌ not allowed
}

public class Final2 {
   public static void main(String[] args) {
       Child c = new Child();
       c.show();
   }
}

7. Final Class (cannot inherit)
final class A {
   void display() {
       System.out.println("Final class");
   }
}

// class B extends A {} ❌ not allowed

public class Final3 {
   public static void main(String[] args) {
       A obj = new A();
       obj.display();
   }
}

