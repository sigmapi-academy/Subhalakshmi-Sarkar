package GenericsAndCollections;

import java.util.*;
//identify and print all the duplicate elements with their count
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter no. of elements in array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        //taking inputs
        for(i=0;i<n;i++){
            System .out.println("Enter element:");
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j:arr){
            if(map.containsKey(j)==false){
                map.put(j,1);
            }
            else{
                map.computeIfPresent(j,(key,value) -> value+1);
            }
        }
        
        Set<Integer> keys = map.keySet();
        for(int k: keys){
            if(map.get(k)<=1){
                map.remove(k);
            }
        }

        System.out.println(map);

    }
}
