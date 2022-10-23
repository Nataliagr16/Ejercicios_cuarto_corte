package Ejercicios_cuarto_corte;

import javax.swing.*;

public class Novela extends Libro {

    public String tipo_novela;

    public Novela(String titulo, String autor, double precio, String tipo_novela) {
        super(titulo, autor, precio);
        this.tipo_novela = tipo_novela;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"Libro: "+getTitulo()+"\nAutor: "+getAutor()+
                "\nPrecio: "+getPrecio()+"\nTipo de novela: "+tipo_novela,"Información del libro",1);
    }
}
