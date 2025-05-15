package questao9;

// Classe que representa um nó da lista duplamente encadeada
class No {
    int value;      // Valor armazenado no nó
    No previous;    // Referência para o nó anterior
    No next;        // Referência para o próximo nó

    // Construtor que inicializa o valor
    public No(int value) {
        this.value = value;
    }
}

// Classe que representa a lista duplamente encadeada
class ListaDupla {
    No start;  // Referência para o início da lista

    public ListaDupla() {
        this.start = null;
    }

    // Método para exibir os valores da lista
    public void display() {
        No current = start;
        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para localizar o nó na posição especificada (1-based)
    public No locate(int position) {
        No current = start;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        return (count == position) ? current : null;
    }

    // Método para inserir um valor na posição especificada (1-based)
    public boolean insertAt(int value, int position) {
        No newNode = new No(value);

        if (position < 1) return false;

        if (position == 1) {
            newNode.next = start;
            if (start != null) start.previous = newNode;
            start = newNode;
            return true;
        }

        No previous = locate(position - 1);
        if (previous == null) return false;

        newNode.next = previous.next;
        newNode.previous = previous;

        if (previous.next != null) {
            previous.next.previous = newNode;
        }

        previous.next = newNode;
        return true;
    }

    // Método para remover o nó na posição especificada (1-based) e retornar seu valor
    public Integer removeAt(int position) {
        if (position < 1 || start == null) return null;

        if (position == 1) {
            int value = start.value;
            start = start.next;
            if (start != null) start.previous = null;
            return value;
        }

        No current = locate(position);
        if (current == null) return null;

        if (current.previous != null) current.previous.next = current.next;
        if (current.next != null) current.next.previous = current.previous;

        return current.value;
    }
}
