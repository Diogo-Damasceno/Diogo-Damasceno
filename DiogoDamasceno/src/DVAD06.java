import java.util.Scanner;

public class DVAD06 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD06 - Exercício 6: Múltiplo de 3 e/ou 5
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean mult3 = (num % 3 == 0);
        boolean mult5 = (num % 5 == 0);

        if (mult3 && mult5) {
            System.out.println("Múltiplo de 3 e de 5.");
        } else if (mult3) {
            System.out.println("Múltiplo de 3.");
        } else if (mult5) {
            System.out.println("Múltiplo de 5.");
        } else {
            System.out.println("Não é múltiplo de 3 nem de 5.");
        }

        sc.close();
    }
}
