package ThreadsForSubhalakshmi;
import java.util.*;


/**
 * Write a description of class Parrot3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot3 extends TimerTask
{
    private String cri;
    private int fois;
    
    public Parrot3(String s, int i){
        cri = s;
        fois = i;
    }
    
    public void repeater(){
        System.out.print("\n"+cri);
    }
    @Override
    public void run(){
        int i;
        for(i = 0; i < fois; i++){
            repeater();
        }
    }
}