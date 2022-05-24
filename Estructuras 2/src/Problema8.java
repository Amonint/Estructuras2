import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int lim = 0;
        System.out.println("ingrese las dimensiones para el cuadro magico");
        lim = entrada.nextInt();
        int[][] A = new int[lim][lim];
        generar(A, lim);
        presentar(A, lim);
    }

    public static void generar(int[][] B, int lim2) {
        int mitad;
        mitad = lim2 / 2;
        int ubcolumn = mitad;
        int ubfilas = 0;
        B[ubfilas][ubcolumn] = 1;
        int ubcolumAc = ubfilas;
        int ubfilasAc = ubcolumn;
        for (int i = 2; i <= (Math.pow(B.length, 2)); i++) {
            ubfilas--;

            ubcolumn--;
            if (ubfilas < 0) {
                ubfilas = B.length - 1;
            }
            if (ubcolumn < 0) {
                ubcolumn = B.length - 1;
            }
            if (B[ubfilas][ubcolumn] == 0) {
                B[ubfilas][ubcolumn] = i;
            } else {
                ubfilas = ubfilasAc + 1;
                ubcolumn = ubcolumAc;
                B[ubfilas][ubcolumn] = i;
            }
            ubfilasAc = ubfilas;
            ubcolumAc = ubcolumn;
        }
    }

    public static void presentar(int[][] B, int lim2) {
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(" " + B[i][j]);
            }
            System.out.println("");
        }
    }
}
