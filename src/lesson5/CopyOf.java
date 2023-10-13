package lesson5;

import java.util.Arrays;
import java.util.Random;

public class CopyOf {

    public static void main(String[] args) {

        Random random = new Random();

//        int[] array = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 10};
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt(101) - 50;
        }

        int[] list = Arrays.copyOf(array, 15);

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Новый массив: " + Arrays.toString(list));

    }


}
