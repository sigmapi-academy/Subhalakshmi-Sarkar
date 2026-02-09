package Practice;
import java.util.*;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2_2018
{
    private int m,n;
    private int A[][];
    //private int arr[];
    public Q2_2018(int m,int n){
        this.m=m;
        this.n=n;
        A=new int[m][n];        
    }
    
    public void sort(int arr[]){
        int i,j,temp;
        int n=arr.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void input(){
        int i,j,d;
        Scanner sc=new Scanner (System.in);
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.printf("Enter A[%d][%d]:",i,j);
                d=sc.nextInt();
                A[i][j]=d;
            }
        }
    }
    public void display(String msg){
        System.out.println(msg);
        int i,j,k;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("\t"+A[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public void sortMatrix(){
        //sorting matrix
        for(int i=0;i<m;i++){
            sort(A[i]);
        }
    }
}
