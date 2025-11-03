import java.util.Scanner;

public class DVAD05 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD05 - Exercício 5: Notas e aprovação
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota final (0-10): ");
        double nota = sc.nextDouble();

        // Considerando 6.0 como nota mínima para aprovação
        if (nota >= 6.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
