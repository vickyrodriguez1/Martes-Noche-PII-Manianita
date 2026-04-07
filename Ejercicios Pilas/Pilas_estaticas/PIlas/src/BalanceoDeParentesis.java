import Implementacion.Estrategia_1_String;
import Interfaces.PilaTDAString;

public class BalanceoDeParentesis {
    public static void main(String[] args) {

        System.out.println(estaBalanceado("((a+b)*c)"));
        System.out.println(estaBalanceado("(a+b))"));
        System.out.println(estaBalanceado("((a+b)"));
    }

    public static boolean estaBalanceado(String expr) {
        PilaTDAString pila = new Estrategia_1_String();
        pila.InicializarPila();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') {
                pila.Apilar("(");
            } else if (c == ')') {
                if (pila.PilaVacia()) {
                    return false;
                }
                pila.Desapilar();
            }
        }

        return pila.PilaVacia();
    }
}
