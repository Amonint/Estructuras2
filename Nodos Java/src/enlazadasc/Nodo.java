/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadasc;


public class Nodo {
    Persona alumno;
    Nodo sig;
    
    public Nodo(int _id, String _nombre, int _edad,int n1,int n2,int n3){
        this.alumno =new Persona(_id,_nombre,_edad,n1,n2,n3);
        this.sig=null;
    }
    
}
