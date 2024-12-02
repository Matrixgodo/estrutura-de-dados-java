package matrixgodo.no;

/**
 * Classe genérica que representa um nó de uma estrutura de dados encadeada.
 * @param <T> O tipo de dado armazenado no nó.
 */
public class No<T> {
    // Atributo que armazena o dado do nó.
    private T dado;

    // Atributo que armazena a referência para o próximo nó na estrutura.
    private No<T> prox;

    /**
     * Construtor padrão que cria um nó vazio.
     */
    public No() {}

    /**
     * Construtor que cria um nó com um dado especificado.
     * @param dado O valor a ser armazenado no nó.
     */
    public No(T dado) {
        this.dado = dado;
    }

    /**
     * Construtor que cria um nó com um dado e a referência para o próximo nó.
     * @param dado O valor a ser armazenado no nó.
     * @param prox Referência para o próximo nó na estrutura.
     */
    public No(T dado, No<T> prox) {
        this.dado = dado;
        this.prox = prox;
    }

    /**
     * Obtém o valor armazenado no nó.
     * @return O valor armazenado no nó.
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o valor a ser armazenado no nó.
     * @param dado O valor a ser armazenado.
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Obtém a referência para o próximo nó na estrutura.
     * @return A referência para o próximo nó.
     */
    public No<T> getProx() {
        return prox;
    }

    /**
     * Define a referência para o próximo nó na estrutura.
     * @param prox A nova referência para o próximo nó.
     */
    public void setProx(No<T> prox) {
        this.prox = prox;
    }
}
