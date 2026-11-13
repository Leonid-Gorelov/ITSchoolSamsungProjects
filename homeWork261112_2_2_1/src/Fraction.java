public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }

        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);

        normalization();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;

        normalization();
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }

        if (denominator < 0) {
            this.numerator = -this.numerator;
        }

        this.denominator = Math.abs(denominator);

        normalization();
    }

    private int gcd(int numerator, int denominator) {
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }

        return numerator + denominator;
    }

    private void normalization() {
        int n = gcd(Math.abs(numerator), Math.abs(denominator));

        numerator /= n;
        denominator /= n;
    }

    public boolean properFraction() {
        return Math.abs(numerator) < denominator;
    }

    public int getIntegerPart() {
        return numerator / denominator;
    }

    public Fraction fractionalPart() {
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions() {
        return (double) numerator / denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

    public Fraction sumFractionTo(Fraction obj) {
        int newNumerator = this.numerator * obj.denominator + obj.numerator * this.denominator;
        int newDenominator = this.denominator * obj.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction sumFraction(Fraction obj1, Fraction obj2) {
        int newNumerator = obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator;
        int newDenominator = obj1.denominator * obj2.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subFractionTo(Fraction obj) {
        int newNumerator = this.numerator * obj.denominator - obj.numerator * this.denominator;
        int newDenominator = this.denominator * obj.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction subFraction(Fraction obj1, Fraction obj2) {
        int newNumerator = obj1.numerator * obj2.denominator - obj1.denominator * obj2.numerator;
        int newDenominator = obj1.denominator * obj2.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multFractionTo(Fraction obj) {
        int newNumerator = this.numerator * obj.numerator;
        int newDenominator = this.denominator * obj.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction multFraction(Fraction obj1, Fraction obj2) {
        int newNumerator = obj1.numerator * obj2.numerator;
        int newDenominator = obj1.denominator * obj2.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divFractionTo(Fraction obj) {
        int newNumerator = this.numerator * obj.denominator;
        int newDenominator = this.denominator * obj.numerator;

        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction divFraction(Fraction obj1, Fraction obj2) {
        int newNumerator = obj1.numerator * obj2.denominator;
        int newDenominator = obj1.denominator * obj2.numerator;

        return new Fraction(newNumerator, newDenominator);
    }
}
