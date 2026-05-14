//=====================================================
//                ENCAPSULATION IN JAVA
//=====================================================

// Definition:
// Encapsulation is an OOP concept that binds
// data (variables) and methods into a single unit
// called a class.

// It hides internal data and allows controlled
// access using getter and setter methods.

// Benefits:
// - Data Security
// - Data Validation
// - Better Control
// - Data Integrity

//=====================================================
//              ENCAPSULATION DIAGRAM
//=====================================================

/*

                    ENCAPSULATION
                           |
          -----------------------------------
          |                                 |
          v                                 v

     Hide Internal Data            Controlled Access
        (Private Data)             Using Methods

*/

//=====================================================
//            REAL-LIFE ENCAPSULATION
//=====================================================

/*

                     ATM MACHINE
                           |
          --------------------------------
          |                              |
          v                              v

     User Can Access             Internal Data Hidden
     Withdraw & Balance          PIN & Database Hidden

*/

//=====================================================
//           GETTER & SETTER DIAGRAM
//=====================================================

/*

                   +------------------+
                   |      Person      |
                   +------------------+
                   | - name           |
                   | - age            |
                   | - hairColor      |
                   +------------------+
                   | + getName()      |
                   | + setName()      |
                   | + getAge()       |
                   | + setAge()       |
                   | + getHairColor() |
                   | + setHairColor() |
                   +------------------+

*/


//=====================================================
//                 FLOW DIAGRAM
//=====================================================

/*

                        main()
                           |
                           v

                 Create Person Object
                           |
                           v

                ---------------------
                |                   |
                v                   v

            setData()           getData()

                |                   |
                v                   v

         Modify Private Data   Access Private Data

*/

//=====================================================
//                 PERSON CLASS
//=====================================================

class Person {

    // Private Data Members
    private String name;
    private int age;
    private String hairColor;


    //=================================================
    //                  GETTERS
    //=================================================

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
  
    //=================================================
    //                  SETTERS
    //=================================================

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {

        // Validation
        if (newAge >= 0) {
            this.age = newAge;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setHairColor(String newHairColor) {
        this.hairColor = newHairColor;
    }
}

//=====================================================
//                 CAR CLASS
//=====================================================

class Car {

    // Private Attributes
    private String brand;
    private String model;
    private int year;


    //=================================================
    //                  GETTERS
    //=================================================

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //=================================================
    //                  SETTERS
    //=================================================

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

   //=================================================
    //                  METHODS
    //=================================================

    public void honk() {
        System.out.println("Beep Beep!");
    }

    public void start() {
        System.out.println("Car Started");
    }

    public void display() {

        System.out.println(
                "Brand: " + brand
                + ", Model: " + model
                + ", Year: " + year
        );
    }
}

//=====================================================
//                    MAIN CLASS
//=====================================================

public class Encapsulation {

    public static void main(String[] args) {

        //=================================================
        //              PERSON OBJECT
        //=================================================

        Person obj1 = new Person();

        obj1.setName("Hussain");
        obj1.setAge(25);
        obj1.setHairColor("White");

        System.out.println(
                "Name: " + obj1.getName()
                + ", Age: " + obj1.getAge()
                + ", Hair Color: " + obj1.getHairColor()
        );

        //=================================================
        //                CAR OBJECT
        //=================================================

        Car car1 = new Car();

        car1.setBrand("Ford");
        car1.setModel("Ford GT");
        car1.setYear(2022);

        car1.honk();
        car1.start();
        car1.display();
    }
}

/*

======================== OUTPUT ========================

Name: Hussain, Age: 25, Hair Color: White

Beep Beep!
Car Started
Brand: Ford, Model: Ford GT, Year: 2022

========================================================

*/
