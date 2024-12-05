/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author utpl
 */
public class Problema011 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        String cadena = "";
       
        for (int i = 30; i >= 10; i-=1) {
            num1=i;
            num2=i*2;
            num3=i*3;
            num4=i*4;
            
            System.out.printf("%d-%d-%d-%d\n",num1,num2,num3,num4);
        }
    }
    
}
