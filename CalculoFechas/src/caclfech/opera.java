package caclfech;

/**
 *
 * @author Javier Piñero
 * 
 */
public class opera {
    public static boolean esBisiesto(int anio){
        if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            return true;
        }else{
            return false;
        }
    }
    
    public static int numDiasMes(int mes, int anio){     
        switch(mes){
            case 1,3,5,7,8,10,12:
                return 31;
            case 2:
                if(esBisiesto(anio)== false){
                    return 28;
                }else{
                    return 29;
                }
            case 4,6,9,11:
                return 30;
        }
        //Si ponen un numero no valido devuelve 0.
        return 0;
    }
    
    
    public static boolean fechaCorrecta(int dia, int mes, int anio){
        if (esBisiesto(anio) == true && numDiasMes(mes,anio) >= dia){
            return true;
        }else return esBisiesto(anio) == false && numDiasMes(mes,anio) >= dia;
    }
    
    public static int numDiasA(int anio){
        if (esBisiesto(anio)) {
            return 366;
        }else{
            return 365;
        }
    }
    public static int numDiasTranscurridos(int dias, int mes,int anio){
        //int diasanio = numDiasA(anio);
        /*int sumaDias = dias;
        
        if(fechaCorrecta(dias,mes,anio)){
            
            for (int i = 0; i < mes-1; i++) {
                sumaDias += numDiasMes(i,anio);
            }
        }      
        return sumaDias;*/
        int[] diasPorMes={31,28,31,30,31,30,31,31,30,31,30,31};
        int diasTranscurridos = dias;
        
        if (esBisiesto(anio)) {
            diasPorMes[1]=29;
        }
        //int diasTranscurridos = 0;
        for (int i = 0; i < mes-1; i++) {
            diasTranscurridos += diasPorMes[i];
        }
        return diasTranscurridos;
    }
    
    
    public static int numDíasRestantes(int dias, int mes, int anio){
        
        

        return numDiasA(anio)-numDiasMes(mes,anio)-dias;
    }
}




