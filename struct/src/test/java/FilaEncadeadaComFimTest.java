import matrixgodo.fila.ErroFila;
import matrixgodo.fila.Fila;
import matrixgodo.fila.FilaEncadeadaComFim;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilaEncadeadaComFimTest {

    private Fila<Integer> fila;

    @BeforeEach
    public void setup() {
        fila = new FilaEncadeadaComFim<>();
    }

    @Test
    public void testInserir() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        // Teste se o primeiro elemento inserido é o primeiro a ser removido (FIFO)
        assertEquals(10, fila.verInicio()); // O primeiro elemento inserido deve ser 10
    }

    @Test
    public void testRemover() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        // Remover e verificar a ordem de remoção
        assertEquals(10, fila.remover());  // Remove o primeiro elemento (FIFO)
        assertEquals(20, fila.remover());  // Remove o segundo
        assertEquals(30, fila.remover());  // Remove o terceiro
    }

    @Test
    public void testFilaVazia() throws ErroFila {
        // Teste para fila vazia
        assertThrows(ErroFila.class, () -> {
            fila.verInicio(); // Deve lançar exceção porque a fila está vazia
        });
    }

    @Test
    public void testInserirERemover() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);

        // Remover o primeiro elemento
        assertEquals(10, fila.remover());  // Deve remover 10

        // Verificar o próximo início da fila
        assertEquals(20, fila.verInicio());  // O próximo elemento deve ser 20
    }

    @Test
    public void testFilaVaziaAposRemoverTodos() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        // Removendo todos os elementos
        fila.remover(); // Remove 10
        fila.remover(); // Remove 20
        fila.remover(); // Remove 30

        // Tentando acessar o início da fila vazia
        assertThrows(ErroFila.class, () -> {
            fila.verInicio();  // Deve lançar exceção pois a fila está vazia
        });
    }
}
