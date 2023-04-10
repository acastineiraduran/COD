import javax.swing.*;

public class Figura {
    public void pedirFigura() {
        int nro = Integer.parseInt(JOptionPane.showInputDialog(
                "Eliga la opción deseada:" + "\n" +
                        "1.Cuadrado" + "\n" +
                        "2.Triangulo" + "\n" +
                        "3.Circulo" + "\n"
        ));

        switch (nro) {
            case 1:
                float l = Float.parseFloat(JOptionPane.showInputDialog("Indique el valor de los lados:"));
                float acd = l * l;
                JOptionPane.showMessageDialog(null, "el área es: " + acd);
                break;
            case 2:
                float b = Float.parseFloat(JOptionPane.showInputDialog("Indique el valor de la base:"));
                float h = Float.parseFloat(JOptionPane.showInputDialog("Indique el valor de la altura:"));
                float at = b * h / 2;
                JOptionPane.showMessageDialog(null, "el área es: " + at);
                break;
            case 3:
                float r = Float.parseFloat(JOptionPane.showInputDialog("Indique el valor del radio:"));
                float ac = (float) (Math.PI * Math.pow(r, 2));
                JOptionPane.showMessageDialog(null, "el área es: " + ac);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta.");
        }
    }

}
