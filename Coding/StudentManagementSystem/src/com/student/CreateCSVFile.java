package com.student;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSVFile {
    private String path;
    private String fileName;
    
    public CreateCSVFile(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }

    public CreateCSVFile() { //default constructor
    }

    public void createCSVFile(){
        String filePath = path + fileName;

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.append("Name, Age, City\n");
            fileWriter.append("Apple, 30, Pune\n");
            fileWriter.append("Nokia,29,Delhi\n");
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
