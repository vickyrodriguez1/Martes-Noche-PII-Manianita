package Implementacion;

import Interface.DiccionarioMultipleEstaticoTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleEstaticoTDA {

    private static final int MAX_CLAVES = 100;
    private static final int MAX_VALORES = 100;

    private String[] claves;
    private String[][] valores;
    private int[] cantValores;
    private int cantidadClaves;

    @Override
    public void InicializarDiccionario() {
        claves = new String[MAX_CLAVES];
        valores = new String[MAX_CLAVES][MAX_VALORES];
        cantValores = new int[MAX_CLAVES];
        cantidadClaves = 0;
    }

    @Override
    public void Agregar(String clave, String valor) {
        int posClave = buscarClave(clave);

        if (posClave == -1) {
            claves[cantidadClaves] = clave;
            valores[cantidadClaves][0] = valor;
            cantValores[cantidadClaves] = 1;
            cantidadClaves++;
        } else {
            if (!existeValor(posClave, valor)) {
                valores[posClave][cantValores[posClave]] = valor;
                cantValores[posClave]++;
            }
        }
    }

    @Override
    public void EliminarValor(String clave, String valor) {
        int posClave = buscarClave(clave);

        if (posClave != -1) {
            int posValor = buscarValor(posClave, valor);

            if (posValor != -1) {
                valores[posClave][posValor] = valores[posClave][cantValores[posClave] - 1];
                cantValores[posClave]--;

                if (cantValores[posClave] == 0) {
                    Eliminar(clave);
                }
            }
        }
    }

    @Override
    public void Eliminar(String clave) {
        int posClave = buscarClave(clave);

        if (posClave != -1) {
            claves[posClave] = claves[cantidadClaves - 1];
            cantValores[posClave] = cantValores[cantidadClaves - 1];

            for (int i = 0; i < cantValores[posClave]; i++) {
                valores[posClave][i] = valores[cantidadClaves - 1][i];
            }

            cantidadClaves--;
        }
    }

    @Override
    public String[] Recuperar(String clave) {
        int posClave = buscarClave(clave);

        if (posClave == -1) {
            return new String[0];
        }

        String[] aux = new String[cantValores[posClave]];
        for (int i = 0; i < cantValores[posClave]; i++) {
            aux[i] = valores[posClave][i];
        }
        return aux;
    }

    @Override
    public String[] Claves() {
        String[] aux = new String[cantidadClaves];
        for (int i = 0; i < cantidadClaves; i++) {
            aux[i] = claves[i];
        }
        return aux;
    }

    private int buscarClave(String clave) {
        int i = 0;
        while (i < cantidadClaves && !claves[i].equals(clave)) {
            i++;
        }
        return (i < cantidadClaves) ? i : -1;
    }

    private int buscarValor(int posClave, String valor) {
        int i = 0;
        while (i < cantValores[posClave] && !valores[posClave][i].equals(valor)) {
            i++;
        }
        return (i < cantValores[posClave]) ? i : -1;
    }

    private boolean existeValor(int posClave, String valor) {
        return buscarValor(posClave, valor) != -1;
    }
}