import java.util.Scanner;

public class DVAD10 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD10 - Exercício 10: Ano bissexto
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        // Regras: múltiplo de 400 OU (múltiplo de 4 e não múltiplo de 100)
        if ( (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0) ) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }

        sc.close();
    }
}
