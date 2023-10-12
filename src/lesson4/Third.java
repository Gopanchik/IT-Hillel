package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Third {
    public static void main(String[] args) {

        Random random = new Random();
        int array[] = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(31) - 10;
        }

        System.out.println("Массив: " + Arrays.toString(array));


        int[] arrays = Arrays.stream(array).distinct().toArray();

        for (int value : arrays) {
            System.out.print(value + " ");


        }
    }





}
