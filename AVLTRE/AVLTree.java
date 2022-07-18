public class MetodosAVL {
    public static void main(String[] args) {
      MetodosAvlT myArbol= new MetodosAvlT();
    int opc, num;
        do{
        opc=myArbol.menu();
        switch (opc) {
            case 1:
                System.out.println("Diguite el numero a ingresar 1");
                num= myArbol.entrada.nextInt();
                myArbol.raiz= myArbol.insertaEquilibrado(myArbol.raiz,num);
                break;
            case 2:
                myArbol.preOrden(myArbol.raiz);
                System.out.println("\n");
                break;
        
                default: break;
                
        }while (opc !=0) {
            
        }
     
    
}    
    
}    
}
