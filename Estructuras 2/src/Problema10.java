import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int A[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                A[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Introduzca el elemento (" + i + "," + j + "):");
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(A[j][i]);
            }
            System.out.println("\n");
        }
    }   
}
