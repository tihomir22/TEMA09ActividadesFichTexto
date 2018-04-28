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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ruta = "alumno.txt";
        int codigo, edad;
        String nombre, apellidos;
        char sexo;
        ArrayList<String> listaAlumnos = new ArrayList<>();
        do {
            System.out.println("Inserte codigo");
            codigo = teclado.nextInt();
            if (codigo != 0) {
                System.out.println("Inserte nombre");
                teclado.nextLine();
                nombre = teclado.nextLine();
                System.out.println("Inserte apellidos");
                apellidos = teclado.nextLine();
                System.out.println("Inserte edad");
                edad = teclado.nextInt();
                System.out.println("Inserte sexo");
                sexo = teclado.next().charAt(0);
                if (sexo != 'H' && sexo != 'h' && sexo != 'm' && sexo != 'M') {
                    System.out.println("Se produjo un error, introdujo un caracter incorrecto");
                } else {
                    String alumno = codigo + " " + nombre + " " + apellidos + " " + edad + " " + sexo;
                    listaAlumnos.add(alumno);
                }
            }

        } while (codigo != 0);
        if (listaAlumnos.size() > 0) {
            File destino = new File(ruta);
            try {
                PrintWriter pw = new PrintWriter(destino);
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    pw.println(listaAlumnos.get(i));
                }
                pw.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
