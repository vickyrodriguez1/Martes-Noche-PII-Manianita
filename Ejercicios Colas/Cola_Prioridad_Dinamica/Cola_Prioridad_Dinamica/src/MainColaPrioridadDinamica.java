
// Ejercicio

//Examen Final (Promocionados vs Regulares):
//1) Situación: En la cartelera se anotan todos. Pero los que
//promocionaron (Prioridad 10) pasan antes que los que rinden final
//(Prioridad 5).
//2) Consigna: Si un regular llegó a las 8:00 AM y un promocionado a las
//8:30 AM, ¿quién sale primero al hacer Desacolar?


import Implementacion.ColaPrioridadDinamica;
import Interface.ColaPrioridadDinamicaTDA;

public class MainColaPrioridadDinamica {
    public static void main(String[] args) {

        ColaPrioridadDinamicaTDA cola = new ColaPrioridadDinamica();
        cola.InicializarColaPrioridad();

        // Acolar alumnos
        cola.AcolarPrioridad(1, 5);
        cola.AcolarPrioridad(2, 10);
        cola.AcolarPrioridad(3, 5);
        cola.AcolarPrioridad(4, 10);

        // Mostrar orden de salida
        while (!cola.ColaVacia()) {
            System.out.println("Sale: " + cola.Primero() +
                    " | Prioridad: " + cola.Prioridad());
            cola.Desacolar();
        }
    }
}