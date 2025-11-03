import java.util.Scanner;

public class DVAD20 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD20 - Exercício 20: Números de Fibonacci (n termos)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos de Fibonacci deseja ver? ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + a);
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
