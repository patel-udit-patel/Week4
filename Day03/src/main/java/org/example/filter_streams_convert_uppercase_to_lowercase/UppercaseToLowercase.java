package org.example.filter_streams_convert_uppercase_to_lowercase;

import java.io.*;
//UppercaseToLowercase -->Class is created to convert file data into lowercase in output file
public class UppercaseToLowercase {
    public static void main(String[] args) {
        //File Path of input and output file
        String inputFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\filter_streams_convert_uppercase_to_lowercase\\input.txt";
        String outputFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\filter_streams_convert_uppercase_to_lowercase\\output.txt";

        //using Buffer reader and writer for file handling
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
