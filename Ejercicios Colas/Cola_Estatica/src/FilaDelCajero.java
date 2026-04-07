import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class FilaDelCajero {

    public static void main(String[] args) {

        ColaTDA cola = new ColaEstatica();
        cola.InicializarCola();

        // Llegan clientes
        cola.Acolar(1); // cliente 1
        cola.Acolar(2); // cliente 2
        cola.Acolar(3); // cliente 3

        System.out.println("Orden de atencion:");

        while (!cola.ColaVacia()) {
            System.out.println("Atendiendo cliente: " + cola.Primero());
            cola.Desacolar();
        }
    }
}
