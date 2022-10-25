package TiendaMascotas;

import javax.swing.*;

public class Perros_peq extends Perros{
    String raza_peq;

    public Perros_peq(String nombre, String color, int edad, double peso, boolean muerde, String raza_peq) {
        super(nombre, color, edad, peso, muerde);
        this.raza_peq = raza_peq;
    }

    public void setRaza(String raza_peq1){
        this.raza_peq = raza_peq1;
    }

    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\nColor: "+color+"\nEdad: "+edad
        + "\nPeso: "+peso+"\nMuerde: "+muerde+"\nRaza: "+raza_peq,"Información mascota",1);

    }

}
