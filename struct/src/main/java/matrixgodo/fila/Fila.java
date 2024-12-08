package matrixgodo.fila;

/**
 * Interface genérica para implementar o conceito de uma fila (Queue).
 * Uma fila segue o princípio FIFO (First In, First Out), ou seja, o primeiro elemento a ser inserido
 * é o primeiro a ser removido.
 *
 * @param <Tipo_De_Dado> O tipo de dado que a fila armazenará.
 */
public interface Fila<Tipo_De_Dado> {

    /**
     * Insere um novo elemento no final da fila.
     *
     * @param valor O elemento a ser inserido na fila.
     * @throws ErroFila Exceção lançada se ocorrer um erro ao tentar inserir,
     *                  por exemplo, caso a fila esteja cheia (em uma implementação limitada).
     */
    void inserir(Tipo_De_Dado valor) throws ErroFila;

    /**
     * Remove e retorna o elemento na frente da fila.
     *
     * @return O elemento que foi removido da frente da fila.
     * @throws ErroFila Exceção lançada se ocorrer um erro ao tentar remover,
     *                  por exemplo, caso a fila esteja vazia.
     */
    Tipo_De_Dado remover() throws ErroFila;

    /**
     * Retorna o elemento que está na frente da fila sem removê-lo.
     *
     * @return O elemento no início da fila.
     * @throws ErroFila Exceção lançada se ocorrer um erro ao tentar acessar o início,
     *                  por exemplo, caso a fila esteja vazia.
     */
    Tipo_De_Dado verInicio() throws ErroFila;
}

