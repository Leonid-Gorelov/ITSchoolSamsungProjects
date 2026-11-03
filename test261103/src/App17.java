public class App17 {
    public static void main(String[] args) {
//        long x = Integer.MAX_VALUE;
//
//        System.out.println(x + 1 > x);

        int d = 0;
        int previousD = 0;
        while (d < 10000000000000000L && d <= Integer.MAX_VALUE) {
            previousD = d;
            d++;

            if (previousD == d) {
                System.out.println("ERR");
                break;
            }

            if (d > 0 && d < 5000000000000000L) d *= 2;
            System.out.println(d);
        }
        System.out.println((long) d);
    }
}
