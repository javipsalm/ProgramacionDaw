/**
 *
 * @author Javier Piñero
 */
public class Linea extends Punto {
    
    private Punto puntoFinal;

    
    public Linea(Punto puntoInicio, Punto puntoFinal){
        super(puntoInicio.getX(), puntoInicio.getY());
        this.puntoFinal = puntoFinal;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Linea{PuntoInicio="+ super.toString() + "puntoFinal=" + puntoFinal.toString() + '}';
    }
    
    public double calcularlongitud(){
        return Math.sqrt(Math.pow(this.puntoFinal.getX() - super.getX(), 2) + Math.pow(this.puntoFinal.getY() - super.getY(), 2));
    }

    

    

    
    
    
    
}
