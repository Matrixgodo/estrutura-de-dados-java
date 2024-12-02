package matrixgodo;

import matrixgodo.pilha.ErroPilha;
import matrixgodo.pilha.PilhaLigada;

public class Main {
    public static void main(String[] args) {
        // Criação de uma pilha genérica para armazenar números inteiros.
        PilhaLigada<Integer> pilha = new PilhaLigada<>();

        try {
            // Teste de inserção
            System.out.println("Inserindo elementos na pilha...");
            pilha.inserir(10);
            pilha.inserir(20);
            pilha.inserir(30);
            System.out.println("Elementos inseridos com sucesso.");

            // Teste de verificação do topo
            System.out.println("Topo atual da pilha: " + pilha.verTopo()); // Deve ser 30

            // Teste de remoção
            System.out.println("Removendo elemento do topo: " + pilha.remover()); // Deve remover 30
            System.out.println("Topo após remoção: " + pilha.verTopo()); // Deve ser 20

            // Teste de verificação da pilha vazia
            System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve ser false

            // Removendo todos os elementos
            System.out.println("Removendo todos os elementos...");
            pilha.remover(); // Remove 20
            pilha.remover(); // Remove 10

            // Verificando se a pilha está vazia novamente
            System.out.println("A pilha está vazia? " + pilha.estaVazia()); // Deve ser true

            // Tentando remover de uma pilha vazia (deve lançar exceção)
            System.out.println("Tentando remover de uma pilha vazia...");
            pilha.remover();

        } catch (ErroPilha e) {
            // Captura e exibe as exceções relacionadas à pilha.
            System.err.println("Erro: " + e.getMessage());
        }
    }
}