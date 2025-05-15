package questao7;

// Classe principal para testar a lista estática encadeada
public class Questao7 {
    public static void main(String[] args) {
        StaticLinkedList list = new StaticLinkedList();  // Cria uma nova lista

        list.insert(10);  // Insere o valor 10 na lista
        list.insert(20);  // Insere o valor 20 na lista
        list.insert(30);  // Insere o valor 30 na lista
        list.display();   // Exibe a lista: deve mostrar 30 20 10

        list.remove(20);  // Remove o valor 20 da lista
        list.display();   // Exibe a lista atualizada: deve mostrar 30 10

        list.remove(99);  // Tenta remover o valor 99 que não existe; imprime mensagem de não encontrado
    }
}
