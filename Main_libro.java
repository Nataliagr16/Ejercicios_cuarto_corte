package Ejercicios_cuarto_corte;
import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main_libro {
    public static void main(String[] args) {
        String nombre, autor, curse, facu, tipo, novel;
        double valor;
        // Para novelas o textos narrativos:

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        autor = input.nextLine();
        System.out.println("Ingrese el precio del libro: ");
        valor = input.nextDouble();
        input.nextLine();
        System.out.println("Indique si el libro es de texto o novela: ");
        tipo = input.nextLine();


        if (Objects.equals(tipo, "novela")) {
            System.out.println("indique a qué género de novela pertenece el libro: ");
            novel = input.nextLine();
            Novela libro_1 = new Novela(nombre, autor, valor, novel);
            libro_1.imprimir();
        } else {
            System.out.println("Ingrese el curso al cual está asociado el libro: ");
            curse = input.nextLine();
            System.out.println("Ingrese la facultad que publicó el libro: ");
            facu = input.nextLine();
            Libro_texto_unal libro_2 = new Libro_texto_unal(nombre, autor, valor, curse, facu);
            libro_2.imprimir();
        }
    }
}
