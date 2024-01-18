package lesson5.exception;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "aaa";
        array[1] = "bbb";

//        try {
//            array[2] = "ccc";
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Got exception");
//            e.printStackTrace();
//        }
        System.out.println(Arrays.toString(array));


        try{
            doSomething();
        }catch (Throwable e){
            System.out.println("catch block");
        }finally {
            System.out.println("code will be always executed");
        }

        System.out.println("End");

    }
    public static void doSomething() throws IOException {
        if (new Random().nextBoolean()){
            throw new IOException();
        }
    }
}
