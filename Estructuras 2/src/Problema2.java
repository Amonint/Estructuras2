import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca las filas:");
        int a = entrada.nextInt();
        System.out.println("Introduzca las columnas:");
        int b = entrada.nextInt();
        int arreglo[][] = new int[a][b];
        int inv = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i + j == a - 1) {
                    inv = inv + arreglo[i][j];
                }
            }
        }

    }

}