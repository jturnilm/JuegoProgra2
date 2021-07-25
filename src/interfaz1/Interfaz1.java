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
public class Interfaz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //new frame().setVisible(true);
   // new frame().show();
   Juego j= new Juego();
frame a=   new frame(j);
a.show(true);

    }
    
}
