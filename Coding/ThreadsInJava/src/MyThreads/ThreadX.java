package MyThreads;

public class ThreadX extends Thread{
    @Override
    public void run(){
        ClassX.m1();
        ClassX.m2();
        ClassX.m3();
        ClassX.m4();
        ClassX.m5();
    }
}
