import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Workshop {
    static void main() {

    }
    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int[] serie = new int[n];
        if (n > 0) serie[0] = 0;
        if (n > 1) serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }
    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0; // evitar división por cero
        int suma = sumaElementos(arreglo);
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío");
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío");
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) menor = num;
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = java.util.Arrays.copyOf(arreglo, arreglo.length);
        java.util.Arrays.sort(copia);
        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arreglo) {
            set.add(num);
        }
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        int[] resultado = new int[n];
        posiciones = posiciones % n;
        if (posiciones < 0) {
            posiciones = n + posiciones;
        }
        for (int i = 0; i < n; i++) {
            resultado[(i + posiciones) % n] = arreglo[i];
        }
        return resultado;
    }


    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String normalizada = cadena.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(normalizada).reverse().toString();
        return normalizada.equals(invertida);
    }


    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero < 0) {
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero < 0) {
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[new Random().nextInt(opciones.length)];

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

    // Método que determina el ganador en pptls2
    public String pptls2(String[] game) {
        // game[0] = jugador1, game[1] = jugador2
        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) return "Empate";

        // reglas
        if ((p1.equals("R") && (p2.equals("S") || p2.equals("L"))) ||
                (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
                (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
                (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) ||
                (p1.equals("V") && (p2.equals("S") || p2.equals("R")))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    // Método que calcula el área de un círculo
    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    // Método que retorna el signo zodiacal
    public String zoodiac(int day, int month) {
        if ((day >= 21 && month == 3) || (day <= 19 && month == 4)) return "Aries";
        if ((day >= 20 && month == 4) || (day <= 20 && month == 5)) return "Tauro";
        if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) return "Gemini";
        if ((day >= 21 && month == 6) || (day <= 22 && month == 7)) return "Cancer";
        if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) return "Leo";
        if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) return "Virgo";
        if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) return "Libra";
        if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) return "Escorpio";
        if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) return "Sagitario";
        if ((day >= 22 && month == 12) || (day <= 19 && month == 1)) return "Capricornio";
        if ((day >= 20 && month == 1) || (day <= 18 && month == 2)) return "Acuario";
        if ((day >= 19 && day <= 28 && month == 2) || (day <= 20 && month == 3)) return "Piscis";
        return "Invalid Date";
    }
}