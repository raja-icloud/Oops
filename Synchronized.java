import java.util.ArrayList;
import java.util.List;

public class Synchronized {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>(); // it won't support multi thread access

        Thread t1 = new Thread(()->{
            synchronized (numbers) {
                for (int i = 1; i <= 100; i++) {
                    numbers.add(i);
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized(numbers) {
                for (int i = 101; i <= 200 ; i++) {
                    numbers.add(i);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join(); 

        System.out.println(numbers.size());
    }
}
