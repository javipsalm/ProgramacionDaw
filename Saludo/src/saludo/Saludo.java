package saludo;

import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */

public class Saludo {

    public static void main(String[] args) {
        
        //Variables
        String nombre;
        
        //Instrucciones
        System.out.println("¿Como te llamas?"); //El programa te hace una pregunta
        
        Scanner leer = new Scanner(System.in); //Llamamos al paquete scanner para almacenar datos en la variable
        
        nombre = leer.next(); //asignamos los datos de la varible leer en la variable definida nombre
        
        System.out.println("Un placer " + nombre + ", espero que te vaya bien el dia"); //Imprimimos por pantalla todo
        
        
    }
    
}
