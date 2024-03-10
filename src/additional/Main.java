package additional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "10m.txt");

        Scanner scanner = new Scanner(file);

        long maxNumber = 0;
        long minNumber = 0;

        double median;
        double arithmeticMean;

        int maxLength = 0;
        int maxIndex = -1;

        int currentLength = 1;
        int currentIndex = 0;

        ArrayList<Long> allNumbers = new ArrayList<>();

        while (scanner.hasNextLong()){
            long number = scanner.nextLong();
            allNumbers.add(number);

            // максимальне число в файлі;
            if (number > maxNumber){
                maxNumber = number;
            }

            //  мінімальне число в файлі;
            if (number < minNumber){
                minNumber = number;
            }

        }
        scanner.close();

        System.out.println("Maximum number is " + maxNumber);

        System.out.println("Minimum number is " + minNumber);

        //  найбільшу послідовність чисел (які ідуть один за одним), яка збільшується (опціонально)

        for (int i = 1; i < allNumbers.size(); i++) {

            if (allNumbers.get(i) > allNumbers.get(i - 1)){
                currentLength++;
            }else {
                if (currentLength > maxLength){
                    maxLength = currentLength;
                    maxIndex = currentIndex;
                }
                currentLength = 1;
                currentIndex = i;

            }
        }

        if (currentLength > maxLength){
            maxLength = currentLength;
            maxIndex = currentIndex;
        }

        List<Long> longestIncSequence = allNumbers.subList(maxIndex, maxIndex + maxLength);
        System.out.println("Longest increasing Sequence: " + longestIncSequence);

        // найбільшу послідовність чисел (які ідуть один за одним), яка зменьшується (опціонально)


        for (int i = 1; i < allNumbers.size(); i++) {

            if (allNumbers.get(i) < allNumbers.get(i - 1)){
                currentLength++;
            }else {
                if (currentLength > maxLength){
                    maxLength = currentLength;
                    maxIndex = currentIndex;
                }
                currentLength = 1;
                currentIndex = i;
            }

        }

        if (currentLength > maxLength){
            maxLength = currentLength;
            maxIndex = currentIndex;
        }

        List<Long> longestDecSequence = allNumbers.subList(maxIndex, maxIndex + maxLength);
        System.out.println("Longest decreasing Sequence: " + longestDecSequence);

        //  середнє арифметичне значення

        Long sumOfAllValues = allNumbers.stream().reduce(0L,(a, b) -> a + b);
        arithmeticMean = (double) sumOfAllValues / allNumbers.size();

        System.out.println("Arithmetic mean is " + arithmeticMean);

        //  медіану

        allNumbers.sort(Comparator.comparingLong(Long::longValue));
        int size = allNumbers.size();

        if (size % 2 == 0){
            int middleOfArray = size / 2;

            Long firstValue = allNumbers.get(middleOfArray);
            Long secondValue = allNumbers.get(middleOfArray - 1);

            median = (firstValue + secondValue) * 0.5;

        }else {
            double middleOfArray = (size / 2.0) - 0.5;
            median = allNumbers.get((int) middleOfArray);
        }

        System.out.println("Median is " + median);


    }
}
