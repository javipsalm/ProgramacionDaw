package dados;

/**
 *
 * @author Javier Piñero
 * 
 */
public class Dados {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
         //NUMEROS ALEATORIOS
         int n = 5;
         int m = 15;
         double a = Math.random();
         
         System.out.println("a");
         System.out.println((int)(a*m));
         System.out.println((int)(a*(m+1)));
         System.out.println((int)(a*(m+1)+n));
         System.out.println((int)(a*(m-n+1))+n);
         
        
    }
    
}
