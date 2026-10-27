import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length1 = input.nextInt();
        int length2 = input.nextInt();
        int[][] a = new int[length1][length2];
        int indexX = 0;

        for (int i = 0; i < a.length; i++) {
            a[i][indexX] = i * indexX;
            ++indexX;

            if (indexX >= length2) {
                indexX = 0;
            } else {
                --i;
            }
        }

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + "\t");
//            }
//
//            System.out.println();
//        }
    }
}
