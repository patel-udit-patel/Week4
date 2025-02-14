package org.example.try_with_resources;

import java.io.*;

//BufferedFileReading->Demonstrates try block with resources
public class BufferedFileReading {
    public static void readFile(String path){
        try (BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
            int line;
            while((line=br.read())!=-1){
                System.out.print((char)line);
            }
        }catch(IOException e){
            System.out.println("File not found,please check the file path given");
        }
    }
    public static void main(String[] args) {
        String filePath="C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day04\\src\\main\\java\\org\\example\\try_with_resources\\info.txt";
        readFile(filePath);

    }
}
