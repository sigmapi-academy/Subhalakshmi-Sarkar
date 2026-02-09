import java.util.Scanner;

public class WrapperDemo {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("\fEnter integer value for x = ");
        x = sc.nextInt();
        Integer y = x; //boxing
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(y));
        System.out.println("Binary equivalent: " + Integer.toBinaryString(y));
    }
}