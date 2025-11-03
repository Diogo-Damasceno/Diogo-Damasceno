import java.util.Scanner;

public class DVAD08 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD08 - Exercício 8: Login simples
        // *************************************************

        Scanner sc = new Scanner(System.in);

        // credenciais fixas para exemplo
        final String USER = "aluno";
        final String PASS = "1234";

        System.out.print("Usuário: ");
        String u = sc.nextLine();
        System.out.print("Senha: ");
        String p = sc.nextLine();

        if (USER.equals(u) && PASS.equals(p)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        sc.close();
    }
}
