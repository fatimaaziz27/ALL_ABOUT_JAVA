//=====================================================
//                 ABSTRACTION IN JAVA
//=====================================================

// Definition:
// Abstraction is the process of hiding complex
// implementation details and showing only the
// essential features of an object.

// Abstract methods require inheritance.
// Child classes override abstract methods.
// Polymorphism is used to access overridden methods.

//=====================================================
//                ABSTRACTION DIAGRAM
//=====================================================


                    ABSTRACTION
                          |
          --------------------------------
          |                              |
          v                              v

   Hide Complex                 Show Essential
   Implementation                    Features

          |                              |
          v                              v

   Internal Logic                User Interaction
   Hidden from User              Visible to User


//=====================================================
//         REAL-LIFE ABSTRACTION DIAGRAM
//=====================================================


                    User
                      |
                      v

               Uses Mobile Phone
                      |
             -------------------
             |  Call           |
             |  Message        |
             |  Camera         |
             -------------------
                      |
                      v

          Internal Hardware & Code
                  (Hidden)


//=====================================================
//                  EXAMPLE CODE 1
//=====================================================

// Magic Cave Example

/*
                  FLOW DIAGRAM

                 +-------------------+
                 |    MagicCave      |
                 |-------------------|
                 | treasure          |
                 |-------------------|
                 | gates_open()      | ← abstract
                 | open_sesame()     |
                 +-------------------+
                           ▲
                           |
                           |
                 +-------------------+
                 |      AliBaba      |
                 |-------------------|
                 | gates_open()      |
                 | open_sesame()     |
                 | get_treasure()    |
                 | sleep()           |
                 +-------------------+

*/

abstract class MagicCave {

    String treasure = "Hidden Treasure";

    // Abstract method
    abstract void gates_open();

    // Normal method
    void open_sesame() {
        System.out.println("The magic words are spoken.");
    }
}

class AliBaba extends MagicCave {

    // Overriding abstract method
    void gates_open() {
        System.out.println("The gates are opening...");
    }

    // Overriding normal method
    void open_sesame() {
        System.out.println("The gates of the cave open.");
    }

    void get_treasure() {
        System.out.println(treasure);
    }

    void sleep() {
        System.out.println("Sleeping inside the cave.");
    }
}

//=====================================================
//                  EXAMPLE CODE 2
//=====================================================

// Payment System Example

/*
                  FLOW DIAGRAM

                 +----------------------+
                 |       Payment        |
                 |----------------------|
                 | process_payment()    | ← abstract
                 +----------------------+
                            ▲
                -------------------------
                |                       |
                |                       |
       +-------------------+   +-------------------+
       | CreditCardPayment |   |   PaypalPayment   |
       |-------------------|   |-------------------|
       | process_payment() |   | process_payment() |
       +-------------------+   +-------------------+

*/

abstract class Payment {

    abstract void process_payment();
}

class CreditCardPayment extends Payment {

    void process_payment() {
        System.out.println("Payment by Credit Card");
    }
}

class PaypalPayment extends Payment {

    void process_payment() {
        System.out.println("Payment by Paypal");
    }
}

//=====================================================
//                  EXAMPLE CODE 3
//=====================================================

// Shape Example

/*
                  FLOW DIAGRAM

                    +------------------+
                    |      Shape       |
                    |------------------|
                    | cal_area()       | ← abstract
                    +------------------+
                             ▲
                 -------------------------
                 |                       |
                 |                       |
         +---------------+     +----------------+
         |    Circle     |     |   Rectangle    |
         |---------------|     |----------------|
         | cal_area()    |     | cal_area()     |
         +---------------+     +----------------+

*/

abstract class Shape {

    abstract void cal_area();
}

class Circle extends Shape {

    void cal_area() {
        System.out.println("Circle Area");
    }
}

class Rectangle extends Shape {

    void cal_area() {
        System.out.println("Rectangle Area");
    }
}

//=====================================================
//                    MAIN CLASS
//=====================================================

public class Abstraction {

    public static void main(String[] args) {

        //=================================================
        //               EXAMPLE 1
        //=================================================

        AliBaba obj = new AliBaba();

        obj.gates_open();
        obj.open_sesame();
        obj.get_treasure();
        obj.sleep();

        //=================================================
        //               EXAMPLE 2
        //=================================================

        Payment p1;

        p1 = new CreditCardPayment();
        p1.process_payment();

        p1 = new PaypalPayment();
        p1.process_payment();

        //=================================================
        //               EXAMPLE 3
        //=================================================

        Shape s1;

        s1 = new Circle();
        s1.cal_area();

        s1 = new Rectangle();
        s1.cal_area();
    }
}
