import java.util.ArrayList;
import java.util.Scanner;

public class ReversingEachWordOfSentence {
    private String sent, revSent;
    
    public ReversingEachWordOfSentence(){
        sent = revSent = "";
    }

    public void reverseTheSentence(){
        ArrayList<String> words = new ArrayList<>();
        int i, indx;
        sent = sent.trim() + " ";
        for(i = 0; i < sent.length(); i = indx + 1){
            indx = sent.indexOf(" ", i);
            words.add(sent.substring(i, indx));
        }
        for(String w : words.reversed()){
            revSent += w + " ";
        }
    }

    public void display(){
        System.out.println("Original sentence: "+ sent);
        System.out.println("Reversed sentence: " + revSent);
    }

    public void getSent(String sent){
        this.sent = sent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sent = sc.nextLine();
        ReversingEachWordOfSentence ob = new ReversingEachWordOfSentence();
        ob.getSent(sent);
        ob.reverseTheSentence();
        ob.display();
        sc.close();
    }
}
