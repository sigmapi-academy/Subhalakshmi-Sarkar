package Chapter5;
public class Temp {
    @Override
    public String toString(){
        return "Temp";
    }

    public void finalize(){
        System.out.println("Finalize method called");
    }
}
