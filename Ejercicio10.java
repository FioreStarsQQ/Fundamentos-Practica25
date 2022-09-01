// Multiplicación de matrices m x n y n x p
public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[5][3];
        int[][] matriz2 = new int[3][3];
        System.out.println("MATRIZ 01");
        // Bucle para guardar un valor aleatorio en cada posicion de la matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = numeroAleatorio();
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MATRIZ 02");
        // Bucle para guardar un valor aleatorio en cada posicion de la matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = numeroAleatorio();
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MULTIPLICACION DE MATRICES");
        // para evitar que se imprima una matriz vacía se comprueba que las matrices se
        // puedan multiplicar
        if (matriz1[0].length == matriz2.length) {
            for (int i = 0; i < multiplicarMatrices(matriz1, matriz2).length; i++) {
                for (int j = 0; j < multiplicarMatrices(matriz1, matriz2)[i].length; j++) {
                    multiplicarMatrices(matriz1, matriz2)[i][j] = numeroAleatorio();
                    System.out.print(multiplicarMatrices(matriz1, matriz2)[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se puede realizar la multiplicación");
        }
    }

    // retorna un numero aleatorio
    public static int numeroAleatorio() {
        return (int) (Math.random() * 20) + 1;
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        // se comprueba si las matrices se pueden multiplicar
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        // aquí se multiplica la matriz
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        // si no se cumple la condición se retorna una matriz vacía
        return c;
    }
}
