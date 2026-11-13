import java.util.Locale;

public class Vector2D {
    public double x;
    public double y;
    public static int count;

    public Vector2D() {
        x = 1;
        y = 1;

        ++count;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;

        ++count;
    }

    public Vector2D(Vector2D vector2D) {
        this(vector2D.x, vector2D.y);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public void add(Vector2D v) {
        x += v.x;
        y += v.y;
    }

    public void sub(Vector2D v) {
        x -= v.x;
        y -= v.y;
    }

    public void scale(double scaleFactor) {
        x *= scaleFactor;
        y *= scaleFactor;
    }

    public void normalized() {
        double length = length();

        x /= length;
        y /= length;
    }

    public double dotProduct(Vector2D v){
        return x * v.y + y * v.x;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", x) + ", " + String.format(Locale.US, "%.2f", y) + ")");
    }
}
