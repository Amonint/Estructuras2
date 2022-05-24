import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        // Entrada y declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int A[][] = new int[20][5];
        double suma = 0, media = 0, suma_media = 0, media_total = 0;
        double suma2 = 0, media2 = 0;
        double ceros = 0;
        // Proceso por alumno
        for (int i = 0; i < A.length; i++) {
            System.out.println("Introduzca la nota del estudiante " + i + ":");
            suma = 0;
            for (int j = 0; j < A[i].length; j++) {
                media = 0;
                System.out.println("Introduzca la nota de la asignatura " + j + ":");
                A[i][j] = entrada.nextInt();
                suma += A[i][j];
            }
            media = suma / 5;
            suma_media += media;
            System.out.println("La media del estudiante " + i + " es: " + media);
        }
        media_total = suma_media / 20;
        System.out.println("La media general de la clase es: " + media_total);
        // Proceso por asignatura y faltas
        for (int j = 0; j < 5; j++) {
            suma2 = 0;
            for (int i = 0; i < 20; i++) {
                suma2 += A[i][j];
                if (A[i][j] == 0) {
                    ceros++;
                }
            }

            media2 = suma2 / 20;
            System.out.println("La media de la asignatura " + j + " es: " + media2);
        }
        System.out.println("El porcentaje de faltas es: " + ceros + "%");
    }
}
