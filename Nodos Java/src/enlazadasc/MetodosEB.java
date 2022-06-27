/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadasc;

import java.util.Scanner;

/**
 *
 * @author gilbertsolanosotomayor
 */
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
//        System.out.println(_id+" "+_nombre+" "+_tipo);
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
        char _tipo;
        entrada.nextLine();
        System.out.println("Ingrese ID del cliente: ");
        _id = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese nombre del cliente");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese tipo de cliente");
        _tipo = entrada.nextLine().charAt(0);
//        System.out.println(_id+" "+_nombre+" "+_tipo);
        Nodo nuevo = new Nodo(_id, _nombre, _tipo, _id, _id, _id);
       
        if (listaVacia()) {
            head = nuevo;
          
        } else {
            tail.sig=nuevo;
           
        }
       tail=nuevo;

    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println("Id: \t" + actual.alumno.id);
            System.out.println("Nombre: \t" + actual.alumno.nombre);
            System.out.println("Tipo: \t" + actual.alumno.tipo);
            actual = actual.sig;
        }

    }

}
