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



//Make a class 'Car' with attributes 'brand' and 'year' and 'model'.
//Make getter setter to initialize these attributes.
// Include methods to 'honk', 'start', and 'display' the car's details.
//In 'honk', print "Beep Beep!".
//In 'start', print "Car Started".
//In 'display', print the brand, year, and model of the car.

class GetterSetter{
    public static void main(String[] args){
        Car1 car1 = new Car1();
        car1.setBrand("Ford");
        car1.setModel("Ford GT");
        car1.setYear(2022);
        car1.honk();
        car1.start();
        car1.display();
        Car1 car2 = new Car1();
        car2.display();

    }
}
static class Car1{
    String brand;
    String model;
    int year;

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
