public class Student implements Comparable {
    private int roll;
    private String name;

    
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }


    public int getRoll() {
        return roll;
    }


    public void setRoll(int roll) {
        this.roll = roll;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Object o){
        Student st = (Student)o;
        if(this.roll > st.roll){
            return 1;
        }
        else if(this.roll < st.roll){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }
}
