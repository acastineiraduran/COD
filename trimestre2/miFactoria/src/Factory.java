/**
 * crea los objetos de distintos tipos dependiendo de la opcion escogida
 *
 * @author acastineiraduran
 * @version 14/03/23
 */
public class Factory {
    /**
     * numero que se asocia al tipo de transporte: bicicleta
     */
    static final int BICICLETA = 0;
    /**
     * numero que se asocia al tipo de transporte: camion
     */
    static final int CAMION = 1;
    /**
     * mensaje que informa de que la opcion escogida es incorrecta
     */
    static final String MENSAJE_ERROR= "**ERROR: OPCION TRANSPORTE NO VALIDA**";

    /**
     * crea el objeto del tipo de transporte: bicicleta o camion, segun el parametro introducido. Si no corresponde
     * a ninguno devuelve nulo para luego tratarlo como error
     *
     * @param type que es el numero que da el usuario para escoger el tipo de transporte
     * @return objetos de distintos tipos (o nulo) segun la opcion seleccionada
     */

    public ITransporte crearTransporte(int type) {
        switch(type) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            default:
                return null;
        }
    }

}
