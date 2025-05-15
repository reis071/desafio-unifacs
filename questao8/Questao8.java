package questao8;

public class Questao8 {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.insertEnd(1);
        l1.insertEnd(2);
        l1.insertEnd(3);

        Lista l2 = new Lista();
        l2.insertEnd(3);
        l2.insertEnd(4);
        l2.insertEnd(5);

        Lista l3 = union(l1, l2);
        Lista l4 = intersection(l1, l2);

        l1.display("L1");
        l2.display("L2");
        l3.display("L3 (Uniao)");
        l4.display("L4 (Interseção)");
    }

    // Método para criar a união de duas listas
    public static Lista union(Lista l1, Lista l2) {
        Lista l3 = new Lista();

        No current = l1.start;
        while (current != null) {
            if (!l3.contains(current.value)) {
                l3.insertEnd(current.value);
            }
            current = current.next;
        }

        current = l2.start;
        while (current != null) {
            if (!l3.contains(current.value)) {
                l3.insertEnd(current.value);
            }
            current = current.next;
        }

        return l3;
    }

    // Método para criar a interseção de duas listas
    public static Lista intersection(Lista l1, Lista l2) {
        Lista l4 = new Lista();

        No current = l1.start;
        while (current != null) {
            if (l2.contains(current.value) && !l4.contains(current.value)) {
                l4.insertEnd(current.value);
            }
            current = current.next;
        }

        return l4;
    }
}
