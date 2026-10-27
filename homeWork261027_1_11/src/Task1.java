import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length1 = input.nextInt();
        int length2 = input.nextInt();
        int[][] numbers = new int[length1][length2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextInt();
            }
        }

        int[][] numbers2 = new int[length2][length1];

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = numbers[j][i];
            }
        }

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length / 2; j++) {
                int temp = numbers2[i][numbers2[i].length - j - 1];
                numbers2[i][numbers2[i].length - j - 1] = numbers2[i][j];
                numbers2[i][j] = temp;
            }
        }

        System.out.println(length2 + " " + length1);

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.print(numbers2[i][j] + " ");
            }

            System.out.println();
        }
    }
}
