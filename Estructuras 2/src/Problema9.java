import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz:");
        int lim = entrada.nextInt();
        int A[][] = new int[lim][lim];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                A[i][j] = entrada.nextInt();
            }
        }
        System.out.println("El determinante es: " + determinante(A));
    }

    public static double determinante(int[][] matriz) {
        double det;
        if (matriz.length == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
            return det;
        }
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int[][] nm = new int[matriz.length - 1][matriz.length - 1];
            for (int j = 0; j < matriz.length; j++) {
                if (j != i) {
                    for (int k = 1; k < matriz.length; k++) {
                        int indice = -1;
                        if (j < i)
                            indice = j;
                        else if (j > i)
                            indice = j - 1;
                        nm[indice][k - 1] = matriz[j][k];

                    }
                }
            }
            if (i % 2 == 0)
                suma += matriz[i][0] * determinante(nm);
            else
                suma -= matriz[i][0] * determinante(nm);
        }
        return suma;
    }
}