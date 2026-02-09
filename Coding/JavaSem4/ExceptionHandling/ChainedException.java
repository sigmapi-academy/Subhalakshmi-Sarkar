package ExceptionHandling;


/**
 * Write a description of class ChainedException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChainedException
{
    public static void main(String args[]){
        try{
            method1();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void method1() throws Exception{
        try{
            method2();
        }
        catch(Exception e){
            throw new Exception("Exception in method1() ", e);
        }
    }
    
    public static void method2() throws Exception{
        throw new Exception("Original cause of the exception");
    }
}