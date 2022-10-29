package Figuras_Geometricas_abs;

public class Circulo extends Figuras_Geometricas {
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
}
