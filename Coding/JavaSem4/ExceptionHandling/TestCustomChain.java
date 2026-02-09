package ExceptionHandling;


/**
 * Write a description of class CustomChain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCustomChain
{
    public static void main(String args[]){
        try{
            method1();
        }
        catch(MyCustomException e){
            e.printStackTrace();
        }
    }
    
    public static void method1() throws MyCustomException{
        try{
            method2();
        }
        catch(Exception e){
            throw new MyCustomException("Exception in method1() ", e);
        }
    }
    
    public static void method2() throws Exception{
        throw new Exception("Original cause of the exception");
    }
}