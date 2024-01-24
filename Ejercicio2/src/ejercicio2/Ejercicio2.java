package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        /**
        EJERCICIO 2: Escribe un programa que calcule el salario de un trabajador 
        de la siguiente forma: El trabajador cobrará dependiendo de las horas que 
        trabaje (las primeras 40 horas se pagan a 12 euros la hora. A partir de la 
        hora 41 se pagarán a 16 euros) El programa deberá pedir por teclado el 
        total de horas trabajadas y devolverá el cálculo de la siguiente forma:

        Ejemplo de 36 horas:
           - 36h a 12€ = 432€
           TOTAL nómina: 432€

        Ejemplo de 50 horas:
           - 40h a 12€ = 480€
           - 10h a 16€ = 160€
           TOTAL nómina: 640€ 
         */
        
        
        //VARIABLES
        int horas;
        int sueldo1;
        int sueldo2;
        int sueldof;
        int resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas ha trabajado?");
        horas = sc.nextInt();
        
        //PROGRAMA
        
        
        if (horas >= 41) {
            resto = horas - 40;
            sueldo1 = (40 * 12);
            sueldo2 = (resto * 16);
            sueldof = sueldo1 + sueldo2;
            System.out.println(horas + " horas trabajadas:");
            System.out.println("    -40h a 12€ = " + sueldo1 + "€");
            System.out.println("    -"+ resto + "h a 16€ =" + sueldo2 + "€");
            System.out.println("Total nomina " + (sueldo1+sueldo2) + "€");
            
        }else{
            sueldof = horas * 12;
            System.out.println(horas + " horas trabajadas:");
            System.out.println(horas + "h a 12€ = " + sueldof + "€");
            System.out.println("Total nomina " + sueldof + "€");
        }
        
    }
    
}
