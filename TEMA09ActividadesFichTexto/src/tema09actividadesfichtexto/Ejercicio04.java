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
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File pares = new File("pares.txt");
            File impares = new File("impares.txt");
            Scanner par1 = new Scanner(pares);
            Scanner impar2 = new Scanner(impares);
            ArrayList<Integer>listaEnteros=new ArrayList<>();

            while (par1.hasNext()) {
                listaEnteros.add(par1.nextInt());
            }
            while (impar2.hasNext()) {
                listaEnteros.add(impar2.nextInt());
            }
            Collections.sort(listaEnteros);
            File ordenados=new File("ordenados.txt");
            PrintWriter escritura=new PrintWriter(ordenados);
            for (int i = 0; i < listaEnteros.size(); i++) {
                escritura.println(listaEnteros.get(i));
            }
            escritura.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio04.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
