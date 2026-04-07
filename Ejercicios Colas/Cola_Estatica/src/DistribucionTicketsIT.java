import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class DistribucionTicketsIT {

    public static void main(String[] args) {

        ColaPrioridadTDA tickets = new ColaPrioridadEstatica();
        tickets.InicializarColaPrioridad();

        tickets.AcolarPrioridad(501, 0);   // fondo de pantalla
        tickets.AcolarPrioridad(502, 999); // cayo el servidor principal

        System.out.println("Proximo ticket: #" + tickets.Primero() + " (prioridad " + tickets.Prioridad() + ")");
        System.out.println("=> Se atiende primero el servidor (prioridad explicita 999 vs 0).");
    }
}
