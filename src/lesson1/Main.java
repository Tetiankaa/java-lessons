package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello");

        // primitive data types

        byte byte1 = -128;
        int integer = 2_000_000_000;
        long longNumber = 2_000_000_000L;
        double doubleNumber = 1.8;
        float floatNumber = 124.562F;

        // String

        String text1 = "hello";
        String text2 = "hello";
        String text3 = new String("hello");

        System.out.println(text1.equals(text3)); //true, compares the content of the strings
        System.out.println(text1 == text3); //false, compares object references

        System.out.println(text1 == text2); //true

        // String[]

        String[] array = new String[2]; // Arrays have a fixed size

        array[0] = "item 1";
        array[1] = "item 2";
        System.out.println(Arrays.toString(array));

        for (String item : array){
            System.out.println(item);
        }
        for (int a=0; a<array.length; a++){
            System.out.println(array[a]);
        }

        //ArrayList<String>

        ArrayList<String> dynamicArray = new ArrayList<>(); // ArrayList can grow or shrink in size as needed
        dynamicArray.add("item 1");
        System.out.println(dynamicArray);

        for (String item : dynamicArray){
            System.out.println(item);
        }
    }
}