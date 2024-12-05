package exceptions;

public class CalculoNaoPermitidoException extends Exception {
    public CalculoNaoPermitidoException(String mensagem) {
        super(mensagem);
    }
}
