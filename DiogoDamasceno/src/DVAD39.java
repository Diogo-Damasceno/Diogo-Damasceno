import java.util.Scanner;

public class DVAD39 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD39 - Exercício 39: Validar número entre 1 e 5 (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número entre 1 e 5: ");
            n = sc.nextInt();
        } while (n < 1 || n > 5);
        System.out.println("Obrigado. Você digitou: " + n);
        sc.close();
    }
}
