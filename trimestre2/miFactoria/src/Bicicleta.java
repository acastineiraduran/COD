/**
 * Clase que instancia un objecto que corresponde al tipo de transpote: bicicleta.
 *
 * @author acastineiraduran
 * @version 14/03/23
 */
public class Bicicleta implements ITransporte {
    /**
     * codigo postal minimo posible en Galicia
     */
    Integer cpMinGalicia = 1000;
    /**
     * codigo postal maximo posible en Galicia
     */
    Integer cpMaxGalicia = 2000;
    /**
     * precio correspondiente dentro de Galicia
     */
    Float precioDentroGalicia = 1.99f;
    /**
     * precio correspondiente fuera de Galicia
     */
    Float precioFueraGalicia = 8.99f;
    /**
     * peso minimo aceptado del paquete
     */
    Float pesoMin = 0.1f;
    /**
     * peso maximo aceptado del paquete
     */
    Float pesoMax = 2f;

    /**
     * calcula el precio que le corresponde a ese codigo postal
     *
     * @param cp codigo postal del usuario
     * @return el precio correspondiente al tipo de cp
     */
    @Override
    public Float costeTotal(Integer cp) {
        if(cp >= cpMinGalicia && cp <= cpMaxGalicia)
            return precioDentroGalicia;
        if(cp < cpMaxGalicia)
            return precioFueraGalicia;
        else
            return null;
    }

    /**
     * calcula el tipo el tipo de embalaje que le corresponde al paquete con esos parametros
     *
     * @param x dimension de largo
     * @param y dimension de alto
     * @param z dimension de ancho
     * @param peso del paquete
     * @return el tipo de embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if(peso >= pesoMin && pesoMax < pesoMax)
            return CAJA_CARTON;
        else
            return null;
    }
}
