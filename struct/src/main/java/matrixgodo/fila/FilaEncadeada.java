package matrixgodo.fila;

import matrixgodo.no.No;

public class FilaEncadeada<T> implements Fila<T> {
    private No<T> inicio;

    /**
     * Insere um elemento no final da fila.
     *
     * @param valor O valor a ser inserido na fila.
     * @throws ErroFila Caso ocorra algum erro durante a inserção.
     */
    @Override
    public void inserir(T valor) throws ErroFila {
        No<T> aux = inicio;
        if (aux == null) {
            inicio = new No<>(valor);
        } else {
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(new No<>(valor));
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

