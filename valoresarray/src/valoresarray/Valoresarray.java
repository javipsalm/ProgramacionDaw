/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valoresarray;
import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 */
public class Valoresarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int[] x = new int[10];
        Scanner sc = new Scanner(System.in);
        int num;
        
        //EJECUCIÓN DEL CODIGO
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame un numero: ");
            x = sc.nextInt();
            System.out.println("Este es el numero de la primera posicion del array: " + x[i]);
            
            
        }
    }
    
}
