package FileHandling1.src;

import java.io.FileWriter;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i, j, line;
        String fileName;
        StringBuilder output = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of line(s) (2<lines<10): ");
        line = sc.nextInt();
        for(i = 0; i < line; i++){
            //loop for space
            for(j = 0; j < line - i; j++){
                output.append("  ");
            }
            //loop for print left-side of the pattern
            for(j = line-i; j <= line; j++){
                output.append(j+" ");
            }
            //loop for print right-side of the pattern
            for(j-=2; j >= line - i; j--){
                output.append(j+" ");
            }
            output.append("\n"); //to change the line.
        }
        System.out.println(output);
        sc.nextLine(); //to remove the keyboard buffer
        System.out.println("Enter file name to save the pattern: ");
        fileName = sc.nextLine();
        try (FileWriter fw = new FileWriter("./DataFiles/"+fileName)) {
            fw.write(output.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
