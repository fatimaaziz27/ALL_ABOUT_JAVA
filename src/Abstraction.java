//                      Abstraction in Java:

// The concept of hiding the complex implementation details and exposing only the essential features of an object.
// It helps in reducing complexity and increases efficiency.

// Abstraction is an OOP concept that focuses on what an object does, not how it does it.
// It hides unnecessary details and shows only the important features to the user.
// Abstract methods cannot be accessed without inheritance (parent and child classes).
// Polymorphism is required, where the child class overrides the abstract method.
// If inheritance or overriding is used incorrectly, the code will not give the expected output or the abstract method cannot be accessed.
// Abstraction is used to hide data and expose only essential information.


import java.util.*;
class Abstraction {
    public static void main(String[] args) {
        ali_baba obj = new ali_baba();
        obj.open_sesame();
        obj.get_treasure();
    }
}
abstract class magic_cave {
    String treasure = "hidden treasure";
    abstract void gates_open();
    void open_sesame() {
        System.out.println("The magic words are spoken.");
    }
}
class ali_baba extends magic_cave {
    void gates_open() {
        System.out.println("....");
    }
    void open_sesame() {
        System.out.println("The gates of the cave open.");
    }
    void get_treasure() {
        System.out.println(this.treasure);
    }
    void sleep(){
        System.out.println("sleeping in the cave for a while");
    }
}