package Tests;
import java.util.*;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class series1 {
    public static void displaySum(int i,int n)
    { 
        //n=index of term in the series
        //i=starting number
        if(i==1)
            System.out.print("(");
        if(i==(n+1))
            System.out.print(i+")");
        else{
            System.out.print(i+"+");
            displaySum(i+1,n);
        }
    }

    public static void displayProduct(int i,int n){
        //n=index of term in the series
        //i=starting number
        if(i==1)
            System.out.print("(");
        if(i==(n+1))
            System.out.print(i+")");
        else{
            System.out.print(i+"*");
            displayProduct(i+1,n);
        }
    }

    //sum part of each term
    public static int sums(int sum,int i,int n){
        //n=index of term in the series
        //i=starting number=1

        if(i==(n+1)){
            sum+=i;

        }
        else{
            sum+=i;
            sums(sum,i+1,n);
        }   
        return sum;
    }

    //product part of each term
    public static int product(int p,int i,int n){
        //n=index of term in the series
        //i=starting number=1

        if(i==(n+1)){
            p*=i;

        }
        else{
            p*=i;
            product(p,i+1,n);
        }   
        return p;
    }


    public static double final_ans(double sum,int i,int n){
        //i=1 starting index
        //n=no.of terms

        if(i==n){
            sum+=(sums(0,1, n)/product(1,1, n));

        }
        else{
            sum+=(sums(0,1, i)/product(1,1,i));
            final_ans(sum,i+1, n);
        }
        return sum;
    }

    public static void final_display(int i,int n){
        //n=no. of terms
        if(i==n){
            displaySum(1, i);
            System.out.print("/");
            displayProduct(1, i);
        }
        else{
            displaySum(1, i);
            System.out.print("/");
            displayProduct(1, i);
            System.out.print(" + ");
            final_display(i+1, n);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter series length:");
        n=sc.nextInt();
        System.out.println();
        final_display(1,n);
        System.out.print(" = ");
        System.out.printf("%.2f",final_ans(0.0,1, n));
    }
}
