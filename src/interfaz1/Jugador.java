/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz1;

/**
 *
 * @author ubuntu
 */
public class Jugador {
   private String nombre;
   private byte image[];
   private String nombre_imagen;

    public Jugador(String nombre, byte[] image, String nombre_imagen) {
        this.nombre = nombre;
        this.image = image;
        this.nombre_imagen = nombre_imagen;
    }

    public void setNombre_imagen(String nombre_imagen) {
        this.nombre_imagen = nombre_imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public byte[] getImage() {
        return image;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getNombre_imagen() {
        return nombre_imagen;
    }
    public String toString()
    {
    return "nombre:"+this.nombre+" archivo:"+this.nombre_imagen;
    }
    
}
