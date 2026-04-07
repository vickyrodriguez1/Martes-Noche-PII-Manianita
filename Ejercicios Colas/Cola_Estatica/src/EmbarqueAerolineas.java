import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class EmbarqueAerolineas {

    public static void main(String[] args) {

        ColaPrioridadTDA embarque = new ColaPrioridadEstatica();
        embarque.InicializarColaPrioridad();

        embarque.AcolarPrioridad(1, 1); // turista A
        embarque.AcolarPrioridad(2, 3); // movilidad reducida
        embarque.AcolarPrioridad(3, 1); // turista B (misma prioridad que A; llego despues)
        embarque.AcolarPrioridad(4, 2); // business

        System.out.println("Orden de subida al avion:");
        while (!embarque.ColaVacia()) {
            System.out.println("Pasajero " + embarque.Primero() + " (prioridad " + embarque.Prioridad() + ")");
            embarque.Desacolar();
        }
        System.out.println("Con igual prioridad (turistas 1 y 3), sube primero quien llego antes.");
    }
}
