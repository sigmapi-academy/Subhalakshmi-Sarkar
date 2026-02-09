package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class TestCustomEHExample8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCustomEHExample8
{
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter age: ");
            age = sc.nextInt();
            validateAge(age);
        }
        catch(CustomEHExample8 e){
            System.out.print("Caught the exception.");
            System.out.print("\n"+e.getMessage());
        }
    }
    
    public static void validateAge(int age) throws CustomEHExample8{
        if (age < 18){
            throw new CustomEHExample8("Not Elligible for vote");
        }
        else{
            System.out.print("\nElligible to vote.");
        }
    }
}