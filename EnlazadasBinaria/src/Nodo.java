import enlazadasc.Persona;

public class Nodo {
    Persona cliente;
    Nodo sig;

    public Nodo(Persona cliente, Nodo sig) {
        this.cliente = cliente;
        this.sig = sig;
    }

    public Nodo (int _id, String _nombre) {
        this.cliente = new Persona(_id, _nombre);
        this.sig = null;
    }
}
