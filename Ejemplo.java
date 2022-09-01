// Suma y resta de 2 matrices m x n. 
public class Ejemplo {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
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
        System.out.println("SUMA DE MATRICES");
        // Permite la salida de la suma de los valores que ocupan la misma posicion en las matrices
        for (int i = 0; i < sumaMatrices(matriz1, matriz2).length; i++) {
            for (int j = 0; j < sumaMatrices(matriz1, matriz2)[i].length; j++) {
                System.out.print(sumaMatrices(matriz1, matriz2)[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("RESTA DE MATRICES");
        // Permite la salida de la resta de los valores que ocupan la misma posicion en
        // las matrices
        for (int i = 0; i < restaMatrices(matriz1, matriz2).length; i++) {
            for (int j = 0; j < restaMatrices(matriz1, matriz2)[i].length; j++) {
                System.out.print(restaMatrices(matriz1, matriz2)[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatrices(int[][] a, int[][] b) {
        // determina el numero de filas para la solucion
        int m = a.length;
        // determina el numero de columnas para la solucion
        int n = a[0].length;
        // crea un array para almacenar la suma
        int[][] c = new int[m][n];
        // calcula la suma de la matriz fila por fila
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    public static int[][] restaMatrices(int[][] a, int[][] b) {
        // determina el numero de filas para la solucion
        int m = a.length;
        // determina el numero de columnas para la solucion
        int n = a[0].length;
        // crea un array para almacenar la suma
        int[][] c = new int[m][n];
        // calcula la resta de la matriz fila por fila
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                c[i][j] = a[i][j] - b[i][j];
        return c;
    }

    // retorna un numero aleatorio
    public static int numeroAleatorio() {
        return (int) (Math.random() * 20) + 1;
    }
}

// // Suma, resta, multiplicaciónPunto de 2 matrices m x n.
// public class Ejercicio7 {
//     public static void main(String[] args) {
//         int[][] matriz1 = new int[2][2];
//         int[][] matriz2 = new int[2][2];
//         System.out.println("MATRIZ 01");
//         // Bucle para guardar un valor aleatorio en cada posicion de la matriz
//         for (int i = 0; i < matriz1.length; i++) {
//             for (int j = 0; j < matriz1[i].length; j++) {
//                 matriz1[i][j] = numeroAleatorio();
//                 System.out.print(matriz1[i][j] + "\t");
//             }
//             System.out.println();
//         }
//         System.out.println("MATRIZ 02");
//         // Bucle para guardar un valor aleatorio en cada posicion de la matriz
//         for (int i = 0; i < matriz2.length; i++) {
//             for (int j = 0; j < matriz2[i].length; j++) {
//                 matriz2[i][j] = numeroAleatorio();
//                 System.out.print(matriz2[i][j] + "\t");
//             }
//             System.out.println();
//         }
//         System.out.println("SUMA DE MATRICES");
//         // Permite la salida de la suma de los valores que ocupan la misma posicion en
//         // las matrices
//         for (int i = 0; i < sumaMatrices(matriz1, matriz2).length; i++) {
//             for (int j = 0; j < sumaMatrices(matriz1, matriz2)[i].length; j++) {
//                 System.out.print(sumaMatrices(matriz1, matriz2)[i][j] + "\t");
//             }
//             System.out.println();
//         }
//         System.out.println("RESTA DE MATRICES");
//         // Permite la salida de la resta de los valores que ocupan la misma posicion en
//         // las matrices
//         for (int i = 0; i < restaMatrices(matriz1, matriz2).length; i++) {
//             for (int j = 0; j < restaMatrices(matriz1, matriz2)[i].length; j++) {
//                 System.out.print(restaMatrices(matriz1, matriz2)[i][j] + "\t");
//             }
//             System.out.println();
//         }
//         System.out.println("PRODUCTO DE MATRICES");
//         // Permite la salida del producto de los valores que ocupan la misma posicion en
//         // las matrices
//         for (int i = 0; i < productoMatrices(matriz1, matriz2).length; i++) {
//             for (int j = 0; j < productoMatrices(matriz1, matriz2)[i].length; j++) {
//                 System.out.print(productoMatrices(matriz1, matriz2)[i][j] + "\t");
//             }
//             System.out.println();
//         }
//     }

//     public static int[][] sumaMatrices(int[][] a, int[][] b) {
//         // determina el numero de filas para la solucion
//         int m = a.length;
//         // determina el numero de columnas para la solucion
//         int n = a[0].length;
//         // crea un array para almacenar la suma
//         int[][] c = new int[m][n];
//         // calcula la suma de la matriz fila por fila
//         for (int i = 0; i < m; ++i)
//             for (int j = 0; j < n; ++j)
//                 c[i][j] = a[i][j] + b[i][j];
//         return c;
//     }

//     public static int[][] restaMatrices(int[][] a, int[][] b) {
//         // determina el numero de filas para la solucion
//         int m = a.length;
//         // determina el numero de columnas para la solucion
//         int n = a[0].length;
//         // crea un array para almacenar la suma
//         int[][] c = new int[m][n];
//         // calcula la resta de la matriz fila por fila
//         for (int i = 0; i < m; ++i)
//             for (int j = 0; j < n; ++j)
//                 c[i][j] = a[i][j] - b[i][j];
//         return c;
//     }

//     public static int[][] productoMatrices(int[][] a, int[][] b) {
//         // determina el numero de filas para la solucion
//         int m = a.length;
//         // determina el numero de columnas para la solucion
//         int n = a[0].length;
//         // crea un array para almacenar la suma
//         int[][] c = new int[m][n];
//         // calcula el producto de la matriz fila por fila
//         for (int i = 0; i < m; ++i)
//             for (int j = 0; j < n; ++j)
//                 c[i][j] = a[i][j] * b[i][j];
//         return c;
//     }

//     // retorna un numero aleatorio
//     public static int numeroAleatorio() {
//         return (int) (Math.random() * 20) + 1;
//     }
// }
