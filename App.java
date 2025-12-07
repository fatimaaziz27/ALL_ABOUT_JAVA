import java.util.*;
class App {
    public static void main(String[] args) {

// 1. Write a program to Print First 10 natural numbers. 

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

// 2. Write a program to Calculate the sum of all numbers from 1 to a given number. 3. Write a program to print multiplication table of a given number. 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println((num * i));
        }

// 4. Write a program to display only those numbers from a list (numbers = [12, 75, 150,  180, 145, 525, 50]) that satisfy the following conditions:
// The number must be divisible by five 
// If the number is greater than 150, then skip it and move to the next number  If the number is greater than 500, then stop the loop 

        int[] numbers = {12, 75, 150, 180, 145, 525, 50};
    for (int number : numbers) {
        if (number > 500) break;
        if (number % 5 == 0 && number <= 150) {
            System.out.println(number);
        }
    }

// 5. Write a program to Print list in reverse order using a loop. 

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

// 6. Write a program to display all prime numbers within a range. 

    int n = 20;
    System.out.println("Prime numbers up to " + n + ":");
    for (int i = 2; i <= n; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(i);
    }

// 7. Write a program to Find the factorial of a given number. 

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }
    System.out.println("Factorial of " + num + " is " + factorial);

// 8. Write a program to find the sum of the series up to n terms.

    System.out.print("Enter the number of terms: ");
    int terms = scanner.nextInt();
    double sumSeries = 0.0;
    for (int i = 1; i <= terms; i++) {
        sumSeries += (double) 1 / i;
    }
    System.out.println("Sum of the series up to " + terms + " terms is " + sumSeries);

// 9. Write a Java program to guess a number between 1 and 9. 
// Note : User is prompted to enter a guess. If the user guesses wrong then the prompt  appears again until the guess is correct, on successful guess,
// user will get a "Well  guessed!" message, and the program will exit. 

    Scanner scanner = new Scanner(System.in);    
    int secretNumber = 7;
    int userGuess = 0;
    while (userGuess != secretNumber) {
        System.out.print("Guess a number between 1 and 9: ");
        userGuess = scanner.nextInt();
        if (userGuess < secretNumber) {
            System.out.println("Too low, try again.");
        } else if (userGuess > secretNumber) {
            System.out.println("Too high, try again.");
        }
    }
System.out.println("Well guessed!");

// 10. Write a Java program that accepts a word from the user and reverses it. 11. Write a Java program that accepts a string and calculates the number of digits and  letters. 
// Sample Data : Java 3.2  
// Expected Output : 
// Letters 4 
// Digits 2. 

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine();
    String reversed = "";
    for (int i = word.length() - 1; i >= 0; i--) {
        reversed += word.charAt(i);
    }
    System.out.println("Reversed word: " + reversed);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    int letterCount = 0;
    int digitCount = 0;
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (Character.isLetter(ch)) {
            letterCount++;
        } else if (Character.isDigit(ch)) {
            digitCount++;
        }
    }
    System.out.println("Letters: " + letterCount);
    System.out.println("Digits: " + digitCount);

// 12. Write a program to calculate the length of string provide input by user (without using  len). 
    
Scanner scanner = new Scanner(System.in);    
    System.out.print("Enter a string to calculate its length: ");
    String str = scanner.nextLine();
    int length = 0;
    for (char c : str.toCharArray()) {
        length++;
    }
    System.out.println("Length of the string: " + length);

// 13. Write a Java program to print the number of vowels and consonant in your full  name. 

Scanner scanner = new Scanner(System.in);    
    System.out.print("Enter your full name: ");
    String fullName = scanner.nextLine().toLowerCase();
    int vowels = 0;
    int consonants = 0;
    for (int i = 0; i < fullName.length(); i++) {
        char ch = fullName.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
    }System.out.println("Vowels: " + vowels);

// 14. Write a Java program that generates list of values. The values must be taken from  user as input. 
    
    Scanner scanner = new Scanner(System.in);    
    System.out.print("Enter the number of values you want to input: ");
    int n = scanner.nextInt();
    List<Integer> values = new ArrayList<>();
    System.out.println("Enter " + n + " values:");
    for (int i = 0; i < n; i++) {
        int value = scanner.nextInt();
        values.add(value);
    }
    
    System.out.println("You entered: " + values);

// 15. Write a Java program to copy elements from one list to another. 

    List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> destinationList = new ArrayList<>();
    for (Integer item : sourceList) {
        destinationList.add(item);
    }
    System.out.println("Source List: " + sourceList);
    System.out.println("Destination List: " + destinationList);

// 16. Write a Java program to select the maximum value from list (without using maximum function). 

    List<Integer> numbers = Arrays.asList(34, 67, 23, 89, 12, 90, 45);
    int max = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
        if (numbers.get(i) > max) {
            max = numbers.get(i);
        }
    }
    System.out.println("Maximum value in the list: " + max);

// 17. Write a Java program to count the number of even and odd numbers from a series of  numbers. Sample numbers: numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9) 

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    int evenCount = 0;
    int oddCount = 0;
    for (Integer number : numbers) {
        if (number % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    System.out.println("Even numbers count: " + evenCount);
    System.out.println("Odd numbers count: " + oddCount);

// 18. Find the sum of squares of each element of the list using for loop. numbers = [3, 5, 23,  6, 5, 1, 2, 9, 8 

    List<Integer> numbers = Arrays.asList(3, 5, 23, 6, 5, 1, 2, 9, 8);
    int sumOfSquares = 0;
    for (Integer number : numbers) {
        sumOfSquares += number * number;
    }
    System.out.println("Sum of squares: " + sumOfSquares);

// 19. From given list: gadgets = [“Mobile”, “Laptop”, 100, “Camera”, 310.28, “Speakers”,  27.00, “Television”, 1000, “Laptop Case”, “Camera Lens”] 
// a) Create separate lists of strings and numbers. 
// b) Sort the strings list in ascending order 
// c) Sort the strings list in descending order 
// d) Sort the number list from lowest to highest 
// e) Sort the number list from highest to lowest

List<Object> gadgets = Arrays.asList("Mobile", "Laptop", 100, "Camera", 310.28, "Speakers", 27.00, "Television", 1000, "Laptop Case", "Camera Lens");
        List<String> stringList = new ArrayList<>();
        List<Double> numberList = new ArrayList<>();
        
        // a) Create separate lists
        for (Object item : gadgets) {
            if (item instanceof String) {
                stringList.add((String) item);
            } else if (item instanceof Number) {
                numberList.add(((Number) item).doubleValue());
            }
        }
        
        // b) Sort strings in ascending order
        List<String> ascStrings = new ArrayList<>(stringList);
        Collections.sort(ascStrings);
        System.out.println("Strings (Ascending): " + ascStrings);
        
        // c) Sort strings in descending order
        List<String> descStrings = new ArrayList<>(stringList);
        Collections.sort(descStrings, Collections.reverseOrder());
        System.out.println("Strings (Descending): " + descStrings);
        
        // d) Sort numbers from lowest to highest
        List<Double> ascNumbers = new ArrayList<>(numberList);
        Collections.sort(ascNumbers);
        System.out.println("Numbers (Low to High): " + ascNumbers);
        
        // e) Sort numbers from highest to lowest
        List<Double> descNumbers = new ArrayList<>(numberList);
        Collections.sort(descNumbers, Collections.reverseOrder());
        System.out.println("Numbers (High to Low): " + descNumbers);
    }
}

