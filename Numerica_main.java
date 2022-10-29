public class Numerica_main {

    public static void main(String[] args){

        Fraccion operacion = new Fraccion(36,96);
        System.out.println(
                "Suma: " + operacion.NumericaSumar() + "\n" +
                "Multiplicación: " + operacion.NumericaMultiplicar() + "\n" +
                "Resta: " + operacion.NumericaRestar() + "\n" +
                "División: " + operacion.NumericaDividir()  + "\n" +
                "Comparación de igualdad: " + operacion.equals() + "\n" +
                "Double a String: " + operacion.toString() );
    }
}
