package Conversiones;
import javax.swing.*;

public class Convert {
    private JPanel mainPanel;
    private JTextField txtDecimal;
    private JButton btnBinario;
    private JButton btnHexadecimal;
    private JButton btnVisualizar;
    private JTextArea txtResultado;

    public Convert() {
        // Decimal a Binario
        btnBinario.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtDecimal.getText());
                String binario = (numero < 0) ? "-" + Integer.toBinaryString(Math.abs(numero))
                        : Integer.toBinaryString(numero);
                txtResultado.setText("Decimal: " + numero + "\nBinario: " + binario);
            } catch (NumberFormatException ex) {
                txtResultado.setText("Entrada inválida. Ingrese un número entero.");
            }
        });

        // Decimal a Hexadecimal
        btnHexadecimal.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtDecimal.getText());
                String hex = (numero < 0) ? "-" + Integer.toHexString(Math.abs(numero)).toUpperCase()
                        : Integer.toHexString(numero).toUpperCase();
                txtResultado.setText("Decimal: " + numero + "\nHexadecimal: " + hex);
            } catch (NumberFormatException ex) {
                txtResultado.setText("Entrada inválida. Ingrese un número entero.");
            }
        });

        // Visualización lado a lado
        btnVisualizar.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtDecimal.getText());
                String binario = (numero < 0) ? "-" + Integer.toBinaryString(Math.abs(numero))
                        : Integer.toBinaryString(numero);
                String hex = (numero < 0) ? "-" + Integer.toHexString(Math.abs(numero)).toUpperCase()
                        : Integer.toHexString(numero).toUpperCase();
                txtResultado.setText("Decimal: " + numero +
                        "\nBinario: " + binario +
                        "\nHexadecimal: " + hex);
            } catch (NumberFormatException ex) {
                txtResultado.setText("Entrada inválida. Ingrese un número entero.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Números");
        frame.setContentPane(new Convert().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}