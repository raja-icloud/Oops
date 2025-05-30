class Driver extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Line Number 5 : " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
           System.out.println("Driver Thread");
        }
    }

}

class Passenser implements Runnable {

    @Override
    public void run() {
        System.out.println("Line Number 17 : " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Passenser Thread");
        }
    }
    
}

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("Line Number 25 : " + Thread.currentThread().getName());

        Driver t1 = new Driver(); // way one by extend thead class
        Thread t2 = new Thread(new Passenser()); // way two by implement Runnable interface
        Thread t3 = new Thread(()->{ // way three by Thread class with Lamda expression
            System.out.println("Line Number 33 : " + Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread One"+i);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        System.out.println("Process Completed");
    }
}
