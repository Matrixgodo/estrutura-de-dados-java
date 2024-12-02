package matrixgodo.pilha;

/**
 * Interface que define os métodos essenciais para a operação de uma pilha (LIFO).
 *
 * @param <T> O tipo de elemento armazenado na pilha.
 */
public interface Pilha<T> {

    /**
     * Insere um valor no topo da pilha.
     *
     * @param valor O valor a ser inserido na pilha.
     * @throws ErroPilha Se ocorrer algum erro ao tentar inserir o valor na pilha (ex: pilha cheia).
     */
    void inserir(T valor) throws ErroPilha;

    /**
     * Remove e retorna o valor no topo da pilha.
     *
     * @return O valor removido do topo da pilha.
     * @throws ErroPilha Se ocorrer algum erro ao tentar remover um valor da pilha (ex: pilha vazia).
     */
    T remover() throws ErroPilha;

    /**
     * Retorna o valor no topo da pilha sem removê-lo.
     *
     * @return O valor no topo da pilha.
     * @throws ErroPilha Se ocorrer algum erro ao tentar acessar o topo da pilha (ex: pilha vazia).
     */
    T verTopo() throws ErroPilha;

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário.
     * @throws ErroPilha Se ocorrer algum erro ao verificar o estado da pilha.
     */
    boolean estaVazia() throws ErroPilha;
}
