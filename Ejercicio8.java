// Generador de matrices identidad de n x n

public class Ejercicio8 {
    public static void main(String[] args) {
        int orden = 4;
        matrizIdentidad(orden);
    }
    public static int[][] matrizIdentidad(int ordenMatriz){
        int[][] matriz = new int[ordenMatriz][ordenMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                // Ingresa 1 en la fila y columna que tienen igual subindice
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        return matriz;
    }
}
