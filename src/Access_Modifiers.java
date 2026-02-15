class Access_Modifiers {


    //              Access Modifiers:
//  Access modifiers are keywords in Java that set the accessibility
//  of classes, methods, and variables.


//           Types of Access Modifiers:
//  public ---> Accessible from anywhere
//  private ---> Accessible only within this class
//  protected ---> Accessible within package and subclasses

// Example:
    public static void main(String[] args) {

        // Creating an object of Car class
        Car myCar = new Car("Toyota", 2020, "Corolla");
        
        // Accessing public member
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getModel());

        // Accessing protected member through method
        myCar.setBrand("Ford");
        myCar.setModel("Ford GT");
        myCar.setYear(2022);
        myCar.display();

        // Accessing private member through method
        //myCar.honk();
        // myCar.start(); // This line would cause a compile-time error
    }
}

class Car {

    // var with different access modifiers
    public String brand;
    protected int year;
    private String model;

    // Constructor
    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    //Getter
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    //Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Method to honk
    protected  void honk() {
        System.out.println("Beep Beep!");
    }

    // Method to start the car
    private void start() {
        System.out.println("Car Started");
    }

    // Method to display car details
    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Model: " + model);
    }
}
