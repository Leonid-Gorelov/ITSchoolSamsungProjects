import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lastNumber = input.nextInt();
        int startFistSort = input.nextInt();
        int finishFistSort = input.nextInt();
        int startSecondSort = input.nextInt();
        int finishSecondSort = input.nextInt();
        int[] numbers = new int[lastNumber];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = startFistSort - 1, j = finishFistSort - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = startSecondSort - 1, j = finishSecondSort - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
