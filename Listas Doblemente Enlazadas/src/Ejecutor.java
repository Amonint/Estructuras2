import java.util.Scanner;


public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaDoble lD = new ListaDoble();

        int opc;
        do {

            System.out.println("Ingresar elementos              [1]:");
            System.out.println("Eliminar elemento               [2]:");
            System.out.println("Intercambiar nodos              [3]:");
            System.out.println("Presentar                       [4]:");
            System.out.println("Salir                           [0]:");
            opc = entrada.nextInt();

            if (opc == 1) {
                boolean bandera = true;
                while (bandera) {
                    int i = 1, num;
                    System.out.println("Ingrese un número a insertar");
                    num = entrada.nextInt();
                    lD.insertar(i, num);
                    i++;
                    entrada.nextLine();
                    System.out.println("Ingrese s para dejar de ingresar números");
                    String a = entrada.nextLine();
                    if ("s".equals(a) || "S".equals(a)) {
                        bandera = false;
                    }
                }
            } else {
                if (opc == 2) {

                    int num;
                    System.out.println("Ingrese la posición a eliminar");
                    num = entrada.nextInt();
                    lD.borrar(num);
                } else {
                    if (opc == 3) {
                        int num, num2;
                        System.out.println("Ingrese la posición 1 a intercambiar:");
                        num = entrada.nextInt();
                        System.out.println("Ingrese la posición 2 a intercambiar:");
                        num2 = entrada.nextInt();
                        lD.intercambiar(num, num2);

                    } else {
                        if (opc == 4) {
                            lD.imprimir();
                        }
                    }
                }
            }

        } while (opc != 0);

    }

}

