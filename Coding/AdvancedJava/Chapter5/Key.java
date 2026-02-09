package Chapter5;

public class Key {
    int i;

    public Key(int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return i;
    }
    @Override
    public boolean equals(Object obj) {
        Key k = null;
        if(obj instanceof Key){
            k = (Key)obj;
        }
        System.out.println("In equals");
        if(this.i == k.i){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Key [i=" + i + "]";
    }
    
}
