package org.example.read_a_large_file_line_by_line;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\read_a_large_file_line_by_line\\large_file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
