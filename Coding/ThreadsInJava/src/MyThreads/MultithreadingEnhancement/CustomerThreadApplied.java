package MyThreads.MultithreadingEnhancement;

public class CustomerThreadApplied {
    public static void main(String[] args) {
        CustomerThread c1 = new CustomerThread("Arjun");
        CustomerThread c2 = new CustomerThread("Nakul");
        CustomerThread c3 = new CustomerThread("Yudhistir");
        CustomerThread c4 = new CustomerThread("Bhim");
        CustomerThread c5 = new CustomerThread("Shadev");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
