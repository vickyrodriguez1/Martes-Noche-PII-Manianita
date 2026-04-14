

import Interface.ColaTDA;
import Implementacion.ColaDinamica;

public class GuardiaHospitalDinamico {

    public static String obtenerCaso(int id) {
        switch (id) {
            case 1: return "Dolor de garganta leve (Prioridad 1)";
            case 2: return "Corte profundo en la mano (Prioridad 50)";
            case 3: return "Asfixia severa (Prioridad 100)";
            default: return "Caso no registrado";
        }
    }

    public static void main(String[] args) {

        ColaTDA guardia = new ColaDinamica();
        guardia.InicializarCola();

        System.out.println("Llegan pacientes a la guardia...");

        System.out.println("Ingresa: " + obtenerCaso(1));
        guardia.Acolar(1);

        System.out.println("Ingresa: " + obtenerCaso(2));
        guardia.Acolar(2);

        System.out.println("Ingresa: " + obtenerCaso(3));
        guardia.Acolar(3);

        System.out.println("\nEl médico empieza a llamar (Orden de llegada FIFO)...");

        while (!guardia.ColaVacia()) {
            int pacienteActual = guardia.Primero();
            System.out.println("Atendiendo caso: " + obtenerCaso(pacienteActual));
            guardia.Desacolar();
        }
    }
}