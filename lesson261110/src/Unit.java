public class Unit {
    private int hp;
    private String name;

    public Unit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Unit name - " + name);
        System.out.println("Hp - " + hp);
    }

    public int getHp() {
        return hp;
    }
}
