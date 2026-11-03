import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numberOne = input.nextDouble();

        input.next();

        double numberTwo = input.nextDouble();

        input.next();

        double numberThree = input.nextDouble();

        double result = numberOne + numberTwo + numberThree;

        System.out.println(result);
    }
}
