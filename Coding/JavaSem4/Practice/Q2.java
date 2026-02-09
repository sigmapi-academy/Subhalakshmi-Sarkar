package Practice;
import java.util.*;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    int m,n;
    int A[][];
    int decimal[];
    public Q2(int m,int n){
        this.m=m;
        this.n=n;
        this.A=new int[m][n];
        this.decimal=new int[m];
    }

    

    public void input(){
        Scanner sc=new Scanner(System.in);
        String arr[];
        int i,j;
        String n;
        for(i=0;i<m;i++){
            System.out.printf("\nEnter elements for row %d:",i);
            n=sc.nextLine();
            arr=n.split("\\s");
            for(j=0;j<arr.length;j++){
                int d=Integer.parseInt(arr[j]);
                if(d<0 || d>7){
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
                A[i][j]=d;
            }
        }
    }
    public void decimal(){
        int i,j,d=0,k;
        for(i=0;i<m;i++){
            k=n-1; d = 0;
            for(j=0;j<n;j++){
                d+=A[i][j]*(Math.pow(8,k));
                k--;
            }
            decimal[i]=d;
        }        
    }
    public void display(){
        int i,j;
        decimal();
        String output= String.format("%-25s%s\n","FILLED MATRIX", "DECIMAL EQUIVALENT");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){ 
                output += String.format("%-5d", A[i][j]);
            }
            output+= String.format("%15d\n",decimal[i]);
        }
        System.out.print(output);
    }
}
