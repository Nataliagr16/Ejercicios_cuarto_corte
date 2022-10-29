package Figuras_Geometricas_abs;

public class Fig_geo_main {

    public static void main(String[] args){

        Circulo cir = new Circulo(5);
        System.out.println(
                "Área del círculo: " + cir.area() + "\n" +
                "Perímetro del círculo: " + cir.perimetro() );

        Rectangulo rec = new Rectangulo(3,6);
        System.out.println(
                "Área del rectángulo: " + rec.area() + "\n" +
                "Perímetro del rectángulo: " + rec.perimetro() );

        Cuadrado cuad = new Cuadrado(9);
        System.out.println(
                "Área del cuadrado: " + cuad.area() + "\n" +
                "Perímetro del cuadrado: " + cuad.perimetro() );

        Triangulo_Rectangulo t_rec = new Triangulo_Rectangulo(3.6, 9.4);
        System.out.println(
                "Área del triángulo rectángulo: " + t_rec.area() + "\n" +
                "Perímetro del triángulo rectángulo: " + t_rec.perimetro() + "\n" +
                "Hipotenusa del triángulo rectángulo: " + t_rec.hipotenusa() );
    }
}
