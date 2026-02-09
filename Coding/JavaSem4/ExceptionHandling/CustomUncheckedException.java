package ExceptionHandling;


/**
 * Write a description of class CustomUncheckedException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomUncheckedException extends RuntimeException
{
    public CustomUncheckedException(String message){
        super(message);
    }
}