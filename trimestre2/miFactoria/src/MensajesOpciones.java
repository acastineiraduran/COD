/**
 * clase que responde a las opciones seleccionadas por el usuario
 *
 * @author acastineiraduran
 * @version 14/03/23
 */
public class MensajesOpciones {
    /**
     * mensajes que confirma en el balaje de tipo carton
     */
    final static String MENSAJE_CARTON = "El tipo de embalaje sera una caja de carton";
    /**
     * mensajes que confirma en el balaje de tipo madera
     */
    final static String MENSAJE_MADERA = "El tipo de embalaje sera una caja de madera";
    /**
     * mensajes que confirma en el balaje de tipo palet
     */
    final static String MENSAJE_PALET = "El tipo de embalaje sera un palet";
    /**
     * mensaje de error por haber introducido incorrectamente la opcion de transporte
     */
    final static String MENSAJE_ERROR_EMBALAJE = "**ERROR: TRANSPORTE NO VALIDOS**";
    /**
     * mensaje de error por haber introducido incorrectamente parametros
     */
    final static String MENSAJE_ERROR_PRECIO = "**ERROR: PARAMETROS NO VALIDOS**";

    public static String responderPrecio(Float precioCorrespondiente){
        if(precioCorrespondiente != null)
            return "El importe total sera de " + precioCorrespondiente +  "€";
        else
            return MENSAJE_ERROR_PRECIO;
    }

    /**
     * Devuelve el mensaje adecuado para la opcion escogida
     *
     * @param embalajeCorrepondiente tipo de embalaje que recibe
     * @return mensaje error si el objecto Integer no coincide con ninguno o le mensaje
     * de ese tipo de embalaje si coincide con el mismo
     */
    public static String responderEmbalaje(Integer embalajeCorrepondiente){
        if(embalajeCorrepondiente == null)
            return MENSAJE_ERROR_EMBALAJE;
        else if(embalajeCorrepondiente == ITransporte.CAJA_CARTON)
            return MENSAJE_CARTON;
        else if(embalajeCorrepondiente == ITransporte.CAJA_MADERA)
            return MENSAJE_MADERA;
        else if(embalajeCorrepondiente == ITransporte.PALET)
            return MENSAJE_PALET;
        else
            return MENSAJE_ERROR_EMBALAJE;

    }
}
