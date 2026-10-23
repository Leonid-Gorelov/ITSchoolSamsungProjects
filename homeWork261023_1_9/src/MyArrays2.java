import java.util.Scanner;

public class MyArrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        minToBegin(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void minToBegin(int[] numbers) {
        int minNumber = 1000000001;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                index = i;
            }
        }

        for (int i = numbers.length - 1; i > 0; i--) {
            if (index == i) {
                int tempNumber = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = tempNumber;
                --index;
            }
        }
    }
}
