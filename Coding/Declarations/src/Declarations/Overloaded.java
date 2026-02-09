package Declarations;

import java.util.List;

public class Overloaded {
    public static int sum(List<Integer> ints){
        int s = 0;
        for(int i: ints){
            s += i;
        }
        return s;
    }

    public static String sum(List<String> strings){
        StringBuffer sum = new StringBuffer();
        for(String s: strings) sum.append(s);
        return sum.toString();
    }
}
