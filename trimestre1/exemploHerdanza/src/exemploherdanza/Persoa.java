/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploherdanza;

public class Persoa {
    private String nome;
    private String direccion;

    public Persoa() {
    }
    
    public Persoa(String direccion, String nome){
        this.direccion = direccion;
        this.nome = nome;
    }
    
    //acceso
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDireccion() {
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", direccion=" + direccion;
    }
    
    
}
