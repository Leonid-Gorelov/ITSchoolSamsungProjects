public class App1 {
    public static void main(String[] args) {
        double d = .0;
        double previousD = .0;
        while (d < 10000000000000000L) {
            previousD = d;
            d++;

            if (previousD == d) {
                System.out.println("TL");
                break;
            }

            if (d > 0 && d < 5000000000000000L) d *= 2;
        }
        System.out.println((long) d);
    }
}
