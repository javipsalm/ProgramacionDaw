package examenfechas;

/**
 *
 * @author Javier Piñero
 * 
 */
public class ExamenFechas {
    
    public static int fechamayormenor(int a1,int m1,int d1,int a2,int m2,int d2){
            if (a1>a2) {
                return 1;
            }else if(a2<a1){
                return -1;
            }else if(m1>m2){
                return 1;
            }else if(m2<m1){
                return -1;
            }else if(d1>d2){
                return 1;
            }else if(d2<d1){
                return -1;
            }else{
                return 0;
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
