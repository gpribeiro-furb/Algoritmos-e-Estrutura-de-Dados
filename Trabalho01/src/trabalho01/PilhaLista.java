/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

/**
 *
 * @author Panca
 */
public class PilhaLista<T> implements Pilha<T> {

    private ElementoLista topo;
    
    @Override
    public void push(T v) throws Exception {
        ElementoLista elemento = new ElementoLista();
        elemento.setInfo(v);

        if(topo != null) {
            elemento.setProx(topo);
        } 

        topo = elemento;
    }

    @Override
    public T pop() throws Exception {
        if(topo == null) {
            throw new ListaException("A lista está vazia");
        }
        
        T retorno = (T)topo.getInfo();
        if(topo.getProx() != null) {
            topo = topo.getProx();
        } else {
            topo = null;
        }
        return retorno;
    }

    @Override
    public T peek() {
        return (T)topo.getInfo();
    }

    @Override
    public boolean vazia() {
        return topo == null;
    }

    @Override
    public void libera() {
        topo = null;
    }
    
}
