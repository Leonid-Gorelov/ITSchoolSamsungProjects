import java.util.Scanner;

public class App15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int uniqueNumbers = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] != numbers[i]) {
                uniqueNumbers++;
            }
        }

        System.out.println(uniqueNumbers);
    }
}
