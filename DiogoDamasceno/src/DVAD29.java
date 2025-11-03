import java.util.Scanner;

public class DVAD29 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD29 - Exercício 29: Contar dígitos de um número
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        long n = sc.nextLong();

        int digits = 0;
        if (n == 0) digits = 1;
        while (n != 0) {
            digits++;
            n /= 10;
        }

        System.out.println("Quantidade de dígitos: " + digits);
        sc.close();
    }
}
