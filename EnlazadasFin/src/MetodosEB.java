import java.util.Scanner;

public class MetodosEB {
    Nodo head;
    Nodo tail;
    Nodo raiz;
    Nodo respaldo;
    Scanner entrada;
    int tamanio = 0;

    public MetodosEB() {
        this.head = new Nodo();
        this.tail = new Nodo();
        this.entrada = new Scanner(System.in);
        head.sig = null;
        tail.anterior = null;
    }

    public int menu() {
        int opc;
        System.out.println("Ingresar nuevo elemento [1]:");
        System.out.println("Recorrer lista [2]: ");
        System.out.println("Eliminar [3]:");
        System.out.println("Salir [0]: ");
        opc = entrada.nextInt();
        return opc;
    }

    public boolean listaVacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public int cant() {
        int c = 0;
        Nodo recorrer = raiz;
        while (recorrer != null) {
            recorrer = recorrer.sig;
            c++;
        }
        return c;
    }

    public void ingresar() {
        int _id, n1, n2, n3, _edad;
        String _nombre;
        System.out.println("Ingrese la posicion");
        int pos = entrada.nextInt();
        System.out.println("Ingrese ID del cliente: ");
        _id = entrada.nextInt();
        System.out.println("Ingrese nombre del cliente");
        entrada.nextLine();
        _nombre = entrada.nextLine();
        System.out.println("Ingrese edad");
        _edad = entrada.nextInt();
        System.out.println("Ingrese nota 1");
        n1 = entrada.nextInt();
        System.out.println("Ingrese nota 2");
        n2 = entrada.nextInt();
        System.out.println("Ingrese nota 3");
        n3 = entrada.nextInt();
        if (pos <= cant() + 1) {
            Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);
            // nuevo.alumno = p;
            if (pos == 1) {
                nuevo.sig = raiz;
                if (raiz != null) {
                    raiz.anterior = nuevo;
                }
                raiz = nuevo;
            } else {
                if (pos == cant() + 1) {
                    Nodo recorrer = raiz;
                    while (recorrer.sig != null) {
                        recorrer = recorrer.sig;
                    }
                    recorrer.sig = nuevo;
                    nuevo.anterior = recorrer;
                    nuevo.sig = null;
                } else {
                    Nodo recorrer = raiz;
                    for (int i = 1; i <= pos - 2; i++) {
                        recorrer = recorrer.sig;
                    }
                    Nodo siguiente = recorrer.sig;
                    recorrer.sig = nuevo;
                    nuevo.anterior = recorrer;
                    nuevo.sig = siguiente;
                    siguiente.anterior = nuevo;
                }
            }
        }
    }

    public void recorrer() {
        Nodo actual = raiz;
        float prom;
        while (actual != null) {
            System.out.println("Id:" + actual.alumno.id);
            System.out.println("Nombre:" + actual.alumno.nombre);
            System.out.println("Edad:" + actual.alumno.edad);
            prom = (actual.alumno.notas[0] + actual.alumno.notas[1]
                    + actual.alumno.notas[2] / 3);
            System.out.println("Promedio :" + prom + "\n");
            actual = actual.sig;
        }
    }

    public void borrar() {
        System.out.println("Ingrese la posicion");
        int pos = entrada.nextInt();
        if (pos <= cant()) {
            if (pos == 1) {
                raiz = raiz.sig;
                if (raiz != null) {
                    raiz.anterior = null;
                }
            } else {
                Nodo recorrer = raiz;
                for (int i = 1; i <= pos - 2; i++) {
                    recorrer = recorrer.sig;
                }
                Nodo proximo = recorrer.sig;
                proximo = proximo.sig;
                recorrer.sig = proximo;
                if (proximo != null) {
                    proximo.anterior = recorrer;
                }
            }
        }
    }
}
