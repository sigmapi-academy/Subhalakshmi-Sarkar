package Declarations;

import java.util.ArrayList;
import java.util.List;

public class AnotherCell<T> {
    private final T value;
    // private static List<T> values = new ArrayList<T>(); //illegal
    private static List<Object> values = new ArrayList<Object>(); //OK
    public AnotherCell(T value){
        this.value = value;
        values.add(value);
    }

    public T getValue(){
        return value;
    }

    public static List<Object> getValues(){ //Ok
        return values; 
    }
}
