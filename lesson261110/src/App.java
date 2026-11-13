public class App {
    public static void main(String[] args) {
        Unit unit1 = new Unit(100, "Ivan");
        Unit unit2 = new Unit(150, "Aleksandr");

        unit1.showInfo();
        System.out.println(unit2.getHp());

        Unit unit3 = unit1;
        Unit unit4 = new Unit(unit1);

        //System.out.println(Integer.MAX_VALUE);
    }
}
