import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        boolean resultForNumberOne = numberOne % 2 == 0;
        boolean resultForNumberTwo = numberTwo % 2 == 0;
        boolean resultForNumberThree = numberThree % 2 == 0;
        boolean result = resultForNumberOne && resultForNumberTwo || resultForNumberOne && resultForNumberThree
                || resultForNumberTwo && resultForNumberThree;

        System.out.println(result);
    }
}
