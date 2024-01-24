package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Javier Piñero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
            EJERCICIO 1: Crea un programa que pida al usuario un número entero y responda todos los casos siguientes:
            Si es múltiplo de 2 o de 3.
            Si es múltiplo de 2 y de 3 simultáneamente.
            Si es múltiplo de 2 pero no de 3.
            Si no es múltiplo de 2 ni de 3.
         */
        int num;
        
        System.out.println("Dame un numero entero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if (num % 3 == 0 || num % 2 == 0) {
            System.out.println("El numero es multiplo de 2 o de 3");
        } else {
            System.out.println("El numero no es multiplo de 2 ni de 3");
        }
        
        if (num % 3 == 0 && num % 2 == 0) {
            System.out.println(num + " es multiplo de 2 y de 3 simultaneamente");
        }else{
            System.out.println(num + " no es multiplo simultaneamente de 2 y 3");
        }
        
        if (num % 2 == 0 && num % 3 != 0) {
            System.out.println(num + " es multiplo de 2 pero no de 3.");            
        }else{
            System.out.println(num + " no es multiplo de 2 o es multiplo de 3");
        }
    }
    
}
