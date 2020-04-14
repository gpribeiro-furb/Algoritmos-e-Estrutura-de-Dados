package trabalho01;

public class PilhaVetor<T> implements Pilha<T> {

    private T[] vetor;
    private int n = 0;
    private int tamanho;

    public PilhaVetor() {
        tamanho = 100;
        vetor = (T[])new Object[tamanho];
    }
    
    @Override
    public void push(T v) throws Exception {
        if(n == tamanho)
        {
            throw new ListaException("A lista está cheia");
        }
        
        vetor[n] = v;
        n++;
    }

    @Override
    public T pop() throws Exception {
        if(vazia())
        {
            throw new ListaException("A lista está vazia");
        }
        n--;
        T temp = vetor[n];
        vetor[n] = null;
        return temp;
    }

    @Override
    public T peek() {
        if(vazia())
        {
            return null;
        }
        return vetor[n-1];
    }

    @Override
    public boolean vazia() {
        return n == 0;
    }

    @Override
    public void libera() {
        vetor = (T[])new Object[tamanho];
        n = 0;
    }
}
