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
        Integer numero = 0;
        try {
            numero = Integer.parseInt(v.toString());
            ElementoLista elemento = new ElementoLista();
            elemento.setInfo(v);

            if(topo != null) {
                elemento.setProx(topo);
            } 

            topo = elemento;
        } catch (Exception e) {
            if(topo == null || topo.getProx() == null) {
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
        if(topo == null) {
            throw new ListaException("A lista está vazia");
        }
        
        T retorno = (T)topo.getInfo();
        if(topo.getProx() != null) {
            topo = topo.getProx();
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
