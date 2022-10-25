package TiendaMascotas;

public class Mascotas {
    String nombre, color;
    int edad;

    public Mascotas(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public void verDatos(){
    }

    public void setNombre(String nombre1){
        this.nombre = nombre1;
    }

    public void setColor(String color1){
        this.color = color1;
    }

    public void setEdad(int edad1){
        this.edad = edad1;
    }
}
