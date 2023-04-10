import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String introEnt = "Introduce una de las opciones:\n1--> bixun\n2--> tarjeta\n0--> salir";
        Scanner sc = new Scanner(System.in);
        Cash efec = new Cash();
        CreditCard tarj = new CreditCard();
        Bizum biz = new Bizum();

        int opcion;
        do {
            System.out.println(introEnt);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    biz.paymentMethod();
                    break;
                case 2:
                    tarj.paymentMethod();
                    break;
            }
        } while (opcion != 0);
    }
}
