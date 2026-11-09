import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println((byte) number == number ? "YES" : "NO");
        System.out.println((short) number == number ? "YES" : "NO");
    }
}
