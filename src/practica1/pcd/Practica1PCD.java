/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pcd;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juald
 */
public class Practica1PCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola cola = new Cola(4);

        //Creamos un objeto tipo random
        Random numAleatorio = new Random();
        //Inicializamos la semilla aleatoria
        numAleatorio.setSeed(System.currentTimeMillis());

        /*for (int i = 0; i < 4; i++) {
            try {
                cola.acola(i);
            } catch (Exception ex) {
                Logger.getLogger(Practica1PCD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/

        for (int i = 0; i < 10; i++) {
            //Generamos un numero aleatorio
            int aleatorio = numAleatorio.nextInt(2);
            System.out.println("El numero aleatorio obtenido es: " + aleatorio);
            if (aleatorio == 0) {
                try {
                    int n = (int) cola.desacola();
                    System.out.println("El numero extraido de la cola es: " + n);
                } catch (Exception ex) {
                    Logger.getLogger(Practica1PCD.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    cola.acola(i);
                } catch (Exception ex) {
                    Logger.getLogger(Practica1PCD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
