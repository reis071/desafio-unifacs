package questao8;

// Classe que representa a lista encadeada
class Lista {
    No start;  // Reference to the first node of the list

    // Inserts a new value at the end of the list
    public void insertEnd(int value) {
        No newNode = new No(value);  // Create a new node with the value
        if (start == null) {          // If the list is empty
            start = newNode;          // The new node becomes the start
        } else {
            No current = start;
            while (current.next != null) {  // Traverse to the last node
                current = current.next;
            }
            current.next = newNode;   // Attach the new node at the end
        }
    }

    // Checks if the list contains the given value
    public boolean contains(int value) {
        No current = start;
        while (current != null) {
            if (current.value == value) return true;  // Value found
            current = current.next;                    // Continue searching
        }
        return false;  // Value not found
    }

    // Displays all values in the list preceded by the given name
    public void display(String name) {
        System.out.print(name + ": ");
        No current = start;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
