package TiendaMascotas;

import javax.swing.*;

public class Perros_med extends Perros {
    String raza_med;

    public Perros_med(String nombre, String color, int edad, double peso, boolean muerde, String raza) {
        super(nombre, color, edad, peso, muerde);
        this.raza_med = raza;
    }

    public void setRaza(String raza_med1) {
        this.raza_med = raza_med1;
    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nColor: " + color + "\nEdad: " + edad
                + "\nPeso: " + peso + "\nMuerde: " + muerde + "\nRaza: " + raza_med, "Información mascota", 1);


    }
}
