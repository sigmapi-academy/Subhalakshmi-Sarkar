package MyThreads;

public class ClassX {
    public static synchronized void m1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("m1(): " + Thread.currentThread().getName() + " Value:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void m2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("m2(): " + Thread.currentThread().getName() + " Value:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void m3(){
        for (int i = 0; i < 5; i++) {
            System.out.println("m3(): " + Thread.currentThread().getName() + " Value:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void m4(){
        for (int i = 0; i < 5; i++) {
            System.out.println("m4(): " + Thread.currentThread().getName() + " Value:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void m5(){
        for (int i = 0; i < 5; i++) {
            System.out.println("m5(): " + Thread.currentThread().getName() + " Value:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
