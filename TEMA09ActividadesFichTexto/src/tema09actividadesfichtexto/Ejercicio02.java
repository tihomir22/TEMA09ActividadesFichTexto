/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichtexto;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        String ruta = "C:\\prueba1/911.txt";
        String busqueda,linea;
        Scanner teclado = new Scanner(System.in);
        File fich1 = new File(ruta);
        int i=0;
        if (fich1.exists()) {
            System.out.println("Introduce palabra a buscar!");
            busqueda=teclado.nextLine();
            try {
                Scanner sc = new Scanner(fich1);
                while(sc.hasNext()){
                    linea=sc.nextLine();
                    if(linea.contains(busqueda)){
                        System.out.println("La linea numero "+i+"contiene la palabra "+busqueda+" y su contenido es: ");
                        System.out.println(linea);                  
                    }
                    i++;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio02.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No existe!");
        }

    }
}
