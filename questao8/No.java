package questao8;

// Classe que representa um nó da lista encadeada
class No {
    int value;      // Valor armazenado no nó
    No next;        // Referência para o próximo nó

    // Constructor initializes the value and sets next to null
    public No(int value) {
        this.value = value;
        this.next = null;
    }
}
