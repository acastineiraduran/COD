
package exemploherdanza;

public class ExemploHerdanza {

    public static void main(String[] args) {
        
        Ensinate obx = new Ensinate("mates", "calle pz america", "angel");
        
        System.out.println(obx.toString());
        
        obx.setNome("Nicolas");
        
        System.out.println(obx.toString());
        
        Estudante obxEstudante = new Estudante("pzespa", "rebeca", "a", "ies");
        
        System.out.println(obxEstudante.toString());
        
        EstudianteInternacional obxEstudianteInter = new EstudianteInternacional("espa", "oscar", "finca", "castro", "medio");
        
        System.out.println(obxEstudianteInter.toString());
       
    }
    
}
