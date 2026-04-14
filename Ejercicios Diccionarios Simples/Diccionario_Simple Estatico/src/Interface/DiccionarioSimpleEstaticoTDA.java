package Interface;

public interface DiccionarioSimpleEstaticoTDA {
    void InicializarDiccionario();
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    String[] Claves();
}