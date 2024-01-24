package barajaespaniola;

import java.util.Random;

public class Barajaespaniola {

    public static void main(String[] args) {
        String cartadebaraja;
        String baraja[] = {
            "As de oros", "Dos de oros", "Tres de oros", "Cuatro de oros", "Cinco de oros", "Seis de oros", "Siete de oros", "Sota de oros", "Caballo de oros", "Rey de oros",
            "As de copas", "Dos de copas", "Tres de copas", "Cuatro de copas", "Cinco de copas", "Seis de copas", "Siete de copas", "Sota de copas", "Caballo de copas", "Rey de copas",
            "As de espadas", "Dos de espadas", "Tres de espadas", "Cuatro de espadas", "Cinco de espadas", "Seis de espadas", "Siete de espadas", "Sota de espadas", "Caballo de espadas", "Rey de espadas",
            "As de bastos", "Dos de bastos", "Tres de bastos", "Cuatro de bastos", "Cinco de bastos", "Seis de bastos", "Siete de bastos", "Sota de bastos", "Caballo de bastos", "Rey de bastos"
        };
        Random random = new Random();
        int cartaSeleccionada = random.nextInt(baraja.length);
        cartadebaraja = baraja[cartaSeleccionada];

        System.out.println("Tu carta es: " + cartadebaraja);
    }
}




