public class Bizum implements Payment{

    @Override
    public void paymentMethod() {
        System.out.println("Estas pagando con bizum");
    }
}
