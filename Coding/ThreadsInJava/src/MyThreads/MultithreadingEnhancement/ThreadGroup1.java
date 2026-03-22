package MyThreads.MultithreadingEnhancement;

public class ThreadGroup1 {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("First group");
        System.out.println(g1.getParent().getName()); //main

        ThreadGroup g2 = new ThreadGroup(g1, "Second group");
        System.out.println(g2.getParent().getName());
    }
}
