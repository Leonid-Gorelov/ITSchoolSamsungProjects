import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInInput = 1;
        int count = 1;
        int maxCount = 0;
        int direction = 0;
        int[] numbers = new int[0];

        while (numberInInput != 0) {
            numberInInput = input.nextInt();

            if (numberInInput == 0) {
                break;
            }

            int[] tempArray = new int[numbers.length + 1];

            for (int i = 0; i < numbers.length; i++) {
                tempArray[i] = numbers[i];
            }

            tempArray[tempArray.length - 1] = numberInInput;
            numbers = tempArray;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                if (direction != 1) {
                    count = 1;
                }

                ++count;
                direction = 1;
            }
            if (numbers[i] < numbers[i - 1]) {
                if (direction != -1) {
                    count = 1;
                }

                ++count;
                direction = -1;
            } else if (numbers[i] == numbers[i - 1]) {
                count = 0;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount == 0 ? 1 : maxCount);
    }
}
