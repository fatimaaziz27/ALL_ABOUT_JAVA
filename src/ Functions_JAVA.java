class Function_JAVA {
    public static void main(String[] args) {

// Q) Java program to check if a number is prime or not:

// CODE:
/*
    public static String prime(int num) {
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return num+ "Not a Prime number";
            }
        }
        return num+ "is a Prime number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(prime(number));
}

    Scanner number = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = number.nextInt();
        if (num>0){
            if (num%2 == 0){
                System.out.print("the entered num is positive & even");
            }
            else{
                System.out.println("enter number is positive & odd");
            }
        }
        else{
            System.out.println("the entered num is negative");
        }
*/

// Q) Define a StudentData class, create an object, assign values, and display details.

// CODE:
/*
    class StudentData {
    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println(
            "Name: " + name + "\nRoll No: " + rollNo + "\nMarks: " + marks);
        }
    }

    public class Function_JAVA {
        public static void main(String[] args) {
            StudentData student1 = new StudentData();
            student1.name = "YUSRA";
            student1.rollNo = 20;
            student1.marks = 95;
            student1.displayDetails();
        }
    }
*/

// Q) Count vowels and consonants in a name, ignoring spaces.

// CODE:
/*
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter your full name:");
            String name = sc.nextLine();
            name = name.toLowerCase();
    
            int vowels = 0;
            int consonants = 0;
    
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
    
                if (ch == ' ') {
                    continue;
                } else if (ch == 'a' || ch == 'e' || ch == 'i' || 
                            ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
    
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
*/

// while loop example:

// CODE:
/*
    class main{
        public static void main(String[] args){
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
            }
        }
    }
*/

// do-while loop example

// CODE:
/*
    class main{
        public static void main(String[] args){
        int k=0;
        do{
            System.out.println(k);
            k++;
        }
        while(k<=10);
        }
    }
*/

// datatypes examples:

//CODE
/*
    class main{
        public static void main(String[] args){
        // java datatypes
        int my_num = 5;
        float my_float = 5.99f;
        char my_char = 'd';
        Boolean my_bool = true;
        String my_string = "hello";
        }
*/

// Java user input / Scanner examples:

// CODE:
/*
    class Main {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter a number:");
            int num = sc.nextInt();
    
            System.out.println("You entered: " + num);
        }
    }
*/

// Q) A switch statement is a control structure that evaluates an expression and executes code based on matching cases.

// CODE:
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade:");
        char letter = sc.next().toLowerCase().charAt(0);

            switch (letter) {
        case 'a':
            System.out.println("Excellent");
            break;
        case 'b':
            System.out.println("Very good");
            break;
        case 'c':
            System.out.println("Good");
            break;
        case 'd':
            System.out.println("Average");
            break;
        case 'e':
            System.out.println("Poor");
            break;
        default:
            System.out.println("Fail");
        }
    }
}
*/
    }
}