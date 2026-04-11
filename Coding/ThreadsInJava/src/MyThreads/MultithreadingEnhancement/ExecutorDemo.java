package MyThreads.MultithreadingEnhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {
            new PrintJob("Shiv"),
            new PrintJob("Parvati"),
            new PrintJob("Ram"),
            new PrintJob("Sita"),
            new PrintJob("Krishna")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job : jobs) {
            service.submit(job);
        }

        service.shutdown();
    }
}
