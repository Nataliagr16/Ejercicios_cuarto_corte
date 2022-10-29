public class Fraccion extends Numerica {

    double a,b;

    public Fraccion(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        String c = String.valueOf(a);
        return c;
    }

    @Override
    public boolean equals() {
        return a == b;
    }

    @Override
    public double NumericaRestar() {
        return a - b;
    }

    @Override
    public double NumericaSumar() {
        return a + b;
    }

    @Override
    public double NumericaMultiplicar() {
        return a * b;
    }

    @Override
    public double NumericaDividir() {
        return a / b;
    }
}