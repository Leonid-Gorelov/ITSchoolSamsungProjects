import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = input.nextInt();

        a ^= 1 << i;
        System.out.println(a);
    }
}
