/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadasc;

public class EnlazadasC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosABB obj = new MetodosABB();
        int op,num;
        do {
            op = obj.menu();
            switch (op) {
               case 1: System.out.println("ingrese dato");
               num=obj.entrada.nextInt();
               obj.raiz = obj.insertar(obj.raiz,num);
               case 2: obj.preOrden(obj.raiz);
               obj.inOrden(obj.raiz);
               obj.posOrden(obj.raiz);
               
            }
        } while (op != 0);
    }

}
