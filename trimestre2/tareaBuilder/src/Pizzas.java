/**
 * Clase que define el objeto o "producto" del diseño Builder
 *
 * @author acastineiraduran
 * @version 16/03/23
 */
public class Pizzas {
    private boolean relleno;
    private static final int FAMILIAR = 1;
    private static final int MEDIANA = 2;
    private static final int PEQUEÑA = 3;
    private boolean salsa;
    private String salsa_barbacoa;
    private String salsa_soloTomate;
    private String salsa_sinGluten;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhiones;
    private boolean jamon;

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getSalsa_barbacoa() {
        return salsa_barbacoa;
    }

    public void setSalsa_barbacoa(String salsa_barbacoa) {
        this.salsa_barbacoa = salsa_barbacoa;
    }

    public String getSalsa_soloTomate() {
        return salsa_soloTomate;
    }

    public void setSalsa_soloTomate(String salsa_soloTomate) {
        this.salsa_soloTomate = salsa_soloTomate;
    }

    public String getSalsa_sinGluten() {
        return salsa_sinGluten;
    }

    public void setSalsa_sinGluten(String salsa_sinGluten) {
        this.salsa_sinGluten = salsa_sinGluten;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhiones() {
        return champinhiones;
    }

    public void setChampinhiones(boolean champinhiones) {
        this.champinhiones = champinhiones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public Pizzas() {
        this.relleno = relleno;
        this.salsa = salsa;
        this.salsa_barbacoa = salsa_barbacoa;
        this.salsa_soloTomate = salsa_soloTomate;
        this.salsa_sinGluten = salsa_sinGluten;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pinha = pinha;
        this.champinhiones = champinhiones;
        this.jamon = jamon;
    }

    /**
     * Metodo que devuelve una String con las características del objeto de esta clase. Contiene
     * la anotacion @Override que indica que estamos sobreescribiendo el método toString
     * de la clase padre (Object)
     *
     * @return una String con las características
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pizzas{");
        sb.append("relleno=").append(relleno);
        sb.append(", salsa=").append(salsa);
        sb.append(", salsa_barbacoa='").append(salsa_barbacoa).append('\'');
        sb.append(", salsa_soloTomate='").append(salsa_soloTomate).append('\'');
        sb.append(", salsa_sinGluten='").append(salsa_sinGluten).append('\'');
        sb.append(", cebolla=").append(cebolla);
        sb.append(", sinGluten=").append(sinGluten);
        sb.append(", extraQueso=").append(extraQueso);
        sb.append(", pinha=").append(pinha);
        sb.append(", champinhiones=").append(champinhiones);
        sb.append(", jamon=").append(jamon);
        sb.append('}');
        return sb.toString();
    }
}
