package org.example.data_streams_store_and_retrieve_primitive_data;

import java.io.*;
//StudentDataStream-->Class is created for reading and writing data from file
public class StudentDataStream {
    public static void main(String[] args) {
        //Path of file
        String filePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\data_streams_store_and_retrieve_primitive_data\\students.txt";

        // Writing student details to binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading student details from binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

