import java.util.Scanner;

public class DVAD32 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD32 - Exercício 32: Tabuada de um número (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número para tabuada: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
        sc.close();
    }
}
