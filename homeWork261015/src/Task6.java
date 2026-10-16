import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];
        int[] countOfDubles = new int[length];
        int maxCount = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    ++countOfDubles[i];
                }

                if (countOfDubles[i] > maxCount) {
                    maxCount = countOfDubles[i];
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (countOfDubles[i] == maxCount) {
                System.out.println(numbers[i]);
                return;
            }
        }
    }
}
