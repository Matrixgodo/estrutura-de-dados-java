package matrixgodo.fila;

import matrixgodo.no.No;

/**
 * Implementação de uma fila encadeada que mantém referência para o início e o fim.
 *
 * @param <T> O tipo de dados armazenados na fila.
 */
public class FilaEncadeadaComFim<T> implements Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    /**
     * Insere um elemento no final da fila.
     *
     * @param valor O valor a ser inserido na fila.
     * @throws ErroFila Caso ocorra algum erro durante a inserção.
     */
    @Override
    public void inserir(T valor) throws ErroFila {
        No<T> novoNo = new No<>(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProx(novoNo);
            fim = novoNo;
        }
    }

    /**
     * Remove e retorna o elemento na frente da fila.
     *
     * @return O elemento removido da frente da fila.
     * @throws ErroFila Caso a fila esteja vazia.
     */
    @Override
    public T remover() throws ErroFila {
        if (inicio == null) {
            throw new ErroFila("Fila vazia.");
        }
        T aux = inicio.getDado();
        inicio = inicio.getProx();
        if (inicio == null) {
            fim = null; // Atualiza o fim para null quando a fila ficar vazia.
        }
        return aux;
    }

    /**
     * Retorna o elemento na frente da fila sem removê-lo.
     *
     * @return O elemento na frente da fila.
     * @throws ErroFila Caso a fila esteja vazia.
     */
    @Override
    public T verInicio() throws ErroFila {
        if (inicio == null) {
            throw new ErroFila("Fila vazia.");
        }
        return inicio.getDado();
    }
}
