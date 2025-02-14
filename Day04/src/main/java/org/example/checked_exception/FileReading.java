package org.example.checked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileReading ->reads data from a file and print it to console and demonstrates Exceptions occur in working with files
public class FileReading {
    //method reads file data of given path
    public static void readFileData(String filePath){
        //Handling exceptions
        try (FileInputStream fileReader=new FileInputStream(filePath)){
            int word ;
            while((word=fileReader.read())!=-1){

                System.out.print((char)word);
            }
        //Printing messages
        }catch (FileNotFoundException e){
            System.out.println("File is not present at given filePath ");
        }
        catch (IOException e) {
            System.out.println("Some Error occurred in reading file ");
        }
    }
    public static void main(String[] args) {
        //File path of given file
        String filePath="C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day04\\src\\main\\java\\org\\example\\checked_exception\\data.txt";
        System.out.println("Reading File ...");
        //method call
        readFileData(filePath);

    }
}
