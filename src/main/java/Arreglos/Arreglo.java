package Arreglos;

import javax.swing.*;
import java.util.*;

public class Arreglo {
    private JPanel mainPanel;
    private JTextField txtArreglo;
    private JButton btnOrdenar;
    private JButton btnInvertir;
    private JButton btnDuplicados;
    private JButton btnRotar;
    private JButton btnBuscar;
    private JButton btnCalculos;
    private JTextArea txtResultado;

    public Arreglo() {
        // Ordenar
        btnOrdenar.addActionListener(e -> {
            int[] arr = getArray();
            Arrays.sort(arr);
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nOrdenado: " + Arrays.toString(arr));
        });

        // Invertir
        btnInvertir.addActionListener(e -> {
            int[] arr = getArray();
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nInvertido: " + Arrays.toString(arr));
        });

        // Eliminar duplicados
        btnDuplicados.addActionListener(e -> {
            int[] arr = getArray();
            Set<Integer> set = new LinkedHashSet<>();
            for (int num : arr) set.add(num);
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nSin duplicados: " + set);
        });

        // Rotar
        btnRotar.addActionListener(e -> {
            int[] arr = getArray();
            int posiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posiciones a rotar:"));
            posiciones = posiciones % arr.length;
            if (posiciones < 0) posiciones = arr.length + posiciones;
            int[] resultado = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                resultado[(i + posiciones) % arr.length] = arr[i];
            }
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nRotado: " + Arrays.toString(resultado));
        });

        // Buscar elemento
        btnBuscar.addActionListener(e -> {
            int[] arr = getArray();
            int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese elemento a buscar:"));
            boolean encontrado = false;
            for (int num : arr) {
                if (num == elemento) { encontrado = true; break; }
            }
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nBuscar " + elemento + ": " + (encontrado ? "Encontrado" : "No encontrado"));
        });

        // Calculos (mayor, menor, suma, promedio)
        btnCalculos.addActionListener(e -> {
            int[] arr = getArray();
            int mayor = Arrays.stream(arr).max().getAsInt();
            int menor = Arrays.stream(arr).min().getAsInt();
            int suma = Arrays.stream(arr).sum();
            double promedio = Arrays.stream(arr).average().getAsDouble();
            txtResultado.setText("Original: " + txtArreglo.getText() +
                    "\nMayor: " + mayor +
                    "\nMenor: " + menor +
                    "\nSuma: " + suma +
                    "\nPromedio: " + promedio);
        });
    }

    // Método auxiliar para convertir el texto en arreglo
    private int[] getArray() {
        String[] partes = txtArreglo.getText().split(",");
        int[] arr = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            arr[i] = Integer.parseInt(partes[i].trim());
        }
        return arr;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Manipulación de Arreglos");
        frame.setContentPane(new Arreglo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}