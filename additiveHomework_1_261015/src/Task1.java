import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        String result = "";

        while (tempNumber > 0) {
            result += tempNumber % 2;
            tempNumber /= 2;
        }

        System.out.println(result);
    }
}
