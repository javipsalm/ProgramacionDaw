/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lindogatito;

/**
 *
 * @author Javier Piñero
 */
public class LindoGatito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion gato simple macho, nombre de la instacia garfield
        GatoSimple garfield = new GatoSimple("macho");
        
        System.out.println("Hola gatito");
        //se llama al metodo maulla, que devuelve un mensaje por pantalla
        garfield.maulla();
        System.out.println("toma tarta");
        //se llama al metodo come, al que se le pasa como parametro un String, lo evalua y retorna un mensaje por pantalla
        garfield.come("tarta selva negra");
        System.out.println("toma pescado, a ver si esto te gusta");
        //se llama al metodo come, al que se le pasa como parametro un String, lo evalua y retorna un mensaje por pantalla
        garfield.come("pescado");
        
        //Creacion gato simple macho, nombre de la instacia tom
        GatoSimple tom = new GatoSimple("macho");
        
        System.out.println("Tom, toma sopita de verduras");
        //se llama al metodo come, al que se le pasa como parametro un String, lo evalua y retorna un mensaje por pantalla
        tom.come("sopa de verduras");
        
        //Creacion gato simple macho, nombre de la instacia lisa
        GatoSimple lisa = new GatoSimple("hembra");
        
        System.out.println("gatitos, a ver como maullais");
        //se llama al metodo maulla, que devuelve un mensaje por pantalla
        garfield.maulla();
        //se llama al metodo maulla, que devuelve un mensaje por pantalla
        tom.maulla();
        //se llama al metodo maulla, que devuelve un mensaje por pantalla
        lisa.maulla();
        
        
        //se llama al metodo peleaCon y se le pasa como parametro el objeto instanciado lisa, retorna un mensaje por pantalla
        garfield.peleaCon(lisa);
        //se llama al metodo peleaCon y se le pasa como parametro el objeto instanciado tom, retorna un mensaje por pantalla
        lisa.peleaCon(tom);
        //se llama al metodo peleaCon y se le pasa como parametro el objeto instanciado garfield, retorna un mensaje por pantalla
        tom.peleaCon(garfield);
        
        // TODO code application logic here
    }
    
}
