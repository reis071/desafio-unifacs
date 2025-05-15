package questao6;

import java.util.*;

public class Questao6 {

    // Verifica se duas filas possuem os mesmos elementos na mesma ordem
    public static boolean queuesAreEqual(Queue<Integer> q1, Queue<Integer> q2) {
        return q1.equals(q2);
    }

    // Compara os tamanhos das filas e retorna qual é maior ou se são iguais
    public static String compareSize(Queue<Integer> q1, Queue<Integer> q2) {
        if (q1.size() > q2.size()) return "F1 é maior";
        else if (q2.size() > q1.size()) return "F2 é maior";
        else return "As filas têm o mesmo tamanho";
    }

    // Calcula e exibe o maior, menor e a média dos valores da fila
    public static void statistics(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int value : queue) {
            if (value > max) max = value;
            if (value < min) min = value;
            sum += value;
        }

        double average = (double) sum / queue.size();

        System.out.println("Maior: " + max);
        System.out.println("Menor: " + min);
        System.out.printf("Média: %.2f\n", average);
    }

    // Retorna uma nova fila com os mesmos elementos da original
    public static Queue<Integer> copy(Queue<Integer> original) {
        return new LinkedList<>(original);
    }

    // Conta quantos elementos ímpares existem na fila
    public static int countOdd(Queue<Integer> queue) {
        int count = 0;
        for (int value : queue) {
            if (value % 2 != 0) count++;
        }
        return count;
    }

    // Conta quantos elementos pares existem na fila
    public static int countEven(Queue<Integer> queue) {
        int count = 0;
        for (int value : queue) {
            if (value % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Adiciona elementos às duas filas
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(25);

        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(25);

        // 1. Verifica se as filas são iguais
        System.out.println("As filas são iguais? " + queuesAreEqual(q1, q2));
        System.out.println(compareSize(q1, q2));

        // 2. Exibe estatísticas da fila q1
        System.out.println("\nEstatísticas da F1:");
        statistics(q1);

        // 3. Cria e exibe uma cópia da fila q1
        Queue<Integer> copy = copy(q1);
        System.out.println("\nCópia de F1: " + copy);

        // 4 e 5. Conta e exibe a quantidade de pares e ímpares
        System.out.println("\nF1 tem " + countEven(q1) + " pares e " + countOdd(q1) + " ímpares.");
    }
}
