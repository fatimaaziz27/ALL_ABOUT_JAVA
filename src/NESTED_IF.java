// 1. Check Age
class mainn {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            if (age >= 60)
                System.out.println("Senior Citizen");
            else
                System.out.println("Adult");
        }
        else
            System.out.println("Minor");
    }
}
// Steps:
// Store age in age.
// Check if age is 18 or above.
// If yes, check if age is 60 or above.
// If yes → Senior Citizen.
// Otherwise → Adult.
// If no → Minor.

// 2. Check Number
class mainn {
    public static void main(String[] args) {

        int n = 10;

        if (n > 0) {
            if (n % 2 == 0)
                System.out.println("Positive Even");
            else
                System.out.println("Positive Odd");
        }
        else
            System.out.println("Negative");
    }
}
// Steps:
// Store a number in n.
// Check if the number is positive.
// If positive, check if it is even.
// If yes → Positive Even.
// Otherwise → Positive Odd.
// If not positive → Negative.

// 3. Check Marks
class mainn {
    public static void main(String[] args) {

        int marks = 80;

        if (marks >= 50) {
            if (marks >= 80)
                System.out.println("Excellent");
            else
                System.out.println("Pass");
        }
        else
            System.out.println("Fail");
    }
}
// Steps:
// Store marks in marks.
// Check if marks are 50 or above.
// If yes, check if marks are 80 or above.
// If yes → Excellent.
// Otherwise → Pass.
// If below 50 → Fail.

// 4. Check Login
class mainn {
    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234"))
                System.out.println("Login Successful");
            else
                System.out.println("Wrong Password");
        }
        else
            System.out.println("Wrong Username");
    }
}
// Steps:
// Store username.
// Store password.
// Check the username.
// If correct, check the password.
// If both are correct → Login Successful.
// Otherwise → Wrong Username or Wrong Password.

// 5. Check Driving Eligibility
class mainn {
    public static void main(String[] args) {

        int age = 20;
        boolean license = true;

        if (age >= 18) {
            if (license)
                System.out.println("Can Drive");
            else
                System.out.println("Need License");
        }
        else
            System.out.println("Too Young");
    }
}
// Steps:
// Store age.
// Store whether the person has a license.
// Check if age is 18 or above.
// If yes, check the license.
// If license is true → Can Drive.
// Otherwise → Need License.
// If age is below 18 → Too Young.
