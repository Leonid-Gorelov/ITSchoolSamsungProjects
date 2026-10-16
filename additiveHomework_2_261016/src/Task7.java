import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];
        long[] checkedNumbers = new long[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
            checkedNumbers[i] = -2147483649L;
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean isFound = false;

            for (int j = 0; j < checkedNumbers.length; j++) {
                if (numbers[i] == checkedNumbers[j]) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                ++count;

            }
            checkedNumbers[i] = numbers[i];
        }

        System.out.println(count);
    }
}
