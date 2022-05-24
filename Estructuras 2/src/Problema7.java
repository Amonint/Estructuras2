import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i = 0, j = 0;
        System.out.println("Ingrese el tamaño de la matriz:");
        int lim = datos.nextInt();
        int matriz[][] = new int[lim][lim];
        for (i = 0; i < lim; i++) {
            for (j = 0; j < lim; j++) {
                System.out.println("Ingrese el elemento (" + i + "," + j + ")");
                matriz[i][j] = datos.nextInt();

            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {

                for (int x = 0; x < matriz.length; x++) {
                    for (int y = 0; y < matriz.length; y++) {

                        if (matriz[i][j] >= matriz[x][y]) {
                            matriz[i][j] = matriz[i][j];
                        } else {
                            int aux = matriz[x][y];
                            matriz[x][y] = matriz[i][j];
                            matriz[i][j] = aux;
                        }
                    }
                }
            }
        }
        System.out.println("La matriz ordenada es:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
