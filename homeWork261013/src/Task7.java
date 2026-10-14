import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int count = 0;

        while (tempNumber > 0) {
            ++count;
            tempNumber /= 10;
        }

        System.out.println(count);
    }
}
