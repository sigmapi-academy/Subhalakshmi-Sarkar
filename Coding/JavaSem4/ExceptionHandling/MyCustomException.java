package ExceptionHandling;


/**
 * Write a description of class MyCustomException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyCustomException extends Exception
{
    public MyCustomException(String message, Throwable cause){
        super(message, cause);
    }
    
    public MyCustomException(Throwable cause){
        super(cause);
    }
}