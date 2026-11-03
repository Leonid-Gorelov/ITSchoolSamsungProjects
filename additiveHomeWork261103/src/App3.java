import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startNumber = input.nextInt();
        int endNumber = input.nextInt();
        boolean isPrinted = false;

        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {
            boolean isEasyNumber = true;

            for (int divider = 2; divider < currentNumber; divider++) {
                if (currentNumber % divider == 0) {
                    isEasyNumber = false;
                    break;
                }
            }

            if (isEasyNumber) {
                isPrinted = true;
                System.out.print(currentNumber + " ");
            }
        }

        if (!isPrinted) {
            System.out.println(0);
        }
    }
}
