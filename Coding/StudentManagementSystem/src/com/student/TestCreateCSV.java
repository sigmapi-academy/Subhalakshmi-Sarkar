package com.student;

import java.util.Scanner;

public class TestCreateCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        String fileName = sc.nextLine();
        CreateCSVFile file = new CreateCSVFile("./CSVFiles/", fileName);
        file.createCSVFile();
        sc.close();
    }
}
