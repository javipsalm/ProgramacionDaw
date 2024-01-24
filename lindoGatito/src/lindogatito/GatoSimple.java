/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lindogatito;

/**
 *
 * @author Javier Piñero
 */
public class GatoSimple {
    //atributos ///////////////////////
    
    String color, raza, sexo;
    int edad;
    double peso;
    
    //metodos /////////////////////////
    
    //constructor
    GatoSimple(String s) {
        this.sexo = s;
    }
    
    //getter
    String getSexo() {
        return this.sexo;
    }
    
    /**
     * Hace que el gato maulle
     */
    
    void maulla(){
        System.out.println("Miauu");
    }
    
    /**
     * Hace que el gato ronronee
     */
    
    void ronronea(){
        System.out.println("mrrrrr");
    }
    
    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazara
     * 
     * @param comida la comida que se le ofrece al gato
     */
    
    void come(String comida) {
        if (comida == "pescado") {
            System.out.println("Hmmmm, gracias");
        }else{
            System.out.println("Lo siento, yo solo como pescado");
        }
    }
    
    /**
     * Pone a pelear dos gatos.
     * Solo se van a pelear dos machos entre si.
     * 
     * @param contrincante es el gato contra el que pelear
     */
    
    void peleaCon(GatoSimple contrincante){
        if (sexo == "hembra") {
            System.out.println("No me gusta pelear");
        }else{
            if (contrincante.getSexo()=="hembra") {
                System.out.println("No peleo contra gatitas");
            }else{
                System.out.println("Ven aqui que te vas a enterar");
            }
        }
    }
}
