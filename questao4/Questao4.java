package questao4;

public class Questao4 {
    public static void main(String[] args) {
        PilhaDupla stack = new PilhaDupla(); // Cria uma nova pilha duplamente encadeada

        // Empilha os valores 10, 20 e 30
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Exibe o conteúdo atual da pilha
        System.out.print("Conteúdo da pilha: ");
        stack.display(); // Esperado: 30 20 10

        // Mostra o valor do topo da pilha
        System.out.println("Topo: " + stack.top()); // Esperado: 30

        // Remove o elemento do topo da pilha (pop)
        System.out.println("Pop: " + stack.pop()); // Esperado: 30

        // Exibe o conteúdo da pilha após o pop
        System.out.print("Conteúdo após pop: ");
        stack.display(); // Esperado: 20 10
    }
}
