/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybi;

/**
 *
 * @author Adrián MV
 */
public class Arraybi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // VARIABLES
        int[][] array1 = new int[4][4];
        int[][] array2 = new int[4][4];
        int[][] array3 = new int[4][4];
        int[][] espacios = new int[4][5];
        // INICIO
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array1[i][j] = (int)(Math.random()*10);
                //array1[i][j] = i;
                //array1[i][j] = j;
            }            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array2[i][j] = (int)(Math.random()*10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array3[i][j] = (int)(array1[i][j]+array2[i][j]);
            }
        }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j] + " ");
                }
                System.out.print("\n");
            }
            
            System.out.println("   " + "+" + "   ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                System.out.print(array2[i][j] + " ");
                }
                System.out.print("\n");
            }
            
            System.out.println("   " + "=" + "   ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                System.out.print(array3[i][j] + " ");
                }
                System.out.print("\n");
            }
            
    }
}


