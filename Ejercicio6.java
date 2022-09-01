// Simular un lanzamiento de n dados para m concursantes, indicar el ganador y el
// valor del lanzamiento del dado con mayor frecuencia

public class Ejercicio6 {
    public static void main(String[] args) {
        int dados = 8, concursantes = 8, mayor = 0, numDado = 0;
        int[] frecuencias = new int[6];
        mostrarTabla(concursantes, dados, frecuencias);
        for (int i = 0; i < frecuencias.length; i++) {
            if (i == 0) {
                mayor = frecuencias[i];
                numDado = i;
            }
            if (mayor < frecuencias[i]) {
                mayor = frecuencias[i];
                numDado = i;
            }
        }
        System.out.println("El valor que mas repitió fue " + (numDado + 1) + " y se presentó en " + mayor + " lanzamientos");
    }

    // Muestra la tabla de lanzamientos y el ganador
    public static void mostrarTabla(int m, int n, int[] frecuencias) {
        int suma = 0, sumaMayor = 0, posicion = 0;
        int[][] c = new int[m][n];
        for (int i = 0; i < m; ++i) {
            suma = 0;
            System.out.print("Jugador N° " + (i + 1) + ":\t");
            for (int j = 0; j < n; ++j) {
                c[i][j] = (int) (Math.random() * 6) + 1;
                System.out.print(c[i][j] + "\t");
                suma += c[i][j];
                frecuencias(frecuencias, c[i][j]);
            }
            if (i == 0) {
                sumaMayor = suma;
                posicion = i;
            }
            if (sumaMayor < suma) {
                sumaMayor = suma;
                posicion = i;
            }
            System.out.print("Suma: " + suma);
            System.out.println();
        }
        System.out.println("El ganador es el jugador N° " + (posicion + 1) + " ya que la suma de sus dados fue " + sumaMayor);
    }

    public static void frecuencias(int[] frecuencias, int dado) {
        frecuencias[dado - 1]++;
    }
}
