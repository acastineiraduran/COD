Si no hicieramos esto, tendriamos que crear una clase para cada metodo
````java
public interface Payment {
    void paymentMethod(); // me va a ayudar a reunir distintas formas de pagar en una sola clase

}
````
## Procedimiento
1. Creamos interfaz y metodos de pago
2. Creamos logica
   vamos a crear la clase (abstracta) que se encargará de devolver el producto en función del tipo de pago
-----
