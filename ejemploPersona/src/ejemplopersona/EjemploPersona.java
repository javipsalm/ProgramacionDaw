/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopersona;

/**
 *
 * @author Javier Pi�ero
 */
public class EjemploPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona p1=null;
        if (p1.compruebaDNI(12345678,'Z')) {
            p1 = new persona(12345678,'Z',"Manolo","El Del","Bombo");
        }
        
        // TODO code application logic here
    }
    
}
