import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class ImpresoraDelLaboratorio {

    public static void main(String[] args) {

        ColaTDA cola = new ColaEstatica();
        cola.InicializarCola();

        // Llegan archivos
        cola.Acolar(10);
        cola.Acolar(20);
        cola.Acolar(30);
        cola.Acolar(40);
        cola.Acolar(50);

        System.out.println("Orden de impresion:");

        while (!cola.ColaVacia()) {
            System.out.println("Imprimiendo archivo: " + cola.Primero());
            cola.Desacolar();
        }
    }
}