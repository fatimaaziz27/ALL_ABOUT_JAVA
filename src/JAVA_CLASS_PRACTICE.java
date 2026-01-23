import java.util.*;



// 3. Person and Employee Classes
// Define a `Person` class with attributes `name`, `age`, and `address`. Then define an `Employee` class that
// inherits from `Person` and adds an attribute `salary`. Print out the details of an employee.
/* 

class java_class_practice {
    public static void main(String[] args) {
        person em1 = new person("me",18,"north nazimabad",250000);
        em1.name();
        em1.age();
        em1.address();
        em1.salary();
    }
}
class person{
    String name;
    Integer age;
    String address;
    person(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
class employee extends person{
    Integer salary;
    employee(String name,Integer age,String address,Integer salary){
        super(name, age, address);
        this.salary = salary;
    }

}
*/






// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.

class java_class_practice {
    public static void main(String[] args) {
    }
}
class vehicle{
    String make;
    Integer model;
    vehicle(String make,Integer model){
        this.make = make;
        this.model = model;
    }
}
class electriccar extends vehicle{
    batter_capacity;
    electriccar(String make,Integer model)
    this.battery_capacity = battery_capacity;
    }
    void display_info(){
        System.out.println(this.battery_capacity + this.model + this.make)
    }







// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.


// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

/*
class java_class_practice {
    public static void main(String[] args) {
        employee em1 = new employee("me",18,"north nazimabad",250000);
        System.out.println(em1.name);
        System.out.println(em1.age);
        System.out.println(em1.address);
        System.out.println(em1.salary);
    }
}
class person{
    String name;
    Integer age;
    String address;
    person(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // getter
    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public String getaddress() {
        return address;
    }
    // setter
    public void setname(String newname){
        this.name = name;
    }
    public void setage(Integer newage){
        this.age = age;
    }
    public void setaddress(String newaddress){
        this.address = address;
    }
}
class employee extends person{
    Integer salary;
    employee(String name,Integer age,String address,Integer salary){
        super(name, age, address);
        this.salary = salary;
    }
    // getter
    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public String getaddress() {
        return address;
    }
    public Integer getsalary() {
        return salary;
    }
    // setter
    public void setname(String newname){
        this.name = name;
    }
    public void setage(Integer newage){
        this.age = age;
    }
    public void setaddress(String newaddress){
        this.address = address;
    }
    public void setsalary(Integer newsalary){
        this.salary = salary;
    }
}
*/


// 4. Vehicle and Electric Car Classes
// Create a class `Vehicle` with attributes `make` and `model`. Then create a class `ElectricCar` that inherits
// from `Vehicle`, adding the attribute `battery_capacity`. Override the `display_info()` method to include the
// battery capacity.




// right code ---->

// 6. Fruit and Apple Classes
// Define a class `Fruit` with an attribute `name` and a method `taste()`. Then define a subclass `Apple` that
// inherits from `Fruit` and overrides the `taste()` method to print a specific message about the apple's taste.

class java_class_practice {
    public static void main(String[] args) {
        apple a1 = new apple("apple");
        a1.taste();
    }
}
class fruits{
    String name;
    fruits(String name){
        this.name = name;
    }
    void taste(){
        System.out.println();
    }
}
class apple extends fruits{
    apple(String name){
        super(name);
    }
    @Override
    void taste() {
        System.out.println("sweet");
    }
}

// right code ------>

// 5. Shape and Triangle Classes
// Create an abstract class `Shape` with an abstract method `draw()`. Then create a subclass `Triangle` that
// implements the `draw()` method, printing a message when a triangle is drawn.
/*

class main {
    public static void main(String[] args) {
        traingle t1 = new traingle();
        t1.draw();
        t1.getdraw();
        }
}
abstract class shape {
    abstract void getdraw();
}
class traingle extends shape{
    // getter
    @Override
    public void getdraw() {
        System.out.println("vcd");
    }
    // setter
    public void draw(){
        System.out.println("hfg");
    }
}
*/


// final exam Q1 code ----->

