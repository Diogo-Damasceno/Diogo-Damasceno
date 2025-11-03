import java.util.Scanner;

public class DVAD01 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD01 - Exercício 1: Número positivo ou negativo
        // *************************************************

        Scanner sc = new Scanner(System.in); // para ler entrada do usuário
        System.out.print("Digite um número: ");
        int num = sc.nextInt(); // lê inteiro

        if (num > 0) { // se maior que zero
            System.out.println("O número é positivo.");
        } else if (num < 0) { // se menor que zero
            System.out.println("O número é negativo.");
        } else { // num == 0
            System.out.println("O número é zero.");
        }

        sc.close(); // fechar scanner
    }
}
