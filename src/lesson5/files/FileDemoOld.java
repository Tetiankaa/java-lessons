package lesson5.files;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDemoOld {
    public static void main(String[] args) {
        String pathToFile = "resources/test.txt";

        //The try-with-resources statement is used to automatically close the resources when the try block exits.
       // Both FileInputStream and ObjectInputStream implement the AutoCloseable interface, making them suitable for use in try-with-resources.
        try(FileInputStream fileInputStream = new FileInputStream(pathToFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            // 1 fileInputStream
            byte[] bytes = fileInputStream.readAllBytes();
            String result = new String(bytes, StandardCharsets.UTF_8);

            System.out.println(result);

            // 2 objectInputStream
//            System.out.println(objectInputStream.readObject());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile,true);
//
//            fileOutputStream.write("hello".getBytes());
//
//            fileOutputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
