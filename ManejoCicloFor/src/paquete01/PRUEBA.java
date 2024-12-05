/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        String cadena = "";
       
        for (num1 = 30; num1 >= 10; num1--) {
            for (num2 = 60; num2 >= 20; num2 -= 2) {
                for (num3 = 90; num3 >= 30; num3 -= 3) {
                    for (num4 = 120; num4 >= 40; num4 -= 4) {
                        cadena = String.format("%s%d-%d-%d-%d\n", cadena, num1, num2, num3, num4);
                    }
                }
            }
        }
        System.out.printf("%s", cadena);
    }
}
