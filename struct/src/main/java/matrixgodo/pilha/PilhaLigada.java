package matrixgodo.pilha;

import matrixgodo.no.No;

/**
 * Implementação de uma pilha genérica usando uma estrutura encadeada.
 * @param <T> O tipo de elemento armazenado na pilha.
 */
public class PilhaLigada<T> implements Pilha<T> {
    // Referência para o topo da pilha, que é o último elemento inserido.
    private No<T> topo;

    /**
     * Insere um novo valor no topo da pilha.
     * @param valor O valor a ser inserido.
     * @throws ErroPilha Se houver algum erro específico relacionado à operação na pilha.
     */
    @Override
    public void inserir(T valor) throws ErroPilha {
        // Cria um novo nó, apontando o próximo para o atual topo da pilha.
        No<T> aux = new No<>(valor, topo);
        // Atualiza o topo para o novo nó.
        topo = aux;
    }

    /**
     * Remove e retorna o valor do topo da pilha.
     * @return O valor armazenado no topo da pilha.
     * @throws ErroPilha Se a pilha estiver vazia.
     */
    @Override
    public T remover() throws ErroPilha {
        // Verifica se a pilha está vazia.
        if (topo == null)
            throw new ErroPilha("Pilha Vazia.");
        // Armazena o valor do topo para retorno.
        T aux = topo.getDado();
        // Move o topo para o próximo nó.
        topo = topo.getProx();
        return aux;
    }

    /**
     * Retorna o valor do topo da pilha sem removê-lo.
     * @return O valor armazenado no topo da pilha.
     * @throws ErroPilha Se a pilha estiver vazia.
     */
    @Override
    public T verTopo() throws ErroPilha {
        // Verifica se a pilha está vazia.
        if (topo == null)
            throw new ErroPilha("Pilha Vazia.");
        // Retorna o valor armazenado no topo.
        return topo.getDado();
    }

    /**
     * Verifica se a pilha está vazia.
     * @return {@code true} se a pilha estiver vazia, caso contrário {@code false}.
     * @throws ErroPilha Se houver algum erro específico relacionado à operação na pilha.
     */
    @Override
    public boolean estaVazia() throws ErroPilha {
        // Retorna true se o topo for null, indicando que a pilha está vazia.
        return topo == null;
    }
}
