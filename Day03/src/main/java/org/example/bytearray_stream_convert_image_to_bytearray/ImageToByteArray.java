package org.example.bytearray_stream_convert_image_to_bytearray;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        //File path of input image and output image
        String inputImagePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\bytearray_stream_convert_image_to_bytearray\\input.jpg";
        String outputImagePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\bytearray_stream_convert_image_to_bytearray\\output.jpg";

        byte[] imageBytes = convertImageToByteArray(inputImagePath);
        if (imageBytes != null) {
            writeByteArrayToImage(imageBytes, outputImagePath);
        }
    }

    //method converts input image into array of bytes and returns byte array
    private static byte[] convertImageToByteArray(String imagePath) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image converted to byte array successfully.");
            return baos.toByteArray();
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return null;
        }
    }

    //method takes array of bytes and path of output file and converts array into image file at path
    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Byte array written back to image successfully.");
        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
        }
    }
}
