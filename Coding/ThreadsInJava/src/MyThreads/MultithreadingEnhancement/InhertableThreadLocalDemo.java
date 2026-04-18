package MyThreads.MultithreadingEnhancement;

public class InhertableThreadLocalDemo {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
