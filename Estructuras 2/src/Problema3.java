import java.util.Scanner;

/* 2. Dada una lista L de n X m elementos, diseñar un programa que calcule la suma de
números pares e impares contenidos en ella. */
public class Problema3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca las filas:");
        int a = entrada.nextInt();
        System.out.println("Introduzca las columnas:");
        int b = entrada.nextInt();
        int arreglo[][] = new int[a][b];
        System.out.printf("Introduzca la matriz de %d x %d \n", a, b);
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.printf("Introduzca el elemento (%d,%d):\n", i, j);
                arreglo[i][j] = entrada.nextInt();

            }
        }
        int sumapares = 0, sumaimpares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if ((arreglo[i][j] % 2) == 0) {
                    sumapares += arreglo[i][j];
                } else {
                    sumaimpares += arreglo[i][j];
                }
            }
        }
        // Salida de datos
        System.out.println("La suma de los numeros pares es: " + sumapares);
        System.out.println("La suma de los numeros impares es: " + sumaimpares);
    }
}
