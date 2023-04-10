/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploherdanza;

/**
 *
 * @author dam1
 */
public class Estudante extends Persoa{
    private String nomeCole;
    private String nivel;

    public Estudante() {
        super();
    }

    public Estudante (String direccion, String nome, String nivel, String nomeCole){
        super(direccion, nome);
        this.nivel = nivel;
        this.nomeCole = nomeCole;
        
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "nomeCole=" + nomeCole + ", nivel=" + nivel;
    }
    
    
    
    
}
