import java.util.Scanner;

import enlazadasc.NodoABB;

public class MetodosEB {
    Scanner entrada = new Scanner(System.in);
    Nodo head;
    Nodo tail;
    public MetodosEB name() {
        this.head=null;
        this.tail = null;
    }
    public boolean listaVacia() {
        if (head==null) {
            return true;
        }else{
            return false;
        }
        
    }

    public void insertar(int _id,String _nombre){
        Nodo nuevo = new Nodo(_id,_nombre);
        if (listaVacia()) {
            head= nuevo;
            tail=nuevo;
        } else {
            tail.sig=nuevo;
            tail= tail.sig;
        }
    }
}
