/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopersona;

/**
 *
 * @author Javier Piñero
 */
public class persona {
    private int numDNI;
    private char letraDNI;
    private String nombre;
    private String apellido;
    private String apellido2;
    
    public static boolean compruebaDNI(int nD, char lD){
        return true;
    }
    
    
    public persona(int nD, char lD, String n, String a, String a2){
        this.numDNI = nD;
        this.letraDNI = lD;
        this.nombre = n;
        this.apellido = a;
        this.apellido2 = a2;
    }
    
    public int getnumDNI(){
        return this.numDNI;
    }
    
    public char getletraDNI(){
        return this.letraDNI;
    }
    
    public String getnombre(){
        return this.nombre;
    }
    
    public String getapellido(){
        return this.apellido;
    }
    
    public String getapellido2(){
        return this.apellido2;
    }
    
    public int setnumDNI(int nD){
        return this.numDNI = nD;
    }
    
    public char setletraDNI(char lD){
        return this.letraDNI = lD;
    }
    
    public String setnombre(String n){
        return this.nombre = n;
    }
    
    public String setapellido(String a){
        return this.apellido = a;
    }
    
    public String setapellido2(String a2){
        return this.apellido2 = a2;
    }
}
