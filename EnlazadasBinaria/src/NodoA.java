
public class NodoA {
    Persona cliente;
    NodoA izq;
    NodoA der;
    public NodoA(Persona cliente, NodoA izq, NodoA der) {
        this.cliente = cliente;
        this.izq = null;
        this.der = null;
    }


}
