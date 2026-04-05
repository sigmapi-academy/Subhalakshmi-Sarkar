package MyThreads.MultithreadingEnhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLockThread extends Thread{
    private static ReentrantLock rl = new ReentrantLock();

    public MyReentrantLockThread(String name){
        super(name);
    }

    @Override
    public void run() {
        do{
            try {
                if(rl.tryLock(5000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName() + 
                " ... got the lock and performing safe operations");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    rl.unlock();
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName() + 
                " ... unable to get the lock and performing alternative operations");
                    
                }
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }while(true);

    }
}
