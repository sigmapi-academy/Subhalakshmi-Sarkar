package com.example;

import java.net.URL;

import org.apache.solr.response.CSVWriter;

public class CreateCSV {
    public static void main(String[] args) {
        URL fileURL = CreateCSV.class.getClassLoader().getResource("./CSVFiles/mobile.csv");

        CSVWriter writer = new CsvWriter()
    }
}
