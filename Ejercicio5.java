
// Implementar la búsqueda lineal para elementos de un arreglo de n elementos
// enteros. 2 versiones: a) hasta encontrar y b) búsqueda completa. Muestra las
// posiciones donde encuentra o -1 si no ubica
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[10];
        int buscar;
        // Bucle que permite almacenar un numero aleatorio en cada posicion del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 5) + 1;
            System.out.println("Posicion " + i + ": " + arreglo[i]);
        }
        System.out.print("Ingrese el numero que quiere buscar en el arreglo: ");
        buscar = scan.nextInt();
        // muestra las versiones
        System.out.println("PRIMERA VERSION:\n" + buscarNum(arreglo, buscar));
        System.out.println("SEGUNDA VERSION:");
        busquedaCompleta(arreglo, buscar);
        scan.close();
    }

    // primera version: hasta encontrar el numero buscado
    public static int buscarNum(int[] arreglo, int num) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // segunda version: busqueda completa
    public static void busquedaCompleta(int[] arreglo, int num) {
        int verifica = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                verifica = num;
                System.out.println("La posición " + i + " contiene a " + num);
            }
        }
        if (verifica == -1)
            System.out.println(verifica);
    }
        // Metodo que devuelve un booleano para verificar si una matriz es cuadrada o no
    public static boolean esCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + 1 == matriz.length) {
                    return (matriz.length == matriz[i].length);
                }
            }
        }
        return false;
    }
}
