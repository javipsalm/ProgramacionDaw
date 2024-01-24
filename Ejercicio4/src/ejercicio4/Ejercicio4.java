package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Javier Piñero
 * 
 */
public class Ejercicio4 {


    public static void main(String[] args) {
        /**
         * EJERCICIO 4: Un número perfecto es un entero positivo que es igual a 
         * la suma de todos los enteros positivos (excluido el mismo) que son 
         * divisores suyos. El primer número perfecto es el 6, ya que los divisores 
         * son 1,2,3 y 6=1+2+3. Realiza un Programa en JAVA que encuentre los tres 
         * primeros números perfectos.
         */
        
        //!IMPORTANTE, HE REALIZADO UNA MODIFICACION PARA QUE ENCUNTRE LOS N NUMEROS PERFECTOS QUE EL USUARIO QUIERA¡
        
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        
        int contador = 0; // Contador para llevar la cuenta de números perfectos encontrados
        int numero = 2; // Empezamos con el primer número par, que es 2
        int sumaDivisores; //Declaramos la variable
        int numPerfectos;
        System.out.println("Diga cuantos numeros perfectos necesita: ");
        numPerfectos = sc.nextInt();
        //Este bucle comprueba que el contador es menor que el numero de numeros perfectos que requerimos y entra en ejecución.
        while (contador < numPerfectos) {

            sumaDivisores = 1; // Incluimos 1 como divisor inicial
            
            // Recorremos los números desde 2 hasta la mitad de 'numero' en busca de divisores
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i; // Si 'i' es divisor, lo sumamos a la suma de divisores
                }
            }
            //Comprobamos que la suma de los divisores es igual a el numero, en cuyo caso es perfecto
            if (sumaDivisores == numero) {
                
                //Este paso lo hago para que en el output salga el numero desde el 1, despues del sout resto el numero al contador y mantiene el numero previo al sout
                contador = contador + 1;
                System.out.println(contador + ": Número Perfecto: " + numero);
                contador = contador - 1;
                
                contador++; //Incrementamos el numero del contador
            }
            numero++;// Pasamos al siguiente número para continuar la búsqueda
        }
    }
}

