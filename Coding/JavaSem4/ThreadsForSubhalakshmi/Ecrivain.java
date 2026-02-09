package ThreadsForSubhalakshmi;

/**
 * Write a description of class Ecrivain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ecrivain extends Thread
{
    private String text;
    public Ecrivain(String t){
        text = t;
    }

    @Override
    public void run(){
        int i, j;
        for(i = 0; i < 10; i++){
            for(j = 0; j < text.length()-1; j++){
                System.out.print(text.substring(j, j+1));
                try{
                    sleep((long)(Math.random() * 1000));
                }
                catch(InterruptedException ie){}
            }
            System.out.print(text.substring(j, j+1)+"\n");
        }
        System.out.printf("%s %s %s","\necrivane ",text, " gottta");
    }
}
