package ThreadsForSubhalakshmi;


/**
 * Write a description of class Runner1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner1 extends Thread
{
    String nm;
    public Runner1(String name){
        super(name);
        this.nm = name;
    }
    
    @Override
    public void run(){
        long pedalStroke = 0;
        while(pedalStroke < 1000000){
            pedalStroke++;
            if(pedalStroke % 50000 == 0){
                System.out.print("\nRunner " + nm + " performs " + 
                pedalStroke+" pedal strokes.");
            }
        }
    }
}