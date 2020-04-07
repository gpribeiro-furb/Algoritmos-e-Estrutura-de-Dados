/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

/**
 *
 * @author panca
 */
public interface Pilha {
    void push(String v) throws Exception;
    String pop () throws Exception;
    String peek();
    boolean vazia();
    void libera();
}
