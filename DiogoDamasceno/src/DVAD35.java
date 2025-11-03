import java.util.Scanner;

public class DVAD35 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD35 - Exercício 35: Número positivo obrigatório (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Obrigado. Você digitou: " + n);
        sc.close();
    }
}
