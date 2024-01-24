package ejerciciobarajacartas;

/**
 *
 * @author Javier Piñero
 */
public class Carta {

	private int numero;
	private char palo;
	private boolean robada;
	
	public Carta(int numero, char palo) {
		
		this.numero = numero;
		this.palo = palo;
		robada = false;
		
	}
	
	public int getNumero() {
		
		return this.numero;
		
	}
	
	public char getPalo() {
		
		return this.palo;
		
	}
	
	public boolean getRobada() {
		
		return this.robada;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public void setPalo(char palo) {
		
		this.palo = palo;
		
	}
	
	public void setRobada(boolean robada) {
		
		this.robada = robada;
		
	}
	
	public boolean esIgual(Carta c) {
		
		boolean resultado = false;
		
		if(this.numero == c.getNumero() && this.palo == c.getPalo()) {
			
			resultado = true;
			
		}
		
		return resultado;
		
	}
	
	public String toString() {
		
		String resultado = "+---+\n";
		resultado += "|" + this.numero;
		
		if(this.numero < 10) {
			
			resultado += " ";
			
		}
		
		resultado += " |\n| " + this.palo + " |\n| ";
		
		if(this.numero < 10) {
			
			resultado += " ";
			
		}
		
		resultado += this.numero + "|\n";
		resultado += "+---+\n";
		
		return resultado;
		
	}
	
}
