import java.util.Scanner;

public class NumberDigits3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(sumOfThirteen(number));
    }

    public static int sumOfThirteen(int number) {
        int count = 0;

        for (int currentNumber = 0; currentNumber < number; currentNumber++) {
            int sum = 0;
            int tempNumber = currentNumber;

            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }

            if (sum % 13 == 0) {
                ++count;
            }
        }

        return count;
    }
}
