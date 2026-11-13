public class App {
    public static void main(String[] args) {
//        Vector2D v = new Vector2D(1.2374, 2.2334);
//        Vector2D v2 = new Vector2D();
//        Vector2D v3 = new Vector2D(v);
//        v.print();
//        v2.print();
//        v3.print();

//        Vector2D vA = new Vector2D();
//        Vector2D vB = new Vector2D(1.0, 3.0);
//        Vector2D vC = new Vector2D(vB);
//        vA.add(vB);
//        vA.print();
//        vA.sub(vC);
//        vA.print();
//        System.out.println(vB.length());
//        vC.scale(2);
//        vC.print();

        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}
