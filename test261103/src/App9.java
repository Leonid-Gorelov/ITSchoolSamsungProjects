public class App9 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 300) {
            if (i > 100) {
                continue;
            }

            i++;

            System.out.println(i);
        }

        System.out.println(i);
    }
}
