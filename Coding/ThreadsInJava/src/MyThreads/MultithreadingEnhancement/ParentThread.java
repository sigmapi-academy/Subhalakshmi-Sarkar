package MyThreads.MultithreadingEnhancement;

public class ParentThread extends Thread{
    // public static InheritableThreadLocal itl = new InheritableThreadLocal<>(){
    //     protected Object childValue(Object parentValue) {
    //         return "Child value";
    //     };
    // };

    public static ThreadLocal itl = new ThreadLocal<>();
    @Override
    public void run() {
        itl.set("Parent value");
        System.out.println("Parent thread value---> " + itl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
