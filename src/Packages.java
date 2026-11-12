// Packages (7 Practice Codes)

// 1. Simple package class
package mypack;

public class A {
   public void show() {
       System.out.println("Hello Package");
   }
}

// 2. Using package class
import mypack.A;

class Test {
   public static void main(String[] args) {
       A obj = new A();
       obj.show();
   }
}

// 3. Sub-package example
package mypack.subpack;

public class B {
   public void msg() {
       System.out.println("Sub package");
   }
}
// 4. Import all classes
import mypack.*;

class Test {
   public static void main(String[] args) {
       A obj = new A();
       obj.show();
   }
}
5. Fully qualified name
class Test {
   public static void main(String[] args) {
       mypack.A obj = new mypack.A();
       obj.show();
   }
}
6. Multiple classes in package
package mypack;

class X {
   void x() { System.out.println("X"); }
}

class Y {
   void y() { System.out.println("Y"); }
}
7. Access package method
import mypack.X;

class Test {
   public static void main(String[] args) {
       X obj = new X();
       obj.x();
   }
}

