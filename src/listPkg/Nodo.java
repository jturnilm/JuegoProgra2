/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listPkg;

/**
 *
 * @author ubuntu
 */
public class Nodo {

    private Object Valor;
    private Nodo siguiente;
    
    Nodo(Object v)
    {
        System.out.println("nuevo nodo");
    this.Valor=v;
    }
    
    public Object get_valor(){
    return this.Valor;
    }
    
    public void set_valor(Object o){
        this.Valor=o;
    
    }
    
    public Nodo get_siguiente(){
    return this.siguiente;
    }
    public void set_siguiente(Nodo n)
    {
    this.siguiente=n;
    }
    
    
}
