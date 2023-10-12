package lesson4;

import java.util.Arrays;

public class Second {

    public static void main(String[] args) {

        int[] array = {-2, -21, -3, 4, 5, -222, -353, -353, 7};
        int min = 999999999;

        int minCount = countMinValues(array);
        for (int i = 0; i < 9; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Мінімальне число: " + min);
        System.out.println("Кількість мінімальних чисел: " + countMinValues(array));

    }

    public static int countMinValues(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = Arrays.stream(array).min().getAsInt();
        int minCount = 0;

        for (int num : array) {
            if (num == min) {
                minCount++;
            }
        }

        return minCount;
    }
}
