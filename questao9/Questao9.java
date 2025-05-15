package questao9;

public class Questao9 {
    public static void main(String[] args) {
        ListaDupla list = new ListaDupla();

        list.insertAt(10, 1); // [10]
        list.insertAt(20, 2); // [10, 20]
        list.insertAt(30, 2); // [10, 30, 20]
        list.display();       // Lista: 10 30 20

        System.out.println("Elemento na posicao 2: " + list.locate(2).value); // 30

        System.out.println("removendo elemento na posicao 2: " + list.removeAt(2)); // 30
        list.display(); // Lista: 10 20
    }
}
