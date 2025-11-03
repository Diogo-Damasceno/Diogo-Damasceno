import java.util.Scanner;

public class DVAD22 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD22 - Exercício 22: Soma de números até digitar zero
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            soma += n;
        }
        System.out.println("Soma total = " + soma);
        sc.close();
    }
}