/*
import java.util.*;
class q1{
          public static void main(String[]args){
              electronics e1 = new electronics();
              clothing c1 = new clothing();
              e1.getDiscount();
              e1.finalprice();

              c1.getDiscount();
              c1.finalprice();
          }
      }
      abstract class product {
          private int productID;
          private int price;

          abstract void getDiscount();

          void finalprice() {
              int finalprice;
          }
      }
      class electronics extends product{
          @Override
          public void getDiscount() {
              System.out.println("10% discount");
          }
          @Override
          public void finalprice(){
              System.out.println("500");
          }
      }
      class clothing extends product{
          @Override
          public void getDiscount() {
              System.out.println("70% discount");
          }
          @Override
          public void finalprice(){
              System.out.println("600");
          }
      }
*/





// colllection of data ------>

/*
//import java.util.Arrays;
//class collectionofdata{
//    public static void main(String[]args){
//    int[] num = new int[5];
//    num[3]=10;
//    num[0]=20;
//    System.out.println(Arrays.toString(num));
//    num = new int[9];
//    System.out.println(Arrays.toString(num));
//// with integer data type
//    int[] num1 = {1,2,3,4,5,6,7};
//    System.out.println(Arrays.toString(num1));
//// with String data type
//    String[] fruits = {"frf","tfdyfy","dfhgf"};
//    System.out.println(Arrays.toString(fruits));
//}
//}

import java.util.*;
class collectionofdata {
    public static void main (String[]args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println(num);

        Integer add = (num.get(3)+num.get(4));
        num.set(0,add);
        System.out.println(num);

        Integer b = (num.get(4)-num.get(5));
        num.set(1,b);
        System.out.println(num);

        Integer c = (num.get(0)*num.get(1));
        num.set(2,c);
        System.out.println(num);

        Integer d = (num.get(1)/num.get(2));
        num.set(3,d);
        System.out.println(num);




//        num.add(70);
//        num.add(30);
//        num.add(20);
//        System.out.println(num);
//
//        ArrayList<Integer> numl = new ArrayList<>();
//        System.out.println(numl);
//        numl.add(10);
//        numl.add(20);
//        numl.add(30);
//        numl.add(40);
//        numl.add(50);
//        System.out.println(numl);
//        numl.add(2,100);
//        System.out.println(numl);
//        numl.remove(1);
//        System.out.println(numl);
//        numl.set(2,100);
//        System.out.println(numl);
//
//        System.out.println("LinkedList example");
//
//        LinkedList<Integer> numll = new LinkedList<>();
//        System.out.println(numll);
//        numll.add(10);
//        numll.add(20);
//        numll.add(30);
//        numll.add(40);
//        numll.add(50);
//        System.out.println(numll);
//        numll.add(2,100);
//        System.out.println(numll);
//        numll.remove(1);
//        System.out.println(numll);
//        numll.set(2,100);
//        System.out.println(numll);

    }
}
*/





// Encapsulation

// 1. Bank Account Class
// Define a class `BankAccount` with private attributes `account_number` and `balance`. Provide public
// methods `deposit()` and `withdraw()` to handle deposits and withdrawals. Ensure that the `withdraw()`
// method checks that the withdrawal amount is not greater than the balance.

/*

class encap {
    public static void main(String[] args) {
        bank_account acc1 = new bank_account();
        acc1.setbalance(6700);
        acc1.setaccount_number(7);
        acc1.deposit(45);
        acc1.withdraw(67);
    }
}
    class bank_account {
        private Integer account_number;
        private Integer balance;

//        bank_account(Integer account_number,Integer balance){
//            this.account_number = account_number;
//            this.balance = balance;

        // getter
        public Integer getaccount_number() {
            return account_number;
        }
        public Integer getbalance() {
            return balance;
        }
        // setter
        public void setaccount_number(Integer newaccount_number) {
            this.account_number = newaccount_number;
        }
        public void setbalance(Integer newbalance) {
            this.balance = newbalance;
        }

        public void deposit(Integer amount){
            amount+=amount;
            System.out.println(amount);
        }
        public void withdraw(Integer amount){
            if (amount>this.balance){
                System.out.println("hgfh");
            }
            else {
                this.balance-=amount;
            }
        }
    }

*/
// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.

// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).









