package trabalho01;

public class PilhaVetor implements Pilha {

    private String[] vetor;
    private int qntd = 0;
    private int tamanho;

    public PilhaVetor() {
        tamanho = 100;
        vetor = new String[tamanho];
    }
    
    
    
    @Override
    public void push(String v) throws Exception {
        if(qntd == tamanho)
        {
            throw new ListaException("A lista está cheia");
        }
        vetor[qntd] = v;
        qntd++;
    }

    @Override
    public String pop() throws Exception {
        if(vazia())
        {
            throw new ListaException("A lista está vazia");
        }
        qntd--;
        String temp = vetor[qntd];
        vetor[qntd] = null;
        return temp;
    }

    @Override
    public String peek() {
        if(vazia())
        {
            return null;
        }
        return vetor[qntd-1];
    }

    @Override
    public boolean vazia() {
        return qntd == 0;
    }

    @Override
    public void libera() {
        vetor = (String[])new Object[100];
        qntd = 0;
    }
    
}
