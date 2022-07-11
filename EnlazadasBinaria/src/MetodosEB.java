import java.util.Scanner;



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
    public void recorrer(Nodo head) {
        Nodo actual=head;
        while (actual!=null) {
            System.out.println(actual.cliente.id+":"+actual.cliente.nombre);
            actual=actual.sig;

        }
    }
    public void listaArbol() {
        Nodo actual= head;
        while (actual!=null) {
            raiz = sembrar(actual.cliente.id,actual.cliente.nombre);
            actual=actual.sig;
        }
    }
    public NodoA sembrar(NodoA X, int _id, String _nombre ) {
        if (x==null) {
            NodoA nuevo = new NodoA(_id,_nombre);
            return nuevo;
        } else if(_id<X.cliente.id){
            X.izq=sembrar(X, _id, _nombre);
            return X;
        }
    }
    public void inorden(NodoA actual) {
        if (actual!=null) {
            inorden(actual.izq);
            System.out.println(actual.cliente.id+);
        }
    }
}
