public class App5 {
    public static void main(String[] args) {
        boolean a = true, b = true;
        int c = 1;

        if (!a)
            c = c;
        else if (!b)
            c = c;
        else
            c = 0;

        System.out.println(c);
    }
}
