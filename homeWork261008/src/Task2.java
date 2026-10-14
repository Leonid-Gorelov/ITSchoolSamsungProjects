import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (numberOne <= numberTwo && numberOne <= numberThree) {
            System.out.print(numberOne + " ");
        } else if (numberTwo <= numberThree && numberTwo <= numberOne) {
            System.out.print(numberTwo + " ");
        } else {
            System.out.print(numberThree + " ");
        }


        if ((numberOne <= numberTwo && numberOne >= numberThree) ||
                (numberOne <= numberThree && numberOne >= numberTwo)) {
            System.out.print(numberOne + " ");
        } else if ((numberTwo <= numberOne && numberTwo >= numberThree) ||
                (numberTwo <= numberThree && numberTwo >= numberOne)) {
            System.out.print(numberTwo + " ");
        } else {
            System.out.print(numberThree + " ");
        }

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.print(numberOne);
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.print(numberTwo);
        } else {
            System.out.print(numberThree);
        }
    }
}
