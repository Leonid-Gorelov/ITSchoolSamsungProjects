import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;

        while (tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            int preLastDigit = tempNumber % 100 / 10;

            if (lastDigit == preLastDigit) {
                System.out.println("YES");
                return;
            }

            tempNumber /= 10;
        }

        System.out.println("NO");
    }
}
