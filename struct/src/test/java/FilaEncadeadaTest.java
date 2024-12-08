import matrixgodo.fila.ErroFila;
import matrixgodo.fila.Fila;
import matrixgodo.fila.FilaEncadeada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilaEncadeadaTest {

    private Fila<Integer> fila;

    @BeforeEach
    public void setup() {
        fila = new FilaEncadeada<>();
    }

    @Test
    public void testInserir() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        // Teste se o primeiro elemento inserido é o primeiro a ser removido (FIFO)
        assertEquals(10, fila.verInicio());
    }

    @Test
    public void testRemover() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        // Remover e verificar a ordem de remoção
        assertEquals(10, fila.remover());  // Remove o primeiro elemento
        assertEquals(20, fila.remover());  // Remove o segundo elemento
        assertEquals(30, fila.remover());  // Remove o terceiro elemento
    }

    @Test
    public void testFilaVazia() throws ErroFila {
        // Teste para fila vazia
        assertThrows(ErroFila.class, () -> {
            fila.verInicio(); // Deve lançar exceção, pois a fila está vazia
        });
    }

    @Test
    public void testInserirERemover() throws ErroFila {
        fila.inserir(10);
        fila.inserir(20);

        // Remover o primeiro elemento
        assertEquals(10, fila.remover());

        // Verificar o próximo início da fila
        assertEquals(20, fila.verInicio());
    }
}
