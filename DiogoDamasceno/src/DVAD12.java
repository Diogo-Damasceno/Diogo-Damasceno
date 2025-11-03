import java.util.Scanner;

public class DVAD12 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD12 - Exercício 12: Tabuada de um número (for)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para mostrar a tabuada: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
