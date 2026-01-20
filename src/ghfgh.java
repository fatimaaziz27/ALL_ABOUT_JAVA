import java.util.*;
class ghfgh {
    public static void main(String[] args) {

        HashMap<String, Integer> PRODUCT_DICTIONARY = new HashMap<>();
        PRODUCT_DICTIONARY.put("PN1", 1);
        PRODUCT_DICTIONARY.put("PN2", 2);
        PRODUCT_DICTIONARY.put("PN3", 3);
        PRODUCT_DICTIONARY.put("PN4", 4);
        PRODUCT_DICTIONARY.put("PN5", 5);
        PRODUCT_DICTIONARY.put("PN", 6);
        System.out.println(PRODUCT_DICTIONARY);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name (or 'quit' to stop):");
        String p_n = scanner.nextLine();

        if(p_n.equals("quit") || p_n.equals("stop")){
            break;
        else if(PRODUCT_DICTIONARY.containsKey(p_n)) {
            System.out.println("Product:" + p_n + "\nProduct Price:" +PRODUCT_DICTIONARY.get(p_n));
        }
        else {
            System.out.println("Product is not available");
            }
}
}
