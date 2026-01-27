import java.util.*;

// Encapsulation

// encap example --------->>

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




// completed -------->


// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

/*class java{
public static void main(String[] args) {

    account_holder acc1 = new account_holder("me",5000);
    acc1.deposit(0);
    acc1.withdraw(6700);
    }
}
class account_holder{
    private String name;
    private double account_balance;

    public account_holder(String name ,double account_balance) {
        this.account_balance = account_balance;
        this.name = name;
    }
    void deposit(Integer amount){
        if (amount == 0 || amount < 0){
            System.out.println("Negative amount is not accepted.");
        }
        else{
            this.account_balance+=amount;
            System.out.println(amount + " has been deposited");
        }
    }
    void withdraw(Integer amount){
        if (amount>0 && amount<account_balance){
            this.account_balance-=amount;
            System.out.println(this.name + ", your transaction is successful.");
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
}
*/




// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.


// completed -------->

/*
class JAVA{
    public static void main(String[] args) {

    employee em1 = new employee();
    em1.Salary(0);
    System.out.println(em1.get_salary());
    }
}
class employee {
    private Integer salary;

    public Integer get_salary() {
        return salary;
    }

    public void Salary(Integer newsalary) {
        this.salary = newsalary;
        if (salary > 0) {
            System.out.println(salary);
        } else {
            System.out.println("Insufficient funds");

        }
    }
}
*/

// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.


// completed -------->

/*
class java{
    public static void main(String[] args){
    
        productstock p1 = new productstock("chips",0);
        p1.check_availability();
    }
}
class productstock{
    private String product_name;
    private Integer quantity_in_stock;

    productstock(String product_name,Integer quantity_in_stock){
        this.product_name = product_name;
        this.quantity_in_stock = quantity_in_stock;
    }
    
    public void check_availability(){
        if (quantity_in_stock == 0){
            System.out.println(this.product_name + " is out of stock");
        }
        else{
            System.out.println(this.quantity_in_stock +" "+ this.product_name + " are available");
        }
    }
}
*/

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// completed -------->

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).






