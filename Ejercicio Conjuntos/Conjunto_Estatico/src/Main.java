
//Gestión de Legajos: En la base de datos de Ingeniería en Informática, el
//legajo es único.
//o Consigna: Si un alumno se anota a dos carreras, ¿cómo se asegura
//el sistema de no duplicar su ID?

import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {

        ConjuntoTDA legajos = new ConjuntoEstatico();
        legajos.InicializarConjunto();

        // Alumnos se anotan
        legajos.Agregar(1001);
        legajos.Agregar(2002);
        legajos.Agregar(3003);
        legajos.Agregar(4004);

        // Intentos de duplicados
        legajos.Agregar(1001);
        legajos.Agregar(3003);

        // Más alumnos
        legajos.Agregar(5005);
        legajos.Agregar(6006);

        // Verificaciones
        System.out.println("¿Existe legajo 1001?: " + legajos.Pertenece(1001));
        System.out.println("¿Existe legajo 3003?: " + legajos.Pertenece(3003));
        System.out.println("¿Existe legajo 7007?: " + legajos.Pertenece(7007));

        // Mostrar elementos
        System.out.println("\nLegajos en el sistema:");
        while (!legajos.ConjuntoVacio()) {
            int x = legajos.Elegir();
            System.out.println("Legajo: " + x);
            legajos.Sacar(x);
        }


        System.out.println("\n¿Conjunto vacío?: " + legajos.ConjuntoVacio());
    }
}