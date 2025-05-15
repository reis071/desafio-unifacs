package questao5;

import java.util.*;

public class Questao5 {

    // Verifica se duas pilhas são iguais em conteúdo e ordem
    public static boolean stacksAreEqual(Stack<Integer> s1, Stack<Integer> s2) {
        return s1.equals(s2);
    }

    // Compara o tamanho das pilhas e retorna uma mensagem
    public static String compareSize(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() > s2.size()) return "P1 é maior";
        else if (s2.size() > s1.size()) return "P2 é maior";
        else return "As pilhas têm o mesmo tamanho";
    }

    // Calcula e exibe o maior, menor e a média dos valores da pilha
    public static void statistics(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Pilha vazia!");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int value : stack) {
            if (value > max) max = value;
            if (value < min) min = value;
            sum += value;
        }

        double average = (double) sum / stack.size();

        System.out.println("Maior: " + max);
        System.out.println("Menor: " + min);
        System.out.printf("Média: %.2f\n", average);
    }

    // Retorna uma cópia da pilha original
    public static Stack<Integer> copy(Stack<Integer> original) {
        return new Stack<>() {{ addAll(original); }};
    }

    // Conta quantos elementos ímpares existem na pilha
    public static int countOdd(Stack<Integer> stack) {
        int count = 0;
        for (int value : stack) {
            if (value % 2 != 0) count++;
        }
        return count;
    }

    // Conta quantos elementos pares existem na pilha
    public static int countEven(Stack<Integer> stack) {
        int count = 0;
        for (int value : stack) {
            if (value % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();

        // Adiciona elementos às pilhas
        p1.push(10);
        p1.push(20);
        p1.push(30);
        p1.push(25);

        p2.push(10);
        p2.push(20);
        p2.push(30);
        p2.push(25);

        // 1. Verifica se as pilhas são iguais
        System.out.println("As pilhas são iguais? " + stacksAreEqual(p1, p2));
        System.out.println(compareSize(p1, p2));

        // 2. Exibe estatísticas da pilha P1
        System.out.println("\nEstatísticas da P1:");
        statistics(p1);

        // 3. Cria e exibe uma cópia da pilha P1
        Stack<Integer> copy = copy(p1);
        System.out.println("\nCópia de P1: " + copy);

        // 4 e 5. Conta e exibe a quantidade de pares e ímpares
        System.out.println("\nP1 tem " + countEven(p1) + " pares e " + countOdd(p1) + " ímpares.");
    }
}
