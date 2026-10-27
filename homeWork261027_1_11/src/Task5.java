import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length1 = input.nextInt();
        int length2 = input.nextInt();
        int[][] numbers = new int[length1][length2];
        int currentNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(calculateSpaces(currentNumber) + currentNumber++);
                }
            } else {
                int[] array = new int[numbers[i].length];
                for (int j = numbers[i].length - 1; j >= 0; j--) {
                    array[j] = currentNumber++;
                }

                for (int j = 0; j < array.length; j++) {
                    System.out.print(calculateSpaces(array[j]) + array[j]);
                }
            }

            System.out.println();
        }
    }

    public static String calculateSpaces(int number) {
        if (number < 10) {
            return "  ";
        }
        if (number <= 99) {
            return " ";
        }

        return " ";
    }

    public static void printNumber(int number, int length) {
        if (number < 10) {
            System.out.print("  " + number + " ");
        } else if (number <= 99) {
            System.out.print(" " + number + " ");
        } else {
            System.out.print(number + " ");
        }

        if (number % length == 0) {
            System.out.println();
        }
    }
}
