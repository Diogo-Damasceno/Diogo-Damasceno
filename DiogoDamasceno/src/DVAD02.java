import java.util.Scanner;

public class DVAD02 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD02 - Exercício 2: Par ou ímpar
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // resto da divisão por 2: 0 -> par, 1 -> ímpar
        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        sc.close();
    }
}
