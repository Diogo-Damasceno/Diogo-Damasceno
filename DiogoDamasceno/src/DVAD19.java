import java.util.Scanner;

public class DVAD19 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD19 - Exercício 19: Verificar se um número é primo (for)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Não é primo.");
            sc.close();
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(primo ? "É primo." : "Não é primo.");
        sc.close();
    }
}
