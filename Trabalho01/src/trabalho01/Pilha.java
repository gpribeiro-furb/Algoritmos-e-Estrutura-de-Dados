package trabalho01;

public interface Pilha {
    void push(String v) throws Exception;
    String pop () throws Exception;
    String peek();
    boolean vazia();
    void libera();
}
