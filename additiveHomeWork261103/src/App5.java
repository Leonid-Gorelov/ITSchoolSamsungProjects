import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInInput = 1;
        int count = 0;
        int maxNumber = Integer.MIN_VALUE;

        while (numberInInput != 0) {
            numberInInput = input.nextInt();

            if (numberInInput > maxNumber) {
                maxNumber = numberInInput;
                count = 1;
            } else if (maxNumber == numberInInput) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
