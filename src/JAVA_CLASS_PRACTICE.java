import java.util.*;

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// Incompleted -------->

/*
class java{
    public static void main(String[] args){

    }
}
class gradebook{
    private String student_name;
    private ArrayList grades;

    void add_grade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arraylist");
        int size = sc.nextInt();
        while (size > 0) {
            Scanner c = new Scanner(System.in);
            System.out.println("enter any number");
            int num = c.nextInt();
            this.grades.add(num);
            size--;
        }
    }
    void average_grade() {
        int count=0;
        for (int i : this.grades){
            count+=i;
        }
    }
}
*/

// String Manipulation

// 1. Case Count
// Write a Java function `case_count(text: str) -> hashmap` that counts the number of uppercase and
// lowercase letters in a string.
// Example:
// Input: `"Hello World"`
// Output: `{ "uppercase": 2, "lowercase": 8 }`

// 2. Removing Vowels
// Write a Java function `remove_vowels(text: str) -> str` that takes a string and returns a new string with all
// vowels removed.

// 3. Palindrome Check
// Write a Java function `is_palindrome(text: str) -> bool` that checks if a string is a palindrome. A string is a
// palindrome if it reads the same forward and backward (e.g., "madam").

// 4. String Rotation
// Write a Java function `rotate_string(text: str, n: int) -> str` that rotates the string by `n` positions. For
// example, if the input is `"abcdef"` and `n = 2`, the output should be `"cdefab"`.

// 5. String Reversal
// Write a Java function `reverse_words(sentence: str) -> str` that reverses the order of words in a given
// sentence.
// Example:
// Input: `"hello world"`
// Output: `"world hello"`

// 6. Substring Check
// Write a Java function `contains_substring(main: str, sub: str) -> bool` that checks if a substring exists
// within a string.
// Example:
// Input: `"hello world", "world"`
// Output: `True`








// Interface in Java

// An interface is a blueprint of a class that contains abstract methods.

// Example:

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Polymorphism in Java

// Polymorphism allows objects to take many forms.

// Types
// 1. Compile-Time Polymorphism

// Achieved using method overloading

// 2. Run-Time Polymorphism

// Achieved using method overriding

// Run-Time Polymorphism

// Runtime polymorphism is achieved through method overriding where the method call is resolved during execution.

// Example:

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}