class Access_Modifiers {

// Access Modifiers in Java

//  Access modifiers are keywords in Java that set the accessibility
//  of classes, methods, variables and constructors.

// Types of Access Modifiers
// 1. private
// 2. default
// 3. protected
// 4. public

// Private
// Accessible only inside the same class.

// Default
// Accessible within the same package only.

// Protected
// Accessible in the same package and in subclasses (even in different packages).

// Public
// Accessible from anywhere in the program.


// Modifier     Same Class   Same Package   Subclass   World
// ---------------------------------------------------------
// Private      Yes          No             No         No
// Default      Yes          Yes            No         No
// Protected    Yes          Yes            Yes        No
// Public       Yes          Yes            Yes        Yes


    class Example {

        private int a = 10;     // accessible only in this class
        int b = 20;             // default access (same package)
        protected int c = 30;   // same package + subclass
        public int d = 40;      // accessible everywhere

        void show() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}