package Figuras_Geometricas_abs;

public class Triangulo_Rectangulo extends Rectangulo {

    public Triangulo_Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double hipotenusa() {
        double hipot = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return hipot;
    }

    @Override
    public double perimetro() {
        return base + altura + hipotenusa();
    }

    @Override
    public double area(){
        return base * altura / 2;
    }
}
