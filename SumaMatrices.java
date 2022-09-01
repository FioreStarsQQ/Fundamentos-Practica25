import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumaMatrices {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;

        nFilas=Integer.parseInt (JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[nFilas][nCol];

        System.out.println("\nLa matriz es: ");
        for (int i=0;i<nFilas;i++) {
            for (int j=0;j<nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        // suma de elementos
        for (int i =0;i<nFilas;i++) {
            sumaFilas=0;
            for(int j=0;j<nCol;j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("\nLa suma de la fila ["+i+"] es : "+sumaFilas);
        }
        System.out.println();

        for (int j=0;j<nCol;j++) {
            sumaCol=0;
            for (int i=0;i<nFilas;i++){
                // sumaCol += matriz[i]{j};
            }
        }
        // System.out.println("\nLa suma de la fila ["+i+"] es : "+sumaCol);
        scan.close();
    }
}
