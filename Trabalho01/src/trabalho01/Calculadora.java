package trabalho01;

public class Calculadora {
    
    public static String calculaExpressao(String expressao, Pilha pilha) throws Exception {
        for (String str : expressao.split(" ")) {
            Integer numero = 0;
            try {
                numero = Integer.parseInt(str.toString());
                pilha.push(numero);
            } catch (Exception e) {
                if(str.equals("+")){
                    Integer numero2 = Integer.parseInt(pilha.pop().toString());
                    Integer numero1 = Integer.parseInt(pilha.pop().toString());

                    Integer resultado = numero1 + numero2;
                    pilha.push(resultado);
                }
                else if(str.equals("-")){
                    Integer numero2 = Integer.parseInt(pilha.pop().toString());
                    Integer numero1 = Integer.parseInt(pilha.pop().toString());

                    Integer resultado = numero1 - numero2;
                    pilha.push(resultado);
                }
                else if(str.equals("*")){
                    Integer numero2 = Integer.parseInt(pilha.pop().toString());
                    Integer numero1 = Integer.parseInt(pilha.pop().toString());

                    Integer resultado = numero1 * numero2;
                    pilha.push(resultado);
                }
                else if(str.equals("/")){
                    Integer numero2 = Integer.parseInt(pilha.pop().toString());
                    Integer numero1 = Integer.parseInt(pilha.pop().toString());

                    Integer resultado = numero1 / numero2;
                    pilha.push(resultado);
                } else {
                    throw new ListaException("Caractere inválido");
                }
            }
        }
        
        return pilha.peek().toString();
    }
}
