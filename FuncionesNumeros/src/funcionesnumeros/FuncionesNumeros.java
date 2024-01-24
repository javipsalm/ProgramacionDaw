package funcionesnumeros;

import java.util.Scanner;

/**
 *
 * @author Javier Piñero
 */
public class FuncionesNumeros {

    /**
     * @param args the command line arguments
     */
    public static boolean esCapicua(int numero){
        /*int volteado = voltea(numero);
        
        if(numero==volteado){
            return true;
        }else{
            return false;
        }*/
        return numero==voltea(numero);
    }
    
    public static boolean esPrimo(int numero){
        int nump;
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = true;
        
        System.out.println("Dame un numero: ");
        nump = sc.nextInt();
        
        if(nump <= 1) {
            esPrimo = false; //Los numero menores o iguales a 1 no son primos.
        }else{
            for (int i = 2; i * i <= nump; i++) {
                if (nump % i == 0) {
                    esPrimo = false; //Si es divisible por algún número, no es primo.
                    break;
                }
            }
        }
        return esPrimo;
    }
    
    public static int siguientePrimo(int numero){
        int siguiente=numero+1;
        while(!esPrimo(siguiente)){
            siguiente++;
        }
        return siguiente;
    }
    
    public static int potencia(int base, int exponente){
        int resultado = base^exponente;
        return resultado;
    }
    
    public static int digitos(int numero){
        int contador = 0;
        while(contador != 0){
            numero/=10;
            contador++;
        }
        return contador;
    }
    
    public static int voltea(int numero){
        int numVolteado = 0;
        while(numero!=0){
            int ultimoNum = numero % 10;
            numVolteado = numVolteado * 10 + ultimoNum;
            numero /= 10;
        }
        return numVolteado;
    }
    
    public static int digitoN(int numero, int posicion){
        int totaldigitos = digitos(numero);
        
        int posiciondeseada = totaldigitos-1-posicion;
        for (int i = 0; i < posiciondeseada; i++) {
            numero = numero/10;
        }
        return numero%10;
    }
        
    public static int posciondeDigito(int numero, int digito){
        // Inicializar la posición en -1 (no encontrado)
        int posicion = -1;
        // Variable para la posición del dígito
        int i = 0;
        // Recorrer cada dígito del número
        while (numero != 0) {
            // Obtener el último dígito
            int ultimoDigito = numero % 10;
            // Verificar si es igual al dígito buscado
            if (ultimoDigito == digito) {
                posicion = i;
                break; // Salir del bucle si se encuentra el dígito
            }
            // Actualizar posición e ir al siguiente dígito
            i++;
            numero = numero / 10;
        }
        // Devolver la posición del dígito o -1 si no se encuentra
        return posicion;
    }

    
    public static int quitaPorDetras(int numero, int nDigito){
        int num  = numero;
        
        if(digitos(numero) >nDigito){
            return -1;
        }else{
            for (int i = 0; i < nDigito; i++) {
                num /= 10;
            }
            return num;
        }
    }
    
    public static int quitaPorDelante(int numero, int nDigito){
        int num2 = voltea(numero);
        int num3 = quitaPorDetras(num2,nDigito);
        int num4 = voltea(num3);
        
        return num4;
        
    }
    
    public static int trozoDeNumero(int numero, int posini, int posfin){
        int num7 = quitaPorDelante(numero,posini);
        int num8 = quitaPorDetras(num7, posfin);
        
        return num8;
    }
    
    public static int juntanumeros(int numero1, int numero2){
        int num5 = (int) (numero1 * Math.pow(10, digitos(numero2)));
        int numj = num5 + numero2;
        return  numj;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
