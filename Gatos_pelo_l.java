package TiendaMascotas;

import javax.swing.*;

public class Gatos_pelo_l extends Gatos{

    String raza_pelo_l;

    public Gatos_pelo_l(String nombre, String color, int edad, double altura, double longitud, String raza_pelo_l) {
        super(nombre, color, edad, altura, longitud);
        this.raza_pelo_l = raza_pelo_l;
    }

    public void setRaza_pelo_l(String raza_pelo_l1){
        raza_pelo_l = raza_pelo_l1;
    }

    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nColor: " + color + "\nEdad: " + edad
                + "\nAltura de salto: " + altura + "\nLongitud de salto: " + longitud + "\nRaza: " + raza_pelo_l,
                "Información mascota", 1);

    }
}
