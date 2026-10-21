import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int difference = count + 1;
        int maxValue = count * count;

        for (int i = 1; i <= maxValue; i += difference) {
            System.out.print(i + " ");
        }
    }
}
