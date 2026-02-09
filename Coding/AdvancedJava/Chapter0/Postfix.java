import java.util.*;
public class Postfix {
    public static void main(String args[]){
        int i,d1,d2,number=0;
        char c;
        Stack<Integer> s = new Stack<>();
        String in;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a postfix expression(separated with spaces):");
        in=sc.nextLine();
        for(i=0;i<in.length();i++){
            c=in.charAt(i);
            if(Character.isDigit(c)){
                number=(number*10)+c;
            }
            else if(c==' '){
                s.push(number-'0');
                number=0;
            }
            else{
                d1=s.pop();
                d2=s.pop();
                switch (c) {
                    case '+':
                        s.push(d1+d2);
                        break;
                    case '-':
                        s.push(d1-d2);
                        break;
                    case '/':
                        if(d1>d2)
                            s.push(d1/d2);
                        else
                            s.push(d2/d1);
                        break;
                    case '*':
                        s.push(d1*d2);
                        break;  
                    default:
                        break;
                }
            }
            System.out.println("Answer:"+s.pop());
        }
    }
    
}