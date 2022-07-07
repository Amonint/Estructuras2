import java.util.Scanner;

public class ListaDoble {
    public class listaDoble {

        public class Nodo {

            int tail;
            Nodo anterior, siguiente;
        }

        private Nodo head;

        public listaDoble() {
            head = null;
        }

        void insertar(int pos, int x) {
            if (pos <= cantidad() + 1) {
                Nodo nuevo = new Nodo();
                nuevo.tail = x;
                if (pos == 1) {
                    nuevo.siguiente = head;
                    if (head != null) {
                        head.anterior = nuevo;
                    }
                    head = nuevo;
                } else if (pos == cantidad() + 1) {
                    Nodo actual = head;
                    while (actual.siguiente != null) {
                        actual = actual.siguiente;
                    }
                    actual.siguiente = nuevo;
                    nuevo.anterior = actual;
                    nuevo.siguiente = null;
                } else {
                    Nodo act = head;
                    for (int i = 1; i <= pos - 2; i++) {
                        act = act.siguiente;
                    }
                    Nodo sig = act.siguiente;
                    act.siguiente = nuevo;
                    nuevo.anterior = act;
                    nuevo.siguiente = sig;
                    sig.anterior = nuevo;
                }
            }
        }

        public int extraer(int pos) {
            if (pos <= cantidad()) {
                int informacion;
                if (pos == 1) {
                    informacion = head.tail;
                    head = head.siguiente;
                    if (head != null) {
                        head.anterior = null;
                    }
                } else {
                    Nodo actual;
                    actual = head;
                    for (int f = 1; f <= pos - 2; f++) {
                        actual = actual.siguiente;
                    }
                    Nodo prox = actual.siguiente;
                    actual.siguiente = prox.siguiente;
                    Nodo siguiente = prox.siguiente;
                    if (siguiente != null) {
                        siguiente.anterior = actual;
                    }
                    informacion = prox.tail;
                }
                return informacion;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        public void borrar(int pos) {
            if (pos <= cantidad()) {
                if (pos == 1) {
                    head = head.siguiente;
                    if (head != null) {
                        head.anterior = null;
                    }
                } else {
                    Nodo reco;
                    reco = head;
                    for (int f = 1; f <= pos - 2; f++) {
                        reco = reco.siguiente;
                    }
                    Nodo prox = reco.siguiente;
                    prox = prox.siguiente;
                    reco.siguiente = prox;
                    if (prox != null) {
                        prox.anterior = reco;
                    }
                }
            }
        }

        public void intercambiar(int pos1, int pos2) {
            if (pos1 <= cantidad() && pos2 <= cantidad()) {
                Nodo reco1 = head;
                for (int f = 1; f < pos1; f++) {
                    reco1 = reco1.siguiente;
                }
                Nodo reco2 = head;
                for (int f = 1; f < pos2; f++) {
                    reco2 = reco2.siguiente;
                }
                int aux = reco1.tail;
                reco1.tail = reco2.tail;
                reco2.tail = aux;
            }
        }

        public int cantidad() {
            int cant = 0;
            Nodo reco = head;
            while (reco != null) {
                reco = reco.siguiente;
                cant++;
            }
            return cant;
        }

        public boolean existe(int n) {
            Nodo actual = head;
            while (actual != null) {
                if (actual.tail == n) {
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }

        public boolean listavacia() {
            return head == null;
        }

        public void imprimir() {
            Nodo reco = head;
            while (reco != null) {
                System.out.print(reco.tail + "\t");
                reco = reco.siguiente;
            }
            System.out.println();
        }

    }

    public void insertar(int i, int num) {
    }

    public void borrar(int num) {
    }

    public void intercambiar(int num, int num2) {
    }

    public void imprimir() {
    }
}