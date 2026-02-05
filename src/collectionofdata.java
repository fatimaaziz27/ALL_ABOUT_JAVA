

// colllection of data ------>


//     import java.util.Arrays;
//     class collectionofdata{
//     public static void main(String[]args){
//     int[] num = new int[5];
//     num[3]=10;
//     num[0]=20;
//     System.out.println(Arrays.toString(num));
//     num = new int[9];
//     System.out.println(Arrays.toString(num));
//     // with integer data type
//     int[] num1 = {1,2,3,4,5,6,7};
//     System.out.println(Arrays.toString(num1));
//     // with String data type
//     String[] fruits = {"frf","tfdyfy","dfhgf"};
//     System.out.println(Arrays.toString(fruits));
//     }
// }




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
    }
}



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











//import java.util.*;
//class hashmaporset{
//    public static void main(String[]args){
//        // HASHMAP
//        System.out.println("HASHSET");
//
//        HashMap<String,Integer> h1 = new HashMap<>();
//        h1.put("alice",10);
//        h1.put("bob",20);
//        h1.put("tom",30);
//        h1.put("charlie",40);
//        h1.put("alan",50);
//        h1.remove("alice");
//        h1.remove("tom");
//        System.out.println(h1.get("alan"));
//        System.out.println(h1.size());
//        System.out.println(h1);



//        // HASHSET
//        System.out.println("HASHSET");
//
//        HashSet<Integer> h2 = new HashSet<>();
//        h2.add(10);
//        h2.add(20);
//        h2.add(30);
//        h2.add(40);
//        h2.add(50);
//        h2.remove(40);
//        h2.remove(10);
//        System.out.println(h2.contains(56));
//        System.out.println(h2.size());
//        System.out.println(h2.isEmpty());
//        System.out.println(h2);
//        h2.clear();
//        System.out.println(h2);
//




//
//        // STACK
//        System.out.println("STACK");
//
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(10);
//        s1.push(20);
//        s1.push(30);
//        s1.push(40);
//        s1.push(50);
//        System.out.println(s1.peek());
//        System.out.println(s1.pop());
//        System.out.println(s1.search(10));
//        System.out.println(s1.isEmpty());
//        System.out.println(s1.contains(10));
//        System.out.println(s1.size());
//        s1.clear();
//    }
//}

