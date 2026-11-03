import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int count = 0;

        for (; numberOne != 0 && numberTwo != 0; count++) {
            if (numberOne > numberTwo) {
                numberOne -= numberTwo;
            } else {
                numberTwo -= numberOne;
            }
        }

        System.out.println(numberOne == 0 ? numberTwo : numberOne + " " + count);
    }
}
