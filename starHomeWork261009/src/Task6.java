import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int count = 0;

        while (number > 1) {
            ++count;
            number >>= 1;
        }

        int result = number << count;

        if (number == 1 && tempNumber == result) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
