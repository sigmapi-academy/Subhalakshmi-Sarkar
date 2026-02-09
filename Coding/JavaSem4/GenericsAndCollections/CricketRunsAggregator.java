package GenericsAndCollections;

import java.util.*;
public class CricketRunsAggregator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        Map<String,Integer> runs=new HashMap<>();
        System.out.println("Enter number of inputs");
        int n=sc.nextInt();
        String name;
        //taking inputs
        for(i=0;i<n;i++){
            System.out.println("Enter player name:");
            name = sc.next();
            System.out.println("Enter runs:");
            final int score = sc.nextInt();
            if(runs.containsKey(name)==false){
                runs.put(name, score);
            }
            else{
                runs.computeIfPresent(name, (key,value)-> (value+score));
            }
        }
        System.out.println(runs);
    }
}
