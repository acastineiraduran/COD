public class BaseDeDatos {
    // Atributos
    public String usuario;
    public String token;

    // Metodos
    private static BaseDeDatos instance = null; // porque el null es compatible con todos los tipos

    private BaseDeDatos () {

    }

     public static BaseDeDatos getConstructor () {
        if (instance == null) { // null para que me entre en el condicional
            instance = new BaseDeDatos(); // para que me cree el objeto
        }
        return instance; // solo entrara una vez en el condicional y por tanto solo utiliza el new una vez
         // y por tanto no me vuelve a crea un objeto
     }



}
