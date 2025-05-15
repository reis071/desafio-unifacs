package questao7;

// Classe que representa um nó da lista estática encadeada
class Node {
    int value;       // Valor armazenado no nó
    int next;        // Índice do próximo nó na lista
    boolean used;    // Indica se a posição do nó está em uso

    Node() {
        this.used = false;  // Inicialmente, o nó não está usado
        this.next = -1;    // -1 indica que não há próximo nó
    }
}

// Classe que implementa a lista estática encadeada
class StaticLinkedList {
    private static final int SIZE = 10;  // Tamanho fixo da lista
    private Node[] list = new Node[SIZE]; // Array que armazena os nós
    private int start = -1;               // Índice do primeiro elemento da lista

    // Construtor: inicializa todos os nós do array
    public StaticLinkedList() {
        for (int i = 0; i < SIZE; i++) {
            list[i] = new Node();
        }
    }

    // Método para alocar um nó livre na lista
    private int allocate() {
        for (int i = 0; i < SIZE; i++) {
            if (!list[i].used) {
                list[i].used = true;  // Marca o nó como usado
                return i;             // Retorna o índice alocado
            }
        }
        return -1; // Lista cheia, não há nó disponível
    }

    // Método para liberar um nó, marcando-o como não usado
    private void free(int index) {
        list[index].used = false;
        list[index].next = -1;
    }

    // Insere um novo valor no início da lista
    public void insert(int value) {
        int newNode = allocate();
        if (newNode == -1) {
            System.out.println("Lista cheia!");
            return;
        }

        list[newNode].value = value;      // Define o valor no novo nó
        list[newNode].next = start;       // Aponta para o início atual da lista
        start = newNode;                  // Atualiza o início para o novo nó
    }

    // Remove o nó que contém o valor especificado
    public void remove(int value) {
        int current = start;
        int previous = -1;

        // Percorre a lista até encontrar o valor ou o fim da lista
        while (current != -1 && list[current].value != value) {
            previous = current;
            current = list[current].next;
        }

        if (current == -1) {
            System.out.println("Valor não encontrado!");
            return;
        }

        // Remove o nó ajustando os ponteiros
        if (previous == -1) {
            start = list[current].next; // Remove o primeiro nó
        } else {
            list[previous].next = list[current].next; // Remove nó do meio ou fim
        }

        free(current); // Libera o nó removido
    }

    // Exibe todos os valores da lista na ordem
    public void display() {
        int current = start;
        System.out.print("List: ");
        while (current != -1) {
            System.out.print(list[current].value + " ");
            current = list[current].next;
        }
        System.out.println();
    }
}
