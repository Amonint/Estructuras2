/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadasc;


public class Persona {
    int id,edad;
    String nombre;
    int[] notas;
    public String tipo;
    
    public Persona(int _id, String _nombre, int _edad, int n1,int n2,int n3 ){
        this.id=_id;
        this.nombre=_nombre;
        this.edad = _edad;
        this.notas=new int[3];
        this.notas[0]=n1;
        this.notas[1]=n2;
        this.notas[2]=n3;
    }

    
    
}
