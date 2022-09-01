
// Leer enteros entre 1 y 5 (calificaciones) en un arreglo de 10 posiciones. Que lo
// muestre como un si fuera un arreglo de 5x2. Además que muestre el histograma
// de frecuencias
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] calificaciones = new int[10];
        guardarNota(calificaciones);
        // muestra los elementos del arreglo como uno de 5x2
        System.out.println("Datos ingresados:");
        for (int i = 0; i < calificaciones.length;) {
            for (int j = 0; j < 2; j++, i++) {
                System.out.print(calificaciones[i] + "\t");
            }
            System.out.println();
        }
    }

    // Almacena en un arreglo las notas ingresadas
    public static void guardarNota(int[] arreglo) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < arreglo.length; i++) {
            a = i + 1;
            // Permite guardar notas entre 1 y 5
            while (arreglo[i] < 1 || arreglo[i] > 5) {
                System.out.println("Ingrese la nota " + (a) + ": ");
                arreglo[i] = scan.nextInt();
            }
        }
        scan.close();
    }
}
