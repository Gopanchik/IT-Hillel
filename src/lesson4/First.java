package lesson4;

import java.util.Arrays;
import java.util.Random;

public class First {

    public static void main(String[] args) {

        Random random = new Random();
        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(101) - 50;
        }

        System.out.println("Array: " + Arrays.toString(list));

        int max = -999999999;
        int min = 999999999;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < 10; i++) {
            if (list[i] < min) {
                min = list[i];
                minIndex = i;
            }
            if (list[i] > max) {
                max = list[i];
                maxIndex = i;
            }
        }

        int chan = list[minIndex];
        list[minIndex] = list[maxIndex];
        list[maxIndex] = chan;

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

        System.out.println("Array after swapping: " + Arrays.toString(list));
    }
}
