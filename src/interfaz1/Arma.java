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
public class Arma {
   String Nombre;
   byte [] image;

    public Arma(String Nombre, byte[] image) {
        this.Nombre = Nombre;
        this.image = image;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getNombre() {
        return Nombre;
    }

    public byte[] getImage() {
        return image;
    }
}
