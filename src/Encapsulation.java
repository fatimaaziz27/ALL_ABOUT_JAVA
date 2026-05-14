//=====================================================
//                ENCAPSULATION IN JAVA
//=====================================================

// Definition:
// Encapsulation is an OOP concept that binds
// data (variables) and methods into a single unit
// called a class.

// It hides internal data and allows controlled
// access using getter and setter methods.

// Benefits:
// - Data Security
// - Data Validation
// - Better Control
// - Data Integrity

//=====================================================
//              ENCAPSULATION DIAGRAM
//=====================================================

/*

                    ENCAPSULATION
                           |
          -----------------------------------
          |                                 |
          v                                 v

     Hide Internal Data            Controlled Access
        (Private Data)             Using Methods

*/

//=====================================================
//            REAL-LIFE ENCAPSULATION
//=====================================================

/*

                     ATM MACHINE
                           |
          --------------------------------
          |                              |
          v                              v

     User Can Access             Internal Data Hidden
     Withdraw & Balance          PIN & Database Hidden

*/

//=====================================================
//           GETTER & SETTER DIAGRAM
//=====================================================

/*

                   +------------------+
                   |      Person      |
                   +------------------+
                   | - name           |
                   | - age            |
                   | - hairColor      |
                   +------------------+
                   | + getName()      |
                   | + setName()      |
                   | + getAge()       |
                   | + setAge()       |
                   | + getHairColor() |
                   | + setHairColor() |
                   +------------------+

*/


//=====================================================
//                 FLOW DIAGRAM
//=====================================================

/*

                        main()
                           |
                           v

                 Create Person Object
                           |
                           v

                ---------------------
                |                   |
                v                   v

            setData()           getData()

                |                   |
                v                   v

         Modify Private Data   Access Private Data

*/

//=====================================================
//                 PERSON CLASS
//=====================================================

class Person {

    // Private Data Members
    private String name;
    private int age;
    private String hairColor;




  

//Getter Setter Methods
//Getter syntax ->
//    public datatype_attribute get+attribute_name(){
//      return attribute_name
//    }

//Setter syntax ->
//    public void set+attribute_name(datatype_attribute new_value(new+attribute_name){
//      this.attribute_name =  new+attribute_name
//    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String newbrand) {
        this.brand = newbrand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void honk(){
        System.out.println("Beep Beep");
    }
    public void start(){
        System.out.println("Car Started");
    }
    public void display(){
        System.out.println("Brand: " + this.brand + ", Model: " + this.model+", Year: " + this.year);
        }
    }
}
