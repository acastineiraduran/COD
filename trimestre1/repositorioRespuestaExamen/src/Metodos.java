/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 * Metodos
 * version1.0
 * 16/11/22
 * Copy notice?
 */
public class Metodos {
    int numeroIntroducido;
    public static final String MENSAJE_CONSOLA = "Numero fuera de rango, volver a introducirlo";
    public static final String MENSAJE_FUERA_RANGO = "Numero dentro del rango";
    public final String MENSAJE_CORRECTO = "El numero introducir es correcto";
    public final String MENSAJE_ACABASTE_INTENTOS = "Se han acabado el numero de intentos posibles";

    public int pedirEnteros(String mensaje) {
        this.numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numeroIntroducido;
    }

    public void merterEnRango(){

        while(this.numeroIntroducido < 1 || this.numeroIntroducido > 50){
            pedirEnteros(MENSAJE_CONSOLA);
        }
        System.out.println(MENSAJE_FUERA_RANGO);
    }

    public void salirPrograma(int numeroCorrecto){
        if(this.numeroIntroducido == numeroCorrecto){
            System.out.println(MENSAJE_CORRECTO);
        }
        else{
            System.out.println(MENSAJE_ACABASTE_INTENTOS);
        }

    }


}