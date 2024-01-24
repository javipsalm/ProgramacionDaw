package testarray;

/**
 *
 * @author Javier Piñero
 */
public class Testarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array1 = new int[3][3];
        int[][] array2 = new int [3][3];
        int[][] array3 = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array1[i][j] = (int)(Math.random()*10)+1;
                
                array2[i][j] = (int)(Math.random()*10)+1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j]+"\t");               
            }
            System.out.print("\n");
        }
        System.out.println("\t+");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("------------------");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j]+ "\t");
            }
            System.out.println("");
        }
        
    }
}
    
