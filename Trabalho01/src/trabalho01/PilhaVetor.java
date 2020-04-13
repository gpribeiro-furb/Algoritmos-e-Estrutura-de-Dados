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
        
        Integer numero = 0;
        try {
            numero = Integer.parseInt(v.toString());
            vetor[n] = v;
            n++;
        } catch (Exception e) {
            
            if(n <= 1) {
                throw new ListaException("Expressão inválida");
            }
            
            if(v.toString().equals("+")){
                Integer numero2 = Integer.parseInt(pop().toString());
                Integer numero1 = Integer.parseInt(pop().toString());
                
                Integer resultado = numero1 + numero2;
                push((T)resultado);
            }
            else if(v.toString().equals("-")){
                Integer numero2 = Integer.parseInt(pop().toString());
                Integer numero1 = Integer.parseInt(pop().toString());
                
                Integer resultado = numero1 - numero2;
                push((T)resultado);
            }
            else if(v.toString().equals("*")){
                Integer numero2 = Integer.parseInt(pop().toString());
                Integer numero1 = Integer.parseInt(pop().toString());
                
                Integer resultado = numero1 * numero2;
                push((T)resultado);
            }
            else if(v.toString().equals("/")){
                Integer numero2 = Integer.parseInt(pop().toString());
                Integer numero1 = Integer.parseInt(pop().toString());
                
                Integer resultado = numero1 / numero2;
                push((T)resultado);
            } else {
                throw new ListaException("Caractere inválido");
            }
        }
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
        vetor = (T[])new Object[100];
        n = 0;
    }
}
