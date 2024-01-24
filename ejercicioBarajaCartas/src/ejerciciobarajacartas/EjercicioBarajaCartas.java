package ejerciciobarajacartas;

/**
 *
 * @author Javier Piñero
 */
public class EjercicioBarajaCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
		
		baraja.barajar();
		baraja.cortar(6);
		System.out.println(baraja.robar());
		baraja.mostrar(10);
		
        // TODO code application logic here
    }
    
}
