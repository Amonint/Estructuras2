import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        // Entrada y declaracion de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENÚ \n"
                + "1. Multiplicacion de matrices\n"
                + "2. Suma de matrices\n"
                + "3. Resta de matrices\n"
                + "4. Multiplicacion por un escalar\n"
                + "5. Traspuesta de una matriz");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                // A[axb], B[bxa]

                break;
            case 2:
                System.out.println("Introduzca el tamaño de las matrices:");
                int lim = entrada.nextInt();
                int A[][] = new int[lim][lim];
                int B[][] = new int[lim][lim];
                int C[][] = new int[lim][lim];
                System.out.println("Introduzca la matriz A:");
                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        A[i][j] = entrada.nextInt();
                    }
                }
                System.out.println("Introduzca la matriz B:");
                for (int i = 0; i < B.length; i++) {
                    for (int j = 0; j < B[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        B[i][j] = entrada.nextInt();
                    }
                }
                for (int i = 0; i < C.length; i++) {
                    for (int j = 0; j < C[i].length; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }
                System.out.println("La suma es:");
                for (int i = 0; i < C.length; i++) {
                    for (int j = 0; j < C[i].length; j++) {
                        System.out.print(" " + C[i][j]);
                    }
                }
                System.out.println("");

                break;
            case 3:
                System.out.println("Introduzca el tamaño de las matrices:");
                int lim2 = entrada.nextInt();
                int X[][] = new int[lim2][lim2];
                int Y[][] = new int[lim2][lim2];
                int Z[][] = new int[lim2][lim2];
                System.out.println("Introduzca la matriz A:");
                for (int i = 0; i < X.length; i++) {
                    for (int j = 0; j < X[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        X[i][j] = entrada.nextInt();
                    }
                }
                System.out.println("Introduzca la matriz B:");
                for (int i = 0; i < Y.length; i++) {
                    for (int j = 0; j < Y[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        Y[i][j] = entrada.nextInt();
                    }
                }
                for (int i = 0; i < Z.length; i++) {
                    for (int j = 0; j < Z[i].length; j++) {
                        Z[i][j] = X[i][j] - Y[i][j];
                    }
                }
                System.out.println("La resta es:");
                for (int i = 0; i < Z.length; i++) {
                    for (int j = 0; j < Z[i].length; j++) {
                        System.out.print(" " + Z[i][j]);
                    }
                }
                System.out.println("");

                break;
            case 4:
                System.out.println("Introduzca el tamaño de la matriz:");
                int lim3 = entrada.nextInt();
                int a[][] = new int[lim3][lim3];
                System.out.println("Introduzca la matriz A:");
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        a[i][j] = entrada.nextInt();
                    }
                }
                System.out.println("Introduzca el escalar:");
                int esc = entrada.nextInt();
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        a[i][j] = a[i][j] * esc;
                    }
                }
                System.out.println("La matriz resultante es:");
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.print(" " + a[i][j]);
                    }
                }
                System.out.println("");
                break;
            case 5:
                System.out.println("Introduzca el tamaño de la matriz:");
                int lim4 = entrada.nextInt();
                int b[][] = new int[lim4][lim4];
                System.out.println("Introduzca la matriz A:");
                for (int i = 0; i < b.length; i++) {

                    for (int j = 0; j < b[i].length; j++) {
                        System.out.println("Introduzca el elemento (" + i + "," + j + "):");
                        b[i][j] = entrada.nextInt();
                    }
                }
                System.out.println("La matriz traspuesta es:");
                for (int j = 0; j < b.length; j++) {
                    for (int i = 0; i < b[j].length; i++) {
                        System.out.print(" " + b[i][j]);
                    }
                }
                System.out.println("");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                break;
        }
    }
}
