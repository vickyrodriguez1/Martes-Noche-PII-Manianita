import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

/**
 * Bloque 1: cada carpeta se apila; "subir" es desapilar.
 */
public class TestNavegacionDirectorios {

    public static void main(String[] args) {
        PilaTDAString pila = new Estrategia_1_String();
        probar("Estrategia 1", pila);
    }

    public static void probar(String nombre, PilaTDAString pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("C:/");
        System.out.println("Bajé a " + pila.Tope());

        pila.Apilar("Usuarios");
        System.out.println("Bajé a " + pila.Tope());

        pila.Apilar("Documentos");
        System.out.println("Bajé a " + pila.Tope());

        pila.Desapilar();
        System.out.println("Subí un nivel. Ahora estoy en: " + pila.Tope());

        pila.Desapilar();
        System.out.println("Subí otro nivel. Ahora estoy en: " + pila.Tope());

        pila.Desapilar();
        System.out.println("¿Pila vacía? " + pila.PilaVacia());

        System.out.println();
    }
}
