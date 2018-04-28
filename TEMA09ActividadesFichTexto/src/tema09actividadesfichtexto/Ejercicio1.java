/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichtexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String ruta = "C:\\prueba1/911.txt";
        File fich1 = new File(ruta);
        String linea = "";
        String[] listaPalabras;
        int i = 0;
        if (fich1.exists()) {
            try {
                Scanner sc = new Scanner(fich1);
                while (sc.hasNext()) {
                    linea = linea + sc.nextLine();
                }

                listaPalabras = linea.split(" ");
                System.out.println("El archivo tiene "+listaPalabras.length+" palabras");
                System.out.println("El archivo tiene "+contarCaracteres(linea)+"caracteres");
                System.out.println("La longitud media de una palabra es "+contarCaracteres(linea)/listaPalabras.length);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No existe");
        }
    }

    public static int contarCaracteres(String linea) {
        return linea.length();
    }
}
