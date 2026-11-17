// ARRAYS
// 1. Print Array Elements
public class Array1 {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};

       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
   }
}

// 2. Find Sum of Array
public class Array2 {
   public static void main(String[] args) {
       int[] arr = {10, 20, 30};
       int sum = 0;

       for (int num : arr) {
           sum += num;
       }

       System.out.println("Sum = " + sum);
   }
}

3. Find Maximum Element
public class Array3 {
   public static void main(String[] args) {
       int[] arr = {5, 2, 9, 1};

       int max = arr[0];

       for (int num : arr) {
           if (num > max) {
               max = num;
           }
       }

       System.out.println("Max = " + max);
   }
}

4. Reverse an Array
public class Array4 {
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4};

       for (int i = arr.length - 1; i >= 0; i--) {
           System.out.print(arr[i] + " ");
       }
   }
}

5. Search Element
public class Array5 {
   public static void main(String[] args) {
       int[] arr = {3, 7, 1, 9};
       int key = 7;

       boolean found = false;

       for (int num : arr) {
           if (num == key) {
               found = true;
               break;
           }
       }

       System.out.println(found ? "Found" : "Not Found");
   }
}

6. Count Even Numbers
public class Array6 {
   public static void main(String[] args) {
       int[] arr = {2, 5, 6, 7, 8};
       int count = 0;

       for (int num : arr) {
           if (num % 2 == 0) {
               count++;
           }
       }

       System.out.println("Even count = " + count);
   }
}

7. 2D Array (Matrix Print)
public class Array7 {
   public static void main(String[] args) {
       int[][] matrix = {
           {1, 2},
           {3, 4}
       };

       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
   }
}

