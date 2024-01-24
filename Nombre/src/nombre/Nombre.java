package nombre;

import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */
public class Nombre {

    public static void main(String[] args) {
        //Variables
        String nombre;
        
        //Instrucciones
        System.out.println("¿Dime tu nombre?");
        
        Scanner leer = new Scanner(System.in);
        nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);
        
        
    }
    
}
