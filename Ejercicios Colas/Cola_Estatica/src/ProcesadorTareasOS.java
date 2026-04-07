import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class ProcesadorTareasOS {

    public static void main(String[] args) {

        ColaPrioridadTDA listo = new ColaPrioridadEstatica();
        listo.InicializarColaPrioridad();

        listo.AcolarPrioridad(7001, 10); // Spotify (usuario)
        listo.AcolarPrioridad(9001, 50); // driver de red (sistema)
        listo.AcolarPrioridad(7002, 10); // otro proceso usuario

        System.out.println("Bajo sobrecarga, el CPU atiende por prioridad:");
        while (!listo.ColaVacia()) {
            System.out.println("Ejecutando PID " + listo.Primero() + " (prioridad " + listo.Prioridad() + ")");
            listo.Desacolar();
        }
    }
}
