package examendinero;
import java.util.Scanner;


public class ExamenDinero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad,resto;
        System.out.println("Dime una cantidad en euros(sin centimos)");
        cantidad = sc.nextInt();
        
        System.out.println("Hay "+cantidad/500+" billetes de 500");
        resto = cantidad%500;
        System.out.println("Hay " +resto/200 +" billetes de 200");
        resto = resto%200;
        System.out.println("Hay " + resto/100 + " billetes de 100");
        resto = resto%100;
        System.out.println("Hay " + resto/50 + " billetes de 50");
        resto = resto%50;
        System.out.println("Hay " + resto/20 + " billetes de 20");
        resto = resto%20;
        System.out.println("Hay " + resto/10 + " billetes de 10");
        resto = resto%10;
        System.out.println("Hay " + resto/5 + " billetes de 5");
        resto = resto%5;
        System.out.println("Hay " + resto/2 + " monedas de 2");
        resto = resto%2;
        System.out.println("Hay " + resto/1 + " monedas de 1");
        resto = resto%1;
        
        
        // TODO code application logic here
    }
    
}
