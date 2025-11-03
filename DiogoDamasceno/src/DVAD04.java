import java.util.Scanner;

public class DVAD04 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD04 - Exercício 4: Pode votar?
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // No Brasil o voto é facultativo a partir dos 16 e obrigatório entre 18 e 70
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você ainda não pode votar.");
        }

        sc.close();
    }
}
