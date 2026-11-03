public class App4 {
    public static void main(String[] args) {
        int x = 11;

        if(!(x > 0 && x < 5) || x > 10){
            System.out.println(true);
            return;
        }

        System.out.println(false);
    }
}
