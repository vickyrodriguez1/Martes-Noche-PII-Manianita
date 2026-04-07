import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

/**
 * Bloque 1: metemos letra por letra y las sacamos al revés.
 */
public class TestReversionStrings {

    public static void main(String[] args) {
        PilaTDAString pila = new Estrategia_1_String();
        probar("Estrategia 1", pila);
    }

    public static void probar(String nombre, PilaTDAString pila) {
        System.out.println("=== " + nombre + " ===");

        String palabra = "ALGORITMOS";
        System.out.println("Original: " + palabra);

        pila.InicializarPila();

        // Apilar cada letra
        for (int i = 0; i < palabra.length(); i++) {
            String letra = "" + palabra.charAt(i);
            pila.Apilar(letra);
        }

        // Sacar del tope y pegar al resultado
        String alRevesHastaAhora = "";
        while (!pila.PilaVacia()) {
            alRevesHastaAhora = alRevesHastaAhora + pila.Tope();
            pila.Desapilar();
        }

        System.out.println("Al revés: " + alRevesHastaAhora);
        System.out.println();
    }
}
