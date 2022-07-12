public class EnlazadasC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosEB obj = new MetodosEB();
        int op;
        do {
            op = obj.menu();
            switch (op) {

                case 1 ->
                    obj.ingresar();

                case 2 ->
                    obj.recorrer();
                case 3 ->
                    obj.borrar();

                default -> {
                }
            }
        } while (op != 0);
    }

}
