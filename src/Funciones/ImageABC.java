/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import interfaz1.frame;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.imageio.ImageIO;

/**
 *
 * @author ubuntu
 */
public class ImageABC {
    
   public byte[] FileToByteArray(File Archivo) throws IOException
   {
        byte [] arb;
       BufferedImage bi;
   
        bi = ImageIO.read(Archivo);
        ByteArrayOutputStream baos= new ByteArrayOutputStream();
        ImageIO.write(bi, "jpg", baos);
     arb=  baos.toByteArray();
     
      
      
      return arb;
        
     
   
   }
}
