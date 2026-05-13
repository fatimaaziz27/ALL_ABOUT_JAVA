import java.lang.reflect.Method;

//                      Polymorphism in Java
//     The ability of different classes to be treated as instances of the same class through a common interface.
//     It allows methods to do different things based on the object that it is acting upon, even though they share the same name.

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
                  
//       Type of Polymorphism:
//      Method Overloading 
//      Method Overriding

                   POLYMORPHISM
                        |
        -----------------------------------
        |                                 |
        v                                 v
 Method Overloading              Method Overriding
        |                                 |
 Same method name                Same method name
 Different parameters            Different implementation
                    

//1. Method Overloading
// Method overloading means multiple methods with the same name but different parameters.
// Flow Diagram:
                  main()
                     |
                     v
      Create MathOperations object
                     |
        --------------------------------
        |              |              |
        v              v              v

     add(2,3)      add(2,3,4)    add(2,3.5)

        |              |              |
        v              v              v

  add(int,int)   add(int,int,int) add(int,double)

                      
// public class POLYMORPHISM {
// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

                      
                    
//2. Method Overriding
// Method overriding occurs when a subclass provides a specific implementation of a method already defined in the parent class.
// Flow Diagram:
                 main()
                    |
                    v
           Create Dog5 object
                    |
                    v
              dog.sound()
                    |
                    v
          Overridden method runs
                    |
                    v
               "Dog barks"
                      
// class Animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog bark");
//     }
// }











    
//     Example Code:                  
//     Flow Daigram ---->

    class Polymorphism {
        public static void main(String[] args) {
            MathOperations m1 = new MathOperations();

            // Using method overloading

            System.out.println("Sum of 2 and 3: " + mathOps.add(2, 3));
            System.out.println("Sum of 2, 3 and 4: " + mathOps.add(2, 3,4));
            System.out.println("Sum of 2 and 3.5: " + mathOps.add(2, 3.5));
            System.out.println("Sum of 2 and 3.5: " + mathOps.add(2.5, 3.5));

        }
    }

    //Example of Method Overloading

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

        // Overloaded method to add one double value & one int value
        double add(int a, double b) {
            return a + b;

        }
    }

    //Example of Method Overriding

    class Animal5 {

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog5 extends Animal5 {

        //     @Override
            void sound() {
                System.out.println("Dog barks");

            }
        }
    }
