#include <iostream>
using namespace std;

struct Nodo{
    int dato;
    struct Nodo *izq;
    struct Nodo *der;
}
struct Nodo* raiz=NULL;
int menu(){
    int op;
    cout<<"Ingresar Elemento";
    cout<<"Ingresar Elemento";
    cout<<"Ingresar Elemento";
    cin>>op;
    return op;
}

Nodo* crearNodo(int _dato){
    *Nodo actual;
    actual=(struct Nodo*)malloc(sizeof(struct Nodo));
    actual->dato=_dato;
}


void insertar(Nodo** actual, int _dato){
    if(*actual==NULL)
        *actual=crearNodo(_dato);
    else{
        if((*actual)->dato==_dato)
            cout<<"No se puede ingresar elementos repetidos";
        else{
            if((*actual)->dato>_dato)
                insertar(&(*actual)->izq, _dato);
            else
                insertar(&(*actual)->der, _dato);
                
        }
    }
}
void inOrder(Nodo* actual){
    if(actual != NULL){
        inOrder(actual->izq);
        cout<<actual->dato<<" ";
        inOrder
    }
}
void preOrder(Nodo* actual){
    if(actual != NULL){
        inOrder(actual->izq);
        cout<<actual->dato<<" ";
        inOrder
    }
}
void posOrder(Nodo* actual){
    if(actual != NULL){
        inOrder(actual->izq);
        cout<<actual->dato<<" ";
        inOrder
    }
}
void eliminar(nodo**actual,int num){
    if(*actual==NULL)
    cout<<"Elemento no es en el arbol"endl;
    else if((*actual)->dato < num)
    eliminar(&(*actual)->der,num);
    else if((actual))->dato > num)
    eliminar(&(*actual)->izq,num);
    else{
        Nodo*aux = *actual;
        if(aux->izq==NULL)
        *actual=aux->der;
        else if(aux->der==NULL)
        *actual=aux->izq;
        else
        replazar(&aux);
        delete(aux);
    }
}
void reemplazar(Nodo** actual){
    Nodo* p = actual;
    Nodo* a = *actual->izq;
    while(a->der!NULL){
        p=a;
        a=a->der;
        
    }
    (*actual)->dato = a->dato;
    if(p == *actual){
        p->izq=a->izq
    }else{
        p->der=a->izq
    }
    *actual = a;

}

int main(){
    int op, num;
    do{
        op=menu();
        switch (op) {
            case 1:
                cout<<"Ingrese dato: ";
                cin>>num;
                insertar(&raiz, num);
                break;
            case 2:
                preOrden(raiz);
                cout<<endl;
                posOrder(raiz);
                break;
             case 3:
               cout<<"Ingrese dato a eliminar : ";
                cin>>num;
                eliminar(&raiz,num);
                break;
            default:
                break;
        }
    }while(op!=0);
    return 0;
    
}