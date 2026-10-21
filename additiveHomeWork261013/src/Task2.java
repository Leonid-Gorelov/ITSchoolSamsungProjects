import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int currentAction = 0;
        int result = 0;

        if (numberTwo > 0 && numberOne > 0) {
            while (currentAction < numberTwo) {
                result += numberOne;
                ++currentAction;
            }
        } else if (numberTwo < 0 && numberOne < 0) {
            while (currentAction > numberTwo) {
                result -= numberOne;
                --currentAction;
            }
        } else if (numberTwo > 0 && numberOne < 0) {
            while (currentAction < numberTwo) {
                result += numberOne;
                ++currentAction;
            }
        } else if (numberTwo < 0 && numberOne > 0) {
            while (currentAction > numberTwo) {
                result -= numberOne;
                --currentAction;
            }
        }

        System.out.println(result);
    }
}
