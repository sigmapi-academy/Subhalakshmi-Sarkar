package FileHandling1.src;

import java.util.Scanner;

public class Fibo {
    private int start, end;
    public Fibo(){
        start = end = 0;
    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        start = sc.nextInt();
        System.out.print("Eter the end value: ");
        end = sc.nextInt();
        sc.close();
    }

    int fibo(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public void display(){
        int i;
        System.out.println("\nFibonacci numbers are: ");
        for(i = start; i <= end; i++){
            System.out.print(fibo(i)+" ");
        }
    }

    public static void main(String[] args) {
        System.out.print("\f");
        Fibo f = new Fibo();
        f.read();
        f.display();
    }
}