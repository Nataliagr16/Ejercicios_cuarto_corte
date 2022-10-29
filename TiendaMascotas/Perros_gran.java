package TiendaMascotas;

import javax.swing.*;

public class Perros_gran extends Perros {
    String raza_gran;


    public Perros_gran(String nombre, String color, int edad, double peso, boolean muerde, String raza_gran) {
        super(nombre, color, edad, peso, muerde);
        this.raza_gran = raza_gran;
    }

    public void setRaza(String raza_gran1) {
        this.raza_gran = raza_gran1;
    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nColor: " + color + "\nEdad: " + edad
                + "\nPeso: " + peso + "\nMuerde: " + muerde + "\nRaza: " + raza_gran, "Información mascota", 1);

    }
}
