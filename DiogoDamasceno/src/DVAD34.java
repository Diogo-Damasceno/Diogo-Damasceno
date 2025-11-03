import java.util.Scanner;

public class DVAD34 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD34 - Exercício 34: Pedir senha até acertar (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        final int SENHA = 1111;
        int entrada;
        do {
            System.out.print("Digite a senha (número): ");
            entrada = sc.nextInt();
        } while (entrada != SENHA);
        System.out.println("Acesso liberado!");
        sc.close();
    }
}
