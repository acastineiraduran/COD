package ejemploMio.view;

import javax.swing.*;

public class Vista  extends JFrame{
    public Vista(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(800,600);
        this.setLocationRelativeTo(this);
        //this.setLayout(null);
    }
    private JPanel mainPanel;
    private JLabel nombreLabel;
    private JTextField txtNombre;
    private JLabel correoLabel;
    private JTextField txtCorreo;
    private JLabel telefonoLabel;
    private JTextField txtTelefono;

    public static void main(String[] args) {
        JFrame frame = new Vista("MVC");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
