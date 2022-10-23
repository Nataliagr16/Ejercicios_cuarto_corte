package Ejercicios_cuarto_corte;

import javax.swing.*;

public class Libro_texto extends Libro {

     String curso;

    public Libro_texto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public void setCurso(String curso1){
        this.curso = curso1;
    }

    public String getCurso(){
        return curso;
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Libro: "+getTitulo()+"\nAutor: "+getAutor()+
                "\nPrecio: "+getPrecio()+"\nCurso al que está asociado: "+getCurso(),"Información del libro",1);
    }





}
