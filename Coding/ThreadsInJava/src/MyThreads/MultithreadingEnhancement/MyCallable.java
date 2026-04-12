package MyThreads.MultithreadingEnhancement;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
    private int num;

    public MyCallable(int num){
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+
            " is ...responsible to find the sum of first "+ 
            num + " numbers.");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }
}
