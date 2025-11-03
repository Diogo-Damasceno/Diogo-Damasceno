import java.util.Scanner;

public class DVAD23 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD23 - Exercício 23: Senha correta (while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        final String SENHA = "1111";
        String entrada = "";
        while (!SENHA.equals(entrada)) {
            System.out.print("Digite a senha: ");
            entrada = sc.nextLine();
        }
        System.out.println("Senha correta. Acesso liberado!");
        sc.close();
    }
}
