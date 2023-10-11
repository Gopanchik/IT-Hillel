package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    static double[] numbers = new double[1];

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        int counter = -1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the first num: ");
            double a = scanner.nextDouble(); // 5

            System.out.print("Enter the second num: ");
            double b = scanner.nextDouble();  //3

            System.out.print("Choose the operator (+ - * /:) [or enter 'q' for exit]");
            String operator = scanner.next();

            double result = 0;
            switch (operator) {
                case "q":
                    System.out.println("Exit!!!!");
                    System.out.println(Arrays.toString(numbers));
                    System.exit(0);
                    break;
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error! You can't divide by zero");
                        System.out.println("Do you want to change numbers? \n ('y' for 'yes' / 'n' for 'no')");
                        String yn = scanner.next();
                        if (yn.equalsIgnoreCase("y")) {
                            continue;
                        } else if (yn.equalsIgnoreCase("n")) {
                            System.exit(0);
                        }
                    }
                    break;
                default:
                    System.out.println("Error: wrong operator");
            }

            System.out.println("Result = " + result);
            counter++;
            if (counter >= numbers.length) {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
            }

            numbers[counter] = result;
        }
    }

}
