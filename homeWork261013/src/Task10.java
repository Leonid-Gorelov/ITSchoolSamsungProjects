import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int currentNumber = number;
        boolean isFoundMinNumber = false;

        while (!isFoundMinNumber) {
            ++currentNumber;
            int numberToCheck = 2;
            boolean isDivideByOtherNumber = false;

            while (numberToCheck < 1000) {
                if (currentNumber % numberToCheck == 0 && currentNumber != numberToCheck) {
                    isDivideByOtherNumber = true;
                }

                ++numberToCheck;
            }

            if (!isDivideByOtherNumber) {
                isFoundMinNumber = true;
            }
        }

        System.out.println(currentNumber);
    }
}
