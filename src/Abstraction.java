//                      Abstraction in Java:

// The concept of hiding the complex implementation details and exposing only the essential features of an object.
// It helps in reducing complexity and increases efficiency.

// Abstraction is an OOP concept that focuses on what an object does, not how it does it.
// It hides unnecessary details and shows only the important features to the user.
// Abstract methods cannot be accessed without inheritance (parent and child classes).
// Polymorphism is required, where the child class overrides the abstract method.
// If inheritance or overriding is used incorrectly, the code will not give the expected output or the abstract method cannot be accessed.
// Abstraction is used to hide data and expose only essential information.

//  Examples ------->

//     code 1:

// class Abstraction {
//     public static void main(String[] args) {
//         ali_baba obj = new ali_baba();
//         obj.open_sesame();
//         obj.get_treasure();
//     }
// }
// abstract class magic_cave {
//     String treasure = "hidden treasure";
//     abstract void gates_open();
//     void open_sesame() {
//         System.out.println("The magic words are spoken.");
//     }
// }
// class ali_baba extends magic_cave {
//     void gates_open() {
//         System.out.println("....");
//     }
//     void open_sesame() {
//         System.out.println("The gates of the cave open.");
//     }
//     void get_treasure() {
//         System.out.println(this.treasure);
//     }
//     void sleep(){
//         System.out.println("sleeping in the cave for a while");
//     }
// }

//     code 2:

// abstract class payment{
//     abstract void process_payment();
// }
// class credit_card_payment extends payment{
//     void process_payment(){
//         System.out.println("By Credit Card");
//     }
// }
// class paypal_payment extends payment{
//     void process_payment(){
//         System.out.println("By Paypal");
//     }
// }
// class main{
//     public static void main(String[] args){
//     credit_card_payment c1 = new credit_card_payment();
//     c1.process_payment();
//     paypal_payment p1 = new paypal_payment();
//     p1.process_payment();
//     }
// }

//     code 3:

// import java.util.*;

// abstract class shape{
//     abstract void cal_area();
// }
// class circle extends shape{
//     void cal_area(){
//         System.out.println("Circle Area");
//     }
// }
// class rectangle extends shape{
//     void cal_area(){
//         System.out.println("Rectangle Area");
//     }
// }
// class main{
//     public static void main(String[] args){
//         circle c1 = new circle();
//         c1.cal_area();
//         rectangle r1 = new rectangle();
//         r1.cal_area();
//     }
// }