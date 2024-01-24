package ejerciciobarajacartas;

/**
 *
 * @author Javier Piñero
 */
public class Baraja {

	private Carta[] mazo = new Carta[48];
	private int numCartas = 48;
	
	public Baraja() {
		
		for(int i=0; i<48; i++) {
			
			mazo[i] = new Carta(0,'X');
			mazo[i].setNumero(i%12 + 1);

			if(i < 12) {
				
				mazo[i].setPalo('O');
				
			}else if(i > 11 && i < 24) {
				
				mazo[i].setPalo('C');
				
			}else if(i > 23 && i < 36) {
				
				mazo[i].setPalo('E');
				
			}else {
				
				mazo[i].setPalo('B');
				
			}
			
		}
		
	}
	
	public Baraja(Carta c) {
		
		for(int i=0; i<48; i++) {
			
			mazo[i] = new Carta(0,'X');
			mazo[i].setNumero(i%12 + 1);

			if(i < 12) {
				
				mazo[i].setPalo('O');
				
			}else if(i > 11 && i < 24) {
				
				mazo[i].setPalo('C');
				
			}else if(i > 23 && i < 36) {
				
				mazo[i].setPalo('E');
				
			}else {
				
				mazo[i].setPalo('B');
				
			}
			
		}
		
		Carta aux = new Carta(mazo[0].getNumero(),mazo[0].getPalo());
		mazo[0] = c;
		
		for(int i=1; i<48; i++) {
			
			if(mazo[i].getNumero() == c.getNumero() && mazo[i].getPalo() == c.getPalo()) {
				
				mazo[i] = aux;
				
			}
			
		}
		
	}
	
	public void barajar() {
		
		for(int i=0; i<48; i++) {
			
			int aleatorio = (int)(Math.random()*48);
					
			Carta aux = mazo[i];
			mazo[i] = mazo[aleatorio];
			mazo[aleatorio] = aux;
			
		}
		
	}
	
	public void cortar(int pos) {
		
		Carta[] aux = new Carta[pos+1];
		
		for(int i=0; i<pos+1; i++) { // ROJO
			
			aux[i] = mazo[i];
			
		}
		
		for(int i=0; i<48-pos-1; i++) { // VERDE
			
			mazo[i] = mazo[i+pos+1];
			
		}
		
		for(int i=0; i<pos+1; i++) { // AZUL
			
			mazo[48-pos+i-1] = aux[i];
			
		}
		
	}
	
	public Carta robar() {
		
		Carta resultado = null;
		
		for(int i=0; i<48; i++) {
			
			if(!mazo[i].getRobada()) {
				
				mazo[i].setRobada(true);
				resultado = mazo[i];
				this.numCartas--;
				break;
				
			}
			
		}
		
		return resultado;
		
	}
	
	public Carta eligeCarta() {
		
		Carta resultado = null;
		
		int j=0;
		
		for(int i=0; i<48; i++) {
			
			if(!mazo[i].getRobada()) {
				
				j++;
				break;
				
			}

		}
		
		if(j > 0) {
	
		}
		
		return resultado;
		
	}
	
	public void elige3cartas(Carta[] tres) {
		
		for(int i=0; i<3; i++) {
			
			tres[i] = eligeCarta();
			
		}
		
	}
	
	public void mostrar(int cartas) {
		
		int k = 0;
		
		for(int i=0; i<numCartas/cartas; i++) {
			
			for(int j=0; j<cartas; j++) {
				
				System.out.print("+---+");
				
			}
			
			System.out.println();
			
			for(int j=0; j<cartas; j++) {
				
				System.out.print("|");
				
				while(mazo[k].getRobada()) {
					
					k++;
					
				}
				
				if(!mazo[k].getRobada()) {
					
					System.out.print(mazo[k].getNumero());

					if(mazo[k].getNumero() < 10) {
						
						System.out.print(" ");
						
					}
					
				}
				
				System.out.print(" |");
				
				k++;
				
			}
			
			k -= cartas;
			System.out.println();
			
			for(int j=0; j<cartas; j++) {
				
				System.out.print("| ");
				
				while(mazo[k].getRobada()) {
					
					k++;
					
				}
				
				if(!mazo[k].getRobada()) {
					
					System.out.print(mazo[k].getPalo());
					
				}
				
				System.out.print(" |");
				
				k++;
				
			}
			
			k -= cartas;
			System.out.println();
			
			for(int j=0; j<cartas; j++) {
				
				System.out.print("| ");
				
				while(mazo[k].getRobada()) {
					
					k++;
					
				}
				
				if(!mazo[k].getRobada()) {

					if(mazo[k].getNumero() < 10) {
						
						System.out.print(" ");
						
					}
					
					System.out.print(mazo[k].getNumero());
					
				}
				
				System.out.print("|");
				
				k++;
				
			}
			
			k -= cartas;
			System.out.println();
			
			for(int j=0; j<cartas; j++) {

				System.out.print("+---+");
				
			}
			
			System.out.println();
			
			k += cartas;
			
		}
		
		for(int j=0; j<numCartas%cartas; j++) {
			
			System.out.print("+---+");
			
		}
		
		System.out.println();
		
		for(int j=0; j<numCartas%cartas; j++) {
			
			System.out.print("|");
			
			while(mazo[k].getRobada()) {
				
				k++;
				
			}
			
			if(!mazo[k].getRobada()) {
				
				System.out.print(mazo[k].getNumero());

				if(mazo[k].getNumero() < 10) {
					
					System.out.print(" ");
					
				}
				
			}
			
			System.out.print(" |");
			
			k++;
			
		}
		
		k -= numCartas%cartas;
		System.out.println();
		
		for(int j=0; j<numCartas%cartas; j++) {
			
			System.out.print("| ");
	
			while(mazo[k].getRobada()) {
				
				k++;
				
			}
			
			if(!mazo[k].getRobada()) {
				
				System.out.print(mazo[k].getPalo());
				
			}
			
			System.out.print(" |");
			
			k++;
			
		}
		
		k -= numCartas%cartas;
		System.out.println();
		
		for(int j=0; j<numCartas%cartas; j++) {
			
			System.out.print("| ");
			
			while(mazo[k].getRobada()) {
				
				k++;
				
			}
			
			if(!mazo[k].getRobada()) {

				if(mazo[k].getNumero() < 10) {
					
					System.out.print(" ");
					
				}
				
				System.out.print(mazo[k].getNumero());
				
			}
			
			System.out.print("|");
			
			k++;
			
		}
		
		k -= numCartas%cartas;
		System.out.println();
		
		for(int j=0; j<numCartas%cartas; j++) {

			System.out.print("+---+");
			
		}
		
		System.out.println();
		
	}
	
}
