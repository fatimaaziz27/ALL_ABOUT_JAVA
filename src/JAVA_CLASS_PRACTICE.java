//                      static code:


// import java.util.*;
// class main{
//     public static void main(String[]args){

// // object 1
//         library b1 = new library("book_t","auth1",2007,true);
//         System.out.println("book title:\n" + b1.book_title + "author:\n" + b1.author + "published year:\n" +
//                 b1.published_year + "is available:\n" + b1.is_available);

// // object 2
//         library b2 = new library("book_t2","auth2",2003,false);
//         System.out.println("book title:\n" + b2.book_title + "author:\n" + b2.author + "published year:\n" +
//                 b2.published_year + "is available:\n" + b2.is_available);
//     }
// }

// // argumental constructor
// class library{

// // attributes
//     String book_title;
//     String author;
//     Integer published_year;
//     Boolean is_available;

// // value calling
//     library(String book_name, String author_name, Integer year, Boolean available){
//         this.book_title = book_name;
//         this.author = author_name;
//         this.published_year = year;
//         this.is_available = available;
//     }

//     // getter
//     public String getBook_title(){
//         return book_title;
//     }
//     public String getAuthor(){
//         return author;
//     }
//     public Integer getpublished_year(){
//         return published_year;
//     }
//     public boolean getis_available(){
//         return is_available;
//     }

//     // setter
//     public void setBook_title(String newbook_title){
//         this.book_title = newbook_title;
//     }
//     public void setAuthor(String newauthor){
//         this.author = author;
//     }
//     public void setPublished_year(Integer newpublished_year){
//         this.published_year = published_year;
//     }
//     public void setIs_available(Boolean newis_available) {
//         if (is_available == true) {
//             this.is_available = is_available;
//         } else {
//             System.out.println("not available");
//         }
//     }

// }


//                             dynamic code:


import java.util.*;
public class JAVA_CLASS_PRACTICE {
    public static void main(String[]args){
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you want to continue? yes/no: ");
            String i = scanner.nextLine();
        }
        while (String i == "yes") {
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter book title: ");
            String book_title = scanner.nextLine();

            System.out.print("Enter author_name: ");
            String author = scanner.nextLine();

            System.out.print("Enter published year: ");
            Integer published_year = scanner.nextInt();

            System.out.print("Enter is available: ");
            Boolean is_available = scanner.nextBoolean();
            
            library b1 = new library(book_title,author,published_year,is_available);
            System.out.println("book title:" + b1.book_title + "author:" + b1.author + "published year:" +
                b1.published_year + "is available:" + b1.is_available);
        }
    }
}

// object 2
//        library b2 = new library("book_t2","auth2",2003,false);
//        System.out.println("book title:" + b2.book_title + "author:" + b2.author + "published year:" +
//                b2.published_year + "is available:\n" + b2.is_available);

// argumental constructor

class library{

// attributes
    String book_title;
    String author;
    Integer published_year;
    Boolean is_available;

// value calling
    library(String book_name, String author_name, Integer year, Boolean available){
        this.book_title = book_name;
        this.author = author_name;
        this.published_year = year;
        this.is_available = available;
    }

    // getter
    public String getBook_title(){
        return book_title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getpublished_year(){
        return published_year;
    }
    public boolean getis_available(){
        return is_available;
    }

    // setter
    public void setBook_title(String newbook_title){
        this.book_title = newbook_title;
    }
    public void setAuthor(String newauthor){
        this.author = author;
    }
    public void setPublished_year(Integer newpublished_year){
        this.published_year = published_year;
    }
    public void setIs_available(Boolean newis_available) {
        if (is_available == true) {
            this.is_available = is_available;
        } else {
            System.out.println("not available");
        }
    }
}



import java.util.*;
public class jp {
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you want to continue? yes/no: ");
            String de = scanner.nextLine();
        while (de.equals("yes")) {
            System.out.println("what do you want to do? \n1. add a book \n2. exit");
            int input_type = scanner.nextInt();
            switch (input_type){
                case 1:
                    System.out.print("Enter book title: ");
                    String book_title = scanner.nextLine();

                    System.out.print("Enter author_name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter published year: ");
                    Integer published_year = scanner.nextInt();

                    System.out.print("Enter is available: ");
                    Boolean is_available = scanner.nextBoolean();

                    library b1 = new library(book_title,author,published_year,is_available);
                    System.out.println("book title:" + b1.book_title + "author:" + b1.author + "published year:" +
                            b1.published_year + "is available:" + b1.is_available);
                case 2:
                    break;
            }
        }
    }
}

// object 2
//        library b2 = new library("book_t2","auth2",2003,false);
//        System.out.println("book title:" + b2.book_title + "author:" + b2.author + "published year:" +
//                b2.published_year + "is available:\n" + b2.is_available);

// argumental constructor

class library{

    // attributes
    String book_title;
    String author;
    Integer published_year;
    Boolean is_available;

    // value calling
    library(String book_name, String author_name, Integer year, Boolean available){
        this.book_title = book_name;
        this.author = author_name;
        this.published_year = year;
        this.is_available = available;
    }

    // getter
    public String getBook_title(){
        return book_title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getpublished_year(){
        return published_year;
    }
    public boolean getis_available(){
        return is_available;
    }

    // setter
    public void setBook_title(String newbook_title){
        this.book_title = newbook_title;
    }
    public void setAuthor(String newauthor){
        this.author = author;
    }
    public void setPublished_year(Integer newpublished_year){
        this.published_year = published_year;
    }
    public void setIs_available(Boolean newis_available) {
        if (is_available == true) {
            this.is_available = is_available;
        } else {
            System.out.println("not available");
        }
    }
}

import java.util.*;
public class jp {
    public static void main(String[]args){
        product p1 = new product("rice",250,10);
        System.out.println("product name:" + p1.product_name + "\nprice:" + p1.price + "\nquantity:" +
                p1.quantity + "\ntotal value:" + p1.total_value);
    }
}
