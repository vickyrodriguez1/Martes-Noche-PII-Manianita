

import Interfaces.PilaTDA;
import Implementacion.PilaDinamica;

public class HistorialNavegacionDinamico {

    public static String obtenerSitio(int id) {
        switch (id) {
            case 1: return "fi.uba.ar";
            case 2: return "campus.utn.edu.ar";
            case 3: return "stackoverflow.com";
            default: return "Desconocido";
        }
    }

    public static void main(String[] args) {

        PilaTDA historial = new PilaDinamica();
        historial.InicializarPila();

        System.out.println("Entrando a " + obtenerSitio(1));
        historial.Apilar(1);

        System.out.println("Entrando a " + obtenerSitio(2));
        historial.Apilar(2);

        System.out.println("Entrando a " + obtenerSitio(3));
        historial.Apilar(3);

        System.out.println("Página actual: " + obtenerSitio(historial.Tope()));

        System.out.println("Apretando el botón Atrás...");

        int paginaCerrada = historial.Tope();
        historial.Desapilar();

        System.out.println("Se desapiló: " + obtenerSitio(paginaCerrada));

        if (!historial.PilaVacia()) {
            System.out.println("Volvimos a: " + obtenerSitio(historial.Tope()));
        }
    }
}