/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author utpl
 */
public class Problema022 {
    public static void main(String[] args) {
        int fahrenheit = 20;
        double celcius;
        for (int contador = 0; contador<=20; contador++) {
            celcius = 5.0/9*(fahrenheit-32);
            System.out.printf("Operación(%d) Fahrenheit: %d ===> Celcius: %.2f\n",contador,fahrenheit,celcius);
            fahrenheit = fahrenheit + 4;
            
        }
    }
    
}
