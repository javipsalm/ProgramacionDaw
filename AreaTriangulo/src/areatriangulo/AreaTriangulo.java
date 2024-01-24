package areatriangulo;

import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */
public class AreaTriangulo {

    public static void main(String[] args) {
        
        //Variables
        int base;
        int altura;
        int area;
                
        //Instrucciones
        System.out.println("¿Cual es la base de tu triangulo?");
        Scanner leerBase = new Scanner(System.in);
        base = leerBase.nextInt();
        System.out.println("¿Cual es la altura de tu traingulo?");
        Scanner leerAltura = new Scanner(System.in);
        altura = leerAltura.nextInt();
        
        area = (base * altura)/2;
        
        System.out.println("ok, esta es el area de tu triangulo: " + area);
        
        
        //Prueba
        
        int importe= 300;
	int importeConDesc;

//INCIO
	
	importeConDesc = importe * (90 / 100);
	System.out.println("El importe con un 10% de descuento es: " + importeConDesc);
    }
    
}
