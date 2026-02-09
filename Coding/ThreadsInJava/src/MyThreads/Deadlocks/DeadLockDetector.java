package MyThreads.Deadlocks;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockDetector {
    public static void detectDeadLock() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.findDeadlockedThreads();

        if(ids != null){
            System.out.println("Deadlock detected!");
            ThreadInfo[] infos = 
                bean.getThreadInfo(ids, true, true);
            
            for(ThreadInfo info : infos){
                System.out.println("Thread name: " + info.getThreadName());
                System.out.println("Thread state: " + info.getThreadState());
                System.out.println("Locked on : " +info.getLockName());
                System.out.println("Owned by: " + info.getLockOwnerName());
                System.out.println("Stack Trace:");
                for(StackTraceElement ste : info.getStackTrace()){
                    System.out.println("\t" + ste);
                }
                System.out.println("-----------------------------------------");
            }
        }
        else{
            System.out.println("No deadlock detected.");
        }
    }
}
