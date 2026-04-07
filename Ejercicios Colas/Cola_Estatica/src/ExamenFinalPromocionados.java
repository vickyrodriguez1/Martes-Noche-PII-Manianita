import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class ExamenFinalPromocionados {

    private static final int PRIORIDAD_PROMOCIONADO = 10;
    private static final int PRIORIDAD_REGULAR = 5;

    public static void main(String[] args) {

        ColaPrioridadTDA cartelera = new ColaPrioridadEstatica();
        cartelera.InicializarColaPrioridad();

        // Regular 8:00, promocionado 8:30 (llega despues)
        cartelera.AcolarPrioridad(401, PRIORIDAD_REGULAR);
        cartelera.AcolarPrioridad(502, PRIORIDAD_PROMOCIONADO);

        System.out.println("Primero en salir al Desacolar: alumno " + cartelera.Primero()
                + " (prioridad " + cartelera.Prioridad() + ")");
        System.out.println("=> Pasa primero el promocionado, aunque llego despues.");
    }
}
