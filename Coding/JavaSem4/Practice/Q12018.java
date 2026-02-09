package Practice;
//fining prime pairs whose sum add up to a number

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q12018
{
    private int n;
    public Q12018(int n){
        this.n=n;
    }

    public boolean check_prime(int n){
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public void get_pair(){
        int i,j;
        for(i=3;i<n;i+=2){
            if(check_prime(i)){
                for(j=i;j<n;j+=2){
                    if(check_prime(j)){
                        if(i+j==n)
                            System.out.println(i+" , "+j);
                    }
                }
            }
        }
    }
}
