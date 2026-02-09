package ThreadsForSubhalakshmi;


/**
 * Write a description of class PrintWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintWord 
{
    private String txt;
    public PrintWord(){
        txt = "";
    }
    public void display(String t){
        txt = t;
        int i;
        for(i = 0; i < txt.length() - 1; i++){
            System.out.print(txt.substring(i, i+1));
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        System.out.print(txt.substring(i, txt.length()));
    }
}