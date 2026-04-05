package MyThreads.MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    private ReentrantLock rl = new ReentrantLock(); 
    public void wish(String name) throws InterruptedException{
        rl.lock();      //1
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            Thread.sleep(2000);
            System.out.println(name);
        }
        rl.unlock();  //2
    }
}
