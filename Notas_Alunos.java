package Notas;

/**
 * Aluno_Marcos
 */

import java.util.Scanner;

public class Notas_Alunos {
    public static void main(String args[]) {
        int totalNotas = notas();

        int media = adicao_divicao(totalNotas);
        System.out.println("Média das notas após a divisão por 4: " + media);

        avaliarSituacao(media);
    }

    private static int notas() {
        int A = 3;
        System.out.println("Nota A: " + A);
        int B = 5;
        System.out.println("Nota B: " + B);
        int C = 4;
        System.out.println("Nota C: " + C);
        int D = 4;
        System.out.println("Nota D: " + D);
        return A + B + C + D;
    }

    private static int adicao_divicao(int totalNotas) {
        System.out.println("Total das notas: " + totalNotas);
        return totalNotas / 4;
    }

    private static void avaliarSituacao(int media) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da sua média: ");


        media = scanner.nextInt();

        scanner.close();

        if (media > 7) {
            System.out.println("Parabéns, aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado nessa disciplina. Procure a Sala da Pedagogia.");
        }
        System.out.println("Obrigado :)");
    }
}