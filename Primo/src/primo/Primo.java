/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primo;
import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 */
public class Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = true;
        
        System.out.println("Dame un numero: ");
        num = sc.nextInt();
        
        if(num <= 1) {
            esPrimo = false; //Los numero menores o iguales a 1 no son primos.
        }else{
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    esPrimo = false; //Si es divisible por algún número, no es primo.
                    break;
                }
            }
        }
        
        if(esPrimo){
            System.out.println(num + " es un numero primo");
        }else{
            System.out.println(num + " no es un numero primo");
        }
        
    }
    
}
