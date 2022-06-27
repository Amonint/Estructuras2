/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadasc;

import java.util.Scanner;

public class MetodosEB {

    Nodo head;
    Nodo tail;
    Scanner entrada;

    public MetodosEB() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);

    }

    public int menu() {
        int opc;
        System.out.println("Ingresar nuevo elemento [1]:");
        System.out.println("Recorrer lista [2]: ");
        System.out.println("Eliminar [3]: ");
        System.out.println("Salir [0]: ");
        opc = entrada.nextInt();

        return opc;
    }

    public boolean listaVacia() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresar() {
        int _id;
        String _nombre;
        char _tipo;
        entrada.nextLine();
        System.out.println("Ingrese ID del cliente: ");
        _id = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese nombre del cliente");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese tipo de cliente");
        _tipo = entrada.nextLine().charAt(0);
        // System.out.println(_id+" "+_nombre+" "+_tipo);
        Nodo nuevo = new Nodo(_id, _nombre, _tipo, _id, _id, _id);
        nuevo.sig = head;
        if (listaVacia()) {
            tail = nuevo;
        }
        head = nuevo;

    }

    public void ingresarF() {
        int _id;
        String _nombre;

        entrada.nextLine();
        System.out.println("Ingrese ID del cliente: ");
        _id = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese nombre del cliente");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese Edad de cliente");
        int _edad = entrada.nextInt();
        System.out.println("Ingrese la nota 1");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2");
        int n2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3");
        int n3 = entrada.nextInt();
        // System.out.println(_id+" "+_nombre+" "+_tipo);
        Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);

        if (listaVacia()) {
            head = nuevo;

        } else {
            tail.sig = nuevo;

        }
        tail = nuevo;

    }

    public void ingresarO() {
        int _id;
        String _nombre;

        entrada.nextLine();
        System.out.println("Ingrese ID del cliente: ");
        _id = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese nombre del cliente");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese edad de cliente");
        int _edad = entrada.nextInt();
        System.out.println("Ingrese la nota 1");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2");
        int n2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3");
        int n3 = entrada.nextInt();
        // System.out.println(_id+" "+_nombre+" "+_tipo);
        Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);

        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;

        } else {
            if (_id < nuevo.alumno.id) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (_id > actual.alumno.id))
                    actual = actual.sig;
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                if (nuevo.sig == null) {
                    tail = nuevo;
                }
            }

        }
        tail = nuevo;

    }

    public void recorrer() {
        Nodo actual = head;
        float prom;
        while (actual != null) {
            System.out.println("Id: \t" + actual.alumno.id);
            System.out.println("Nombre: \t" + actual.alumno.nombre);
            System.out.println("Edad: \t" + actual.alumno.edad);
            prom = (actual.alumno.notas[0] + actual.alumno.notas[1] + actual.alumno.notas[2] / 3);
            System.out.println("Promedio: \t" + prom + "");
            actual = actual.sig;
        }

    }

    public void eliminar() {
        int _id;

        entrada.nextLine();
        System.out.println("Ingrese ID del cliente: ");
        _id = entrada.nextInt();
        if (listaVacia()) {
            System.out.println("No hay elementos a eliminar...");

        } else {
            if (_id == head.alumno.id) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }

            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (_id != actual.alumno.id))
                    actual = actual.sig;
                if (actual == tail) {
                    System.out.println("El elemento no exite");
                } else {
                    actual.sig = actual.sig.sig;
                    if (actual.sig == null) {
                        tail = actual;
                    }
                }

            }
        }

    }

}
