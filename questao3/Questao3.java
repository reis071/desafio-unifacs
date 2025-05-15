package questao3;

import java.util.*;

public class Questao3 {

    public static void main(String[] args) {
        Queue<Stack<Integer>> stackQueue = new LinkedList<>(); // Fila de pilhas

        // Cria e adiciona a primeira pilha na fila
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stackQueue.add(stack1);

        // Cria e adiciona a segunda pilha na fila
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(30);
        stack2.push(40);
        stackQueue.add(stack2);

        // Insere um número em uma pilha específica (índice 0 = primeira pilha da fila)
        insertNumberInStack(stackQueue, 0, 99);

        // Remove um número da pilha de índice 0 (último elemento inserido)
        removeNumberFromStack(stackQueue, 0);

        // Remove a pilha mais antiga da fila (FIFO)
        Stack<Integer> removedStack = stackQueue.poll();
        System.out.println("Pilha removida da fila: " + removedStack);

        // Exibe o conteúdo das pilhas restantes na fila
        int i = 0;
        for (Stack<Integer> stack : stackQueue) {
            System.out.println("Pilha " + i + ": " + stack);
            i++;
        }
    }

    // Função que insere um número em uma pilha específica da fila
    public static void insertNumberInStack(Queue<Stack<Integer>> queue, int index, int value) {
        List<Stack<Integer>> list = new ArrayList<>(queue); // Converte a fila em lista para acesso direto

        if (index < list.size()) {
            list.get(index).push(value); // Insere o valor na pilha no índice especificado
        }

        queue.clear();         // Limpa a fila original
        queue.addAll(list);    // Reinsere as pilhas modificadas
    }

    // Função que remove um número do topo de uma pilha específica da fila
    public static void removeNumberFromStack(Queue<Stack<Integer>> queue, int index) {
        List<Stack<Integer>> list = new ArrayList<>(queue); // Converte a fila em lista

        if (index < list.size() && !list.get(index).isEmpty()) {
            list.get(index).pop(); // Remove o topo da pilha no índice especificado
        }

        queue.clear();         // Limpa a fila original
        queue.addAll(list);    // Reinsere as pilhas atualizadas
    }
}
