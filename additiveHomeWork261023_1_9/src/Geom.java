import java.util.Scanner;

public class Geom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        System.out.println(trianglePerimetr(x1, y1, x2, y2, x3, y3));
    }

    public static double segmentLength(long x1, long y1, long x2, long y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x1, y1, x3, y3);
    }
}
