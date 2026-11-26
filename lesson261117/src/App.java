public class App {
    public static void main(String[] args) {
        String string1 = "qwer";
        String string2 = new String("qwer");
        String string3 = "qwer";

//        System.out.println(string1.equals(string2));
//
//        Unit unit1 = new Unit(100, "Name1");
//        Unit unit2 = new Unit(100, "Name1");
//
//        System.out.println(unit1.equals(unit2));
//        System.out.println(unit1);

        StringBuffer stringBuffer = new StringBuffer(string1);

        for (int i = 0; i < 10; i++) {
            stringBuffer.append(i);
        }

        System.out.println(stringBuffer);
    }
}
