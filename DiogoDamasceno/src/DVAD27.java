import java.util.Scanner;

public class DVAD27 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD27 - Exercício 27: Quantidade de números ímpares digitados
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int countImpares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n % 2 != 0) countImpares++;
        }
        System.out.println("Quantidade de ímpares: " + countImpares);
        sc.close();
    }
}
