import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[][] numbers = new int[length][length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i][numbers.length - i - 1] = 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 1) {
                    continue;
                }
                if (j > numbers.length - i - 1) {
                    numbers[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}
