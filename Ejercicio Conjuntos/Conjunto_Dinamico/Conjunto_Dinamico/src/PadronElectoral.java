import Interface.ConjuntoTDA;
import Implementacion.ConjuntoDinamico;

public class PadronElectoral {

    public static void votar(ConjuntoTDA padron, int legajo) {
        if (padron.Pertenece(legajo)) {
            System.out.println("El alumno " + legajo + " ya voto. No puede votar dos veces.");
        } else {
            padron.Agregar(legajo);
            System.out.println("Voto registrado para el alumno " + legajo);
        }
    }

    public static void main(String[] args) {
        ConjuntoTDA padron = new ConjuntoDinamico();
        padron.InicializarConjunto();

        votar(padron, 101);
        votar(padron, 202);
        votar(padron, 101);
        votar(padron, 303);
        votar(padron, 202);
    }
}
