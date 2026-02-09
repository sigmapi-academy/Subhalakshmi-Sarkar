import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String inputFile = "./TextFiles/input.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
            String line;
            while((line = br.readLine()) != null){
                //Remove the punctuation and convert it into lower case
                line = line.replaceAll("[^a-zA-Z]", " ").toLowerCase();
                String words[] = line.split("\\s+");
                for(String word : words ){
                    System.out.print(word + " ");
                }
                System.out.println();
            }
        }
        catch(FileNotFoundException fnfe){
            
        }
        catch(IOException ioe){}
    }
}
