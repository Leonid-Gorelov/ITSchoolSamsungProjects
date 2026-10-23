import java.util.Scanner;

public class NumberDigits4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        int count = input.nextInt();

        binFraction(number, count);
    }

    public static void binFraction(double number, int count) {
        for (int i = 0; i < count; i++) {
            number *= 2;

            if (number >= 1) {
                System.out.print(1);
                --number;
            } else {
                System.out.print(0);
            }
        }
    }
}
