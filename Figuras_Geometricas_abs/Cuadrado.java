package Figuras_Geometricas_abs;

public class Cuadrado extends Figuras_Geometricas{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public double area() {
        return Math.pow(lado,2);
    }
}
