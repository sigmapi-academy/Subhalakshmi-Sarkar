package MyThreads.MultithreadingEnhancement;

public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal<>(){
            @Override
            protected Object initialValue() {
                return "abc";
            }
        };
        System.out.println(tl.get()); //abc
        tl.set("Durga");
        System.out.println(tl.get()); //Durga
        tl.remove();
        System.out.println(tl.get()); //abc
    }
}
