/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadasc;


/**
 *
 * @author gilbertsolanosotomayor
 */
public class EnlazadasC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosEB obj = new MetodosEB();
        int op;
        do{
            op=obj.menu();
            switch (op) {
                case 1 -> obj.ingresarF();
                case 2 -> obj.recorrer();
                default -> {
                }
            }
        }while(op!=0);
    }
    
}
