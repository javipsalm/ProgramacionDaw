package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        /**
         * EJERCICIO 3: Escribe un programa que muestre los n primeros términos
         * de la serie de Fibonacci. El primer término de la serie de Fibonacci 
         * es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, 
         * por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 
         * 34, 55, 89, 144… El número n se debe introducir por teclado.
         */
        
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos terminos necesitas de la serie Fibonacci: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        
        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
        System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
        }

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
    
}
