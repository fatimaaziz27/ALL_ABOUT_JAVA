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





// 3. Account Holder Class
// Create a class `AccountHolder` with private attributes `name` and `account_balance`. Provide public
// methods `deposit(amount)` and `withdraw(amount)` to handle money transactions, while ensuring that
// negative values are not accepted.

class JAVA_CLASS_PRACTICE {
public static void main(String[] args) {
    account_holder.acc1 = new account_holder("me",5000);
    acc1.amount(6700);
    }
}
class account_holder{
    private String name;
    private double account_balance;
    public account_holder(String name ,double account_balance) {
        this.account_balance = account_balance;
        this.name = name;
    }
    void deposit(amount){
        if (amount == 0 || amount < 0){
            System.out.println("Negative amount is not accepted.");
        }
        System.out.println(amount + " has been deposited");
    }
    void withdraw(amount){
        if (amount>0){
            System.out.println(this.name + ", your transaction is successful.");
        }
        else{
            System.out.println("Insufficient funds")
        }
    }

}




// 2. Employee Class with Salary
// Define a class `Employee` with a private attribute `salary`. Write a method `get_salary()` that allows
// access to the salary, but only if the employee's salary is greater than 0.

// 4. Product Stock Class
// Define a class `ProductStock` with private attributes `product_name` and `quantity_in_stock`. Write a
// public method `check_availability()` to check if a product is in stock and return a message accordingly.

// 5. Gradebook Class
// Create a `Gradebook` class with private attributes `student_name` and `grades` (a list). Provide a method
// `add_grade()` to add grades, and a method `average_grade()` that returns the average of all grades.

// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).
