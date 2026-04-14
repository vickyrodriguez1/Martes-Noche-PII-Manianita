
//Agenda de Contactos:
// TDA: Simple.
// Modelado: Clave: [Nombre] / Valor: [Teléfono]


import Implementacion.DiccionarioSimpleEstatico;
import Interface.DiccionarioSimpleEstaticoTDA;

public class MainDiccionarioSimpleEstatico {
    public static void main(String[] args) {

        DiccionarioSimpleEstaticoTDA agenda = new DiccionarioSimpleEstatico();
        agenda.InicializarDiccionario();

        // Agregar contactos
        agenda.Agregar("Pablo", "1234");
        agenda.Agregar("Ana", "5678");
        agenda.Agregar("Luis", "9999");

        // Actualizar teléfono
        agenda.Agregar("Ana", "0000");

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        for (String nombre : agenda.Claves()) {
            System.out.println(nombre);
        }

        // Eliminar contacto
        agenda.Eliminar("Pablo");

        System.out.println("\nLuego de eliminar a Pablo:");
        for (String nombre : agenda.Claves()) {
            System.out.println(nombre);
        }
    }
}