package MyThreads.MultithreadingEnhancement;

public class ThreadGroup3Demo {
    public static void main(String[] args) {
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg, "Child Group");
        MyThread t1 = new MyThread(pg, "Child Thread-1");
        MyThread t2 = new MyThread(pg, "Child Thread-2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }
}
