public class Coche {
    private String modelo;
    private Integer velocidad;
    private String matricula;



    public Integer acelerar(int aumentoVelocidad){
        velocidad = velocidad + aumentoVelocidad;
        return velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.velocidad = 0;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer frenar(Integer descensoVelocidad){
        velocidad = velocidad + descensoVelocidad;
        return velocidad;
    }


}
