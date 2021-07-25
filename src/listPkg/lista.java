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
public class lista {
    private Nodo header;
    private Nodo aux;
    private Nodo Iterador;
    public void insertar(Object o)
    {
        if(header==null)
        {
        header= new Nodo(o);
        
        }
        else
        {
        insertar_siguiente(o);
        }
    }
    private void insertar_siguiente(Object o)
    {
        System.out.println("metodo insertar ");
        if(this.header.get_siguiente()==null)
        {
         //   Nodo temp= new Nodo(numero,llave);
         //   this.header.set_siguiente(temp);
            this.header.set_siguiente(new Nodo(o));
            
        }
        else
        {
            aux=this.header.get_siguiente();
            while(aux!=null)
            {
            aux=aux.get_siguiente();
            }
            aux.set_siguiente(new Nodo(o));
        }
    }
 public   String imprimir()
    {
        Nodo a=this.header;
        System.out.println("imprimiendo");
        String valor="";
    while(a!=null)
    {
       valor=valor+" valor:"+a.get_valor().toString();
       valor=valor+System.lineSeparator();
    a=a.get_siguiente();
    }
    return valor;
    }
    
 public Nodo Siguiente()
 {
     if(Iterador==null)
     {
         Iterador=this.header;
     }
     else
     {
         Iterador=Iterador.get_siguiente();
         if(Iterador==null)  Iterador=this.header;
             
     }
     return Iterador;
 }
}
