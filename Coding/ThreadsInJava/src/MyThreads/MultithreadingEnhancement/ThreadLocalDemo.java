package MyThreads.MultithreadingEnhancement;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal<>();
        System.out.println(tl.get());
        tl.set("Shiv");
        System.out.println(tl.get()); //Shiv 
        tl.remove();
        System.out.println(tl.get()); //null  
    }
}
