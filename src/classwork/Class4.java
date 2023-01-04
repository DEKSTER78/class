package classwork;

import java.util.Arrays;
import java.util.Random;

public class Class4 {
    public static void main(String[] args) {
        int[] arrayOfNumers = {1, 2, 3, 4, 5};
        int sumOfNumbers = 0;
        for (int i = 0; i < arrayOfNumers.length; i++) {
            sumOfNumbers += arrayOfNumers[i];
        }
        System.out.println(sumOfNumbers);
      /*  arrayOfNumers[0] = (int) Math.pow(arrayOfNumers[0], 2);
        arrayOfNumers[1] = (int) Math.pow(arrayOfNumers[1], 2);
        arrayOfNumers[2] = (int) Math.pow(arrayOfNumers[2], 2);
        arrayOfNumers[3] = (int) Math.pow(arrayOfNumers[3], 2);
        arrayOfNumers[4] = (int) Math.pow(arrayOfNumers[4], 2);
        System.out.println(Arrays.toString(arrayOfNumers));*/

        //for (int i=0; i< arrayOfNumers.length; i++){
        //arrayOfNumers[i] = (int) Math.pow(arrayOfNumers[i], 2);
        //if (arrayOfNumers[i] % 2 == 0) {

        int[] myArray = createArrayWhithRandomNumbers(10);
        System.out.println(Arrays.toString(createArrayWhithRandomNumbers(5)));
        System.out.println(Arrays.toString(sortArrayToOddNumbes(myArray)));
        //  }
        // }
    }

    public static int[] createArrayWhithRandomNumbers(int lengthOfArray) {
        int[] arrayOfNumers = new int[lengthOfArray];
        for (int i = 0; i < arrayOfNumers.length; i++) {
            Random random = new Random();
            arrayOfNumers[i] = random.nextInt(random.nextInt(1000));
        }

        return arrayOfNumers;
    }

    public static int[] sortArrayToOddNumbes(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }
}
