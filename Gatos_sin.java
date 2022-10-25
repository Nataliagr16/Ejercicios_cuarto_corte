package TiendaMascotas;

import javax.swing.*;

public class Gatos_sin extends Gatos {

    String raza_sin;

    public Gatos_sin(String nombre, String color, int edad, double altura, double longitud, String raza_sin) {
        super(nombre, color, edad, altura, longitud);
        this.raza_sin = raza_sin;
    }

    public void setRaza(String raza_sin1){
        raza_sin = raza_sin1;
    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nColor: " + color + "\nEdad: " + edad
                + "\nAltura de salto: " + altura + "\nLongitud de salto: " + longitud + "\nRaza: " + raza_sin, "Información mascota", 1);
    }
    }
