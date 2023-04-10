# Mi Factoria
>Previamente planteé el diagrama UML siguiente:

![giagramaUML](/imagenes/diagramaUML.png)

## Interfaz
Creé la interfaz ``ITransporte`` que contiene los atributos y los 
métodos comunes a los
los productos (bicicleta y camión).

## Clases de los productos
Creo las clases de ``Camion`` y ``Bicicleta`` que instancian
los tipos de transporte (camion y bicicleta).

1. Defino algunas nuevas características de cada una de las clases.
2. Implemento los métodos (de la interfaz común) dependiendo del rango
   (establecido por los atributos anteriores)
al que pertenezcan los parámetros introducidos por el usuario.

## Clase Factory
Tiene las opciones que representan las instancias posibles. El metodo
retornará una instancia según el la opcion que hayamos seleccionado.

## Mensaje Opciones
Añadí esta clase extra simplemente para no saturar de codigo la Main
y que prorporcione la respuesta adecuada a cada alternativa posible.

## Clase principal
Finalmente creé la clase principal donde primero pruebo los metodos y las clases
anteriormente definidas con el tipo de transporte ``camion``

````java
ITransporte camion = factory.crearTransporte(Factory.CAMION);
if(factory.crearTransporte(0)!=null){
    Float precio = camion.costeTotal(1000);
    String getMensajePrecio = MensajesOpciones.responderPrecio(precio);
    Integer tipoEmbalaje = camion.tipoEmbalaje(1f,3f,3f,2f);
    String getMensajeEmbalaje = MensajesOpciones.responderEmbalaje(tipoEmbalaje);
    System.out.println('\n' + getMensajePrecio + '\n' + getMensajeEmbalaje);
} else {
    System.out.println(factory.MENSAJE_ERROR);
}
````

1. si la selección del tipo de transporte es incorreca imprime un mensaje de error,
si no, entra en el ``if`` e instancia (gracias a la clase ``Factory``) un objeto
del tipo ``Camion``.
2. Llamo a los metodos que de ``Camion`` que asignan los valores del precio
y del tipo de embalaje para finalmente guardarlos en otra variable que luego
me permita imprimir el mensaje adecuado.


En la segunda parte de la Main hago exactamente lo mismo pero instanciando
un objeto tipo ``Bicicleta``.


