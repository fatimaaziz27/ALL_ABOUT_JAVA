import java.util.*;
class RAW_FILE_PRICE_CHECKER {
    public static void main(String[] args) {

        HashMap<String, Integer> PRODUCT_DICTIONARY = new HashMap<>();
        PRODUCT_DICTIONARY.put("PN1", 1);
        PRODUCT_DICTIONARY.put("PN2", 2);
        PRODUCT_DICTIONARY.put("PN3", 3);
        PRODUCT_DICTIONARY.put("PN4", 4);
        PRODUCT_DICTIONARY.put("PN5", 5);
        PRODUCT_DICTIONARY.put("PN6", 6);
        System.out.println(PRODUCT_DICTIONARY);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name (or 'quit' to stop):");
        String p_n = scanner.nextLine();

        if(p_n.equals("quit") || p_n.equals("stop")){
            System.out.println("Program terminated by user.");
        }
        else if(PRODUCT_DICTIONARY.containsKey(p_n)) {
            System.out.println("Product:" + p_n + "\nProduct Price:" + PRODUCT_DICTIONARY.get(p_n));
        }
        else {
            System.out.println("Product is not available");
        }
}
}




import java.util.*;

class RAW_FILE_PRICE_CHECKER {
    public static void main(String[] args) {

//=====================================================
//             PRICE CHECKING MACHINE
//=====================================================

// Definition:
// This program stores product names
// and their prices in a HashMap.
// The user enters a product name,
// and the program checks whether
// the product is available.
// If found, it displays the price.
// Otherwise, it shows that the
// product is not available.

/*

            PRICE CHECKER
                  |
                  v

          Product Database
             (HashMap)
                  |
                  v

        User Enters Product
                  |
        ------------------------
        |                      |
        v                      v

     Product Found       Product Not Found
        |                      |
        v                      v

   Display Price       Show Not Available

*/

// Flow Diagram

/*

               Start
                 |
                 v

      Create Product HashMap
                 |
                 v

        Enter Product Name
                 |
                 v

 Is Input "quit" or "stop"?
         /            \
       Yes            No
        |              |
        v              v

 End Program    Product Exists?
                   /        \
                 Yes        No
                  |          |
                  v          v

          Display Price   Product Not
                            Available
                  |
                  v

                 End

*/

// CODE:

/*
HashMap<String, Integer> PRODUCT_DICTIONARY = new HashMap<>();
PRODUCT_DICTIONARY.put("PN1", 1);
PRODUCT_DICTIONARY.put("PN2", 2);
PRODUCT_DICTIONARY.put("PN3", 3);
PRODUCT_DICTIONARY.put("PN4", 4);
PRODUCT_DICTIONARY.put("PN5", 5);
PRODUCT_DICTIONARY.put("PN6", 6);

System.out.println(PRODUCT_DICTIONARY);

Scanner scanner = new Scanner(System.in);

System.out.print("Enter product name (or 'quit' to stop):");

String p_n = scanner.nextLine();

if(p_n.equals("quit") || p_n.equals("stop")){
    System.out.println("Program terminated by user.");
}
else if(PRODUCT_DICTIONARY.containsKey(p_n)) {
    System.out.println("Product:" + p_n +
            "\nProduct Price:" + PRODUCT_DICTIONARY.get(p_n));
}
else {
    System.out.println("Product is not available");
}
*/

    }
}
