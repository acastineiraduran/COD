

import javax.swing.JOptionPane;

/**
 * Todos los metodos de la clase main.
 *
 * @author casty
 * @version 23/11/2022
 */
public class Metodos {
    /**
     * introducir un numero por teclado
     */
    public int numeroIntroducido;
    /**
     * mensaje en consola 1
     */
    public static final String MENSAJE_CONSOLA = "Numero fuera de rango, volver a introducirlo";
    /**
     * mensaje en consola 2
     */
    public static final String MENSAJE_FUERA_RANGO = "Numero dentro del rango";
    /**
     * mensaje en consola 3
     */
    public final String MENSAJE_CORRECTO = "El numero introducir es correcto";
    /**
     * mensaje en consola 4
     */
    public final String MENSAJE_ACABASTE_INTENTOS = "Se han acabado el numero de intentos posibles";

    /**
     * constructor por defecto
     */
    public Metodos(){

    }
    /**
     *Te pide numeros enteros.
     * @param mensaje: mensaje introducido por consola.
     * @return numeros
     */
    public int pedirEnteros(String mensaje) {
        this.numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numeroIntroducido;
    }

    /**
     * Si tu numero está entre esos numeros, te mete en un bucle.
     */
    public void merterEnRango(){
        /*este metodo no recibe recibe parametro ni da nada, esto realmente no sería un metodo,
        realmente es una funcion pero hacemos el ejemplo igual
         */
        while(this.numeroIntroducido < 1 || this.numeroIntroducido > 50){
            pedirEnteros(MENSAJE_CONSOLA);
        }
        System.out.println(MENSAJE_FUERA_RANGO);
    }

    /**
     * Te saca del programa si cumple unas condiciones.
     * @param numeroCorrecto: numero que sale del bucle.
     */
    public void salirPrograma(int numeroCorrecto){
        if(this.numeroIntroducido == numeroCorrecto){
            System.out.println(MENSAJE_CORRECTO);
        }
        else{
            System.out.println(MENSAJE_ACABASTE_INTENTOS);
        }

    }


}