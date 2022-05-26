import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // ThreadPool of 2 threads

        for (int i = 0; i < 10; i++) { // add in ThreadPool tasks from 0 to 9
            executorService.submit(new Work(i));
        }

        executorService.shutdown(); // no new tasks, just do previous tasks from 0 to 9 (some like start() method)

        executorService.awaitTermination(1, TimeUnit.HOURS); // wait 1 HOUR to end execution of all task
    }
}
