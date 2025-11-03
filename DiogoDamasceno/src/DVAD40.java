import java.util.Scanner;

public class DVAD40 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD40 - Exercício 40: Ler números e mostrar o maior (até digitar negativo)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            int n = sc.nextInt();
            if (n < 0) break;
            if (n > maior) maior = n;
        }
        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("Maior número digitado: " + maior);
        }
        sc.close();
    }
}
