/**
 *
 * @author Javier Piñero
 */
public class Movil extends Terminal{

	private String tarifa;
	private double tarificados;
	
	public Movil(String numero, String tarifa) {
		
            super(numero);
            this.tarifa = tarifa;
            this.tarificados = 0;
		
	}
	
	public String getTarifa() {
		
            return this.tarifa;
		
	}
	
	public void setTarifa(String tarifa) {
		
            this.tarifa = tarifa;
		
	}
	
	public double getTarificados() {
		
            return this.tarificados;
		
	}
	
	public void setTarificados(double tarificados) {
		
            this.tarificados = tarificados;
		
	}
	
	public String toString() {
		
            String resultado = super.toString() + " - tarificados " + this.tarificados + " euros";
            return resultado;
		
	}
	
	@Override
	public void llama(Terminal terminal, int tiempo) {
		
            super.llama(terminal, tiempo);
		
            switch(this.tarifa){
                case "rata":
                    this.tarificados += 0.06 * tiempo / 60;
                    break;
                    
                case "mono":
                    this.tarificados += 0.12 * tiempo / 60;
                    break;
                    
                case "bisonte":
                    this.tarificados += 0.30 * tiempo / 60;
                    break;
            }
		
	}
	
}
