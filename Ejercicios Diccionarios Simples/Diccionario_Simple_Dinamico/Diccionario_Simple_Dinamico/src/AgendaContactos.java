import Interface.DiccionarioSimpleTDA;
import Implementacion.DiccionarioSimpleDinamico;

public class AgendaContactos {

    public static void main(String[] args) {
        DiccionarioSimpleTDA agenda = new DiccionarioSimpleDinamico();
        agenda.InicializarDiccionario();

        agenda.Agregar(1, 111111);
        agenda.Agregar(2, 222222);
        agenda.Agregar(3, 333333);

        System.out.println("Claves guardadas en la agenda:");
        int[] claves = agenda.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Contacto: " + claves[i]);
        }


        agenda.Agregar(2, 999999);

        System.out.println("Despues de actualizar la clave 2:");
        claves = agenda.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Contacto: " + claves[i]);
        }


        agenda.Eliminar(1);

        System.out.println("Despues de eliminar la clave 1:");
        claves = agenda.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Contacto: " + claves[i]);
        }
    }
}
