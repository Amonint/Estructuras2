#include <iostream>
#include <stdlib.h>

using namespace std;

struct Nodo{
    int dato;
    Nodo *sig;
};

Nodo* head=NULL;
Nodo* end=NULL;
Nodo* crear(int _dato);
void insertar(Nodo** actual, int dato);
void recorrer(Nodo* actual);
void insertarF(Nodo** cabeza, Nodo** final, int n);

int main()
{
    int op, num;
    do
    {
        cout << "Insertar [1]: " <<endl
            << "Recorrer [2]: " <<endl
            << "Salir [0]: " <<endl;
        cin >> op;
        switch (op)
        {
        case 1:
            cout << "Digite elemento: ";
            cin >> num;
            insertarF(&head,&end,num);
            break;
        case 2:
            recorrer(head);
            break;
        default:
            break;
        }
    } while (op!=0);
    /* system("pause"); */
    return 0;
}

Nodo* crear(int _dato){
    Nodo* nuevo = new Nodo;
    nuevo->dato = _dato;
    nuevo->sig = NULL;
    return nuevo;
}
void insertar(Nodo** actual, int dato)
{
    Nodo* aux = crear(dato);
    aux ->sig=*actual;
    *actual=aux;
}

void recorrer(Nodo* actual)
{
    while(actual!=NULL)
    {
        cout << actual->dato << " ";
        actual=actual->sig;
    }
    cout << endl;
}
/*
bool listavacia(Nodo* actual){
    if(actual==NULL)
        return true;
    else
        return false;
}*/
/*
 void insertarF(Nodo** head, int dato){
    Nodo* aux=crear(dato);
    if(*head==NULL)
        *head=aux;
    else{
        Nodo* ac=*head;
        while (ac->sig!=NULL)
            ac=ac->sig;
            ac->sig=aux;

        
        }
      */
                void insertarF(Nodo** cabeza, Nodo** final, int n){
                   Nodo* aux=crear(n);
                    if(*cabeza==NULL){
                       *cabeza=aux;
                        *final=aux;
                    
                    }
                else{
                    (*final)->sig=aux;
                    *final=(*final)->sig;
                       
                       }
                }