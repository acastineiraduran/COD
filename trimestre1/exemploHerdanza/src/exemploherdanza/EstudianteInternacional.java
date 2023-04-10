/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploherdanza;

/**
 *
 * @author dam1
 */
public class EstudianteInternacional extends Estudante{
    private String pais;
    
    //los hago directamente con insert code
    public EstudianteInternacional(){
        super();
    }
    
    public EstudianteInternacional (String pais, String nome, String direccion, String nomeCole, String nivel) {
        super(direccion, nome, nivel, nomeCole);
        this.pais = pais;
        
    }

    //los hago con insert code

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "pais=" + pais;
    }
    
    
    
    
    
}
