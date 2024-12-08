package matrixgodo.fila;

/**
 * Exceção personalizada para representar erros relacionados a operações em uma fila.
 * Esta classe estende a classe {@link Exception}, permitindo especificar mensagens
 * de erro e causas subjacentes.
 */
public class ErroFila extends Exception {

    /**
     * Construtor padrão sem mensagem ou causa.
     */
    public ErroFila() {
        super("Erro genérico na operação da fila.");
    }

    /**
     * Construtor que aceita uma mensagem descritiva do erro.
     *
     * @param message A descrição do erro.
     */
    public ErroFila(String message) {
        super(message);
    }

    /**
     * Construtor que aceita uma mensagem descritiva e uma causa do erro.
     *
     * @param message A descrição do erro.
     * @param cause   A causa original da exceção.
     */
    public ErroFila(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Construtor que aceita apenas uma causa para o erro.
     *
     * @param cause A causa original da exceção.
     */
    public ErroFila(Throwable cause) {
        super("Erro na fila causado por outra exceção.", cause);
    }

    /**
     * Construtor completo que permite controlar a supressão e a gravidade da pilha de execução.
     *
     * @param message            A descrição do erro.
     * @param cause              A causa original da exceção.
     * @param enableSuppression  Indica se a supressão de exceção é permitida.
     * @param writableStackTrace Indica se a pilha de execução deve ser gravada.
     */
    public ErroFila(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
