import java.util.*;

import javax.print.attribute.standard.Copies;
public class Constructor {

// Constructors in Java
// A constructor is a special method used to initialize objects.

//Types of Constructor:
    
    //1. Argumental
    // Constructor with parameters

    //2. Non Argumental/ Programmer Defined Default
    // Constructor without parameters written by programmer

    Person(){
        this.name = "Unknown";
        this.age = 10;
        this.hair_color = "Black";
        }

    //3. Java Default
    // Constructor automatically created by Java if none exists


// Types of Constructors

// 1. Default Constructor
// Constructor without parameters.

class Student {
    Student() {
        System.out.println("Default Constructor");
    }
}

// 2. Parameterized Constructor
// Constructor with parameters.

class Students {
    int id;
    Student(int i) {
        id = i;
    }
}

// 3. Copy Constructor
// Copies values from another object.

}





















import java.util.*;

import javax.print.attribute.standard.Copies;

public class Constructor {

//=====================================================
//                 CONSTRUCTORS IN JAVA
//=====================================================

// Definition:
// Constructor is a special method in Java
// that is used to initialize objects.
// It runs automatically when an object
// of a class is created.

/*

                 CONSTRUCTOR
                      |
                      v

             Initialize Object
                      |
                      v

             Assign Initial Values

*/



// Types of Constructors:

/*

              CONSTRUCTORS
                    |
     --------------------------------
     |              |               |
     v              v               v

 Argumental    Non Argumental   Java Default
 Constructor    Constructor     Constructor

     |              |               |

 With           Without        Created by
 Parameters     Parameters     Java Automatically

*/



//=====================================================
//        1. ARGUMENTAL CONSTRUCTOR
//=====================================================

// Definition:
// A constructor that receives values
// through parameters is called
// an argumental or parameterized constructor.

/*

       Parameterized Constructor

                |
                v

          Receive Values

                |
                v

        Initialize Object

*/



//=====================================================
//     2. NON ARGUMENTAL CONSTRUCTOR
//=====================================================

// Definition:
// A constructor without parameters
// is called a non argumental constructor.
// It is created by the programmer.

/*

        Non Argumental Constructor

                    |
                    v

              No Parameters

                    |
                    v

          Set Default Values

*/



// CODE:

/*

Person(){

    this.name = "Unknown";

    this.age = 10;

    this.hair_color = "Black";

}

*/



//=====================================================
//          3. JAVA DEFAULT CONSTRUCTOR
//=====================================================

// Definition:
// Java automatically creates a default
// constructor if no constructor is written
// inside the class.

/*

             No Constructor
                    |
                    v

              Java Creates
                    |
                    v

        Default Constructor

*/



//=====================================================
//             TYPES OF CONSTRUCTORS
//=====================================================



//=====================================================
//             1. DEFAULT CONSTRUCTOR
//=====================================================

// Definition:
// A constructor without parameters
// is called a default constructor.

// Flow Diagram:

/*

              Start
                |
                v

        Create Object
                |
                v

      Call Constructor
                |
                v

       Execute Statements
                |
                v

              End

*/

// CODE:

/*

class Student {

Student() {

System.out.println("Default Constructor");

}

}

*/



//=====================================================
//          2. PARAMETERIZED CONSTRUCTOR
//=====================================================

// Definition:
// A constructor that accepts parameters
// to initialize object values.

/*

        Parameterized Constructor

                 |
                 v

          Receive Parameter

                 |
                 v

          Store Value

*/

// Flow Diagram:

/*

             Start
               |
               v

        Create Object
               |
               v

     Pass Values to Constructor
               |
               v

       Initialize Variables
               |
               v

              End

*/

// CODE:

/*

class Students {

int id;

Student(int i) {

id = i;

}

}

*/



//=====================================================
//             3. COPY CONSTRUCTOR
//=====================================================

// Definition:
// A copy constructor creates a new object
// by copying values from another object.

/*

             COPY CONSTRUCTOR

                    |
                    v

          Existing Object

                    |
                    v

          Copy Values

                    |
                    v

          New Object

*/

// Flow Diagram:

/*

              Start
                |
                v

       Existing Object Created
                |
                v

       Pass Object to Constructor
                |
                v

          Copy Object Values
                |
                v

             New Object

*/


}
