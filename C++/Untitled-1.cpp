#include <iostream>
#include <stdlib.h>

using namespace std;

struct Nodo
{
    int dato;
    Nodo *sig;
};

Nodo *head = NULL;
Nodo *end = NULL;
Nodo *crear(int _dato);
void insertar(Nodo **actual, int dato);
void recorrer(Nodo *actual);
void insertarF(Nodo **cabeza, Nodo **final, int n);
void buscar(Nodo *actual, int num);
void eliminar(Nodo **cabeza, Nodo **final, int n);

int main()
{
    int op, num;
    do
    {
        cout << "Insertar [1]: " << endl
             << "Recorrer [2]: " << endl
             << "Buscar   [3]: " << endl;
        << "Eliminar [4]: " << endl;
        << "Salir    [0]: " << endl;

        cin >> op;
        switch (op)
        {
        case 1:
            cout << "Digite elemento: ";
            cin >> num;
            insertarF(&head, &end, num);
            break;
        case 2:
            recorrer(head);
            break;
        case 3:
            cout << "Digite elemento: ";
            cin >> num;
            buscar(head, num);
            break;
        case 4:
            cout << "Digite elemento a eliminar: ";
            cin >> num;
            eliminar(&head, &end, num);
            break;
        default:
            break;
        }
    } while (op != 0);
    /* system("pause"); */
    return 0;
}

Nodo *crear(int _dato)
{
    Nodo *nuevo = new Nodo;
    nuevo->dato = _dato;
    nuevo->sig = NULL;
    return nuevo;
}
void insertar(Nodo **actual, int dato)
{
    Nodo *aux = crear(dato);
    aux->sig = *actual;
    *actual = aux;
}

void recorrer(Nodo *actual)
{
    while (actual != NULL)
    {
        cout << actual->dato << " ";
        actual = actual->sig;
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
void insertarF(Nodo **cabeza, Nodo **final, int n)
{
    Nodo *aux = crear(n);
    if (*cabeza == NULL)
    {
        *cabeza = aux;
        *final = aux;
    }
    else
    {
        (*final)->sig = aux;
        *final = (*final)->sig;
    }
}
void buscar(Nodo *actual, int num)
{
    int bandera = 0;
    while (actual != NULL)
    {
        if (actual->dato == num)
        {
            bandera = 1;
        }
        actual = actual->sig;
    }
    if (bandera == 1)
    {
        cout << "Si Esta...";
    }
    else
    {
        cout << "No Esta...";
    }
}
void eliminar(Nodo **cabeza, Nodo **final, int n)
{
    Nodo *aux;
    Nodo *actual;
    if (*cabeza == NULL)
    {
        cout << "No hay nada que eliminar...";
    }
    elseif(*cabeza->sig == NULL)
    {
        if (*cabeza->dato == n)
        {
            aux = *cabeza;
            *cabeza = NULL;
            *final == NULL;
            delete (aux);
        }
        else
        {
            cout << "El elememto no existe...";
        }
    }
    else
    {
        actual = *cabeza;
        while ((actual->sig != NULL) && (actual->sig->dato != n))
        {
            actual = actual->sig;
        }
        if (actual->sig == NULL)
        {
            cout << "El elememto no existe...";
        }
        else
        {
            aux = actual->sig;
            actual->sig = aux->sig;
            if (aux->sig == NULL)
            {
                *final == actual;
                delete (aux);
            }
        }
    }
}