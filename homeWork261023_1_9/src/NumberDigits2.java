import java.util.Scanner;

public class NumberDigits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(sumOfSeven(number1, number2));
    }

    public static int sumOfSeven(int number1, int number2) {
        int sum = 0;

        for (int number = number1; number <= number2; number++) {
            if (number % 7 == 0 && number >= 10 && number <= 99) {
                int tempNumber = number;

                while (tempNumber > 0) {
                    sum += tempNumber % 10;
                    tempNumber /= 10;
                }
            }
        }

        return sum;
    }
}
