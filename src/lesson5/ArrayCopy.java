package lesson5;


import java.util.Arrays;
import java.util.Random;

public class ArrayCopy {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.println(Arrays.toString(array));
        System.arraycopy(array, 0, list, 0, array.length);


        for (int i : list) {
            System.out.print(i + " ");
        }

    }

}
