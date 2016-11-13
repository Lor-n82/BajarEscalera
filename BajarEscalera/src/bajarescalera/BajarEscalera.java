/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bajarescalera;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class BajarEscalera {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bajarEscaleras(20); //llamada al metodo pasandolo como parametro 20 escalones
    }

    public static void bajarEscaleras(int escalon) {
        if (escalon == 0) {
            System.out.println("Has llegado abajo");
        } else {
            System.out.println("Bajando escalon" + escalon);
            bajarEscaleras(escalon - 1);
        }
    }
}
