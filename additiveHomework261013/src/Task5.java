import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbeer = input.nextInt();
        int tempNumber = numbeer;
        int summary = 0;

        while (tempNumber > 0) {
            summary += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println(summary);
    }
}
