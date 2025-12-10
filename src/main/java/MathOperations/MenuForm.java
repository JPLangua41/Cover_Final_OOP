package MathOperations;

import javax.swing.*;
import java.awt.event.*;

public class MenuForm {
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSuma;
    private JTextField txtRadio;
    private JButton btnArea;
    private JTextField txtDia;
    private JTextField txtMes;
    private JButton btnZodiaco;
    private JTextArea txtResultado;
    private JButton btnFactorial;
    private JButton btnPrimo;
    private JButton btnFibonacci;
    private JPanel mainPanel; // el panel raíz del form

    public MenuForm() {
        // Acción suma
        btnSuma.addActionListener(e -> {
            int a = Integer.parseInt(txtNumero1.getText());
            int b = Integer.parseInt(txtNumero2.getText());
            txtResultado.setText("Resultado de la suma: " + (a + b));
        });

        // Acción área círculo
        btnArea.addActionListener(e -> {
            double radio = Double.parseDouble(txtRadio.getText());
            double area = Math.PI * radio * radio;
            txtResultado.setText("Área del círculo: " + area);
        });

        // Acción zodiaco
        btnZodiaco.addActionListener(e -> {
            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            txtResultado.setText("Tu signo zodiacal es: " + obtenerZodiaco(dia, mes));
        });

        // Acción factorial
        btnFactorial.addActionListener(e -> {
            int n = Integer.parseInt(txtNumero1.getText());
            if (n < 0 || n > 20) {
                txtResultado.setText("Número fuera de rango.");
            } else {
                long fact = 1;
                for (int i = 1; i <= n; i++) fact *= i;
                txtResultado.setText("Factorial de " + n + " = " + fact);
            }
        });

        // Acción primo
        btnPrimo.addActionListener(e -> {
            int num = Integer.parseInt(txtNumero1.getText());
            boolean esPrimo = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { esPrimo = false; break; }
            }
            txtResultado.setText(num + (esPrimo ? " es primo." : " no es primo."));
        });

        // Acción Fibonacci
        btnFibonacci.addActionListener(e -> {
            int n = Integer.parseInt(txtNumero1.getText());
            if (n < 0) {
                txtResultado.setText("Número inválido.");
            } else {
                int[] serie = new int[n];
                if (n > 0) serie[0] = 0;
                if (n > 1) serie[1] = 1;
                for (int i = 2; i < n; i++) serie[i] = serie[i - 1] + serie[i - 2];
                txtResultado.setText("Serie Fibonacci: " + java.util.Arrays.toString(serie));
            }
        });
    }

    // Método zodiacal
    public static String obtenerZodiaco(int day, int month) {
        if ((day >= 21 && month == 3) || (day <= 19 && month == 4)) return "Aries";
        if ((day >= 20 && month == 4) || (day <= 20 && month == 5)) return "Tauro";
        if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) return "Géminis";
        if ((day >= 21 && month == 6) || (day <= 22 && month == 7)) return "Cáncer";
        if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) return "Leo";
        if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) return "Virgo";
        if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) return "Libra";
        if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) return "Escorpio";
        if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) return "Sagitario";
        if ((day >= 22 && month == 12) || (day <= 19 && month == 1)) return "Capricornio";
        if ((day >= 20 && month == 1) || (day <= 18 && month == 2)) return "Acuario";
        if ((day >= 19 && day <= 29 && month == 2) || (day <= 20 && month == 3)) return "Piscis";
        return "Fecha inválida";
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Funciones");
        frame.setContentPane(new MenuForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
