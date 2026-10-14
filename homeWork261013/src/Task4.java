import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int delimoe = input.nextInt();
        int divider = input.nextInt();
        int chastnoe = 0;
        int ostatok = delimoe;
        int tempDelimoe = delimoe;

        if (delimoe > divider) {
            while (tempDelimoe > 0) {
                ++chastnoe;
                tempDelimoe -= divider;
            }

            if (tempDelimoe < 0) {
                --chastnoe;
            }
        }

        ostatok = delimoe - divider * chastnoe;

        System.out.println(chastnoe + " " + ostatok);
    }
}
