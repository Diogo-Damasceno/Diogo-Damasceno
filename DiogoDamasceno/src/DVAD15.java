import java.util.Scanner;
import java.math.BigInteger;

public class DVAD15 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD15 - Exercício 15: Fatorial de um número
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número (>=0) para calcular o fatorial: ");
        int n = sc.nextInt();

        BigInteger fat = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fat);
        sc.close();
    }
}
