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
        int A[][]= new int [filas][columnas];
        System.out.printf("Introduzca la matriz de %d x %d \n", filas, columnas);
        // Lectura de la matriz
        for (int i=0; i<A.length; i++){
        for (int j=0; j<A[i].length; j++){
        System.out.printf("Introduzca el elemento (%d,%d):\n", i, j);
        A[i][j]=entrada.nextInt();
        }
        }
        // Proceso
        int sumafilas[] = new int[filas];
        int sumacolumnas[] = new int[columnas];
        // Suma filas
        for (int i=0; i<filas; i++){
        int suma=0;
        for (int j=0; j<columnas; j++){
        suma+=A[i][j];
        }
        sumafilas[i]=suma;
        }
        // Suma columnas
        for (int j=0; j<columnas; j++){
        int suma=0;
        for (int i=0; i<filas; i++){
        suma+=A[i][j];
        }
        sumacolumnas[j]=suma;
        }
        // Salida de datos
        System.out.println("El vector con la suma de filas es:");
        for (int i=0; i<filas; i++){
        System.out.print(" "+sumafilas[i]);
        }
        System.out.println("");
        System.out.println("El vector con la suma de columnas es:");
        for (int i=0; i<columnas; i++){
        System.out.print(" "+sumacolumnas[i]);
        }
        System.out.println("");
        }
}
