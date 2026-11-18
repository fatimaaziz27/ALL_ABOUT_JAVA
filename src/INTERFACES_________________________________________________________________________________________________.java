// INTERFACES (7 Practice Codes)

// 1. Basic Interface Implementation
interface Animal {
   void sound();
}

class Dog implements Animal {
   public void sound() {
       System.out.println("Dog barks");
   }
}

public class Interface1 {
   public static void main(String[] args) {
       Dog d = new Dog();
       d.sound();
   }
}

// 2. Multiple Classes Implement Same Interface
interface Animal {
   void sound();
}

class Cat implements Animal {
   public void sound() {
       System.out.println("Cat meows");
   }
}

class Cow implements Animal {
   public void sound() {
       System.out.println("Cow moos");
   }
}

public class Interface2 {
   public static void main(String[] args) {
       new Cat().sound();
       new Cow().sound();
   }
}

// 3. Interface with Multiple Methods
interface Shape {
   void draw();
   void color();
}

class Circle implements Shape {
   public void draw() {
       System.out.println("Drawing circle");
   }

   public void color() {
       System.out.println("Coloring circle");
   }
}

public class Interface3 {
   public static void main(String[] args) {
       Circle c = new Circle();
       c.draw();
       c.color();
   }
}

// 4. Interface Variable (Reference)
interface Animal {
   void sound();
}

class Dog implements Animal {
   public void sound() {
       System.out.println("Dog barks");
   }
}

public class Interface4 {
   public static void main(String[] args) {
       Animal a = new Dog(); // interface reference
       a.sound();
   }
}

// 5. Multiple Interfaces (Achieving Multiple Inheritance)
interface A {
   void show();
}

interface B {
   void display();
}

class Test implements A, B {
   public void show() {
       System.out.println("Show method");
   }

   public void display() {
       System.out.println("Display method");
   }
}

public class Interface5 {
   public static void main(String[] args) {
       Test t = new Test();
       t.show();
       t.display();
   }
}

// 6. Default Method (Java 8+)
interface Animal {
   void sound();

   default void sleep() {
       System.out.println("Sleeping...");
   }
}

class Dog implements Animal {
   public void sound() {
       System.out.println("Dog barks");
   }
}

public class Interface6 {
   public static void main(String[] args) {
       Dog d = new Dog();
       d.sound();
       d.sleep();
   }
}

// 7. Static Method in Interface
interface MathUtil {
   static int square(int x) {
       return x * x;
   }
}

public class Interface7 {
   public static void main(String[] args) {
       System.out.println(MathUtil.square(5));
   }
}

