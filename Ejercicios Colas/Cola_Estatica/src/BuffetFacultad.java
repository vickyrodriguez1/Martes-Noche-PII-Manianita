import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class BuffetFacultad {

    public static void main(String[] args) {

        ColaTDA fila = new ColaEstatica();
        fila.InicializarCola();

        fila.Acolar(101);
        fila.Acolar(102);
        fila.Acolar(103);

        System.out.println("Quien esta primero (nadie se puede colar): " + fila.Primero());
        System.out.println("Operacion clave: Acolar al final de la cola; atender con Primero + Desacolar.");
    }
}
