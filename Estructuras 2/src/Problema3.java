import java.util.Scanner;
/* 2. Dada una lista L de n X m elementos, diseñar un programa que calcule la suma de
números pares e impares contenidos en ella. */ 
public class Problema3 {
    public static void main (String[] args){
        // Entrada y declaracion de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca las filas:");
        int n=entrada.nextInt();
        System.out.println("Introduzca las columnas:");
        int m=entrada.nextInt();
        int L[][]= new int [n][m];
        System.out.printf("Introduzca la matriz de %d x %d \n", n, m);
        // Lectura de la matriz
        for (int i=0; i<L.length; i++){
        for (int j=0; j<L[i].length; j++){
        System.out.printf("Introduzca el elemento (%d,%d):\n", i, j);
        L[i][j]=entrada.nextInt();
       
        }
        }
        // Proceso
        int sumapares=0, sumaimpares=0;
        for (int i=0; i<L.length; i++){
        for (int j=0; j<L[i].length; j++){
        if ((L[i][j]%2)==0){
        sumapares+=L[i][j];
        }else{
        sumaimpares+=L[i][j];
        }
        }
        }
        // Salida de datos
        System.out.println("La suma de los numeros pares es: "+sumapares);
        System.out.println("La suma de los numeros impares es: "+sumaimpares);
        }
}
