package MyThreads.MultithreadingEnhancement;

public class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread Value ---> " +
         ParentThread.itl.get());
    }
}
