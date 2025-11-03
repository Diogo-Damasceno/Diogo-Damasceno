import java.util.Scanner;

public class DVAD03 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD03 - Exercício 3: Maior de dois números
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior é: " + a);
        } else if (b > a) {
            System.out.println("O maior é: " + b);
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close();
    }
}
