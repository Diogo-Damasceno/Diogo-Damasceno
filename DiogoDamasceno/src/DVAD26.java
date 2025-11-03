import java.util.Scanner;

public class DVAD26 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD26 - Exercício 26: Número primo com while
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Não é primo.");
            sc.close();
            return;
        }

        int i = 2;
        boolean primo = true;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        System.out.println(primo ? "É primo." : "Não é primo.");
        sc.close();
    }
}
