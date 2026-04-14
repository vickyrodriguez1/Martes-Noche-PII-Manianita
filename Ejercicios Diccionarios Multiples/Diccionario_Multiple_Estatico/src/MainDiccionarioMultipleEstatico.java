

//Diccionario de Sinónimos:
// TDA: Múltiple.
// Modelado: Clave: [Palabra] / Valor: [Conjunto de Sinónimos]


import Implementacion.DiccionarioMultipleEstatico;
import Interface.DiccionarioMultipleEstaticoTDA;

public class MainDiccionarioMultipleEstatico {
    public static void main(String[] args) {

        DiccionarioMultipleEstaticoTDA dic = new DiccionarioMultipleEstatico();
        dic.InicializarDiccionario();

        dic.Agregar("rápido", "veloz");
        dic.Agregar("rápido", "ágil");
        dic.Agregar("rápido", "ligero");

        dic.Agregar("feliz", "contento");
        dic.Agregar("feliz", "alegre");

        // Mostrar claves
        System.out.println("Palabras:");
        for (String clave : dic.Claves()) {
            System.out.println(clave);
        }

        // Mostrar sinónimos
        System.out.println("\nSinónimos de 'rápido':");
        for (String v : dic.Recuperar("rápido")) {
            System.out.println(v);
        }
    }
}