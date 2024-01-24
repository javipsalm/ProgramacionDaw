package examenimc;

public class ExamenIMC {

    
    public static char imc(float peso,float altura){
        float valor;
        
        valor = peso/(altura*altura);
        
        if(valor<18){
            return 'D';
        }else if(valor>=18 && valor <=25){
            return 'I';
        }else{
            return 'S';
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
