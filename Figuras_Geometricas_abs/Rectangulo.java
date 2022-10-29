package Figuras_Geometricas_abs;

public class Rectangulo extends Figuras_Geometricas{
    double base, altura;

    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double area() {
        return base * altura;
    }
}
