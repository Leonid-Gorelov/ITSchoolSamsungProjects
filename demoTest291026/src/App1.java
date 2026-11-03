public class App1 {
    public static void main(String[] args) {
        double  d  = .0;

        while (d < 10000000000000000L) {
            d++;
            System.out.println((long) d);
        }
        System.out.println("Result" + (long) d);
    }
}
