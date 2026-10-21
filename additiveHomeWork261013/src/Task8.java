import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        int stepen = input.nextInt();

        if (stepen % 2 == 0) {
            int currentStep = 0;
            double numberInStepen = 1;

            while (currentStep < stepen / 2) {
                numberInStepen *= number;
                ++currentStep;
            }

            System.out.println(numberInStepen * numberInStepen);
        } else {
            int currentStep = 0;
            double numberInStepen = 1;

            if (stepen == 1) {
                System.out.println(number);
                return;
            }

            while (currentStep < stepen - 1) {
                numberInStepen *= number;
                ++currentStep;
            }

            System.out.println(number * numberInStepen);
        }
    }
}
