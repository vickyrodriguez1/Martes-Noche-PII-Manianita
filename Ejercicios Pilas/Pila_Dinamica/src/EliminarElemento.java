import Interfaces.PilaTDA;
import Implementacion.PilaDinamica;
import ImplementacionPilaEstatica.Estrategia_1;


public class EliminarElemento {

    public static void EliminarElemento(PilaTDA pila, int valor) {
        PilaTDA aux = new PilaDinamica();
        aux.InicializarPila();

        while (!pila.PilaVacia()) {
            int x = pila.Tope();
            System.out.println("Saco: " + x);
            pila.Desapilar();

            if (x != valor) {
                aux.Apilar(x);
            } else {
                System.out.println("Elimino: " + x);
            }
        }

        while (!aux.PilaVacia()) {
            int x = aux.Tope();
            pila.Apilar(x);
            aux.Desapilar();
            System.out.println("Vuelvo a poner: " + x);
        }
    }

    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        for (int i = 1; i <= 20; i++) {
            pila.Apilar(i);
        }

        EliminarElemento(pila, 10);
    }
}
