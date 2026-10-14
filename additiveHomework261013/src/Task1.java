import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int busHeight = 437;
        int mostsCount = input.nextInt();
        int currentMost = 0;

        while (currentMost < mostsCount) {
            int mostHeight = input.nextInt();

            if (mostHeight <= busHeight) {
                System.out.println("Crash " + (currentMost + 1));
                return;
            }

            ++currentMost;
        }

        System.out.println("No crash");
    }
}
