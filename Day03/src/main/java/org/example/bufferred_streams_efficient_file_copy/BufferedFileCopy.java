package org.example.bufferred_streams_efficient_file_copy;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        //File Path of sourcefile and destinationfile
        String sourceFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\bufferred_streams_efficient_file_copy\\largefile.txt";
        String destinationFile = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\bufferred_streams_efficient_file_copy\\destfile.txt";

        //Creating file object
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file not found.");
            return;
        }


        long startTime, endTime;

        // Using Buffered Streams
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            //Using buffer array
            byte[] buffer = new byte[4096];
            int bytesRead;
            startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            endTime = System.nanoTime();
            System.out.println("Buffered Streams Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }

        // Using Unbuffered Streams
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            startTime = System.nanoTime();
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            endTime = System.nanoTime();
            System.out.println("Unbuffered Streams Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
