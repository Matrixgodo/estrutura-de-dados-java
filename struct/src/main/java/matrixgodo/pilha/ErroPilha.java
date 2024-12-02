package matrixgodo.pilha;

// A classe ErroPilha estende a classe Exception, permitindo tratar erros específicos relacionados à pilha.
public class ErroPilha extends Exception {

    // Construtor padrão sem parâmetros.
    public ErroPilha() {
    }

    // Construtor que recebe uma mensagem de erro como parâmetro e a passa para o construtor da classe Exception.
    public ErroPilha(String message) {
        super(message); // Chama o construtor da classe Exception com a mensagem de erro.
    }

    // Construtor que recebe uma mensagem de erro e a causa do erro (Throwable).
    public ErroPilha(String message, Throwable cause) {
        super(message, cause); // Chama o construtor da classe Exception com a mensagem e a causa.
    }

    // Construtor que recebe apenas a causa do erro e chama o construtor da classe Exception.
    // Throwable é a classe base para erros e exceções em Java.
    public ErroPilha(Throwable cause) {
        super(cause); // Chama o construtor da classe Exception passando a causa do erro.
    }

    // Construtor que permite especificar uma mensagem, a causa do erro, se a supressão de exceções é permitida e se o rastreamento da pilha de erros será gravado.
    public ErroPilha(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace); // Chama o construtor da classe Exception com todos os parâmetros fornecidos.
    }
}
