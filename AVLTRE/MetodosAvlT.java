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

    public void insertaEquilibrado(NodoAvl actual, int num) {
        if (actual == null) {
            NodoAvl nuevo = new nodoavl(num);
            altura = true;

            return nuevo;
        } else if (num > actual.dato) {
            actual.der = insertaEquilibrado(actual.der, num);
            if (altura) {
                switch (actual.fe) {
                    case -1:
                        actual.fe = 0;
                        altura = false;
                        break;

                    default:
                    case 0:
                        actual.fe = 1;
                        break;

                    case 1:
                        NodoAvl n1= actual.der;
                        if (n1.fe == 1) {
                            actual = rotacionDD(actual,n1);
                        }else{
                            actual=rotacionesDI(actual,n1);
                        }
                        
                        break;
                }
            }
        } else {
            actual.izq = insertaEquilibrado(actual.izq, num);
        }
    }

}
