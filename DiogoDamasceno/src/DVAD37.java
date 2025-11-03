import java.util.Scanner;

public class DVAD37 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD37 - Exercício 37: Soma até o número ser múltiplo de 10 (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int n;
        do {
            System.out.print("Digite um número (quando for múltiplo de 10, para): ");
            n = sc.nextInt();
            soma += n;
        } while (n % 10 != 0);
        System.out.println("Soma total = " + soma);
        sc.close();
    }
}
