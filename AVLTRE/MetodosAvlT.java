import java.util.Scanner;

public class MetodosAvlT {
    Scanner entrada;
    NodoAvl raiz;
    boolean altura;

    public MetodosAvlT(Scanner entrada, NodoAvl raiz, boolean altura) {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
        this.altura = false;
    }
    public NodoAvl rotaID(NodoAvl n, nodoAvl n1) {
        NodoAvl n2 = n1.der;
        n.izq= n2.der;
        n2.der=n;
        n1.der = n2.izq;
        n2.izq=n1;
        if (n2.fe == 1) {
            n1.fe=-1;
        }else{
            n1.fe=0;

        }if (n2.fe==-1) {
            n2.fe =1;
            

        }else{
            n.fe =0;
            n2.fe=0;
            return n2;
        }
    }
    public NodoAvl rotaDI(NodoAvl n, nodoAvl n1) {
        NodoAvl n2 = n1.izq;
        n.der= n2.izq;
        n2.izq=n;
        n1.izq = n2.der;
        n2.der=n1;
        if (n2.fe == 1) {
            n1.fe=-1;
        }else{
            n1.fe=0;

        }if (n2.fe==-1) {
            n2.fe =1;
            

        }else{
            n.fe =0;
            n2.fe=0;
            return n2;
        }
    }
    public NodoAvl rotacionesII(NodoAvl n, nodoAvl n1) {
        n.izq = n1.der;
        n1.der=n;
        if (n1.fe == -1) {
            n.fe=0;
            n1.fe =0;
        }else{
            n.fe=-1;
            n1.fe=-1;
        }
        return n1;
    }
    public NodoAvl rotacionesDD(NodoAvl n, nodoAvl n1) {
        n.der = n1.izq;
        n1.izq=n;
        if (n1.fe == n1) {
            n.fe=0;
            n1.fe =0;
        }else{
            n.fe=1;
            n1.fe=-1;
        }
        return n1;
    }

    public void insertaEquilibrado(NodoAvl actual, int num) {
        if (actual == null) {
            NodoAvl nuevo = new nodoavl(num);
            altura = true;

            return nuevo;
        } else if (num > actual.dato) {
            actual.der = insertaEquilibrado(actual.der, num);
            if (altura) {
                switch (actual.fe) {
                    case 1:
                        actual.fe = 0;
                        altura = false;
                        break;
                    case 0:
                        actual.fe = -1;
                        break;

                    case -1:
                        NodoAvl n1= actual.der;
                        if (n1.fe == -1) {
                            actual = rotacionII(actual,n1);
                        }else{
                            actual=rotacionesID(actual,n1);
                            altura= false;
                        }
                        
                        break;
                }
            }
        } else {
            actual.izq = insertaEquilibrado(actual.izq, num);
        }
    }

}
