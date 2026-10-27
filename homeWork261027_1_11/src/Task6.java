import java.util.Scanner;

public class Task6 {
    static int[][] numbers;
    static int j, i;
    static int currentNumber = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        numbers = new int[2 * n + 1][2 * n + 1];

        j = numbers.length / 2;
        i = numbers.length / 2;
        setNumber();

        int currentStep = 1;

        while (currentNumber < ((2 * n + 1) * (2 * n + 1))) {

            for (int k = 0; k < currentStep && currentNumber < ((2 * n + 1) * (2 * n + 1)); k++) {
                --i;
                setNumber();
            }

            for (int k = 0; k < currentStep && currentNumber < ((2 * n + 1) * (2 * n + 1)); k++) {
                --j;
                setNumber();
            }

            ++currentStep;

            for (int k = 0; k < currentStep && currentNumber < ((2 * n + 1) * (2 * n + 1)); k++) {
                ++i;
                setNumber();
            }

            for (int k = 0; k < currentStep && currentNumber < ((2 * n + 1) * (2 * n + 1)); k++) {
                ++j;
                setNumber();
            }

            ++currentStep;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(calculateSpaces(numbers[i][j]) + numbers[i][j]);
            }

            System.out.println();
        }
    }

    public static void setNumber() {
        numbers[i][j] = currentNumber;
        ++currentNumber;
    }

    public static String calculateSpaces(int number) {
        if (number < 10) {
            return "  ";
        } else if (number < 99) {
            return " ";
        }

        return "";
    }
}
