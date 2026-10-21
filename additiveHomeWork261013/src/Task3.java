import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int currentNumber = 2;
        int count = 0;

        while (number > count) {
            if (currentNumber % 2 == 0 && currentNumber / 2 != number) {
                ++count;
                System.out.print(currentNumber + " ");
            } else if (currentNumber / 2 == number) {
                ++count;
                System.out.print(currentNumber);
            }

            ++currentNumber;
        }
    }
}
