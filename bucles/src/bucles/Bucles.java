/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author Javier Piñero
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**BUCLE MIENTRAS
          while(condicion){
               Bloque de instrucciones (cuerpo) 
          }
         */
        int contador;
        contador = 10;
        
        while(contador > 0){
            System.out.println(contador + " Hola");
            contador = contador - 1;
        }
        
        contador = 10;
        /*Bucle Repetir Mientras*/
        
        do{
            System.out.println("Adios");
            contador--;
        }while(contador > 0);
        
        for(contador = 0; contador < 10; contador++){
        System.out.println("ey listen");
        }
    }
        
}