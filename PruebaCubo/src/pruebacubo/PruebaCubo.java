/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacubo;

/**
 *
 * @author Javier Piñero
 */
public class PruebaCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo cubito = new Cubo(2);
        Cubo cubote = new Cubo(7);
        
        System.out.println("Cubito: \n");
        cubito.pinta();
        
        System.out.println("Cubote: \n");
        cubote.pinta();
        
        System.out.println("\nLleno el cubito: \n");
        cubito.llena();
        cubito.pinta();
        
        System.out.println("\nEl cubote sigue vacío: \n");
        cubote.pinta();
        
        System.out.println("\nAhora vuelco lo que tiene el cubito en el cubote.\n");
        cubito.vuelcaEn(cubote);
        
        System.out.println("Cubito: \n");
        cubito.pinta();
        
        System.out.println("\nCubote: \n");
        cubote.pinta();
        
        System.out.println("\nAhora vuelco lo que tiene el cubote en el cubito");
        cubote.vuelcaEn(cubito);
        
        System.out.println("\nCubito: \n");
        cubito.pinta();
        
        System.out.println("\nCubote: \n");
        cubote.pinta();
        
        // TODO code application logic here
    }
    
}
