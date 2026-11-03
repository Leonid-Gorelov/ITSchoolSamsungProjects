public class App7 {
    public static void main(String[] args) {
        int x = 101, c = 0;

        do {
            if (x < 100) {
                c++;
                x++;
            }
        } while (x < 100);

        System.out.println(x);
    }
}
