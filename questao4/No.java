package questao4;

// Classe que representa um nó da lista duplamente encadeada
class Node {
    int value;         // Valor armazenado no nó
    Node previous;     // Referência para o nó anterior
    Node next;         // Referência para o próximo nó

    public Node(int value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
}

// Classe que implementa uma pilha usando uma lista duplamente encadeada
class PilhaDupla {
    private Node top;  // Referência para o topo da pilha

    public PilhaDupla() {
        this.top = null;
    }

    // Método para empilhar (inserir) um valor no topo da pilha
    public void push(int value) {
        Node newNode = new Node(value);
        if (top != null) {
            top.next = newNode;       // O topo atual aponta para o novo nó
            newNode.previous = top;   // O novo nó aponta para o topo anterior
        }
        top = newNode; // O novo nó se torna o topo
    }

    // Método para desempilhar (remover) o valor do topo da pilha
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        int value = top.value; // Armazena o valor a ser retornado
        top = top.previous;    // Move o topo para o nó anterior
        if (top != null) top.next = null; // Remove referência para o nó removido
        return value;
    }

    // Método para acessar o valor do topo da pilha sem removê-lo
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return top.value;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Exibe os elementos da pilha do topo até a base
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }
}
