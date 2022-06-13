# Estructuras2
#include <iostream>
#include <conio.h>
#include <stdlib.h>
using namespace std;
struct nodo
{
    int dato;
    nodo *sig;
} nodo *head *NULL;
nodo *crear(int dato);
void insertar(nodo **actual, int dato);
void recorre(nodo *actual);
void insertarF(nodo** head, int dato );


int main()
{
    int op, num;
    do
    {
        cout << "Insertar [1" << endl cout << "Insertar [2" << endl cout << "Insertar [3" << endl cin >> op;
        switch (op)
        {
        case1:
            cout << "digite";
            cin >> num;
            insertar(&head, num);
            break;
        default:
            break;
        }
    }
    While(op != 0);
    system("PAUSE");
    return 0;
}
nodo *crear(int dato)
{
    Nodo *nuevo;
    nuevo = new nodo;
    nuevo->dato = _dato;
    nuevo->sig = NULL;
    return nuevo;
}
void insertar(nodo **actual, int dato)
{
    nodo *aux = crear(dato);
    aux->sig = *actual;
    *actual = aux;
}
void recorre(nodo *actual)
{
    while (actual != NULL)
    {
        cout << actual->dato << " ";
        actual = actual->sig;
    }
    cout << endl;
}
/* bool listaVacia(nodo *actual)
{
    if (actual == NULL)
        return true;
    else
        return false;
} */
void insertarF(nodo** head, int dato ){
    if(head== NULL)
    *head=crear(dato);
    else{
        nodo* aux=*head->sig;
        while(aux!=NULL)
        aux=aux.sig;
        aux=crear(dato)
        ;
    }
}
}
