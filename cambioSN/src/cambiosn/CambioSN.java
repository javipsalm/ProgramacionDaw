/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiosn;
import java.util.Scanner;
import matematicas.numeros;

/**
 *
 * @author Juan C. Jiménez
 */
public class CambioSN {

    /**
     * @param args the command line arguments
     */
    /*public static int pasarDecimal(int numero, int base){
        int resultado=0;
        
        if(base<10){
            for (int i = 0; i < numeros.digitos(numero); i++) {
                resultado += (numeros.digitoN(numero, i)*numeros.potenca(base,i));
            }
            return resultado;
        }else{
            return numero;
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int binario;
        int decimal=0;
        
        System.out.println("Dime un número en octal");
        binario=sc.nextInt();
        for (int i = 0; i < numeros.digitos(binario); i++) {
            if(i>0)
                System.out.print(" + ");
            System.out.print(numeros.digitoN(binario, i));
            System.out.print("x8^");
            System.out.print(numeros.digitos(binario)-i-1);
            decimal+=(numeros.digitoN(binario, i)*numeros.potencia(8, numeros.digitos(binario)-i-1));
        }
        System.out.println(" = "+decimal);
    }
    
}
