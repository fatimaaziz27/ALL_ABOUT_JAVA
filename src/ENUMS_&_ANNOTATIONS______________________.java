// Enums & Annotations (Practice Codes)
// 1. Basic Enum
enum Day {
   MON, TUE, WED
}

class Test {
   public static void main(String[] args) {
       System.out.println(Day.MON);
   }
}

// 2. Enum in switch
enum Day { MON, TUE }

class Test {
   public static void main(String[] args) {
       Day d = Day.MON;

       switch(d) {
           case MON -> System.out.println("Monday");
           case TUE -> System.out.println("Tuesday");
       }
   }
}

// 3. Enum with values
enum Size {
   SMALL, MEDIUM, LARGE
}

4. Loop enum
for (Day d : Day.values()) {
   System.out.println(d);
}
5. Custom enum constructor
enum Level {
   LOW(1), MEDIUM(2), HIGH(3);

   int value;

   Level(int value) {
       this.value = value;
   }
}
6. Basic annotation usage
class Test {
   @Override
   public String toString() {
       return "Hello";
   }
}
7. Custom annotation
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
   String value();
}

@Info("Test Class")
class Demo {}

