package TiendaMascotas;

public class Main {
    public static void main(String[] args){

        //Perros
        Perros_gran perro_1 = new Perros_gran("Pluto","Negro",3,11.3,false,"Doberman");
        perro_1.verDatos();
        perro_1.sonido();

        Perros_peq perro_2 = new Perros_peq("Dulce","Café",1,3,false,"Chihuahua");
        perro_2.verDatos();
        perro_2.sonido();

        //Gatos
        Gatos_pelo_l gato_1 = new Gatos_pelo_l("Kafka","Negro con manchas blancas",4,40.5,34.8,"Angora");
        gato_1.verDatos();
        gato_1.sonido();

        Gatos_sin gato_2 = new Gatos_sin("Orión","Blanco",6,37.2,33,"Esfinge");
        gato_2.verDatos();
        gato_2.sonido();

    }
}
