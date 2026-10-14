import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();
        boolean resultForNumberOne = numberOne == -numberTwo || numberOne == -numberThree || numberOne == -numberFour;
        boolean resultForNumberTwo = numberTwo == -numberOne || numberTwo == -numberThree || numberTwo == -numberFour;
        boolean resultForNumberThree = numberThree == -numberOne || numberThree == -numberTwo || numberThree == -numberFour;
        boolean resultForNumberFour = numberFour == -numberOne || numberFour == -numberTwo || numberFour == -numberThree;
        boolean result = resultForNumberOne || resultForNumberTwo || resultForNumberThree || resultForNumberFour;

        System.out.println(result);
    }
}
