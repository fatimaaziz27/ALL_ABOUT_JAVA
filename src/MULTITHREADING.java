MULTITHREADING (Practice Codes)

1. Create Thread using Thread class
class MyThread extends Thread {
   public void run() {
       System.out.println("Thread is running");
   }
}

public class Thread1 {
   public static void main(String[] args) {
       MyThread t = new MyThread();
       t.start(); // starts thread
   }
}

2. Create Thread using Runnable
class MyTask implements Runnable {
   public void run() {
       System.out.println("Runnable thread running");
   }
}

public class Thread2 {
   public static void main(String[] args) {
       Thread t = new Thread(new MyTask());
       t.start();
   }
}

3. Multiple Threads
class A extends Thread {
   public void run() {
       System.out.println("Thread A");
   }
}

class B extends Thread {
   public void run() {
       System.out.println("Thread B");
   }
}

public class Thread3 {
   public static void main(String[] args) {
       new A().start();
       new B().start();
   }
}

4. Thread Sleep
public class Thread4 {
   public static void main(String[] args) throws InterruptedException {
       for (int i = 1; i <= 5; i++) {
           System.out.println(i);
           Thread.sleep(1000); // 1 second delay
       }
   }
}

5. Thread Join
class MyThread extends Thread {
   public void run() {
       System.out.println("Thread running");
   }
}

public class Thread5 {
   public static void main(String[] args) throws Exception {
       MyThread t = new MyThread();
       t.start();
       t.join(); // wait for thread to finish

       System.out.println("Main ends");
   }
}

6. Synchronization
class Counter {
   int count = 0;

   synchronized void increment() {
       count++;
   }
}

public class Thread6 {
   public static void main(String[] args) throws Exception {
       Counter c = new Counter();

       Thread t1 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) c.increment();
       });

       Thread t2 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) c.increment();
       });

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println("Count = " + c.count);
   }
}

7. Lambda Thread (Java 8+)
public class Thread7 {
   public static void main(String[] args) {
       Thread t = new Thread(() -> {
           System.out.println("Lambda thread running");
       });

       t.start();
   }
}

