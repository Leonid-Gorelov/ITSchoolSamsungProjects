import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int minNumberWhichNotDividedByTwo = 0;

        while (tempNumber > 0){
            int currentDigit = tempNumber % 10;
            if(currentDigit % 2 != 0 && currentDigit > minNumberWhichNotDividedByTwo){
                minNumberWhichNotDividedByTwo = currentDigit;
            }

            tempNumber /= 10;
        }

        System.out.println(minNumberWhichNotDividedByTwo == 0 ? "NO" : minNumberWhichNotDividedByTwo);
    }
}
