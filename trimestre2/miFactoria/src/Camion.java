/**
 * Es que instancia un objecto que corresponde al tipo de transpote coche con caracteristicas
 *
 * @author acastineiraduran
 * @version 14/03/23
 */
public class Camion implements ITransporte {
    /**
     * codigo postal minimo posible en Espanha
     */
    Integer cpMinEsp = 0;
    /**
     * postal maximo posible dentro de Espanha
     */
    Integer cpMaxEsp = 9999;
    /**
     * precio correspondiente dentro de Espanha
     */
    Float precioDentroEsp = 4.99f;
    /**
     * precio correspondiente si es fuera de Espanha
     */
    Float precioFueraEsp = 14.99f;
    /**
     * peso minimo aceptado del paquete
     */
    Float pesoMin = 0.5f;
    /**
     * peso maximo permitido de un paquete pequenho
     */
    Float pesoPocoMax = 5f;
    /**
     * peso maximo admitido para un paquete mediano
     */
    Float pesoMedioMax = 20f;
    /**
     * peso maximo adminito para un paquete grande
     */
    Float pesoMuchoMax = 50f;

    /**
     * metodo que calcula el precio correspondiente de un objeto <code>camion</code> en vale al codigo postal
     *
     * @param cp codigo postal del usuario
     * @return precio correspondiente
     */
    @Override
    public Float costeTotal(Integer cp) {
        if(cp >= cpMinEsp && cp <= cpMaxEsp)
            return this.precioDentroEsp;
        else if(cp < cpMaxEsp)
            return this.precioFueraEsp;
        else
            return null;
    }

    /**
     * calcula el tipo de embalaje correspondiente a los argumentos proporcionados
     *
     * @param x dimension de largo
     * @param y dimension de alto
     * @param z dimension de ancho
     * @param peso del paquete
     * @return el tipo de embalaje que le corresponde
     */
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if(peso >= pesoMin && peso < pesoPocoMax)
            return CAJA_CARTON;
        else if(peso >= pesoPocoMax && peso < pesoMedioMax)
            return CAJA_MADERA;
        else if(peso >= pesoMedioMax && peso < pesoMuchoMax)
            return PALET;
        else
            return null;
    }
}
