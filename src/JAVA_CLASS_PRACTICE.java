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

// object 1
        library b1 = new library("book_t","auth1",2007,true);
        System.out.println("book title:\n" + b1.book_title + "author:\n" + b1.author + "published year:\n" +
                b1.published_year + "is available:\n" + b1.is_available);

// object 2
        library b2 = new library("book_t2","auth2",2003,false);
        System.out.println("book title:\n" + b2.book_title + "author:\n" + b2.author + "published year:\n" +
                b2.published_year + "is available:\n" + b2.is_available);
    }
}

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