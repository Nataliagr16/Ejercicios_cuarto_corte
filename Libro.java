package Ejercicios_cuarto_corte;
import javax.swing.*;
public class Libro {
    public String titulo, autor, texto;
    public double precio;

    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.texto = texto;
    }

     public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public double getPrecio(){
        return precio;
    }

    public void setTitulo(String titulo1){
        this.titulo = titulo1;
    }

    public void setAutor(String autor1){
        this.autor = autor1;
    }

    public void setPrecio(double precio1){
        this.precio = precio1;
    }
    public void imprimir(){
    }
}
