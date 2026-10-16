import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        int numberToFind = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("NO");
    }
}
