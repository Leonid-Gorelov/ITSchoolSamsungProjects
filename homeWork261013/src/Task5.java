import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int tempNumber = number;
        int digitsCount = 0;

        while (tempNumber > 0) {
            tempNumber >>= 1;
            ++digitsCount;
        }

        System.out.println(digitsCount);
    }
}
