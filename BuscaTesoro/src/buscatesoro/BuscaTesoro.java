package buscatesoro;
import java.util.Scanner;
import tesoro.funcionestesoro;
/**
 *
 * @author Javier Piñero
 * 
 */
public class BuscaTesoro {

    public static void main(String[] args) {
        //VARIABLES
        int contador = 3;
        char[][] mapatesoro = new char [6][10];
        Scanner sc = new Scanner(System.in);
        int disparox,disparoy,bombax,bombay,tesorox,tesoroy;
        
        //INICIO
        System.out.println("Empieza el juego");
        //CREAMOS EL TABLERO
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                mapatesoro[i][j]= 'L';
                //System.out.print(mapatesoro[i][j] + " ");
            }
            //System.out.print('\n');
        }

        do {
            //Creacion cordenadas bomba
            bombax = (int)(Math.random()*5);
            bombay = (int)(Math.random()*9);
            //sout coordenadas bomba
            System.out.println("Coordenadas bomba: " + bombax+","+bombay);
            
            //Creamos el tesoro
            tesorox = (int)(Math.random()*5);
            tesoroy = (int)(Math.random()*9);
            //sout coordenadas tesoro
            System.out.println("Coordenadas tesoro: " + tesorox+","+tesoroy);
            
        //Comprobamos que la bomba y el tesoro no esten en la misma coordenada
        } while (mapatesoro[bombax][bombay] != mapatesoro[tesorox][tesoroy]);
            
            //Este sout te muestra las coordenadas(descomentar para mostrarlas)
            //System.out.println(bombax +""+ bombay +""+ tesorox +""+ tesoroy);
            mapatesoro[bombax][bombay] = '*';
            mapatesoro[tesorox][tesoroy]= 'T';
            
            //Escribimos por pantalla el tablero con los huecos libre, la bomba y el tesoro
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(mapatesoro[i][j] + " ");
                }
            System.out.print('\n');
            }
            
            //Se piden las coordenadas del disparo
            System.out.println("Dame una coordenada x para disparo");
            disparox = sc.nextInt();
            System.out.println("Dame una coordenada y para disparo");
            disparoy = sc.nextInt();
            
            while(contador >= 0){
                switch(mapatesoro[disparox][disparoy]){
                    case 'T':
                        System.out.println("Enhorabuena has ganado!!");
                        contador = 0;
                    case '*':
                        System.out.println("BOOOOOOMMM!!!");
                        System.out.println("Lo siento perdiste!");
                        contador = 0;
                    case 'L':
                        if (disparox > tesorox) {
                            System.out.println("Creo que tienes el tesoro un poco más arriba");
                        } 
                        if (disparox < tesorox) {
                            System.out.println("Creo que tienes el tesoro un poco más abajo");
                        } 
                        if (disparoy > tesoroy){
                            System.out.println("Creo que tienes el tesoro hacia tu izquierda");
                        } 
                        if (disparoy < tesoroy){
                            System.out.println("Creo que tienes el tesoro hacia tu derecha");
                        }
                        //Se piden las coordenadas del disparo
                        System.out.println("Dame una coordenada x para disparo");
                        disparox = sc.nextInt();
                        System.out.println("Dame una coordenada y para disparo");
                        disparoy = sc.nextInt();
                }
                
                contador--;
                
            } 
        }
    }
    
