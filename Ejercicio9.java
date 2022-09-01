// Transpuesta de una matriz m x n
public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        System.out.println("MATRIZ");
        // Bucle para guardar un valor aleatorio en cada posicion de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio();
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        // Comprobar que se pueda transponer
        if (esCuadrada(matriz)) {
            System.out.println("MATRIZ TRANSPUESTA");
            for (int i = 0; i < matrizTranspuesta(matriz).length; i++) {
                for (int j = 0; j < matrizTranspuesta(matriz).length; j++) {
                    System.out.print(matrizTranspuesta(matriz)[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se puede transponer la matriz.");
        }
    }

    // retorna la matriz transpuesta
    public static int[][] matrizTranspuesta(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }

    // retorna un numero aleatorio
    public static int numeroAleatorio() {
        return (int) (Math.random() * 20) + 1;
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