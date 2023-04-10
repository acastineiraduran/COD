/**
 * interfaz que contiene los metodos comunes y atributos a todos los productos que implementen la misma
 *
 * @author acastineiraduran
 * @version 14/03/23
 */
public interface ITransporte {
    /**
     * opcion de embalaje en palet
     */
    int PALET = 0;
    /**
     * opcion de embalaje en caja de carton
     */
    int CAJA_CARTON = 1;
    /**
     * opcion de embalaje en caja de madera
     */
    int CAJA_MADERA = 2;

    /**
     * Metodo comun que realiza los costes del transporte en cuestion
     *
     * @param cp codigo postal del usuario
     * @return el coste del transporte
     */

    Float costeTotal(Integer cp);

    /**
     *  Metodo que definira el tipo de embalaje que le corresponde a partir de los parametros dados
     *
     * @param x dimension de largo
     * @param y dimension de alto
     * @param z dimension de ancho
     * @param peso del paquete
     * @return tipo de embalaje necesitado
     */
    Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);
}
