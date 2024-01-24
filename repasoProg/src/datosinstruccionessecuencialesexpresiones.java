import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 */
public class datosinstruccionessecuencialesexpresiones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double notaDeseada;
        double nota2;
        double pesoPrimerExamen = 0.4;
        double pesoSegundoExamen = 0.6;
        
        System.out.println("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.println("¿Que nota quieres sacar en el trimestre?");
        notaDeseada = sc.nextDouble();
        
        nota2 = (notaDeseada -(nota1 * pesoPrimerExamen))/pesoSegundoExamen;
        System.out.println("La nota que tienes que sacar en el segundo examen es: " + nota2);
    }
}

