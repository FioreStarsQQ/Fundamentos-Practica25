// Programa que genere un arreglo transpuesta de un arreglo bidimensional cualquiera“arr”que tenga valores enteros aleatorios pertenecientes a un rango[m,n]que nosotros ingresemos.

// Imprima el original y la transpuesta en forma matricial(filas y columnas).Crear el main y los métodos necesarios(usar sólo arreglos estándar).

// Usar en main:

// generarTranspuesta(arr,arrT);

// arrT=generarTranspuesta(arr);

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TransponerMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[][], nFilas, nCol, m, n;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Difíte el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Difíte el número de columnas: "));

        arr = new int[nFilas][nCol];

        System.out.print("Ingrese el valor de m: ");
        m = scan.nextInt();
        System.out.print("Ingrese el valor de n: ");
        n = scan.nextInt();
        // generan...
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "] : ");
                arr[i][j] = (int)(Math.random()*(n-m +1))+1;
            }
        }

        System.out.println("\nMatriz original: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // transponien...
        int aux;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = aux;
            }
        }
        System.out.println("\nLa matriz tanspuesta es:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    public static Array[][] generarTranspuesta(int f, int c) {
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "] : ");
                arr[i][j] = (int) (Math.random() * (n - m + 1)) + 1;
            }
        }
        return arr;
    } 
}
