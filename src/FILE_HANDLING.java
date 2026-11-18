// FILE HANDLING JAVA (Practice Codes)

// 1. Create a File
import java.io.File;
import java.io.IOException;

public class File1 {
   public static void main(String[] args) throws IOException {
       File f = new File("test.txt");

       if (f.createNewFile()) {
           System.out.println("File created");
       } else {
           System.out.println("File already exists");
       }
   }
}

// 2. Write to File (FileWriter)
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
   public static void main(String[] args) throws IOException {
       FileWriter fw = new FileWriter("test.txt");
       fw.write("Hello Java File Handling");
       fw.close();

       System.out.println("Data written");
   }
}

// 3. Read File (FileReader)
import java.io.FileReader;
import java.io.IOException;

public class File3 {
   public static void main(String[] args) throws IOException {
       FileReader fr = new FileReader("test.txt");
       int ch;

       while ((ch = fr.read()) != -1) {
           System.out.print((char) ch);
       }

       fr.close();
   }
}

// 4. Read File using BufferedReader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File4 {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new FileReader("test.txt"));

       String line;
       while ((line = br.readLine()) != null) {
           System.out.println(line);
       }

       br.close();
   }
}

5. Append Data to File
import java.io.FileWriter;
import java.io.IOException;

public class File5 {
   public static void main(String[] args) throws IOException {
       FileWriter fw = new FileWriter("test.txt", true); // append mode
       fw.write("\nNew line added");
       fw.close();

       System.out.println("Data appended");
   }
}

6. Delete a File
import java.io.File;

public class File6 {
   public static void main(String[] args) {
       File f = new File("test.txt");

       if (f.delete()) {
           System.out.println("File deleted");
       } else {
           System.out.println("Failed to delete");
       }
   }
}

7. Get File Information
import java.io.File;

public class File7 {
   public static void main(String[] args) {
       File f = new File("test.txt");

       if (f.exists()) {
           System.out.println("Name: " + f.getName());
           System.out.println("Path: " + f.getAbsolutePath());
           System.out.println("Readable: " + f.canRead());
           System.out.println("Writable: " + f.canWrite());
           System.out.println("Size: " + f.length());
       }
   }
}

