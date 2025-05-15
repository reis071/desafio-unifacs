package questao2;

import java.util.Stack;

public class Questao2 {

    // Função que ordena os elementos da pilha em ordem crescente
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>(); // Pilha auxiliar para ajudar na ordenação

        // Enquanto a pilha original não estiver vazia
        while (!stack.isEmpty()) {
            int temp = stack.pop(); // Remove o topo da pilha original

            // Move os elementos da pilha auxiliar de volta para a pilha original
            // enquanto forem maiores que o elemento temporário
            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                stack.push(auxStack.pop());
            }

            // Coloca o elemento temporário na posição correta da pilha auxiliar
            auxStack.push(temp);
        }

        // Transfere os elementos da pilha auxiliar de volta para a pilha original
        // Agora estarão em ordem crescente
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adiciona elementos à pilha
        stack.push(4);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        stack.push(3);

        // Exibe a pilha original
        System.out.println("Original stack: " + stack);

        // Ordena a pilha em ordem crescente
        sortStack(stack);

        // Exibe a pilha ordenada
        System.out.println("Sorted stack: " + stack); // Saída esperada: [1, 2, 3, 4, 7]
    }
}
