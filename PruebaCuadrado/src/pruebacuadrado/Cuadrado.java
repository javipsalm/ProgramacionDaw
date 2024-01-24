/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacuadrado;

/**
 *
 * @author Javier Piñero
 */
public class Cuadrado {
    int lado;
    
    public Cuadrado(int l){
        this.lado = l;
    }
    
    public String toString(){
        int i, espacios;
        String resultado = "";
        
        for (i = 0; i < this.lado; i++) {
            resultado +="oo";
        }
        resultado += "\n";
        
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "oo";
            
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += "  ";
            }
            resultado += "oo\n";
        }
        
        for (i = 0; i < this.lado ;i++) {
            resultado += "oo";
        }
        resultado += "\n";
        
        return resultado;
        
    }
}
