import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int minNumber = 1000000000;

        while (tempNumber > 0) {
            int currentDigit = tempNumber % 10;
            if (currentDigit != 0 && currentDigit < minNumber) {
                minNumber = currentDigit;
            }

            tempNumber /= 10;
        }

        System.out.println(minNumber);
    }
}
