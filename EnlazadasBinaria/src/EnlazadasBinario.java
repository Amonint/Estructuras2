import java.util.List;

public class EnlazadasBinario {
    public static void main(String[] args) throws Exception {
        MetodosEB obj = new MetodosEB();
        int _id,op;
        String _nombre;
        do {
            System.out.println("Ingrese Id: ");
            _id=obj.entrada.nextInt();
            obj.entrada.nextline();
            System.out.println("Ingrese Nombre");
            _nombre=obj.entrada.nextline();
            obj.insertar(_id,_nombre);
            System.out.println("Desea insertar otro Cliente [1");
            op=obj.entrada.nextInt();

        } while (op!=1);
        listaArbol(obj.head);
        inorden(obj.raiz);
    }
}
