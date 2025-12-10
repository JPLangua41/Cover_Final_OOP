package Juegos;
import javax.swing.*;
import java.util.*;

public class Juegos {
    private JPanel mainPanel;
    private JButton btnPiedra;
    private JButton btnPapel;
    private JButton btnTijera;
    private JButton btnLagarto;
    private JButton btnSpock;
    private JLabel lblResultado;
    private JLabel lblVictorias;
    private JLabel lblDerrotas;
    private JLabel lblEmpates;
    private JTextArea txtHistorial;

    private int victorias = 0;
    private int derrotas = 0;
    private int empates = 0;
    private LinkedList<String> historial = new LinkedList<>();

    public Juegos() {
        btnPiedra.addActionListener(e -> jugarConInterfaz("Piedra"));
        btnPapel.addActionListener(e -> jugarConInterfaz("Papel"));
        btnTijera.addActionListener(e -> jugarConInterfaz("Tijera"));
        btnLagarto.addActionListener(e -> jugarConInterfaz("Lagarto"));
        btnSpock.addActionListener(e -> jugarConInterfaz("Spock"));
    }

    // Método corregido: recibe la elección de la computadora
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario, String eleccionComputadora) {
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            return "Empate";
        }

        switch (eleccionUsuario.toLowerCase()) {
            case "piedra":
                if (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))
                    return "Ganaste";
                break;
            case "papel":
                if (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))
                    return "Ganaste";
                break;
            case "tijera":
                if (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))
                    return "Ganaste";
                break;
            case "lagarto":
                if (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel"))
                    return "Ganaste";
                break;
            case "spock":
                if (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra"))
                    return "Ganaste";
                break;
        }
        return "Perdiste";
    }

    // Método que conecta la lógica con la interfaz
    private void jugarConInterfaz(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[new Random().nextInt(opciones.length)];

        String resultado = jugarPiedraPapelTijeraLagartoSpock(eleccionUsuario, eleccionComputadora);

        // Actualizar contadores
        switch (resultado) {
            case "Ganaste": victorias++; break;
            case "Perdiste": derrotas++; break;
            case "Empate": empates++; break;
        }

        // Mostrar resultado
        lblResultado.setText("Tú: " + eleccionUsuario + " | PC: " + eleccionComputadora + " → " + resultado);
        lblVictorias.setText("Victorias: " + victorias);
        lblDerrotas.setText("Derrotas: " + derrotas);
        lblEmpates.setText("Empates: " + empates);

        // Actualizar historial (máximo 5 jugadas)
        historial.addFirst("Tú: " + eleccionUsuario + " | PC: " + eleccionComputadora + " → " + resultado);
        if (historial.size() > 5) historial.removeLast();
        txtHistorial.setText(String.join("\n", historial));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego: Piedra, Papel, Tijera, Lagarto, Spock");
        frame.setContentPane(new Juegos().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}