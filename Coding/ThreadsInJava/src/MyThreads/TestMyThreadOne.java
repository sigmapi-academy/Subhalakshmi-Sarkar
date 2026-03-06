package MyThreads;

class TestMyThreadOne {

    public static void main(String[] args) throws InterruptedException {
        MyThreadOne mto = new MyThreadOne(100);
        System.out.println();
        if(mto.isDaemon()){
            System.out.println(mto+" is a daemon");     
        }
        else{
            System.out.println(mto+ " is not a daemon");
        }
        mto.setDaemon(true);
        mto.start();
        System.out.println("Main Thread");
        Thread.sleep(3000);
        mto.stop(); 
    }    
}