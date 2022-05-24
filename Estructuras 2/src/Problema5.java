import java.util.Scanner;

public class Problema5 {
    public static void main (String[] args){
        // Entrada y declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int A[] = new int [10];
      
        double suma=0, media=0;
        for (int i=0; i<A.length; i++){
        System.out.println("Ingrese las ventas del almacen "+i);
        A[i]=entrada.nextInt();
        suma+=A[i];
        }
        media=suma/A.length;
        // Salida de datos
        System.out.print("Las ventas por almacen son: \n[ ");
        for (int i=0; i<A.length; i++){
        System.out.print(A[i]+", ");
        }
        System.out.print(" ]\nLa media es: "+media+"\n");
        System.out.println("Los almacenes que superan la media son:");
        for (int i=0; i<A.length; i++){
        if (A[i]>media){
        System.out.print(i+", ");
        }
        }
        System.out.println("");
        }
}
