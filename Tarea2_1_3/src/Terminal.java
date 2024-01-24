/**
 *
 * @author Javier Piñero
 */
public class Terminal {

	private String numero;
	private int tiempo;
	
	public Terminal(String numero) {
		
		this.numero = numero;
		this.tiempo = 0;
		
	}
	
	public String getNumero() {
		
		return this.numero;
		
	}
	
	public void setNumero(String numero) {
		
		this.numero = numero;
		
	}
	
	public int getTiempo() {
		
		return this.tiempo;
		
	}
	
	public void setTiempo(int tiempo) {
		
		this.tiempo = tiempo;
		
	}
	
	public String toString() {
		
		String resultado = "Nº " + this.numero + " - " + this.tiempo + "s de conversación";
		return resultado;
		
	}
	
	public void llama(Terminal terminal, int tiempo) {
		
		this.tiempo += tiempo;
		terminal.setTiempo(terminal.getTiempo() + tiempo);
		
	}
	
}