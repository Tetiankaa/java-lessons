package lesson5.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {

        String pathToFile = "resources/test.txt";
        String text = "Hello 3";

        writeToFile(pathToFile, text);
        readFromFile(pathToFile);

//        Path path = Paths.get(pathToFile);
//
//        try {
//            Files.write(path, text.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    private static void writeToFile(String pathToFile, String text){
        Path path = Paths.get(pathToFile);
        try {
            Files.write(path,text.getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void readFromFile(String pathToFile) {
        Path path = Paths.get(pathToFile);

       try {
//           byte[] result = Files.readAllBytes(path);
//           System.out.println(new String(result, StandardCharsets.UTF_8));

           //filtering
           Files.readAllLines(path)
                   .stream()
                   .filter(line->line.contains("x"))
                   .forEach(System.out::println);

       }catch (IOException e){
           throw new RuntimeException();
       }
    }

}
