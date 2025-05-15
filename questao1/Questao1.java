import java.util.Stack;

public class Questao1 {

    // Função que inverte as letras de cada palavra, mantendo a ordem das palavras
    public static String reverseWords(String text) {
        Stack<Character> stack = new Stack<>();  // Pilha para armazenar caracteres de cada palavra
        StringBuilder result = new StringBuilder();  // Acumulador para o texto final

        // Percorre cada caractere do texto
        for (char c : text.toCharArray()) {
            // Se for uma letra (inclusive com acentos), empilha
            if (Character.isLetter(c) || c == 'Ç' || c == 'É' || c == 'Í' || c == 'Á') {
                stack.push(c);
            } else {
                // Se for espaço ou pontuação, desempilha os caracteres da palavra
                while (!stack.isEmpty()) {
                    result.append(stack.pop());  // Constrói a palavra invertida
                }
                result.append(c);  // Adiciona o espaço ou pontuação normalmente
            }
        }

        // Para garantir que a última palavra seja invertida (antes do ponto final)
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Retorna o texto com as palavras invertidas
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "ESTE EXERCÍCIO É MUITO FÁCIL.";  // Texto de entrada
        String output = reverseWords(input);  // Chamada da função que inverte as palavras
        System.out.println(output);  // Exibe o resultado: ETSE OICÍCREXE É OTIUM LICÁF.
    }
}
