import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese tamaño del cuadrado");
        n=entrada.nextInt();
        if(n>=0 && n<=50){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            for(int i=0; i<n-2;i++){
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
        }else{
            System.out.println("Error");
        }
    }
}
