import javax.swing.JOptionPane;
import java.util.*;
public class EjercicioMatriz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica=true;

        nFilas =  Integer.parseInt(JOptionPane.showInputDialog("Difíte el número de filas: "));
        nCol =  Integer.parseInt(JOptionPane.showInputDialog("Difíte el número de columnas: "));

        matriz = new int [nFilas][nCol];

        System.out.println("Digite una matriz: ");

        for (int i=0;i<nFilas;i++) {
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz: ["+i+"] ["+j+"] : ");
                matriz[i][j] = scan.nextInt();
            }
        }

        if (nFilas==nCol) {
            int i,j;
            i=0;
            while(i<nFilas && simetrica == true) {
                j=0;
                while (j<i && simetrica == true) {
                    if(matriz[i][j] != matriz [j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es sumetrica");
            }
            
        } else {
            JOptionPane.showMessageDialog(null,"La matriz no es sumetrica");
        }
        scan.close();
    }
}