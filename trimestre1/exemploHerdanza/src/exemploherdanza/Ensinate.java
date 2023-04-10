/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploherdanza;

/**
 *
 * @author dam1
 */
public class Ensinate extends Persoa{
    private String materia;

    public Ensinate() {
        super();
    }

    public Ensinate(String materia, String direccion, String nome) {
        super(direccion, nome);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

//    @Override
//    public String toString() { // el que me poner el insert code
//        return "Ensinate{" + "materia=" + materia + '}'; // quiero añadir el otro String
//    }

    @Override
    public String toString() {
        return super.toString() + "materia=" + materia; // me añadio los otros tambien
    }
    
    
    
    
    
    
}
