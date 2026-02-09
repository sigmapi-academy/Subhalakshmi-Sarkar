package ThreadsForSubhalakshmi;

/**
 * Write a description of class PrintWord2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintWord2 extends Thread
{
    private String txt;
    private PrintWord pw;

    public PrintWord2(String t, PrintWord pw){
        this.pw = pw;
        txt = t;
    }

    @Override
    public void run(){
        int i;
        for(i = 0; i < 10; i++){
            pw.display(txt);
            try{
                sleep((long)(Math.random() * 1000));
            }
            catch(InterruptedException ie){
                
            }
        }
        System.out.print("This )
    }

}