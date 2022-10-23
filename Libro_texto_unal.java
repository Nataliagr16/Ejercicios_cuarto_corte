package Ejercicios_cuarto_corte;

import javax.swing.*;

public class Libro_texto_unal extends Libro_texto {

    String facultad;

    public Libro_texto_unal(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public void setFacultad(String fac) {
        this.facultad = fac;
    }

    public String getFacultad() {
        return facultad;
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Libro: " + getTitulo() + "\nAutor: " + getAutor() +
                    "\nPrecio: " + getPrecio() + "\nCurso al que está asociado: " + getCurso() +
                    "\nFacultad de la publicación: " + getFacultad(), "Información del libro", 1);

        }
    }


