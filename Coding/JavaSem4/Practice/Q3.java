package Practice;
import java.util.*;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    private String n;

    public Q3(){
        n = "";
    }

    public Q3(String s){
        this.n = s;
    }

    boolean check(){
        int size=n.length();
        char c=n.charAt(size-1);
        return (c=='.'|| c=='!'|| c=='?');
    }

    public String palindrome(String w){
        int i, j;
        char c, d;
        for( i = 0, j = w.length()-1;i<j;i++,j--){
            c = w.charAt(i);
            d = w.charAt(j);
            if(c != d){
                break;
            }
        }

        if(i < j){
            for(j = w.length()-1;j > 0 && w.charAt(j) == w.charAt(j-1);j--);    
            for(j--; j >= 0; w += w.charAt(j--));
        }
        return w;
    }

    public int numOfWords(){
        int i, c = 1;
        for(i = 0; i < n.length(); i++){
            char x = n.charAt(i);
            if( x == ' '){
                c++;
            }
        }
        return c;
    }

    public void convert(String n){
        String arr[]=new String[numOfWords()];
        String w="";
        int i,k=0;
        for( i=0; i < n.length(); i++){
            char c = n.charAt(i);
            if(c !=' ' && c !='.'&&c!='!'&&c!='?'){
                w=w+c;   
            }
            else{
                arr[k++]=palindrome(w);
                w="";
            }
        }

        for(i=0;i<k;i++){
            System.out.print(arr[i]+' ');
        }
    } 
}
