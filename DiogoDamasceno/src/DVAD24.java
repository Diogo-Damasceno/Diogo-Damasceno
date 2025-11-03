import java.util.Scanner;

public class DVAD24 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD24 - Exercício 24: Verificar se um número é positivo (while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Obrigado! Você digitou: " + n);
        sc.close();
    }
}
