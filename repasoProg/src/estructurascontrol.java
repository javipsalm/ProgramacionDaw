/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Javier Piñero
 */
public class estructurascontrol {
    public static void main(String[] args) throws InterruptedException {
        
        String caballo1= "/==/º";
        String caballo2= "/==/º";
        String caballo3= "/==/º";
        
        for (int i = 1; i < 101; i++) {
            Thread.sleep(1000);
            System.out.println("Vuelta: " + i);
            double a = Math.random();
            int tirada = (int)(a*3)+1;
            switch(tirada){
                case 1:
                    caballo1 = " "+caballo1;
                    break;
                
                case 2:
                    caballo2 = " "+caballo2;
                    break;
                                    
                case 3:
                    caballo3 = " "+caballo3;
                    break;      
            }
            
            System.out.println(caballo1);
            System.out.println(caballo2);
            System.out.println(caballo3);
        }
    }
}
