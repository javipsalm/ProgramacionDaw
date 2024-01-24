package calculofechas;
import caclfech.opera;
import java.util.Scanner;
/**
 *
 * @author Javier Piñero
 * 
 */
public class CalculoFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un dia: ");
        int dia1 = sc.nextInt();
        System.out.println("Dame un mes: ");
        int mes1 = sc.nextInt();
        System.out.println("Dame un año: ");
        int anio1=sc.nextInt();
        
        System.out.println("Dime otro dia: ");
        int dia2 = sc.nextInt();
        System.out.println("Dime otro mes: ");
        int mes2 = sc.nextInt();
        System.out.println("Dime otro año: ");
        int anio2 = sc.nextInt();
        
        int diasTranscurridos = 0;
        
        for (int i = anio1; i < anio2; i++) {
            diasTranscurridos += opera.numDiasA(i);
        }
        
        diasTranscurridos -= opera.numDiasTranscurridos(dia1, mes1, anio1);
        diasTranscurridos += opera.numDiasTranscurridos(dia2, mes2, anio2);
        
        System.out.println(diasTranscurridos);
        
        
        //System.out.println(opera.esBisiesto(2100));
        //System.out.println(opera.numDiasMes(2,2024));
        //System.out.println(opera.fechaCorrecta(29, 2, 2023));
        //System.out.println(opera.numDiasA(2022));
        //System.out.println(opera.numDiasTranscurridos(29, 2, 2024));
        //System.out.println(opera.numDíasRestantes(30, 11, 2023));
        // TODO code application logic here
    }
    
}
