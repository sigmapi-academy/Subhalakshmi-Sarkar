package ThreadsForSubhalakshmi;


/**
 * Write a description of class P here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot1 implements Runnable
{
    private String cri;
    private int fois;
    public Parrot1(String s, int i){
        cri = s;
        fois = i;
    }
    @Override
    public void run(){
        int n;
        for(n = 0; n < fois; n++){
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                System.exit(1);
            }
            System.out.print("\n"+cri);
        }
    }
}