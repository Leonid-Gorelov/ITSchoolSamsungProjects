import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int maxNumber, mediumNumber, minNumber;

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            maxNumber = numberOne;
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            maxNumber = numberTwo;
        } else {
            maxNumber = numberThree;
        }

        if ((numberOne >= numberTwo && numberOne <= numberThree) || (numberOne >= numberThree && numberOne <= numberTwo)) {
            mediumNumber = numberOne;
        } else if ((numberTwo >= numberOne && numberTwo <= numberThree) || (numberTwo >= numberThree && numberTwo <= numberOne)) {
            mediumNumber = numberTwo;
        } else {
            mediumNumber = numberThree;
        }

        if (numberOne <= numberTwo && numberOne <= numberThree) {
            minNumber = numberOne;
        } else if (numberTwo <= numberOne && numberTwo <= numberThree) {
            minNumber = numberTwo;
        } else {
            minNumber = numberThree;
        }

        double cos = (mediumNumber * mediumNumber + minNumber * minNumber - maxNumber * maxNumber) * 1.0 / (2 * mediumNumber * minNumber);

        if (maxNumber >= mediumNumber + minNumber) {
            System.out.println("impossible");
        } else if (maxNumber * maxNumber == mediumNumber * mediumNumber + minNumber * minNumber) {
            System.out.println("right");
        } else if (cos > 0 && cos < 1) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}
