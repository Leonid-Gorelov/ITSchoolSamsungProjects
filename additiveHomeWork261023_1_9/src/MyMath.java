import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();

        System.out.println(min(number1, number2, number3, number4));
    }

    public static int min(int number1, int number2, int number3, int number4) {
        if (number1 <= number2 && number1 <= number3 && number1 <= number4) {
            return number1;
        } else if (number2 <= number1 && number2 <= number3 && number2 <= number4) {
            return number2;
        } else if (number3 <= number1 && number3 <= number2 && number3 <= number4) {
            return number3;
        } else {
            return number4;
        }
    }
}
