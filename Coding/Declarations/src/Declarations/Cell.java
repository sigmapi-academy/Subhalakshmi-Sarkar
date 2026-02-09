package Declarations;

import java.util.concurrent.atomic.AtomicInteger;

public class Cell<T> {
    private final int id;
    private final T value;
    private final static AtomicInteger count = new AtomicInteger();
    private static int nextId(){
        return count.getAndIncrement();
    }

    public Cell(T value){
        this.value = value;
        id = nextId();
    }

    public T getValue(){
        return value;
    }

    public int getId(){
        return id;
    }
    public static int getCount(){
        return count.get();
    }
}
