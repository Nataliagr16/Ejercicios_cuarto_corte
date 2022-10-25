package TiendaMascotas;

import javax.swing.*;

public class Gatos extends Mascotas {

    double altura, longitud;

    public Gatos(String nombre, String color, int edad, double altura, double longitud) {
        super(nombre, color, edad);
        this.altura = altura;
        this.longitud = longitud;
    }

    public void sonido() {
        JOptionPane.showMessageDialog(null, "Los gatos maúllan y ronronean", "Sonido de los gatos", 1);
    }

    public void setAltura(double altura1){
        altura = altura1;
    }

    public void setLongitud(double longitud1){
        longitud = longitud1;
    }
}
