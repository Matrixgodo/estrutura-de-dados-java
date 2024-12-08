package matrixgodo;

import matrixgodo.fila.ErroFila;
import matrixgodo.fila.Fila;
import matrixgodo.fila.FilaEncadeada;
import matrixgodo.fila.FilaEncadeadaComFim;
import matrixgodo.pilha.ErroPilha;
import matrixgodo.pilha.Pilha;
import matrixgodo.pilha.PilhaLigada;

public class Main {
    public static void main(String[] args) {
        // ==== Testando Pilha ====
        testarPilha();

        // ==== Testando Fila Encadeada ====
        testarFilaEncadeada();

        // ==== Testando Fila Encadeada com Fim ====
        testarFilaEncadeadaComFim();
    }

    private static void testarPilha() {
        System.out.println("\n===== TESTANDO PILHA =====");
        Pilha<Integer> pilha = new PilhaLigada<>();

        try {
            System.out.println("Inserindo elementos na pilha...");
            pilha.inserir(10);
            pilha.inserir(20);
            pilha.inserir(30);
            System.out.println("Elementos inseridos com sucesso.");

            System.out.println("Topo atual da pilha: " + pilha.verTopo()); // Deve ser 30

            System.out.println("Removendo elemento do topo: " + pilha.remover()); // Deve remover 30
            System.out.println("Topo após remoção: " + pilha.verTopo()); // Deve ser 20

            System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve ser false

            System.out.println("Removendo todos os elementos...");
            pilha.remover(); // Remove 20
            pilha.remover(); // Remove 10

            System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve ser true

            System.out.println("Tentando remover de uma pilha vazia...");
            pilha.remover(); // Deve lançar exceção
        } catch (ErroPilha e) {
            System.err.println("Erro na Pilha: " + e.getMessage());
        }
    }

    private static void testarFilaEncadeada() {
        System.out.println("\n===== TESTANDO FILA ENCADEADA =====");
        Fila<Integer> fila = new FilaEncadeada<>();

        try {
            System.out.println("Inserindo elementos na fila...");
            fila.inserir(10);
            fila.inserir(20);
            fila.inserir(30);
            System.out.println("Elementos inseridos com sucesso.");

            System.out.println("Primeiro elemento da fila: " + fila.verInicio()); // Deve ser 10

            System.out.println("Removendo elemento da fila: " + fila.remover()); // Deve remover 10
            System.out.println("Primeiro após remoção: " + fila.verInicio()); // Deve ser 20

            System.out.println("Removendo todos os elementos...");
            fila.remover(); // Remove 20
            fila.remover(); // Remove 30

            System.out.println("Tentando acessar o início de uma fila vazia...");
            fila.verInicio(); // Deve lançar exceção
        } catch (ErroFila e) {
            System.err.println("Erro na Fila Encadeada: " + e.getMessage());
        }
    }

    private static void testarFilaEncadeadaComFim() {
        System.out.println("\n===== TESTANDO FILA ENCADEADA COM FIM =====");
        Fila<Integer> filaComFim = new FilaEncadeadaComFim<>();

        try {
            System.out.println("Inserindo elementos na fila...");
            filaComFim.inserir(10);
            filaComFim.inserir(20);
            filaComFim.inserir(30);
            System.out.println("Elementos inseridos com sucesso.");

            System.out.println("Primeiro elemento da fila: " + filaComFim.verInicio()); // Deve ser 10

            System.out.println("Removendo elemento da fila: " + filaComFim.remover()); // Deve remover 10
            System.out.println("Primeiro após remoção: " + filaComFim.verInicio()); // Deve ser 20

            System.out.println("Removendo todos os elementos...");
            filaComFim.remover(); // Remove 20
            filaComFim.remover(); // Remove 30

            System.out.println("Tentando acessar o início de uma fila vazia...");
            filaComFim.verInicio(); // Deve lançar exceção
        } catch (ErroFila e) {
            System.err.println("Erro na Fila Encadeada com Fim: " + e.getMessage());
        }
    }
}
