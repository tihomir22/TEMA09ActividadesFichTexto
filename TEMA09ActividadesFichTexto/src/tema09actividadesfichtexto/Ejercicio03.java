/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09actividadesfichtexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector listaPalabras = new Vector();
        Scanner teclado = new Scanner(System.in);
        String ruta, ocurrencia, palabra;
        System.out.println("Introduzca ruta del fichero");
        ruta = teclado.nextLine();
        File fich1 = new File(ruta);
        if (fich1.exists() && fich1.isFile()) {
            System.out.println("Que ocurrencias quieres eliminar? Introduce una cadena");
            ocurrencia = teclado.nextLine();
            try {
                Scanner sc = new Scanner(fich1);
                while (sc.hasNext()) {

                    palabra = sc.next();
                    if (palabra.equalsIgnoreCase(ocurrencia)) {
                        System.out.println("Ocurrencia encontrada");
                    } else {
                        listaPalabras.add(palabra);
                    }
                }
                File fich2 = new File(fich1.getParent() + "/" + obtenerNombreSinExtension(fich1.getName()) + "_" + detectarPrimeraVez(fich1.getName()) + ".txt");
                sc.close();
                try {
                    PrintWriter tw = new PrintWriter(fich2);
                    for (int i = 0; i < listaPalabras.size(); i++) {
                        tw.println(listaPalabras.get(i));
                    }
                    tw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No existe o no es un archivo");
        }
    }

    public static String obtenerNombreSinExtension(String filename) {
        String extension = "";
        for (int i = 0; i < filename.length(); i++) {
            if (filename.charAt(i) == '.') {
                System.out.println("Se encontró el punto");
                break;
            } else {
                extension = extension + filename.charAt(i);
            }
        }
        return extension;
    }

    public static int detectarPrimeraVez(String filename) {
        String res = "";
        boolean puntoEncontrado = false;
        for (int i = 0; i < filename.length(); i++) {
            if (filename.charAt(i) == '_' && puntoEncontrado == false) {
                res = res + filename.charAt(i);
            }
            if (filename.charAt(i) == '.') {
                puntoEncontrado = true;
            }
        }
        if (res.equalsIgnoreCase("")) {
            res = "2";
            return Integer.parseInt(res);
        } else {
            int devolver = Integer.parseInt(res);
            devolver =devolver+1;
            return devolver;
        }

    }

}
