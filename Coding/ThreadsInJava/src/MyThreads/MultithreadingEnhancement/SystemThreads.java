package MyThreads.MultithreadingEnhancement;


public class SystemThreads {
    public static void main(String[] args) {
        // 1. Get current thread group
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        // 2. Move to root(System Thread Group)
        ThreadGroup rootGroup = currentGroup;
        while (rootGroup.getParent()!= null) {
            rootGroup = rootGroup.getParent();
        }
        // 3. Get active thread count
        int count = rootGroup.activeCount();
        // 4. Create array to hold threads
        Thread[] threads = new Thread[count];
        // 5. Copy active threads into array
        rootGroup.enumerate(threads,true);
        // 6. Display thread names
        System.out.println("Active threads in System Thread Group:");
        for(Thread t: threads){
            if(t!=null){
                System.out.println(t.getName());
            }
        }
    }
}
// output
// main
// Reference handler
// Finalizer
// Signal Dispatcher
// Notification Thread
// Common-Cleaner
// (Output may vary depending on JVM and system)
