package org.example.serialisation_save_and_retrieve_an_object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    private static final String FILE_NAME ="C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\serialisation_save_and_retrieve_an_object\\employee.txt";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        serializeEmployees(employees);
        deserializeEmployees();
    }

    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    private static void deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
