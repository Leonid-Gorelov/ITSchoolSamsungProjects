import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int maxNumber;

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            maxNumber = numberOne;
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            maxNumber = numberTwo;
        } else {
            maxNumber = numberThree;
        }

        System.out.println(maxNumber);
    }
}
