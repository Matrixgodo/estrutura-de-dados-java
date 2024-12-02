import matrixgodo.pilha.ErroPilha;
import matrixgodo.pilha.PilhaLigada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaLigadaTest {

    @Test
    void testInserirEVerTopo() throws ErroPilha {
        PilhaLigada<Integer> pilha = new PilhaLigada<>();

        // Testando inserção de elementos
        pilha.inserir(10);
        assertEquals(10, pilha.verTopo());

        pilha.inserir(20);
        assertEquals(20, pilha.verTopo());

        pilha.inserir(30);
        assertEquals(30, pilha.verTopo());
    }

    @Test
    void testRemover() throws ErroPilha {
        PilhaLigada<Integer> pilha = new PilhaLigada<>();
        pilha.inserir(10);
        pilha.inserir(20);

        // Testando remoção
        assertEquals(20, pilha.remover()); // Remove o topo (20)
        assertEquals(10, pilha.verTopo()); // O novo topo é 10

        assertEquals(10, pilha.remover()); // Remove o topo (10)
        assertTrue(pilha.estaVazia()); // Pilha agora está vazia
    }

    @Test
    void testEstaVazia() throws ErroPilha {
        PilhaLigada<Integer> pilha = new PilhaLigada<>();
        assertTrue(pilha.estaVazia()); // Pilha inicialmente está vazia

        pilha.inserir(10);
        assertFalse(pilha.estaVazia()); // Pilha agora tem elementos
    }

    @Test
    void testRemoverDePilhaVazia() {
        PilhaLigada<Integer> pilha = new PilhaLigada<>();

        // Exceção esperada ao remover de uma pilha vazia
        Exception exception = assertThrows(ErroPilha.class, pilha::remover);
        assertEquals("Pilha Vazia.", exception.getMessage());
    }

    @Test
    void testVerTopoDePilhaVazia() {
        PilhaLigada<Integer> pilha = new PilhaLigada<>();

        // Exceção esperada ao acessar o topo de uma pilha vazia
        Exception exception = assertThrows(ErroPilha.class, pilha::verTopo);
        assertEquals("Pilha Vazia.", exception.getMessage());
    }
}