import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class GuardiaHospitalTriage {

    public static void main(String[] args) {

        ColaPrioridadTDA triage = new ColaPrioridadEstatica();
        triage.InicializarColaPrioridad();

        // Tres casos con prioridades definidas por consigna (valores de ejemplo)
        triage.AcolarPrioridad(1, 15);  // caso 1: raspón leve
        triage.AcolarPrioridad(2, 85);  // caso 2: dificultad respiratoria
        triage.AcolarPrioridad(3, 50);  // caso 3: fiebre alta

        System.out.println("Orden de atencion en triage (mayor prioridad primero):");
        while (!triage.ColaVacia()) {
            System.out.println("Atendiendo paciente ID " + triage.Primero()
                    + " (prioridad " + triage.Prioridad() + ")");
            triage.Desacolar();
        }
    }
}
