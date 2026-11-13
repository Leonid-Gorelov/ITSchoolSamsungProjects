public class Main {
    public static void main(String[] args) {
        System.out.println(new Fraction(6, 8));
        System.out.println(new Fraction(3, -4));
        System.out.println(new Fraction(-3, -4));
        System.out.println(new Fraction(0, 5));
        System.out.println(new Fraction(5, 0));

        System.out.println("---\n");

        Fraction fraction1 = new Fraction(1, 2);
        fraction1.setNumerator(4);
        System.out.println(fraction1);

        Fraction fraction2 = new Fraction(3, 4);
        fraction2.setDenominator(-6);
        System.out.println(fraction2);

        Fraction fraction3 = new Fraction(3, 4);
        fraction3.setDenominator(0);
        System.out.println(fraction3);

        System.out.println("---\n");

        System.out.println(new Fraction(3, 4).properFraction());
        System.out.println(new Fraction(-5, 4).properFraction());
        System.out.println(new Fraction(7, 3).getIntegerPart());
        System.out.println(new Fraction(-7, 3).getIntegerPart());
        System.out.println(new Fraction(7, 3).fractionalPart());
        System.out.println(new Fraction(-7, 3).fractionalPart());
        System.out.println(new Fraction(1, 4).toDecimalFractions());

        System.out.println("---\n");

        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        System.out.println(a.sumFractionTo(b) + " " + Fraction.sumFraction(a, b));
        System.out.println(new Fraction(1, 4).sumFractionTo(new Fraction(1, 4)));
        System.out.println(a.subFractionTo(b) + " " + Fraction.subFraction(a, b));
        System.out.println(b.subFractionTo(a) + " " + Fraction.subFraction(b, a));
        System.out.println(a.multFractionTo(b) + " " + Fraction.multFraction(a, b));
        System.out.println(new Fraction(2, 3).multFractionTo(new Fraction(3, 4)));
        System.out.println(a.divFractionTo(b) + " " + Fraction.divFraction(a, b));
        System.out.println(a.divFractionTo(new Fraction(-1, 3)));
        System.out.println(a.divFractionTo(new Fraction(0, 1)));
    }
}
