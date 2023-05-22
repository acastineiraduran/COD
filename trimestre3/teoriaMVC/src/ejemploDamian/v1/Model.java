package ejemploDamian.v1;

import ejemploDamian.v1.Coche;

import java.util.ArrayList;

/**
 * aqui es donde tendria la bd. por tanto aqui es donde creo coches, este es como mi parking
 *
 * si cambio la bd solo tendria que cambiar esta linea <code>parking.add(aux);</code> y en la clase
 * <code>ejemploDamian_v1.Controller</code> **no cambiaria nada**
 */
public class Model {
    ArrayList<Coche> parking = new ArrayList<>();

    public Coche crearCoche(String modelo, String matricula){
       Coche aux = new Coche(modelo, matricula);
       parking.add(aux);
       return aux;
    }

    public Coche getCoche(String matricula){
        for(Coche coche : parking){
            if (matricula.equals(coche.getMatricula()));
            return coche;
        }
        return null;
    }

}
