package TiendaMascotas;

import javax.swing.*;

public class Perros extends Mascotas {

    double peso;
    boolean muerde;

    public Perros(String nombre, String color, int edad, double peso, boolean muerde) {
        super(nombre, color, edad);
        this.peso = peso;
        this.muerde = false;
    }
    public void sonido(){
        JOptionPane.showMessageDialog(null,"Los perros ladran!","Sonido de los perros",1);
    }

    public void morder(String respuesta){
        if(respuesta.equals(true)){
            muerde = true;
        }else{
            muerde = false;
        }
    }

}
