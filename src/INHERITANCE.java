//=====================================================
//                 INHERITANCE IN JAVA
//=====================================================

// Definition:
// Inheritance allows one class to acquire
// the properties and methods of another class.

//=====================================================
//              INHERITANCE DIAGRAM
//=====================================================


                    INHERITANCE
                           |
                           v

          Acquiring Properties & Methods
                   from Another Class
                           |
          --------------------------------
          |                              |
          v                              v

        Reusability                Parent-Child Relation


//=====================================================
//            TYPES OF INHERITANCE
//=====================================================


                    INHERITANCE
                           |
    ------------------------------------------------
    |                     |                        |
    v                     v                        v

 Single Inheritance   Multilevel Inheritance   Hierarchical Inheritance


//=====================================================
//             SINGLE INHERITANCE
//=====================================================


                +----------------+
                |    Animal      |
                +----------------+
                | eat()          |
                +----------------+
                         ▲
                         |
                         |
                +----------------+
                |      Dog       |
                +----------------+
                | bark()         |
                +----------------+


//=====================================================
//           MULTILEVEL INHERITANCE
//=====================================================


                +----------------+
                |    Animal      |
                +----------------+
                         ▲
                         |
                +----------------+
                |      Dog       |
                +----------------+
                         ▲
                         |
                +----------------+
                |     Puppy      |
                +----------------+


//=====================================================
//         HIERARCHICAL INHERITANCE
//=====================================================


                     +----------------+
                     |    Animal      |
                     +----------------+
                        ▲         ▲
                        |         |
              +----------------+ +----------------+
              |      Dog       | |      Cat       |
              +----------------+ +----------------+


//=====================================================
//                  FLOW DIAGRAM
//=====================================================


                        main()
                           |
                           v

                Create Puppy Object
                           |
                           v

                  ----------------
                  |      |       |
                  v      v       v

                eat()  bark()  weep()

                  |      |       |
                  v      v       v

               Animal   Dog    Puppy


//=====================================================
//                PARENT CLASS
//=====================================================

class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}

//=====================================================
//          CHILD CLASS (SINGLE INHERITANCE)
//=====================================================

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

//=====================================================
//            MULTILEVEL INHERITANCE
//=====================================================

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

//=====================================================
//         HIERARCHICAL INHERITANCE
//=====================================================

class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

//=====================================================
//                    MAIN CLASS
//=====================================================

public class Inheritance {

    public static void main(String[] args) {

        //=================================================
        //          MULTILEVEL INHERITANCE
        //=================================================

        Puppy p = new Puppy();

        // Accessing inherited methods

        p.eat();    // From Animal
        p.bark();   // From Dog
        p.weep();   // From Puppy

        //=================================================
        //        HIERARCHICAL INHERITANCE
        //=================================================

        Cat c = new Cat();

        c.eat();    // From Animal
        c.meow();   // From Cat
    }
}

/*

======================== OUTPUT ========================

Animal can eat
Dog barks
Puppy weeps

Animal can eat
Cat meows

========================================================

*/
