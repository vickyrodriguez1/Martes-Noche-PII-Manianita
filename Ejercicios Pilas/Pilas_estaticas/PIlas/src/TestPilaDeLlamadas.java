import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

/**
 * Bloque 1: simulación a mano (sin variables static ni métodos extra).
 * Main llama a CalcularPromedio y eso llama a Sumar: el tope es la función "más adentro".
 */
public class TestPilaDeLlamadas {

    public static void main(String[] args) {
        PilaTDAString pila = new Estrategia_1_String();
        pila.InicializarPila();

        System.out.println("=== Estrategia 1 ===");

        pila.Apilar("Main");
        System.out.println("Entró Main. Tope: " + pila.Tope());

        pila.Apilar("CalcularPromedio");
        System.out.println("Main llamó a CalcularPromedio. Tope: " + pila.Tope());

        pila.Apilar("Sumar");
        System.out.println("CalcularPromedio llamó a Sumar. Tope (quien está \"adentro\"): " + pila.Tope());

        pila.Desapilar();
        System.out.println("Terminó Sumar. Tope ahora: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Terminó CalcularPromedio. Tope ahora: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Terminó Main. ¿Pila vacía?: " + pila.PilaVacia());

        System.out.println();
    }
}
