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


// 6. Movie Class
// Create a class `Movie` with a private attribute `rating` and a public method `get_rating()` that allows
// access to the rating only if it is above a certain threshold (e.g., 3).

// completed -------->

/*
class java{
    public static void main(String[] args){
        movie m1 = new movie();
        m1.rating(2);
        m1.get_rating();
    }
}
class movie{
    private Integer rating;

    public Integer get_rating() {
        return rating;
    }
    public void rating(Integer newrating) {
        this.rating = newrating;
        if (rating > 2) {
            System.out.println(rating);
        } else {
            System.out.println("low rating");
        }
    }
}
*/










