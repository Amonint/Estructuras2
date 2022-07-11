package enlazadasc;

import java.util.Scanner;

public class MetodosABB {
    Scanner entrada;
    NodoABB raiz;
    public MetodosABB(){
        this.raiz=null;
        this.entrada=new Scanner(System.in);
    }
    public int menu() {
        int opc;
        System.out.println("Ingresar nuevo elemento [1]:");
        System.out.println("Recorrer lista [2]: ");
        System.out.println("Eliminar Nodo");
        System.out.println("Salir [0]: ");
        opc = entrada.nextInt();

        return opc;
    }
    public NodoABB insertar(NodoABB actual,int num) {
        if(actual==null){
            NodoABB nuevo = new NodoABB(num);
            return nuevo;
        }else{
            if (actual.dato==num) {
                System.out.println("dato repetido");
                
            }else{
                if (actual.dato>num) {
                    actual.izq=insertar(actual.izq, num);
                }else{
                    actual.der=insertar(actual.der, num);
                }
            }
        }
        return actual;
        
    }
    public void preOrden(NodoABB actual) {
        if (actual!=null) {
            System.out.println(actual.dato+" ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
        
    }
    public void inOrden(NodoABB actual) {
        if (actual!=null) {
            inOrden(actual.izq);
            System.out.println(actual.dato+" ");
            inOrden(actual.der);
        }
        
    }
    public void posOrden(NodoABB actual) {
        if (actual!=null) {
            posOrden(actual.izq);
            System.out.println(actual.dato+" ");
            posOrden(actual.der);
        }
        
    }
}
