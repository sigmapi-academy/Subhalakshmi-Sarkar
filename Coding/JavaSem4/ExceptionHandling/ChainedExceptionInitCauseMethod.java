package ExceptionHandling;


/**
 * Write a description of class ChainedExceptionInitCauseMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChainedExceptionInitCauseMethod
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
            Exception ne =  new Exception("Exception in method1() ");
            ne.initCause(e);
            throw ne;
        }
    }
    
    public static void method2() throws Exception{
        throw new Exception("Original cause of the exception");
    }
}