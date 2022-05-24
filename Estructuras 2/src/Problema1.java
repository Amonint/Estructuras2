import java.util.Scanner;

/* Leer una matriz de n X m elementos y calcular la suma de cada una de sus filas y columnas,
dejando dichos resultados en dos vectores, uno de la suma de filas y otro de columnas. */
public class Problema1 {
    public static void main(String[] args) {
        // Entrada y declaracion de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas:");
        int filas = entrada.nextInt();
        System.out.println("Introduzca el numero de columnas:");
        int columnas = entrada.nextInt();
        int a[][] = new int[filas][columnas];
        System.out.printf("Introduzca la matriz de %d x %d \n", filas, columnas);
        // Lectura de la matriz
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("Introduzca el elemento (%d,%d):\n", i, j);
                a[i][j] = entrada.nextInt();
            }
        }

        int sumafil[] = new int[filas];
        int sumacol[] = new int[columnas];
        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += a[i][j];
            }
            sumafil[i] = suma;
        }
        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += a[i][j];
            }
            sumacol[j] = suma;
        }
        System.out.println("El vector con la suma de filas es:");
        for (int i = 0; i < filas; i++) {
            System.out.print(" " + sumafil[i]);
        }
        System.out.println("");
        System.out.println("El vector con la suma de columnas es:");
        for (int i = 0; i < columnas; i++) {
            System.out.print(" " + sumacol[i]);
        }
        System.out.println("");
    }
}
