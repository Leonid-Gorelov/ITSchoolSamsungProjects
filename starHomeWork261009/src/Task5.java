import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = input.nextInt();

        a &= (1 << i) - 1;

        System.out.println(a);
    }
}
