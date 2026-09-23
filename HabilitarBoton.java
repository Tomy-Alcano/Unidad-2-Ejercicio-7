import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HabilitarBoton {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()-> {

            JFrame ventana = new JFrame("Habilitar Boton");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(500,250);
            ventana.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(5,2,10,10));

            panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

            JLabel lblIngreso = new JLabel("Ingresa tu nombre para continuar: ");

            JTextField textNombre = new JTextField();

            JButton btnContinuar = new JButton("Continuar");
            btnContinuar.setEnabled(false);

            JLabel estado = new JLabel("Completá el campo para habilitar el botón");

            textNombre.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {

                    if(!textNombre.getText()
                            .trim()
                            .isEmpty()) {
                        btnContinuar.setEnabled(true);

                        estado.setText("¡Listo! podés continuar");

                    }else  {
                        btnContinuar.setEnabled(false);

                        estado.setText("Completa el campo para habilitar el botón");

                    }
                }
            });

            panel.add(lblIngreso);
            panel.add(textNombre);
            panel.add(btnContinuar);
            panel.add(estado);

            ventana.add(panel);

            ventana.setVisible(true);
        });

    }
}
