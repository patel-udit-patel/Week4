package org.example.file_handling_read_and_write;

import java.io.*;
//FileCopy --> Class created for reading data from one file and writing to other file
public class FileCopy {
    public static void main(String[] args) {
        //File Path of source and destination files
        String sourceFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\file_handling_read_and_write\\source.txt";
        String destinationFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\file_handling_read_and_write\\dest.txt";

        //Creating file object
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file not found.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
