/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dniarray;
import java.util.Scanner;
/**
 *
 * @author Javier Pi�ero
 */
public class Dniarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc = new Scanner(System.in);
        int DNI;
        
        System.out.println("Dime tu DNI sin la letra:");
        DNI = sc.nextInt();
        System.out.println("Tu DNI es: " + DNI + letras[DNI%23]);
    }
    
}
