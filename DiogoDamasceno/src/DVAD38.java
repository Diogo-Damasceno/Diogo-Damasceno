import java.util.Scanner;

public class DVAD38 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD38 - Exercício 38: Confirmar saída com 's' (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Menu: (aperte 's' para sair)");
            System.out.print("Deseja sair? (s/n): ");
            resp = sc.nextLine().trim().toLowerCase();
        } while (!resp.equals("s"));
        System.out.println("Saindo...");
        sc.close();
    }
}
