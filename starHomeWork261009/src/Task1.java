import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = input.nextInt();

        a >>>= i;
        a <<= i;

        System.out.println(a);
    }
}