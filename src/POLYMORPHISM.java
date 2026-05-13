import java.lang.reflect.Method;

//=====================================================
//                POLYMORPHISM IN JAVA
//=====================================================

// Definition:
// The ability of different classes to be treated as
// instances of the same class through a common interface.
// It allows methods to perform different actions
// depending on the object.

//=====================================================
//                 FLOW DIAGRAM
//=====================================================


                    POLYMORPHISM
                           |
                           v
        One Method or Action with Many Forms
                           |
        -----------------------------------------
        |                                       |
        v                                       v

 Different Objects                     Different Behaviors
 Use the Same Method                   Based on the Object


//=====================================================
//             TYPES OF POLYMORPHISM
//=====================================================


                   POLYMORPHISM
                        |
        -----------------------------------
        |                                 |
        v                                 v

 Method Overloading              Method Overriding
 (Compile-Time)                    (Run-Time)

 Same Method Name                Same Method Name
 Different Parameters            Different Implementation


//=====================================================
//               1. METHOD OVERLOADING
//=====================================================

// Method overloading means multiple methods
// with the same name but different parameters.


                  FLOW DIAGRAM

                       main()
                          |
                          v
          Create MathOperations Object
                          |
          -----------------------------------
          |                 |               |
          v                 v               v

       add(2,3)        add(2,3,4)     add(2,3.5)

          |                 |               |
          v                 v               v

    add(int,int)   add(int,int,int)  add(int,double)

          |                 |               |
          v                 v               v

           5                 9              5.5


class MathOperations {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add one int and one double
    double add(int a, double b) {
        return a + b;
    }
}

//=====================================================
//               2. METHOD OVERRIDING
//=====================================================

// Method overriding occurs when a subclass
// provides its own implementation of a method
// already defined in the parent class.


                  FLOW DIAGRAM

                        main()
                           |
                           v
                  Create Dog Object
                           |
                           v
                      dog.sound()
                           |
                           v
               Overridden Method Called
                           |
                           v
                     "Dog barks"


class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

//=====================================================
//                    MAIN CLASS
//=====================================================

public class Polymorphism {

    public static void main(String[] args) {

        //=================================================
        //           METHOD OVERLOADING
        //=================================================

        MathOperations mathOps = new MathOperations();

        System.out.println("Sum of 2 and 3: "
                + mathOps.add(2, 3));

        System.out.println("Sum of 2, 3 and 4: "
                + mathOps.add(2, 3, 4));

        System.out.println("Sum of 2 and 3.5: "
                + mathOps.add(2, 3.5));

        System.out.println("Sum of 2.5 and 3.5: "
                + mathOps.add(2.5, 3.5));

        //=================================================
        //           METHOD OVERRIDING
        //=================================================

        Dog dog = new Dog();
        dog.sound();
    }
}
