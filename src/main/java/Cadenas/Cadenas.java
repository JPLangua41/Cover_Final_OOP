package Cadenas;
import javax.swing.*;

public class Cadenas {
    private JPanel mainPanel;
    private JTextArea txtCadena;
    private JButton btnMayusculas;
    private JButton btnMinusculas;
    private JButton btnInvertir;
    private JButton btnPalindromo;
    private JButton btnContar;
    private JButton btnBuscarReemplazar;
    private JButton btnValidarCorreo;
    private JTextArea txtResultado;

    public Cadenas() {
        // Mayúsculas
        btnMayusculas.addActionListener(e -> {
            String cadena = txtCadena.getText();
            txtResultado.setText(cadena.toUpperCase());
        });

        // Minúsculas
        btnMinusculas.addActionListener(e -> {
            String cadena = txtCadena.getText();
            txtResultado.setText(cadena.toLowerCase());
        });

        // Invertir
        btnInvertir.addActionListener(e -> {
            String cadena = txtCadena.getText();
            String invertida = new StringBuilder(cadena).reverse().toString();
            txtResultado.setText(invertida);
        });

        // Palíndromo
        btnPalindromo.addActionListener(e -> {
            String cadena = txtCadena.getText().replaceAll("\\s+", "").toLowerCase();
            String invertida = new StringBuilder(cadena).reverse().toString();
            boolean esPalindromo = cadena.equals(invertida);
            txtResultado.setText(esPalindromo ? "Es palíndromo" : "No es palíndromo");
        });

        // Contar caracteres y palabras
        btnContar.addActionListener(e -> {
            String cadena = txtCadena.getText();
            int caracteres = cadena.length();
            int palabras = cadena.trim().isEmpty() ? 0 : cadena.trim().split("\\s+").length;
            txtResultado.setText("Caracteres: " + caracteres + "\nPalabras: " + palabras);
        });

        // Buscar y reemplazar
        btnBuscarReemplazar.addActionListener(e -> {
            String cadena = txtCadena.getText();
            String buscar = JOptionPane.showInputDialog("Ingrese subcadena a buscar:");
            String reemplazar = JOptionPane.showInputDialog("Ingrese subcadena de reemplazo:");
            String resultado = cadena.replace(buscar, reemplazar);
            txtResultado.setText("Original: " + cadena + "\nResultado: " + resultado);
        });

        // Validar correo
        btnValidarCorreo.addActionListener(e -> {
            String correo = txtCadena.getText();
            boolean valido = correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
            txtResultado.setText(valido ? "Correo válido ✅" : "Correo inválido ❌");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Procesamiento de Cadenas");
        frame.setContentPane(new Cadenas().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}