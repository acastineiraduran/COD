
public abstract class Shop {

    /**
     * para comprar algo. llama al metodo makePayment()
     * y con el obj payment utiliza su metodo paymentMethod()
     */
    public void buySomething() {
        Payment payment = makePayment();
        payment().paymentMethod();
    }
    /**
     * metodo abstracto para realizar pagos pagos
     * @return la Interface de tipo Payment
     */
    public abstract Payment makePayment(); // lo definire despues, no se lo que es makePayment pero se que devuelve Payment

}
