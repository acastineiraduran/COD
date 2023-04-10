/**
 * Clase Main
 *
 * @author casty
 * @version 23.11.2022
 */
public class Main {

    /**
     * metodo principal
     *
     * @param args: sentencias que ejecutan codigo
     */
    public static void main(String[] args) {
        
        /**
         * Mensaje superacion de intentos 
         */
        final String MENSAJE_MAX_INTENTOS = "Tienes 10 intentos";
        /**
         * Mensaje introducir numero del rango
         */
        final String MENSAJE_INTRODUCIR_NUM = "Introduce un numero del 1 al 50";
        
        /**
         * Creacion objeto de tipo Metodos
         */
        Metodos obx = new Metodos();
        System.out.println(MENSAJE_MAX_INTENTOS);
        
        /**
         * Intento incial, máximos y respuesta correcta
         */
        int i = 0;
        int numeroMaxIntentos = 10;
        int numeroCorrecto = 3;
        
        /**
         * Metodo que te devuelve si el numero que has escogido es el correcto utilizando los metodos disponibles
         * y respetando las variables declaradas
         */
        do {
            i++;
            obx.pedirEnteros(MENSAJE_INTRODUCIR_NUM);

            //si esta fuera del rango entra en este bucle
            obx.merterEnRango();

        } while (i <= numeroMaxIntentos && obx.numeroIntroducido != numeroCorrecto);

        obx.salirPrograma(numeroCorrecto);

    }

}
