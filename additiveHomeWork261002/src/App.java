import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int  = number % 10;

        System.out.println();*/

        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int firstDigit = number % 100 / 10;

        System.out.println(firstDigit);*/

        /*Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int firstDigit = number % 1000 / 100;
        int mediumDigit = number % 100 / 10;
        int lastDigit = number % 10;
        int digitsSum = firstDigit + mediumDigit + lastDigit;

        System.out.println(digitsSum);*/

        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int result = firstNumber * firstNumber + secondNumber * secondNumber;

        System.out.println(result);
    }
}
