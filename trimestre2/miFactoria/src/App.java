public class App {
    public static void main(String[] args) {
        Factory factory = new Factory();

        ITransporte camion = factory.crearTransporte(Factory.CAMION);
        if(factory.crearTransporte(0)!=null){
            Float precio = camion.costeTotal(1000);
            String getMensajePrecio = MensajesOpciones.responderPrecio(precio);
            Integer tipoEmbalaje = camion.tipoEmbalaje(1f,3f,3f,2f);
            String getMensajeEmbalaje = MensajesOpciones.responderEmbalaje(tipoEmbalaje);
            System.out.println('\n' + getMensajePrecio + '\n' + getMensajeEmbalaje);
        } else{
            System.out.println(factory.MENSAJE_ERROR);
        }

        ITransporte bicicleta = factory.crearTransporte(Factory.BICICLETA);
        if(factory.crearTransporte(0)!=null){
            Float precio = bicicleta.costeTotal(50);
            String getMensajePrecio = MensajesOpciones.responderPrecio(precio);
            Integer tipoEmbalaje = camion.tipoEmbalaje(3f,3f,3f,10f);
            String getMensajeEmbalaje = MensajesOpciones.responderEmbalaje(tipoEmbalaje);
            System.out.println('\n' + getMensajePrecio + '\n' + getMensajeEmbalaje);
        }else{
            System.out.println(factory.MENSAJE_ERROR);
        }

    }
}