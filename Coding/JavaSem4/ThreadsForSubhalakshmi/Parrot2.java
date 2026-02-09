package ThreadsForSubhalakshmi;


/**
 * Write a description of class P here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot2 extends Thread
{
    private String cri;
    private int fois;
    public Parrot2(String s, int i){
        cri = s;
        fois = i;
    }
    @Override
    public void run(){
        int n;
        for(n = 0; n < fois; n++){
            repeater();
        }
    }
    public void repeater(){
        System.out.print("\n"+cri);
    }
}